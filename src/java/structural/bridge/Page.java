package structural.bridge;

import java.util.List;

public abstract class Page {
    //Bridge ↓ (поле PageTheme, связывающее 2 иерархии: абстракции и реализиции)
    private PageTheme theme;
    private String title;
    private List<String> content;

    public Page(PageTheme theme){
        setTheme(theme);
        refreshAll();
    }
    public abstract void printInfo();

    public void refreshAll(){
        refreshTitle();
        refreshContent();
    }
    public abstract void refreshTitle();
    public abstract void refreshContent();

    public PageTheme getTheme() {
        return theme;
    }

    public void setTheme(PageTheme theme) {
        this.theme = theme;
        this.theme.colorPage();
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }
}
