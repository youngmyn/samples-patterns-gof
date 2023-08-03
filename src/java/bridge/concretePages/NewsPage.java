package bridge.concretePages;

import bridge.Page;
import bridge.PageTheme;

import java.util.ArrayList;
import java.util.List;

public class NewsPage extends Page {

    public NewsPage(PageTheme theme){
        super(theme);
    }
    @Override
    public void printInfo() {
        System.out.println("It's a news page");
    }

    @Override
    public void refreshTitle() {
        setTitle("NEWS");
    }

    @Override
    public void refreshContent() {
        List<String> content = new ArrayList<>();
        content.add("A FLYING DOG BRAVELY SAVED A 5-YEAR-OLD BOY FROM A BURNING SKYSCRAPER");
        content.add("A STUBBORN SERBIAN BULL DID NOT WANT TO JUMP THROUGH A HOOP AND ATE HIS MASTER");
        content.add("AUSTRALIA'S PRESIDENT SAYS HE WILL NOT TOLERATE THIS KIND OF TREATMENT OF KANGAROOS)");
        setContent(content);
    }
}
