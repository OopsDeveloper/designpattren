package com.oopsdev.designpattern.state.two;

public class VideoPlayer {
    private State state;

    public VideoPlayer() {
        // Set initial state Stopped
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }
}