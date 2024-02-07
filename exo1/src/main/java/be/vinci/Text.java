package be.vinci;


public class Text {
private int id;
private String content;
private Level level;

    public Text(){}
    public Text(int id,String content,Level level){
    this.id=id;
    this.content=content;
    this.level=level;
    }


    public enum Level{
        EASY,MEDUM,HARD
    }
}
