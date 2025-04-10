class Displaying{
    public static void main(String[] args){
        System.out.println("Screen Display");
        for(int i=1;i<=9;i+=1){
            for (int j=1;j<=i;j+=1){
                System.out.print(i);
                System.out.print(" ");
            }
           System.out.println("");
        }
        System.out.println("Screen Display Done");
    }
}