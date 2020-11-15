package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.GameRequirements;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GameRequirementDao {

    //Inserts a requirements into a game_requirements.
    public void createGameRequirement(GameRequirements gameRequirements);

}
