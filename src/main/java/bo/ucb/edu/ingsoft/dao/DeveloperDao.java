package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Developer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeveloperDao {

    //Create developer
    public Developer createDeveloper(Developer developer);

    public Developer findByIdDeveloper(Integer idDeveloper);

    // Get developer by publisher
    public List<Developer> findByPublisher(Integer idPublisher);

}
