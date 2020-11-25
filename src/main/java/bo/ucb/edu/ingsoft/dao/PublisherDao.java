package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Publisher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PublisherDao {

    //Create new publisher;
     void createPublisher(Publisher publisher);

    //Get publisher data
     Publisher findByPublisherId(Integer idUser);

    //Update publisher data;
     void updatePublisher(Publisher publisher);

    //Get publisher list
     List<Publisher> listPublisher(@Param("a") Integer page, @Param("b") String query ,@Param("c") List<Integer> idUser, @Param("d") Integer offset);

    //delete  publisher
     void deletePublisher(Integer idUser);

    //get userId
     Integer findUserIdByIdPublisher(Integer idPublisher);

}
