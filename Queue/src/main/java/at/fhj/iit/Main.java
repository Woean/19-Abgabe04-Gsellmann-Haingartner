package at.fhj.iit;

public class Main {

    public static void main(String[] args) {



        StringQueue versuch = new StringQueue(5);
        versuch.offer("Hello");
        versuch.offer("ciao");

        System.out.println(versuch.peek());

        versuch.poll();
        versuch.remove();

        System.out.print(versuch.peek());
        versuch.element();


    }
}
