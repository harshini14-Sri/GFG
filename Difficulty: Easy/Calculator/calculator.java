class Solution {
    public static void utility(int a, int b, int opr) {
        // code here
        switch (opr) {
            case 1:
                System.out.print(String.valueOf(a + b));
                break;
            case 2:
                System.out.print(String.valueOf(a - b));
                break;
            case 3:
                System.out.print(String.valueOf(a * b));
                break;
            default:
                System.out.print("Invalid Input");
                break;
        }
        // String result="";
        
        // if(opr==1){
        //     result+=(a+b);
        //     System.out.println(result);
        // }
        // else if(opr==2){
        //     result+=(a-b);
        //     System.out.println(result);
        // }
        // else if(opr==3){
        //     result+=(a*b);
        //     System.out.println(result);
        // }
        // else{
        //     System.out.println("Invalid Input");
        // }
    }
}