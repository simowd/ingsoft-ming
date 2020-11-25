package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Developer;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeveloperDao {

    //Create developer
     void createDeveloper(Developer developer);

    // Finds the developer by its id
     Developer findByIdDeveloper(Integer idDeveloper);

    // Get developer by publisher
     List<Integer> findByPublisher(Integer idPublisher);


    //get last id in developers
     Integer getLastInsertId();
    // Updates the developer info
     void updateDeveloper(Developer developer);

    // Finds the developer by its name
     Integer findBydeveloperName(String developer);



}
