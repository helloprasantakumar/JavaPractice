package com.loop;

public class SwitchCase {
    public static void main(String[] args) {
        int dayOfWeek=1;

        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
