package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Publisher;
import bo.ucb.edu.ingsoft.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PublisherDao {

    //Create new publisher admi;
    public void createPublisher(Publisher publisher);


    //Get publisher data
    public Publisher findByPublisherId(Integer idUser);

    //Update publisher data;
    public void updatePublisher(Publisher publisher);

    //Get publisher list
    public ArrayList<Publisher> listPublisher(ArrayList<Integer> idUser);
}
