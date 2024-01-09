public class Message {
    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public String toString() {
        return "Sender: " + this.sender + "; content:  " + this.content;
    }
}
