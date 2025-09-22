class Solution {
    static String revStr(String s) {
        // code here
        // String reverse="";
        // for(int i=s.length()-1;i>=0;i--){
        //     reverse+=s.charAt(i);
        // }
        // return reverse;
        return new StringBuilder(s).reverse().toString();
    }
}