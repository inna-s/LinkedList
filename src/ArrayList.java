public class ArrayList {
    private static int INITIAL_CAPACITY = 10;
    private String[] numbers;
    private int size;

    public ArrayList() {
        this(INITIAL_CAPACITY);
    }

    public ArrayList(int capacity) {
        this.numbers = new String[capacity];
    }

    public int size() {
        return size;
    }

    public void add(String number) {

        numbers[size] = number;
        size++;
    }
}




