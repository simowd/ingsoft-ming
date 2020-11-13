package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameBl {

    private GameDao gameDao;
    private TransactionDao transactionDao;
    private DeveloperDao developerDao;
    private EsrbDao esrbDao;
    private GamesDirectxDao gamesDirectxDao;
    private GamesLanguagesDao languagesDao;
    private GamesOsDao gamesOsDao;
    private GenreDao genreDao;
    private PhotoDao photoDao;
    private PriceDao priceDao;
    private UserDao userDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(GameBl.class);

    @Autowired
    public GameBl(GameDao gameDao, TransactionDao transactionDao, DeveloperDao developerDao, EsrbDao esrbDao, GamesDirectxDao gamesDirectxDao, GamesLanguagesDao languagesDao, GamesOsDao gamesOsDao, GenreDao genreDao, PhotoDao photoDao, PriceDao priceDao, UserDao userDao) {
        this.gameDao = gameDao;
        this.transactionDao = transactionDao;
        this.developerDao = developerDao;
        this.esrbDao = esrbDao;
        this.gamesDirectxDao = gamesDirectxDao;
        this.languagesDao = languagesDao;
        this.gamesOsDao = gamesOsDao;
        this.genreDao = genreDao;
        this.photoDao = photoDao;
        this.priceDao = priceDao;
        this.userDao = userDao;
    }


    /*
    POST (/publisher/{id}/game) The publisher create a new game
 */
    public NewGameRequest createGame(NewGameRequest newGameRequest, Transaction transaction, Integer idPublisher) {

        Game game = new Game();
        Developer developer = new Developer();
        Esrb esrb = new Esrb();
        GameDirectx gameDirectx = new GameDirectx();
        GameOS gameOS = new GameOS();
        LanguageGame languageGame = new LanguageGame();
        GenreGame genreGame = new GenreGame();
        Photo photo = new Photo();
        Price price = new Price();

        String developerName = newGameRequest.getDeveloper();
        Integer developerId = developerDao.findBydeveloperName(developerName);

        Integer idDeveloper = null;
        if (developerId == null) {
            developer.setDeveloper(newGameRequest.getDeveloper());
            developer.setIdPublisher(idPublisher);
            developerDao.createDeveloper(developer);

            idDeveloper = developerDao.getLastInsertId();
        } else {
            idDeveloper = developerId;
        }


        game.setIdEsrb(newGameRequest.getIdEsrb());
        game.setIdDeveloper(idDeveloper);
        game.setName(newGameRequest.getTitle());
        game.setHighlight(newGameRequest.getHighlighted());
        game.setDescription(newGameRequest.getGame_description());
        game.setSize(newGameRequest.getSize());
        game.setPlayers(newGameRequest.getPlayers());
        game.setReleaseDate(newGameRequest.getRelease_date());
        game.setProcessor(newGameRequest.getProcessor());
        game.setMemory(newGameRequest.getMemory());
        game.setGraphics(newGameRequest.getGraphics());
        game.setColor(newGameRequest.getColor());
        game.setDownloadPath(newGameRequest.getDownload_path());
        game.setTxId(transaction.getTxId());
        game.setTxHost(transaction.getTxHost());
        game.setTxUserId(transaction.getTxUserId());
        game.setTxDate(transaction.getTxDate());
        gameDao.createGame(game);

        List<Integer> directIds = new ArrayList<Integer>();
        Integer idGame = gameDao.getLastInsertId();

        directIds = newGameRequest.getDirectx();
        for (int i = 0; i < directIds.size(); i++) {

            gameDirectx.setIdDirectx(directIds.get(i));
            gameDirectx.setIdGame(idGame);
            gamesDirectxDao.createGameDirectx(gameDirectx);
        }
        List<Integer> operatingSystemIds = new ArrayList<Integer>();
        operatingSystemIds = newGameRequest.getOperatingSystem();
        for (int i = 0; i < operatingSystemIds.size(); i++) {

            gameOS.setIdOperatingSystem(operatingSystemIds.get(i));
            ;
            gameOS.setIdGame(idGame);
            gamesOsDao.createGameOs(gameOS);
        }

        List<Integer> languagesIds = new ArrayList<Integer>();
        languagesIds = newGameRequest.getLanguageGames();
        for (int i = 0; i < languagesIds.size(); i++) {

            languageGame.setIdLanguage(languagesIds.get(i));
            ;
            languageGame.setIdGame(idGame);
            languagesDao.createLanguageGame(languageGame);
        }


        List<Integer> genreIds = new ArrayList<Integer>();
        genreIds = newGameRequest.getGenreGames();
        for (int i = 0; i < genreIds.size(); i++) {

            genreGame.setIdGenre(genreIds.get(i));
            genreGame.setIdGame(idGame);
            genreDao.createGenreGame(genreGame);
        }


        List<String> imagesPath = new ArrayList<String>();
        imagesPath = newGameRequest.getImages();
        for (int i = 0; i < imagesPath.size(); i++) {

            if (i == 0) {
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photo.setStatus(1);
                photo.setType(1);
                photoDao.createPhotoBanner(photo);
            } else {
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photo.setStatus(1);
                photo.setType(2);
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


        return newGameRequest;
    }

    /*
          PUT (/publisher/{id}/game) The publisher can update a game
       */
    public NewGameRequest updateGame(NewGameRequest newGameRequest, Transaction transaction, Integer idGame) {
        Game game = new Game();
        Developer developer = new Developer();
        Esrb esrb = new Esrb();
        GameDirectx gameDirectx = new GameDirectx();
        GameOS gameOS = new GameOS();
        LanguageGame languageGame = new LanguageGame();
        GenreGame genreGame = new GenreGame();
        Photo photo = new Photo();
        Price price = new Price();

        Integer idDeveloper = gameDao.findByDeveloperGame(idGame);
        developer.setIdDeveloper(idDeveloper);
        developer.setDeveloper(newGameRequest.getDeveloper());
        developerDao.updateDeveloper(developer);

        game.setIdGame(idGame);
        game.setIdEsrb(newGameRequest.getIdEsrb());
        game.setIdDeveloper(idDeveloper);
        game.setName(newGameRequest.getTitle());
        game.setHighlight(newGameRequest.getHighlighted());
        game.setDescription(newGameRequest.getGame_description());
        game.setSize(newGameRequest.getSize());
        game.setPlayers(newGameRequest.getPlayers());
        game.setReleaseDate(newGameRequest.getRelease_date());
        game.setProcessor(newGameRequest.getProcessor());
        game.setMemory(newGameRequest.getMemory());
        game.setGraphics(newGameRequest.getGraphics());
        game.setColor(newGameRequest.getColor());
        game.setDownloadPath(newGameRequest.getDownload_path());
        game.setTxId(transaction.getTxId());
        game.setTxHost(transaction.getTxHost());
        game.setTxUserId(transaction.getTxUserId());
        game.setTxDate(transaction.getTxDate());
        gameDao.updateGame(game);

        List<Integer> directIds = new ArrayList<Integer>();
        directIds = newGameRequest.getDirectx();

        List<Integer> idGameDirectx = gamesDirectxDao.findByIdDirectxGame(idGame);
        gamesDirectxDao.deleteOldsDirectx(idGameDirectx);


        for (int i = 0; i < directIds.size(); i++) {

            gameDirectx.setIdDirectx(directIds.get(i));
            gameDirectx.setIdGame(idGame);
            gamesDirectxDao.createGameDirectx(gameDirectx);
        }

        List<Integer> operatingSystemIds = new ArrayList<Integer>();
        operatingSystemIds = newGameRequest.getOperatingSystem();

        List<Integer> idGameOs = gamesOsDao.findByIdGamesOs(idGame);

        gamesOsDao.deleteOldsOs(idGameOs);
        for (int i = 0; i < operatingSystemIds.size(); i++) {

            gameOS.setIdOperatingSystem(operatingSystemIds.get(i));
            ;
            gameOS.setIdGame(idGame);
            gamesOsDao.createGameOs(gameOS);
        }

        List<Integer> languagesIds = new ArrayList<Integer>();
        languagesIds = newGameRequest.getLanguageGames();

        List<Integer> idGameLanguages = languagesDao.findByIdGamesLanguages(idGame);
        languagesDao.deleteOldsLanguages(idGameLanguages);

        for (int i = 0; i < languagesIds.size(); i++) {

            languageGame.setIdLanguage(languagesIds.get(i));
            ;
            languageGame.setIdGame(idGame);
            languagesDao.createLanguageGame(languageGame);
        }


        List<Integer> genreIds = new ArrayList<Integer>();
        genreIds = newGameRequest.getGenreGames();

        List<Integer> idGameGenreId = genreDao.findByIdGamesGenre(idGame);
        genreDao.deleteOldsGenreDao(idGameGenreId);

        for (int i = 0; i < genreIds.size(); i++) {

            genreGame.setIdGenre(genreIds.get(i));
            ;
            genreGame.setIdGame(idGame);
            genreDao.createGenreGame(genreGame);
        }

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

        price.setIdGame(idGame);
        price.setPrice(newGameRequest.getPrice());
        price.setSale(newGameRequest.getSale());
        price.setTxId(transaction.getTxId());
        price.setTxHost(transaction.getTxHost());
        price.setTxUserId(transaction.getTxUserId());
        price.setTxDate(transaction.getTxDate());
        priceDao.updatePrice(price);
        return newGameRequest;
    }

    // Returns Game details by id
    public GameDetailsRequest getGameInformation(Integer gameId) {
        // Getting game information by game id
        Game game = gameDao.getGameInfo(gameId);
        System.out.println(game);
        if(game == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
        // Getting the language ids in a list
        List<Integer> gamesLanguagesDao = languagesDao.findGameLanguages(gameId);

        // Print language id
        LOGGER.info(gamesLanguagesDao.toString());

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
        gameDetailsRequest.setProcessor(game.getProcessor());
        gameDetailsRequest.setMemory(game.getMemory());
        gameDetailsRequest.setGraphics(game.getGraphics());
        gameDetailsRequest.setColor(game.getColor());
        gameDetailsRequest.setHighlighted(game.getHighlight());
        gameDetailsRequest.setDownload_path(game.getDownloadPath());
        gameDetailsRequest.setStatus(game.getStatus());
        gameDetailsRequest.setOperating_systems(operatingSystemList);
        gameDetailsRequest.setGenres(genres);
        gameDetailsRequest.setSale(price.getSale());
        gameDetailsRequest.setPrice(price.getPrice());

        // Print game details data
        LOGGER.info(gameDetailsRequest.toString());

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
        Game game = new Game();
        game.setHighlight(setHighlightRequest.getHighlight());
        game.setTxId(transaction.getTxId());
        game.setTxDate(transaction.getTxDate());
        game.setTxHost(transaction.getTxHost());
        game.setTxUserId(transaction.getTxUserId());
        game.setIdGame(gameId);
        gameDao.updateHighlight(game);
    }
}
