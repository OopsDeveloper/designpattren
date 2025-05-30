package com.oopsdev.designpattern.state.not;

public class VideoPlayer {
    private String state;

    public VideoPlayer() {
        this.state = "Stopped";
    }

    public void play() {
        if (state.equals("Stopped")) {
            System.out.println("Starting the video.");
            state = "Playing";
        } else if (state.equals("Playing")) {
            System.out.println("Video is already playing.");
        } else if (state.equals("Paused")) {
            System.out.println("Resuming the video.");
            state = "Playing";
        }
    }

    public void stop() {
        if (state.equals("Playing")) {
            System.out.println("Pausing the video.");
            state = "Paused";
        } else if (state.equals("Paused")) {
            System.out.println("Stopping the video.");
            state = "Stopped";
        } else if (state.equals("Stopped")) {
            System.out.println("Video is already stopped.");
        }
    }

    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();

        player.play();   // "Starting the video."
        player.play();   // "Video is already playing."
        player.stop();   // "Pausing the video."
        player.play();   // "Resuming the video."
        player.stop();   // "Pausing the video."
        player.stop();   // "Stopping the video."
        player.stop();   // "Video is already stopped."
    }
}
