package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.GameDirectx;
import bo.ucb.edu.ingsoft.models.GameRequirements;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameRequirementDao {

    //Inserts a requirements into a game_requirements.
    public void createGameRequirement(GameRequirements gameRequirements);

    //finds the requirements used by a game
    public List<GameRequirements> findByIdGamesRequirements(Integer idGame);
    //updates directx per game
    public void deleteOldsRequirements(List<Integer> idGameRequirement);

    public void changeStatus(Integer idGameRequirement);

}
