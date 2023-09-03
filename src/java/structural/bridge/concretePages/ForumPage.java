package structural.bridge.concretePages;

import structural.bridge.Page;
import structural.bridge.PageTheme;

import java.util.ArrayList;
import java.util.List;

public class ForumPage extends Page {
    public ForumPage(PageTheme theme){
        super(theme);
    }
    @Override
    public void printInfo() {
        System.out.println("It's a forum page");
    }

    @Override
    public void refreshTitle() {
        setTitle("FORUM");
    }

    @Override
    public void refreshContent() {
        List<String> content = new ArrayList<>();
        content.add("Why are little puppies so dumb?");
        content.add("People, help! Does anyone know how to hide a little pony on a balcony??");
        setContent(content);
    }
}
