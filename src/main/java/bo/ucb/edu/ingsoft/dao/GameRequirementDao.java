package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.GameDirectx;
import bo.ucb.edu.ingsoft.models.GameRequirements;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameRequirementDao {

    //Inserts a requirements into a game_requirements.
     void createGameRequirement(GameRequirements gameRequirements);

    //finds the requirements used by a game
     List<GameRequirements> findByIdGamesRequirements(Integer idGame);
    //updates directx per game
     void deleteOldsRequirements(List<Integer> idGameRequirement);

     void changeStatus(Integer idGameRequirement);

}
