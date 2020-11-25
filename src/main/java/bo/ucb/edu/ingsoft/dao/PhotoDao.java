package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhotoDao {
    // Get Photo Data
     List<Photo> findByIdGame(List<Integer> idGame);

    //Get banner by banner Id
     List<Photo> findBannerbyId(List<Integer> idGame);

    //Get photo_path by game Id
     List<Photo> findPhotosByGameId(Integer idGame);

    //Get banner by game Id
     Photo findBannerbyGame(Integer idGame);

    //Create Banner
     void createPhotoBanner (Photo photo);

    //Create Photo
     void createPhoto (Photo photo);

    //Update Photo Banner
     void updatePhotoBanner (Photo photo);

    //Update Photo
     void updatePhoto (Photo photo);

    //Find Photo by Id game
     List<Integer> findByPhotos(Integer idGame);

}
