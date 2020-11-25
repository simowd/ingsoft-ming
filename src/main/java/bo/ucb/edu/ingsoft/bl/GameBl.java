package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class GameBl {

    private final GameDao gameDao;
    private final TransactionDao transactionDao;
    private final DeveloperDao developerDao;
    private final EsrbDao esrbDao;
    private final GamesDirectxDao gamesDirectxDao;
    private final GamesLanguagesDao languagesDao;
    private final GamesOsDao gamesOsDao;
    private final GenreDao genreDao;
    private final PhotoDao photoDao;
    private final PriceDao priceDao;
    private final UserDao userDao;
    private final PublisherDao publisherDao;
    private final GameRequirementDao gameRequirementDao;

    /*
    POST (/publisher/{id}/game) The publisher create a new game
    */
    public void createGame(NewGameRequest newGameRequest, Transaction transaction, Integer idPublisher) {

        Game game = new Game();
        Developer developer = new Developer();
        GameDirectx gameDirectx = new GameDirectx();
        GameOS gameOS = new GameOS();
        LanguageGame languageGame = new LanguageGame();
        GenreGame genreGame = new GenreGame();
        Photo photo = new Photo();
        Price price = new Price();
        GameRequirements gameRequirements =new GameRequirements();

        Integer developerId = developerDao.findBydeveloperName(newGameRequest.getDeveloper());

        if (developerId == null) {
            developer.setIdPublisher(idPublisher);
            developer.setDeveloper(newGameRequest.getDeveloper());
            developer.setTxId(transaction.getTxId());
            developer.setTxHost(transaction.getTxHost());
            developer.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
            developer.setTxDate(transaction.getTxDate());
            developerDao.createDeveloper(developer);

            developerId = developerDao.getLastInsertId();
        }

        game.setIdEsrb(newGameRequest.getIdEsrb());
        game.setIdDeveloper(developerId);
        game.setName(newGameRequest.getTitle());
        game.setDescription(newGameRequest.getGame_description());
        game.setSize(newGameRequest.getSize());
        game.setPlayers(newGameRequest.getPlayers());
        game.setReleaseDate(newGameRequest.getRelease_date());
        game.setColor(newGameRequest.getColor());
        game.setHighlight(newGameRequest.getHighlighted());
        game.setDownloadPath(newGameRequest.getDownload_path());
        game.setTxId(transaction.getTxId());
        game.setTxHost(transaction.getTxHost());
        game.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
        game.setTxDate(transaction.getTxDate());
        gameDao.createGame(game);

        List<Integer> directIds = new ArrayList<Integer>();
        Integer idGame = gameDao.getLastInsertId();

        directIds = newGameRequest.getDirectx();
        for (int i = 0; i < directIds.size(); i++) {

            gameDirectx.setIdDirectx(directIds.get(i));
            gameDirectx.setIdGame(idGame);
            gameDirectx.setTxId(transaction.getTxId());
            gameDirectx.setTxHost(transaction.getTxHost());
            gameDirectx.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
            gameDirectx.setTxDate(transaction.getTxDate());
            gamesDirectxDao.createGameDirectx(gameDirectx);
        }

        List<Integer> operatingSystemIds = new ArrayList<Integer>();
        operatingSystemIds = newGameRequest.getOperatingSystem();

        for (int i = 0; i < operatingSystemIds.size(); i++) {

            gameOS.setIdOperatingSystem(operatingSystemIds.get(i));
            gameOS.setIdGame(idGame);
            gameOS.setTxId(transaction.getTxId());
            gameOS.setTxHost(transaction.getTxHost());
            gameOS.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
            gameOS.setTxDate(transaction.getTxDate());
            gamesOsDao.createGameOs(gameOS);
        }

        List<Integer> languagesIds = new ArrayList<Integer>();
        languagesIds = newGameRequest.getLanguageGames();
        for (int i = 0; i < languagesIds.size(); i++) {

            languageGame.setIdLanguage(languagesIds.get(i));
            languageGame.setIdGame(idGame);
            languageGame.setTxId(transaction.getTxId());
            languageGame.setTxHost(transaction.getTxHost());
            languageGame.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
            languageGame.setTxDate(transaction.getTxDate());
            languagesDao.createLanguageGame(languageGame);
        }


        List<Integer> genreIds = new ArrayList<Integer>();
        genreIds = newGameRequest.getGenreGames();
        for (int i = 0; i < genreIds.size(); i++) {

            genreGame.setIdGenre(genreIds.get(i));
            genreGame.setIdGame(idGame);
            genreGame.setTxId(transaction.getTxId());
            genreGame.setTxHost(transaction.getTxHost());
            genreGame.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
            genreGame.setTxDate(transaction.getTxDate());
            genreDao.createGenreGame(genreGame);
        }


        List<String> imagesPath = new ArrayList<String>();
        imagesPath = newGameRequest.getImages();
        for (int i = 0; i < imagesPath.size(); i++) {

            if (i == 0) {
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photo.setType(1);
                photo.setTxId(transaction.getTxId());
                photo.setTxHost(transaction.getTxHost());
                photo.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
                photo.setTxDate(transaction.getTxDate());
                photoDao.createPhotoBanner(photo);
            } else {
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photo.setType(2);
                photo.setTxId(transaction.getTxId());
                photo.setTxHost(transaction.getTxHost());
                photo.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
                photo.setTxDate(transaction.getTxDate());
                photoDao.createPhoto(photo);
            }

        }

        price.setIdGame(idGame);
        price.setPrice(newGameRequest.getPrice());
        price.setSale(newGameRequest.getSale());
        price.setTxId(transaction.getTxId());
        price.setTxHost(transaction.getTxHost());
        price.setTxUserId(transaction.getTxUserId());
        price.setTxDate(transaction.getTxDate());
        priceDao.createPrice(price);

        List<GameRequirements> gameRequirements1 = new ArrayList<GameRequirements>();
        gameRequirements1 = newGameRequest.getRequirements();
        for(GameRequirements requirements : gameRequirements1){

            gameRequirements.setIdGame(idGame);
            gameRequirements.setIdOperatingSystem(requirements.getIdOperatingSystem());
            gameRequirements.setProcessor(requirements.getProcessor());
            gameRequirements.setMemory(requirements.getMemory());
            gameRequirements.setGraphics(requirements.getGraphics());
            gameRequirements.setTxId(transaction.getTxId());
            gameRequirements.setTxHost(transaction.getTxHost());
            gameRequirements.setTxUserId(publisherDao.findUserIdByIdPublisher(idPublisher));
            gameRequirements.setTxDate(transaction.getTxDate());
            gameRequirementDao.createGameRequirement(gameRequirements);
        }

    }

    /*
          PUT (/publisher/{id}/game) The publisher can update a game
    */
    public void updateGame(NewGameRequest newGameRequest, Transaction transaction, Integer idGame) {
        Game game = new Game();
        Developer developer1 = new Developer();
        Developer developer = new Developer();
        GameDirectx gameDirectx = new GameDirectx();
        GameOS gameOS = new GameOS();
        LanguageGame languageGame = new LanguageGame();
        GenreGame genreGame = new GenreGame();
        Photo photo = new Photo();
        Price price = new Price();
        GameRequirements gameRequirements = new GameRequirements();

        String developers = "developers";

        Integer idDeveloper = gameDao.findByDeveloperGame(idGame);
        developer1=developerDao.findByIdDeveloper(idDeveloper);

        Integer idUser= publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher());


        //Update developer
        if(developer1.getDeveloper().compareTo(newGameRequest.getDeveloper()) != 0){
            developer.setIdPublisher(developer1.getIdPublisher());
            developer.setDeveloper(newGameRequest.getDeveloper());
            developer.setTxId(transaction.getTxId());
            developer.setTxHost(transaction.getTxHost());
            developer.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
            developer.setTxDate(transaction.getTxDate());
            developerDao.createDeveloper(developer);
        }
        //Update game
        game.setIdGame(idGame);
        game.setIdEsrb(newGameRequest.getIdEsrb());
        game.setIdDeveloper(idDeveloper);
        game.setName(newGameRequest.getTitle());
        game.setDescription(newGameRequest.getGame_description());
        game.setSize(newGameRequest.getSize());
        game.setPlayers(newGameRequest.getPlayers());
        game.setReleaseDate(newGameRequest.getRelease_date());
        game.setColor(newGameRequest.getColor());
        game.setHighlight(newGameRequest.getHighlighted());
        game.setDownloadPath(newGameRequest.getDownload_path());
        game.setTxId(transaction.getTxId());
        game.setTxHost(transaction.getTxHost());
        game.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
        game.setTxDate(transaction.getTxDate());
        gameDao.updateGame(game);

        //Update game_directx
        List<GameDirectx> gameDirectx1 = gamesDirectxDao.findByIdDirectxGame(idGame);

        List<Integer> ids = new ArrayList<Integer>();
        for(GameDirectx idGameDirectx2 : gameDirectx1){
            ids.add(idGameDirectx2.getIdGameDirectx());
        }
        List<Integer> idDirectx = new ArrayList<Integer>();
        for(GameDirectx idGameDirectx2 : gameDirectx1){
            idDirectx.add(idGameDirectx2.getIdDirectx());
        }
        gamesDirectxDao.deleteOldsDirectx(ids);


        List<Integer> directIds = new ArrayList<Integer>();
        directIds = newGameRequest.getDirectx();

        for (int i = 0; i < directIds.size(); i++) {
            Integer flag=0;
            for (int j=0;j<ids.size();j++){

                if(directIds.get(i)==idDirectx.get(j)){
                    flag=1;
                    gamesDirectxDao.changeStatus(ids.get(j));
                }
            }
            if(flag==0){
                gameDirectx.setIdDirectx(directIds.get(i));
                gameDirectx.setIdGame(idGame);
                gameDirectx.setTxId(transaction.getTxId());
                gameDirectx.setTxHost(transaction.getTxHost());
                gameDirectx.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
                gameDirectx.setTxDate(transaction.getTxDate());
                gamesDirectxDao.createGameDirectx(gameDirectx);
            }
        }
        //Update game_os
        List<GameOS> gameOs = gamesOsDao.findByIdGamesOs(idGame);

        List<Integer> idsGameOS = new ArrayList<Integer>();
        for(GameOS idGameOS2 : gameOs){
            idsGameOS.add(idGameOS2.getIdGameOs());
        }
        List<Integer> idsOperatingSystem = new ArrayList<Integer>();
        for(GameOS idGameOS2 : gameOs){
            idsOperatingSystem.add(idGameOS2.getIdOperatingSystem());
        }
        gamesOsDao.deleteOldsOs(idsGameOS);

        List<Integer> operatingSystemIds = new ArrayList<Integer>();
        operatingSystemIds = newGameRequest.getOperatingSystem();
        for (int i = 0; i < operatingSystemIds.size(); i++) {
            Integer flag=0;
            for (int j=0;j<idsGameOS.size();j++){

                if(operatingSystemIds.get(i)==idsOperatingSystem.get(j)){
                    flag=1;
                    gamesOsDao.changeStatus(idsGameOS.get(j));
                }
            }
            if(flag==0){
                gameOS.setIdOperatingSystem(operatingSystemIds.get(i));
                gameOS.setIdGame(idGame);
                gameOS.setTxId(transaction.getTxId());
                gameOS.setTxHost(transaction.getTxHost());
                gameOS.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
                gameOS.setTxDate(transaction.getTxDate());
                gamesOsDao.createGameOs(gameOS);
            }
        }
        //Update game languges
        List<LanguageGame> gameLanguages = languagesDao.findByIdGamesLanguages(idGame);

        List<Integer> idsLanguagesGames = new ArrayList<Integer>();
        for(LanguageGame idsLanguagesGames1:gameLanguages ){
            idsLanguagesGames.add(idsLanguagesGames1.getIdLanguageGame());
        }
        List<Integer> idsLanguages = new ArrayList<Integer>();
        for(LanguageGame idsLanguagesGames1 : gameLanguages){
            idsLanguages.add(idsLanguagesGames1.getIdLanguage());
        }
        languagesDao.deleteOldsLanguages(idsLanguagesGames);

        List<Integer> languagesIds = new ArrayList<Integer>();
        languagesIds = newGameRequest.getLanguageGames();
        for (int i = 0; i < languagesIds.size(); i++) {
            Integer flag=0;
            for (int j=0;j<idsLanguagesGames.size();j++){

                if(languagesIds.get(i)==idsLanguages.get(j)){
                    flag=1;
                    languagesDao.changeStatus(idsLanguagesGames.get(j));
                }
            }
            if(flag==0){
                languageGame.setIdLanguage(languagesIds.get(i));
                languageGame.setIdGame(idGame);
                languageGame.setTxId(transaction.getTxId());
                languageGame.setTxHost(transaction.getTxHost());
                languageGame.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
                languageGame.setTxDate(transaction.getTxDate());
                languagesDao.createLanguageGame(languageGame);
            }
        }
        // Update genre games

        List<GenreGame> idGameGenreId = genreDao.findByIdGamesGenre(idGame);

        List<Integer> idsGenreGames = new ArrayList<Integer>();
        for(GenreGame idsGenreGames1:idGameGenreId ){
            idsGenreGames.add(idsGenreGames1.getIdGenreGame());
        }
        List<Integer> idsGenre = new ArrayList<Integer>();
        for(GenreGame idsGenreGames1 : idGameGenreId){
            idsGenre.add(idsGenreGames1.getIdGenre());
        }
        genreDao.deleteOldsGenreDao(idsGenreGames);
        List<Integer> genreIds = new ArrayList<Integer>();
        genreIds = newGameRequest.getGenreGames();
        for (int i = 0; i < genreIds.size(); i++) {
            Integer flag=0;
            for (int j=0;j<idsGenreGames.size();j++){

                if(genreIds.get(i)==idsGenre.get(j)){
                    flag=1;
                    genreDao.changeStatus(idsGenreGames.get(j));
                }
            }
            if(flag==0){
                genreGame.setIdGenre(genreIds.get(i));
                genreGame.setIdGame(idGame);
                genreGame.setTxId(transaction.getTxId());
                genreGame.setTxHost(transaction.getTxHost());
                genreGame.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
                genreGame.setTxDate(transaction.getTxDate());
                genreDao.createGenreGame(genreGame);
            }
        }
        // Update photos
        List<String> imagesPath = new ArrayList<String>();
        imagesPath = newGameRequest.getImages();

        List<Integer> idGameImages = photoDao.findByPhotos(idGame);


        for (int i = 0; i < imagesPath.size(); i++) {

            if (i == 0) {
                photo.setIdPhoto(idGameImages.get(i));
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photoDao.updatePhotoBanner(photo);
            } else {
                photo.setIdPhoto(idGameImages.get(i));
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photoDao.updatePhoto(photo);
            }

        }
        //Update price
        price.setIdGame(idGame);
        price.setPrice(newGameRequest.getPrice());
        price.setSale(newGameRequest.getSale());
        price.setTxId(transaction.getTxId());
        price.setTxHost(transaction.getTxHost());
        price.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
        price.setTxDate(transaction.getTxDate());
        priceDao.updatePrice(price);

        //Update requirements
        List<GameRequirements> requirements = gameRequirementDao.findByIdGamesRequirements(idGame);

        List<Integer> idsGameRequirements = new ArrayList<Integer>();
        for(GameRequirements idsGenreGames1: requirements){
            idsGameRequirements.add(idsGenreGames1.getIdGameRequirement());
        }
        List<Integer> idsOperatingSystemRequirements = new ArrayList<Integer>();
        for(GameRequirements idsGenreGames1 : requirements){
            idsOperatingSystemRequirements.add(idsGenreGames1.getIdOperatingSystem());
        }
        gameRequirementDao.deleteOldsRequirements(idsGenreGames);

        List<GameRequirements> gameRequirements1 = new ArrayList<GameRequirements>();
        gameRequirements1 = newGameRequest.getRequirements();



        for (GameRequirements requirements2 : gameRequirements1) {
            Integer flag=0;

            for (int j=0;j<idsGameRequirements.size();j++){

                if(requirements2.getIdOperatingSystem()==idsOperatingSystemRequirements.get(j)){
                    flag=1;
                    gameRequirementDao.changeStatus(idsGameRequirements.get(j));
                }
            }
            if(flag==0){
                gameRequirements.setIdGame(idGame);
                gameRequirements.setIdOperatingSystem(requirements2.getIdOperatingSystem());
                gameRequirements.setProcessor(requirements2.getProcessor());
                gameRequirements.setMemory(requirements2.getMemory());
                gameRequirements.setGraphics(requirements2.getGraphics());
                gameRequirements.setTxId(transaction.getTxId());
                gameRequirements.setTxHost(transaction.getTxHost());
                gameRequirements.setTxUserId(publisherDao.findUserIdByIdPublisher(developer1.getIdPublisher()));
                gameRequirements.setTxDate(transaction.getTxDate());
                gameRequirementDao.createGameRequirement(gameRequirements);
            }
        }
    }

    // Returns Game details by id
    public GameDetailsRequest getGameInformation(Integer gameId) {
        // Getting game information by game id
        Game game = gameDao.getGameInfo(gameId);

        if(game == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }

        log.info(game.toString());
        // Getting the language ids in a list
        List<Integer> gamesLanguagesDao = languagesDao.findGameLanguages(gameId);

        // Print language id
        log.info(gamesLanguagesDao.toString());

        // Getting the language information in a list
        List<Language> languageList = languagesDao.findByIdLanguage(gamesLanguagesDao);
        // Changing from List<Language> to List<String>
        ArrayList<String> languageListAux = new ArrayList<>();
        languageList.forEach(language -> languageListAux.add(language.getLanguage()));

        // Getting ESRB by game id
        Esrb esrb = esrbDao.findEsrbById(game.getIdEsrb());
        List<Photo> photos = photoDao.findPhotosByGameId(game.getIdGame());
        List<String> photosAux = new ArrayList<>();

        // Getting photo paths in string list
        photos.forEach(photo -> photosAux.add(photo.getPhotoPath()));

        // Getting game developer
        Developer developer = developerDao.findByIdDeveloper(game.getIdDeveloper());

        // Getting operative system into string list
        List<Integer> oS = gamesOsDao.findByGame(game.getIdGame());
        List<OperatingSystem> operatingSystemList = gamesOsDao.findByIdGameOs(oS);

        // Getting price by game id
        Price price = priceDao.findById(game.getIdGame());

        // Getting genres by game id
        List<String> genres = genreDao.gameGenre(game.getIdGame());

        List<GameRequirementsHelper> gameRequirements = gameDao.getRequirements(gameId);

        // Loading data into GameDetailsRequest
        GameDetailsRequest gameDetailsRequest = new GameDetailsRequest();
        gameDetailsRequest.setId(gameId);
        gameDetailsRequest.setTitle(game.getName());
        gameDetailsRequest.setLanguage(languageListAux);
        gameDetailsRequest.setGame_description(game.getDescription());
        gameDetailsRequest.setSize(game.getSize());
        gameDetailsRequest.setEsrb(esrb);
        gameDetailsRequest.setImages(photosAux);
        gameDetailsRequest.setDeveloper(developer.getDeveloper());
        gameDetailsRequest.setPlayers(game.getPlayers());
        gameDetailsRequest.setReleaseDate(game.getReleaseDate());
        gameDetailsRequest.setGameRequirements(gameRequirements);
        gameDetailsRequest.setColor(game.getColor());
        gameDetailsRequest.setHighlighted(game.getHighlight());
        gameDetailsRequest.setDownload_path(game.getDownloadPath());
        gameDetailsRequest.setStatus(game.getStatus());
        gameDetailsRequest.setOperating_systems(operatingSystemList);
        gameDetailsRequest.setGenres(genres);
        gameDetailsRequest.setSale(price.getSale());
        gameDetailsRequest.setPrice(price.getPrice());

        // Print game details data
        log.info(gameDetailsRequest.toString());

        return gameDetailsRequest;
    }
    /*
          DELETE (/publisher/{id}/game) The publisher can delete game
       */
    public void deleteGame(Integer idGame, Transaction transaction) {
        gameDao.deleteGame(idGame);
    }

    /*
        A Game object is created and sent to the gameDao to update the Highlight
    */
    public void updateHighlight(SetHighlightRequest setHighlightRequest, Transaction transaction, Integer gameId) {
        Game game1 = gameDao.getGameInfo(gameId);
        if(game1 == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
        Game game = new Game();
        game.setHighlight(setHighlightRequest.getHighlight());
        game.setTxId(transaction.getTxId());
        game.setTxDate(transaction.getTxDate());
        game.setTxHost(transaction.getTxHost());
        game.setTxUserId(gameDao.getPublisherId(gameId));
        game.setIdGame(gameId);
        gameDao.updateHighlight(game);
    }
}
