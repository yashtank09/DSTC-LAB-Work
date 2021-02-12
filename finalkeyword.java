class demo{
    void run(){
        System.out.println("Running");
    }
}
class finalkeyword extends demo{
    void run(){
        System.out.println("abc");
    }//gives error
    public static void main(String args[]) {
        finalkeyword d = new finalkeyword();
        d.run();
    }
}