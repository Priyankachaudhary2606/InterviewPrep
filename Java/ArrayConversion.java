import java.util.Arrays; 
import java.util.List;

public class ArrayConversion {
  
    public static void main(String[] args) {
      
        // Array declaration
        String[] arr1 = {"geeks", "for", "geeks", "for", "dev"};
        
        // Converting using array to list using Arrays.asList()
        List<String> lis = Arrays.asList(arr1);
        
        System.out.println("List: " + lis);
    }
}
