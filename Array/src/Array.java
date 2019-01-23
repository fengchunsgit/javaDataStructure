public class Array {
    private int[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造array
    public Array(int capacity){
        data=new int[capacity];
        size=0;
    }

    //无参数构造函数，默认数组容量capacity=10
    public Array(){
        this(10);
    }

    //getSize
    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

}
