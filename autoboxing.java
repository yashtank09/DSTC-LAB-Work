// Autoboxing and Unboxing
// Autoboxing is like type casting or type conversion of any data type.

/* The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and opposite operation is known as unboxing.
 This is the new feature of Java5. So java programmer doesn't need to write the conversion code. */

class autoboxing {
    public static void main(String[] args) {
        Integer i=new Integer(50);
        int a=i;  

        System.out.println(a);
    }    
}
