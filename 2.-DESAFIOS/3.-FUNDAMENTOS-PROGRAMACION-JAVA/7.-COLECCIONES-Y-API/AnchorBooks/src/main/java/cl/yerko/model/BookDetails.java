package cl.yerko.model;

//5. Crear la clase BookDetail con sus atributos respectivos.
//API: https://my-json-server.typicode.com/Himuravidal/anchorBooks/bookDetail
public class BookDetails {
    //"id": 1,
    //"author": "Chinua Achebe",
    //"country": "Nigeria",
    //"imageLink": "https://user-images.githubusercontent.com/22780253/103938792-90279200-5109-11eb-906a-50ac3b73e40d.jpg",
    //"language": "English",
    //"link": "https://en.wikipedia.org/wiki/Things_Fall_Apart\n",
    //"pages": 209,
    //"title": "Things Fall Apart",
    //"year": 1958,
    //"price": 12500,
    //"lastPrice": 17500,
    //"delivery": true
    private Integer id;
    private String author;
    private String country;
    private String imageLink;
    private String language;
    private String link;
    private Integer pages;
    private String title;
    private Integer year;
    private Integer price;
    private Integer lastPrice;
    private Boolean delivery;

    public BookDetails() {
    }

    public BookDetails(Integer id, String author, String country, String imageLink, String language, String link, Integer pages, String title, Integer year, Integer price, Integer lastPrice, Boolean delivery) {
        this.id = id;
        this.author = author;
        this.country = country;
        this.imageLink = imageLink;
        this.language = language;
        this.link = link;
        this.pages = pages;
        this.title = title;
        this.year = year;
        this.price = price;
        this.lastPrice = lastPrice;
        this.delivery = delivery;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Integer lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "BookDetails{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", country='" + country + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", language='" + language + '\'' +
                ", link='" + link + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", lastPrice=" + lastPrice +
                ", delivery=" + delivery +
                '}';
    }
}
