class Marks<T> {
    T mark;
    Marks(T mark) {
        this.mark = mark;
    }
void display() {
        System.out.println("Marks: " + mark);
    }
}
public class Main {
    public static void main(String[] args) {
      Marks<Integer> m1 =
            new Marks<Integer>(95);
   Marks<Float> m2 =
            new Marks<Float>(89.5f);
   Marks<Double> m3 =
            new Marks<Double>(99.99);
        m1.display();
        m2.display();
        m3.display();
    }
}
