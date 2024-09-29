package ch7.Ex;

class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean getPowerOn() {
        return this.isPowerOn;
    }
    public void setPowerOn(boolean power) {
        this.isPowerOn = power;
    }
    public int getChannel() {
        return this.channel;
    }
    public void setChannel(int channel) {
        this.prevChannel = this.channel;
        this.channel = channel;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void gotoPrevChannel() {
        setChannel(this.prevChannel);
    }
}

class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: "+t.getVolume());
    }
}
