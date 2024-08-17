import java.util.*;

public class Billboard implements Interactable {

    private List<String> content;

    public Billboard(String content) {
        this.content = new ArrayList<String>();
        this.content.add(content);
    }

    public List<String> contactScript() {
        return content;
    }

    public List<String> responseScript() {
        return content;
    }



}
