package nl.duo.tennis.interfaces;

public class Samsung implements Television {

    private boolean on = false;
    private int currentChannel = 1;

    @Override
    public void on() {
        this.on = true;
        System.out.println("Samsung is now on");
    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("Samsung is now off");
    }

    @Override
    public boolean switchChannel(int newChannel) {
        this.currentChannel = newChannel;
        System.out.println("Samsung is now on channel: "+this.currentChannel);

        return this.currentChannel == newChannel;
    }
}
