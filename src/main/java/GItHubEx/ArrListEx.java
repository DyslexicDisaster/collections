package GItHubEx;


public class ArrListEx {
   private int[] data;
   private int num_elements;

    public ArrListEx() {
        data = new int[10];
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
