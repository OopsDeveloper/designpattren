package com.oopsdev.designpattern.adapter.two;

class VGAAdapter implements DisplayAdapter {
    private VGA vga;
    private boolean highQuality;
    public VGAAdapter(VGA vga, boolean highQuality) {
        this.vga = vga;
        this.highQuality = highQuality;
    }

    @Override
    public void display() {
        vga.connectWithVgaCable(highQuality);
    }
}
