package GItHubEx;


public class ArrListEx {
    private static final int MAX_EXPANSION = 10000;
    private static final int MAX_INITIAL_CAPACITY = 100;
   private int[] data;
   private int capacity = 10;
   private int num_elements;
   private int expanstionFactor = 10;

    public ArrListEx(int capacity) {
        if (capacity < 0 || capacity > MAX_EXPANSION){
            capacity = 10;
        }
        this.capacity = capacity;
        data = new int[capacity];
    }

    public ArrListEx(int capacity, int expanstionFactor) {
        if (capacity <= MAX_INITIAL_CAPACITY && capacity > 0){
            this.capacity = capacity;
        } else if (capacity > MAX_INITIAL_CAPACITY) {
            this.capacity = MAX_INITIAL_CAPACITY;
        }

        data = new int[capacity];

        if (this.expanstionFactor <= MAX_EXPANSION && expanstionFactor > 0){
            this.expanstionFactor = expanstionFactor;
        }else if(expanstionFactor > MAX_EXPANSION) {
            this.expanstionFactor = MAX_EXPANSION;
        }
    }

    public int size(){
       return num_elements;
   }

   public void add(int toAdd){
        if (num_elements == data.length){
            grow();
        }
        data[num_elements] = toAdd;
        num_elements++;
   }

   //grow
    //create new array with x extra slots
    //loop through original array and copy to new array
    //replace the original array with the new one

    private void grow(){
        int[] newArr = new int[data.length+10];

        for (int i = 0;i< data.length;i++){
            newArr[i] = data[i];
        }
        data = newArr;
    }
}
