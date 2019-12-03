import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        int a = 21;
        int b = 45;
        int c = 88;
        int d = 907;
        int j = 1056;
        LinkedList numbers=new LinkedList();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        numbers.add(d);
        numbers.add(3,j);
        System.out.println(numbers);
    }
}
