package bo.ucb.edu.ingsoft.models;

public class GameOS {
    private Integer id_game_os;
    private Integer id_game;
    private Integer id_operating_system;

    public GameOS() {
    }

    public Integer getId_game_os() {
        return id_game_os;
    }

    public void setId_game_os(Integer id_game_os) {
        this.id_game_os = id_game_os;
    }

    public Integer getId_game() {
        return id_game;
    }

    public void setId_game(Integer id_game) {
        this.id_game = id_game;
    }

    public Integer getId_operating_system() {
        return id_operating_system;
    }

    public void setId_operating_system(Integer id_operating_system) {
        this.id_operating_system = id_operating_system;
    }

    @Override
    public String toString() {
        return "GameOS{" +
                "id_game_os=" + id_game_os +
                ", id_game=" + id_game +
                ", id_operating_system=" + id_operating_system +
                '}';
    }
}
