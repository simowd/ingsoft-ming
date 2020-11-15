package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LibraryRequest {
    private Integer id;
    private String title;
    private List<String> genre;
    private String banner;
    private String download;

    public LibraryRequest() {

    }

    public LibraryRequest(Integer id, String title, List<String> genre, String banner, String download) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.banner = banner;
        this.download = download;
    }

    @Override
    public String toString() {
        return "LibraryRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", banner='" + banner + '\'' +
                ", download='" + download + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }
}
