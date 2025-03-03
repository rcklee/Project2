import java.util.ArrayList;

public class Tasks {
    private String title; 
    private String description; 
    private int lvl; 

    static ArrayList<String> classList = new ArrayList<String>();

    // Constructor
    public Tasks(String title, String description, int lvl) {
        this.title = title;
        this.description = description;
        this.lvl = lvl;
    }
    
    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for lvl
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String display(){
        String toString = ("Task: "+title + " Description: "+ description+ " Level of importance: "+lvl);
                return toString;

    }
}
