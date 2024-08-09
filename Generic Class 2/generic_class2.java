class Pair<T1,T2>{
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second){
        this.first=first;
        this.second=second;
    }

    public T1 getFirst(){
        return this.first;
    }

    public T2 getSecond(){
        return this.second;
    }
}


public class generic_class2 {
    public static void main(String[] args) {
        Pair<Integer,String> pair1 = new Pair<>(10,"Java");
        System.out.println("First: "+pair1.getFirst());
        System.out.println("Second: "+pair1.getSecond());

        Pair<Double,Character> pair2 = new Pair<>(3.14,'A');
        System.out.println("First: "+pair2.getFirst());
        System.out.println("Second: "+pair2.getSecond());
    }
}