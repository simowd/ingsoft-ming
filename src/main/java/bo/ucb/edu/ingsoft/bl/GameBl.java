package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.GameDetailsRequest;
import bo.ucb.edu.ingsoft.dto.GamesRequest;
import bo.ucb.edu.ingsoft.dto.NewGameRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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

    @Autowired
    public GameBl(GameDao gameDao, TransactionDao transactionDao, DeveloperDao developerDao, EsrbDao esrbDao, GamesDirectxDao gamesDirectxDao, GamesLanguagesDao languagesDao, GamesOsDao gamesOsDao, GenreDao genreDao, PhotoDao photoDao, PriceDao priceDao) {
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
    }


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

        developer.setDeveloper(newGameRequest.getDeveloper());
        developer.setIdPublisher(idPublisher);
        developerDao.createDeveloper(developer);

        Integer idDeveloper = developerDao.getLastInsertId();
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


        List<Integer> genreIds=new ArrayList<Integer>();
        genreIds=newGameRequest.getGenreGames();
        for(int i=0; i<genreIds.size();i++){

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


    public NewGameRequest updateGame(NewGameRequest newGameRequest, Transaction transaction, Integer idGame){
        Game game =new Game();
        Developer developer=new Developer();
        Esrb esrb =new Esrb();
        GameDirectx gameDirectx =new GameDirectx();
        GameOS gameOS=new GameOS();
        LanguageGame languageGame=new LanguageGame();
        GenreGame genreGame=new GenreGame();
        Photo photo=new Photo();
        Price price=new Price();

        Integer idDeveloper=gameDao.findByDeveloperGame(idGame);
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

        List<Integer> directIds=new ArrayList<Integer>();
        directIds=newGameRequest.getDirectx();

        List<Integer> idGameDirectx=gamesDirectxDao.findByIdDirectxGame(idGame);
        gamesDirectxDao.deleteOldsDirectx(idGameDirectx);


        for(int i=0; i<directIds.size();i++){

            gameDirectx.setIdDirectx(directIds.get(i));
            gameDirectx.setIdGame(idGame);
            gamesDirectxDao.createGameDirectx(gameDirectx);
        }

        List<Integer> operatingSystemIds=new ArrayList<Integer>();
        operatingSystemIds=newGameRequest.getOperatingSystem();

        List<Integer> idGameOs=gamesOsDao.findByIdGamesOs(idGame);

        gamesOsDao.deleteOldsOs(idGameOs);
        for(int i=0; i<operatingSystemIds.size();i++){

            gameOS.setIdOperatingSystem(operatingSystemIds.get(i));;
            gameOS.setIdGame(idGame);
            gamesOsDao.createGameOs(gameOS);
        }

        List<Integer> languagesIds=new ArrayList<Integer>();
        languagesIds=newGameRequest.getLanguageGames();

        List<Integer> idGameLanguages=languagesDao.findByIdGamesLanguages(idGame);
        languagesDao.deleteOldsLanguages(idGameLanguages);

        for(int i=0; i<languagesIds.size();i++){

            languageGame.setIdLanguage(languagesIds.get(i));;
            languageGame.setIdGame(idGame);
            languagesDao.createLanguageGame(languageGame);
        }



        List<Integer> genreIds=new ArrayList<Integer>();
        genreIds=newGameRequest.getGenreGames();

        List<Integer> idGameGenreId=genreDao.findByIdGamesGenre(idGame);
        genreDao.deleteOldsGenreDao(idGameGenreId);

        for(int i=0; i<genreIds.size();i++){

            genreGame.setIdGenre(genreIds.get(i));;
            genreGame.setIdGame(idGame);
            genreDao.createGenreGame(genreGame);
        }

        List<String> imagesPath=new ArrayList<String>();
        imagesPath=newGameRequest.getImages();

        List<Integer> idGameImages=photoDao.findByPhotos(idGame);


        for(int i=0; i<imagesPath.size();i++){

            if(i==0){
                photo.setIdPhoto(idGameImages.get(i));
                photo.setIdGame(idGame);
                photo.setPhotoPath(imagesPath.get(i));
                photoDao.updatePhotoBanner(photo);
            }else{
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



    public GameDetailsRequest getGameInformation(Integer gameId) {

        Game game = gameDao.getGameInfo(gameId);
        List<Integer> gamesLanguagesDao = languagesDao.findGameLanguages(game.getIdGame());
        List<Language> languageList = languagesDao.findByIdLanguage(gamesLanguagesDao);
        ArrayList<String> languageListAux = new ArrayList<>();
        languageList.forEach(language -> {
            languageListAux.add(language.getLanguage());
        });
        Esrb esrb = esrbDao.findEsrbById(game.getIdEsrb());
        List<Photo> photos = photoDao.findPhotosByGameId(game.getIdGame());
        List<String> photosAux = new ArrayList<>();
        photos.forEach(photo -> {
            photosAux.add(photo.getPhotoPath());
        });
        Developer developer = developerDao.findByIdDeveloper(game.getIdDeveloper());
        List<Integer> oS = gamesOsDao.findByGame(game.getIdGame());
        List<OperatingSystem> operatingSystemList = gamesOsDao.findByIdGameOs(oS);

        Price price = priceDao.findById(game.getIdGame());
        List<String> genres = genreDao.gameGenre(game.getIdGame());

        GameDetailsRequest gameDetailsRequest = new GameDetailsRequest();
        gameDetailsRequest.setId(game.getIdGame());
        gameDetailsRequest.setTitle(game.getName());
        gameDetailsRequest.setLanguage(languageListAux);
        gameDetailsRequest.setGame_description(game.getDescription());
        gameDetailsRequest.setSize(game.getSize());
        gameDetailsRequest.setEsrb(esrb);
        gameDetailsRequest.setImages(photosAux);
        gameDetailsRequest.setDeveloper(developer.getDeveloper());
        gameDetailsRequest.setPlayers(game.getPlayers());
        gameDetailsRequest.setRelease_date(game.getReleaseDate());
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

        return gameDetailsRequest;
    }

    public void deleteGame(Integer idGame,Transaction transaction){

        gameDao.deleteGame(idGame);

        transactionDao.updateUserTransaction(4, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());

    }


}
