package cl.yerko.model;

//4. Crear la clase Book con los atributos respectivos de la API que trae un listado de libros.
public class Books {
    //"id": 1,
    //"author": "Chinua Achebe",
    //"country": "Nigeria",
    //"imageLink": "https://user-images.githubusercontent.com/22780253/103938792-90279200-5109-11eb-906a-50ac3b73e40d.jpg",
    //"language": "English",
    //"title": "Things Fall Apart"

    private Integer id;
    private String author;
    private String country;
    private String imageLink;
    private String language;
    private String title;

    public Books() {
    }

    public Books(Integer id, String author, String country, String imageLink, String language, String title) {
        this.id = id;
        this.author = author;
        this.country = country;
        this.imageLink = imageLink;
        this.language = language;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", country='" + country + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", language='" + language + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
