// Exception handling try & catch
// Nested try & catch 
public class NestedTrynBlock {
    public static void main(String[] args) {
        // Perent Try block
        try {
            // child 1 try block
            try {
                // Here we are going to divide a value in variable 'b'
                System.out.println("going to divide");
                int b =39/0;
            
            } catch(ArithmeticException e) { //This is catch block that catch ArithmeticException and return 'e'
                System.out.println("This is first Exception: "+e);
            }
            // child 2 try block
            try {
                int a[]=new int[5];  
                a[5]=4;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");
        } catch(Exception e){
            System.out.println("handeled");
        }
        System.out.println("normal flow..");  
    }          
}
