public class MyHashMap {

    private static final int SIZE = 10;
    private Entry[] table;

    // Linked List Node
    class Entry {
        int key;
        int value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        table = new Entry[SIZE];
    }

    // Hash function
    private int getIndex(int key) {
        return key % SIZE;
    }

    // PUT operation
    public void put(int key, int value) {
        int index = getIndex(key);
        Entry head = table[index];

        Entry current = head;
        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Entry newEntry = new Entry(key, value);
        newEntry.next = head;
        table[index] = newEntry;
    }

    // GET operation
    public Integer get(int key) {
        int index = getIndex(key);
        Entry current = table[index];

        while (current != null) {
            if (current.key == key)
                return current.value;
            current = current.next;
        }
        return null;
    }

    // REMOVE operation
    public void remove(int key) {
        int index = getIndex(key);
        Entry current = table[index];
        Entry prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(11, 200); // collision
        map.put(2, 300);

        System.out.println(map.get(1));   // 100
        System.out.println(map.get(11));  // 200

        map.remove(1);
        System.out.println(map.get(1));   // null
    }
}
