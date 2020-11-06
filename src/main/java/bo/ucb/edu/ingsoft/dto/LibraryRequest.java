package bo.ucb.edu.ingsoft.dto;

import java.util.ArrayList;

public class LibraryRequest {
    private Integer id;
    private String title;
    private ArrayList<String> genre;
    private String banner;
    private String download;

    public LibraryRequest() {
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

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
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
