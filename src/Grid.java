import java.util.ArrayList;
import java.util.List;

public class Grid {
    //variables
    List<Task> listTasks = new ArrayList<Task>();
    List<Processor> listProcessors = new ArrayList<Processor>();

    public Grid() {

    }

    public void addProcessor(Processor p){
        listProcessors.add(p);

    }

    public void deleteProcessor(Processor p){
        listProcessors.remove(p);

    }

    public Processor getProcessor(int i){
        return listProcessors.get(i);

    }

    public void addTask(Task p){
        listTasks.add(p);

    }

    public void deleteTask(Task p){
        listTasks.remove(p);

    }

    public Task getTask(int i){
        return listTasks.get(i);

    }

    public void assignTask(Task t, Processor p) throws ThrowError{
        if(p.isFree()){
            p.setTask(t);
            p.setFree(false);
        }else{
            throw new ThrowError("Is being used");
        }
    }
    public int solveTask(Processor p){
        int result = (int) p.solve();
        p.setFree(true);
        return result;

    }





}
