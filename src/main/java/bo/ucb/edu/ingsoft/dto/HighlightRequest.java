package bo.ucb.edu.ingsoft.dto;

public class HighlightRequest {
    private String id;
    private String title;
    private String game_description;
    private String image;

    public HighlightRequest(String id, String title, String game_description, String image) {
        this.id = id;
        this.title = title;
        this.game_description = game_description;
        this.image = image;
    }

    @Override
    public String toString() {
        return "HighlightRequest{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", game_description='" + game_description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public HighlightRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGame_description() {
        return game_description;
    }

    public void setGame_description(String game_description) {
        this.game_description = game_description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
