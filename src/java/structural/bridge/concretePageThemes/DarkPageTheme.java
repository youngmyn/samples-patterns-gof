package structural.bridge.concretePageThemes;

import structural.bridge.PageTheme;

public class DarkPageTheme implements PageTheme {
    @Override
    public void colorPage() {
        System.out.println("now background color of this page is black, and text color is white");

    }

    @Override
    public String getInfo() {
        return "It's a dark theme";
    }
}
