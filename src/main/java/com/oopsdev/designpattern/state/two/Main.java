package com.oopsdev.designpattern.state.two;

public class Main {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();

        player.play();
        player.play();
        player.stop();
        player.play();
        player.stop();
        player.stop();
        player.stop();
    }
}
