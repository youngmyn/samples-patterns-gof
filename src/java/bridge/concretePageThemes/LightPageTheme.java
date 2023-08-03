package bridge.concretePageThemes;

import bridge.PageTheme;

public class LightPageTheme implements PageTheme {
    @Override
    public void colorPage() {
        System.out.println("now background color of this page is white, and text color is black");
    }
    @Override
    public String getInfo() {
        return "It's a light theme";
    }
}
