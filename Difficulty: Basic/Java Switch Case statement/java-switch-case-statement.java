// User function Template for Java

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        // code here
        double area=0;
        switch(choice){
            case 1:area=(double)(Math.PI*arr.get(0)*arr.get(0));
                   break;
            case 2:area=(double)(arr.get(0)*arr.get(1));
                   break;
        }
        return area;
    }
}