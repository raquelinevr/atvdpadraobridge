package padraobridge;

public class ClientBridge {
    public static void main(String[] args) {
        Device tv = new TV();
        AdvancedRemote remote = new AdvancedRemote(tv);

        remote.togglePower(); // Liga a TV
        remote.volumeUp(); // Aumenta o volume da TV
        remote.mute(); // Silencia a TV
        remote.togglePower(); // Desliga a TV

        Device radio = new Radio();
        BasicRemote radioRemote = new BasicRemote(radio);

        radioRemote.togglePower(); 
        radioRemote.volumeUp(); 
        radioRemote.channelUp(); 
        radioRemote.togglePower(); 
    }
}
