class ArrayAssignment {
    public static void main(String[] args) {
        System.out.println("Ways to assign values in an array");
        
        //Option 1
        int[] arr1 = {40, 55, 63, 17, 22};
        for (int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");
            
        //Option 2
        int arr2[] = new int[]{10, 11, 12, 13};
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
        
        
        //Option 3
        Student[] arr3;
        // allocating memory for 5 objects of type Student.
        arr3 = new Student[5];
        // initialize the elements of the array
        arr3[0] = new Student(1, "aman");
        arr3[1] = new Student(2, "vaibhav");
        arr3[2] = new Student(3, "shikar");
        arr3[3] = new Student(4, "dharmesh");
        arr3[4] = new Student(5, "mohit");
        for (int i = 0; i < arr3.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr3[i].roll_no + " "
                               + arr3[i].name+" }");
            
    }
}

class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}
