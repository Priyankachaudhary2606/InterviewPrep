import java.util.*;

public class ArrayConversionFromList {
  
    public static void main(String[] args)
    {

        // Creating an empty LinkedList of string type
        List<String> list = new ArrayList<String>();

        // Adding elements to above LinkedList
        // using add() method
        list.add("Happy");
        list.add("Sad");
        list.add("Love");
        list.add("Angry");
        
        String[] arr1 = new String[list.size()];

        //Option 1 using get() method
        for (int i = 0; i < list.size(); i++)
            arr1[i] = list.get(i);
            
        for (String a : arr1)
            System.out.print(a + " ");

        //Option 2 using toArray method
        String[] arr2 = list.toArray(new String[0]);
        for (String a : arr2)
            System.out.print(a + " ");
        
        //Option 3 to convert using Stream
        String[] arr3 = list.stream().toArray(String[] ::new);

        // Printing elements of array
        // using enhanced for loop
        for (String x : arr3)
            System.out.print(x + " ");
    }
}
