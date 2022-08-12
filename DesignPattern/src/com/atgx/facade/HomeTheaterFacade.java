package com.atgx.facade;

/**
 * 外观类
 */
public class HomeTheaterFacade {
    private  DVDPlayer dVDPlayer;
    private  Popcorn popcorn;
    private  Projector projector;
    private  Screen screen;
    private  Stereo stereo;
    private  TheaterLight theaterLight;

    public HomeTheaterFacade() {
        super();
        this.dVDPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    /**
     * 准备
     */
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dVDPlayer.playing();
    }

    public void pause(){
        dVDPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        dVDPlayer.off();
        projector.off();
        screen.up();
    }
}
