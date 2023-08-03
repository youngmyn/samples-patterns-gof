package bridge.concretePages;

import bridge.Page;
import bridge.PageTheme;

import java.util.ArrayList;
import java.util.List;

public class AboutUsPage extends Page {

    public AboutUsPage(PageTheme theme) {
        super(theme);
    }

    @Override
    public void printInfo() {
        System.out.println("It's page about our company");
    }

    @Override
    public void refreshTitle() {
        setTitle("ABOUT US");
    }

    @Override
    public void refreshContent() {
        List<String> content = new ArrayList<>();
        content.add("Forest gang - we are engaged in helping lone wolves and tigers." +
                " For, as you know, they are too proud to perform in the circus." +
                " Forest gang - we have been working since 1967");

        content.add("John Smith, our founding father, personally helped over 12,345 wolves and 6,789 tigers.");
        setContent(content);
    }
}
