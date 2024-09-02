package padraobridge;

class radio implements Device {
    private boolean enabled = false;
    private int volume = 0;
    private int channel = 1;

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        System.out.println("Rádio ligado.");
    }

    public void disable() {
        enabled = false;
        System.out.println("Rádio desligado.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int percent) {
        volume = Math.min(100, Math.max(0, percent));
        System.out.println("Volume do rádio ajustado para: " + volume);
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Canal do rádio ajustado para: " + channel);
    }
}

class tv implements Device {
    private boolean enabled = false;
    private int volume = 0;
    private int channel = 1;
    private boolean isMuted = false;

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        enabled = true;
        System.out.println("TV ligada.");
    }

    public void disable() {
        enabled = false;
        System.out.println("TV desligada.");
    }

    public int getVolume() {
        return isMuted ? 0 : volume;
    }

    public void setVolume(int percent) {
        volume = Math.min(100, Math.max(0, percent));
        System.out.println("Volume da TV ajustado para: " + volume);
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Canal da TV ajustado para: " + channel);
    }

    public void mute() {
        isMuted = !isMuted;
        if (isMuted) {
            System.out.println("TV silenciada.");
        } else {
            System.out.println("Som da TV restaurado.");
        }
    }
}

