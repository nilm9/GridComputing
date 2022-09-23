import java.util.LinkedList;

public class Task<T extends Comparable<T>> {
    //atributes
    private String id;
    private LinkedList<T> valueList = new LinkedList<T>();
    private String operation;
    private double result;

    public Task(String id, String operation) {
        this.id = id;
        this.operation = operation;
        this.result = 0;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LinkedList<T> getValueList() {
        return valueList;
    }


    public void setValueList(LinkedList<T> valueList) {
        this.valueList = valueList;
    }

    public void addValue(T v){
        valueList.add(v);
    }

    public int lenghtValueList(LinkedList<T> valueList){

        return valueList.size();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
