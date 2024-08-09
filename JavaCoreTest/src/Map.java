import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {

    private List<Entry<K, V>> entries;

    public Map() {
        this.entries = new ArrayList<>();
    }

    /**
     * Добавление значений
     * @param key
     * @param value
     * @return
     */
    public V put(K key, V value) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                V oldValue = entry.getValue();
                entry.setValue(value);
                return oldValue;
            }
        }
        entries.add(new Entry<>(key, value));
        return null;
    }

    /**
     * Получение значения по ключу
     * @param key
     * @return
     */
    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /**
     * Проверка ключа
     * @param key
     * @return
     */
    public boolean containsKey(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Количество пар
     * @return
     */
    public int size() {
        return entries.size();
    }
}
