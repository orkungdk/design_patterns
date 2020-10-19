package creational.singleton.hibernate;

/**
 * @author orkungedik
 */
public class Entity {

    private Integer id;

    private String blob;

    public Integer getId() {
        return id;
    }

    public String getBlob() {
        return blob;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBlob(String blob) {
        this.blob = blob;
    }
}
