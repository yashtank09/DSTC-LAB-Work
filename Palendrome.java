public class Palendrome {
    public static void main(String args[]) {
        int pn = 568; //---A variable for check whether the number is pelendrome or not
        int r, sum = 0, temp; // 

        temp = pn;
        while(pn > 0){
            //---r is a variable that find modulus of pn and stores in it..
            r = pn % 10;
            
            //---sum is the reverced number that compare with orignal number(pn)
            sum = (sum * 10) + r;
            System.out.println("SUM: "+sum);

            //---pn is variable that stores a value.
            pn = pn/10;
            System.out.println("PNUMBER: "+pn);
        }
        // System.out.println(temp);
        // System.out.println(sum);
        if(temp == sum){
            System.out.println("Palendrome number");
        } else {
            System.out.println("Not Palendrome number");
        }

    }
}
