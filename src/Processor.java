public class Processor {
    //Atributes
    private String id;
    private int IP;
    private double processCapacity;
    private double RAMmemory;
    private double hardDisk;
    private boolean free;

    private Task task;



    public Processor(String id, int IP, double processCapacity, double RAMmemory, double hardDisk, Task task) {
        this.id = id;
        this.IP = IP;
        this.processCapacity = processCapacity;
        this.RAMmemory = RAMmemory;
        this.hardDisk = hardDisk;
        this.free = true;
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIP() {
        return IP;
    }

    public void setIP(int IP) {
        this.IP = IP;
    }

    public double getProcessCapacity() {
        return processCapacity;
    }

    public void setProcessCapacity(double processCapacity) {
        this.processCapacity = processCapacity;
    }

    public double getRAMmemory() {
        return RAMmemory;
    }

    public void setRAMmemory(double RAMmemory) {
        this.RAMmemory = RAMmemory;
    }

    public double getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(double hardDisk) {
        this.hardDisk = hardDisk;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int  solve() {
        int res=0;
        if(task.getOperation().equals("+")){
           res= sum();

        }
        return res;
    }

    public int sum(){
        int sum = 0;
        // if head = null
        for(int i=0; i<task.getValueList().size(); i++) {
            sum = sum + (int) task.getValueList().get(i);

        }
        return sum;


    }




}
