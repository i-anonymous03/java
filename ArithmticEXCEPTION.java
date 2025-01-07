class ArithmticEXCEPTION {
    int a=10,b=0;

         void set()
        {
                 try{
            int data1 =a/b;
            System.out.println(data1);
        }
    
     catch(ArithmeticException e){
        
        System.out.println("number cant be divisible by 0");}
        }
        void rop(){
            int data2 =a*b;
        System.out.println(data2 +"\n rest of program");
        System.out.println("\nend of program");
        }
    public static void main(String[] args) {

     Main m1=new Main();
        m1.set();
        m1.rop();
    }
}
