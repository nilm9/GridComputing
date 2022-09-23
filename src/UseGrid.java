import java.util.LinkedList;

public class UseGrid {
    public static void main(String[] args) throws ThrowError {
        Grid g1 = new Grid();


        Task t1 = new Task("1848t", "+" );
        t1.addValue(1);
        t1.addValue(0);
        t1.addValue(0);

        Task t2 = new Task("1821t", "+" );
        t1.addValue(6);
        t1.addValue(2);
        t1.addValue(4);


        Processor p1 = new Processor("484848f", 1894448, 45.00, 58.5, 8181.5,t1);
        Processor p2 = new Processor("48448f", 1854448, 45.00, 5448.5, 8181.5,t2);

        g1.addProcessor(p1);
        g1.addProcessor(p2);

        g1.assignTask(t1, p1);
        g1.assignTask(t2, p1);


        System.out.println("Result solving p1 " + g1.solveTask(p1));
        System.out.println("Result solving p2 " + g1.solveTask(p2));








    }
}
