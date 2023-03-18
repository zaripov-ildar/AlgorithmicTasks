package LeetCode.DesignBrowserHistory_1472;

public class Page {
    String url;
    Page left;
    Page right;

    public Page(String url) {
        this.url = url;
    }
}
