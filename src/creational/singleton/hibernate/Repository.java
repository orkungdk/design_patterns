package creational.singleton.hibernate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author orkungedik
 */
public class Repository {
    
    private static Repository instance = new Repository();

    private Map<Integer, Entity> repository = new HashMap<>();
    
    private Repository() {
    }

    public static Repository getInstance() {
        return instance;
    }

    public void save(Entity entity) {
        repository.put(entity.getId(), entity);
    }

    public Entity findById(Integer id) {
        return repository.get(id);
    }
}
