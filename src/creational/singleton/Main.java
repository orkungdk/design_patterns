package creational.singleton;

import creational.singleton.hibernate.Entity;
import creational.singleton.hibernate.Repository;

/**
 * @author orkungedik
 */
public class Main {

    public static void main(String[] args) {
        insertEntity(1, "This is entity 1");
        insertEntity(2, "This is entity 2");
        insertEntity(3, "This is entity 3");
        insertEntity(4, "This is entity 4");
        insertEntity(5, "This is entity 5");

        System.out.println(Repository.getInstance().findById(1).getBlob());
        System.out.println(Repository.getInstance().findById(3).getBlob());
        System.out.println(Repository.getInstance().findById(5).getBlob());
    }

    private static void insertEntity(Integer id, String blob) {
        Entity entity = new Entity();
        entity.setId(id);
        entity.setBlob(blob);

        Repository repository = Repository.getInstance();
        repository.save(entity);
    }
}
