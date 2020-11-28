package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhotoDao {
    // Get Photo Data
    public List<Photo> findByIdGame(List<Integer> idGame);

    //Get banner by banner Id
    public List<Photo> findBannerbyId(List<Integer> idGame);

    //Get photo_path by game Id
    public List<Photo> findPhotosByGameId(Integer idGame);

    //Get banner by game Id
    public Photo findBannerbyGame(Integer idGame);

    //Create Banner
    public void createPhotoBanner(Photo photo);

    //Create Photo
    public void createPhoto(Photo photo);

    //Update Photo Banner
    public void updatePhotoBanner(Photo photo);

    //Update Photo
    public void updatePhoto(Photo photo);

    //Find Photo by Id game
    public List<Integer> findByPhotos(Integer idGame);

}
