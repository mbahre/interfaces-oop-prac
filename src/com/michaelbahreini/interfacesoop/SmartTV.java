package com.michaelbahreini.interfacesoop;

public class SmartTV extends TV implements Application, Internet, MusicPlayer {

    public void launchApp(){
        System.out.println("Smart TV launches application");
    };
    public void closeApp(){
        System.out.println("Smart TV closes application");
    };

    public void accessInternet(){
        System.out.println("Access the internet using Smart TV");
    };
    public void browseInternet(){
        System.out.println("Browse the internet using Smart TV");
    };
    public void closeInternet(){
        System.out.println("Internet browser closes on Smart TV");
    };

    public void playMusic(){
        System.out.println("Smart TV music plays");
    };
    public void pauseMusic(){
        System.out.println("Smart TV music pauses");
    };
    public void stopMusic(){
        System.out.println("Smart TV music stops");
    };

}
