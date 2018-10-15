import org.jibble.pircbot.*;

public class MyBot extends PircBot {

    public MyBot() {
        this.setName("MyBot");
    }

    public void onMessage(String channel, String sender, String login, String hostname, String message) {
        if (message.equalsIgnoreCase("hello")) {
            sendMessage(channel, sender + ": Hello, my name is Saman" );
        }
    }


}