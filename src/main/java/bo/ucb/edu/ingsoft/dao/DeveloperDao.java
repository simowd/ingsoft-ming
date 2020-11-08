package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Developer;
import bo.ucb.edu.ingsoft.models.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeveloperDao {

    //Create developer
    public void createDeveloper(Developer developer);

    public Developer findByIdDeveloper(Integer idDeveloper);

    // Get developer by publisher
    public List<Integer> findByPublisher(Integer idPublisher);


    //get last id in developers
    public Integer getLastInsertId();

    public void updateDeveloper(Developer developer);



}
