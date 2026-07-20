package com.oops.inheritance;

interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer{
    @Override
    public void takePhoto(){
        System.out.println("Photo Capturing ");
    }

    @Override
    public  void playMusic(){
        System.out.println("Music Playing");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        SmartPhone smartPhone= new SmartPhone();
        smartPhone.playMusic();
        smartPhone.takePhoto();
    }

}
