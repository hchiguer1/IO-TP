package metier;

import java.io.FileNotFoundException;
import java.util.List;

public interface IMetier<T> {
    public void add(T a);
    public List<T> getAll();
    public T findById(long id);
    public void delete(long id);
    public void saveAll() throws Exception;
}
