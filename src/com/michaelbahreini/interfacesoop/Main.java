package com.michaelbahreini.interfacesoop;

public class Main {

    public static void main(String[] args) {

        SmartTV stv = new SmartTV();

     // TV class and interface references
//        TV stv = new SmartTV();
//        Application stv = new SmartTV();
//        Internet stv = new SmartTV();
//        MusicPlayer stv = new SmartTV();

        // TV Class
        stv.powerOn();
        stv.powerOff();
        stv.changeChannel();
        stv.volumeUp();
        stv.volumeDown();

        // Application interface
        stv.launchApp();
        stv.closeApp();

        // Internet interface
        stv.accessInternet();
        stv.browseInternet();
        stv.closeInternet();

        // Music Player interface
        stv.playMusic();
        stv.pauseMusic();
        stv.stopMusic();
    }
}
