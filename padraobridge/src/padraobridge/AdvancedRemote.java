package padraobridge;

class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        if (device instanceof TV) {
            ((TV) device).mute();
        } else {
            System.out.println("Função mute não suportada para este dispositivo.");
        }
    }
}

