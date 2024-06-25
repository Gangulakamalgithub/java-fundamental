package Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //array are object in java
        //1.array declarations
        int[] ids;//reference variable (no array will be created hear)
        //2.array instantiation(creating an object)
        ids = new int[5];
        System.out.println(ids[4]);
        //initialize
        ids[0] = 111;
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;
        ids[4] = 555;

        //shotcut Array
        byte[] marks = {78,88,98,75,85};
        System.out.println(marks.length);

        //3.Accessing array
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        //for-each element in array
        //for each id in  ids
        for(int id : ids){
            System.out.println(id);
        }

        /*for(byte mark : marks){
            mark+=5
            System.out.print(mark + " ");
        }*/
        for (int i = 0 ; i < marks.length; i++){
            marks[i] += 5;
        }

        System.out.println("\nafter updating marks");
        for(byte mark : marks){
            System.out.print(mark + " ");
        }





    }
}
