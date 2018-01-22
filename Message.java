import java.io.Serializable;
import java.util.Date;


public class Message implements Serializable{

    String to, from, title, content, date;

    public Message(){
        to = "";
        from = "";
        title = "";
        content = "";
        date = new Date().toString();
    }

    public void setTo(String to){this.to = to; }
    public void setFrom(String from){this.from = from;}
    public void setTitle(String title){this.title = title;}
    public void setContent(String content){this.content = content;}

    public String toString(){
        return "To: " + this.to + "\nFrom: " + this.from +
        "\nTitle: " + this.title + "\nContent: " + this.content + 
        "\nDate: " + this.date;
    }

}