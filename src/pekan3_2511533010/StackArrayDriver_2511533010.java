package pekan3_2511533010;
public class StackArrayDriver_2511533010 {

    public static void main(String[] args) {

        StackArray_2511533010 s = new StackArray_2511533010();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " dikeluarkan dari stack");
        System.out.println("Elemen teratas adalah : " + s.peek());
        System.out.print("Element pada stack : ");
        s.print();
    }
}