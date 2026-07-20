package com.virtusa;

public class StringPractice {
    public static void main(String[] args) {
        String str="prasanta";
        String reverse = new StringBuilder(str).reverse().toString();

        System.out.println(reverse);

        // pallindrome
        if(str.equals(reverse)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }

        // character count
        String s= "aaabbc";
        StringBuilder result = new StringBuilder();

        int count=1;
        for(int i=0;i<s.length();i++){
            if (i<s.length()-1 && s.charAt(i)== s.charAt(i+1)){
                count++;
            }else{
                System.out.print(s.charAt(i) + "" + count);
                count = 1;
            }

//            System.out.println(result);
        }





    }

}
