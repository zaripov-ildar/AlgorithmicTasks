package LeetCode.DesignBrowserHistory_1472;

class BrowserHistory {
    private Page page;

    public BrowserHistory(String homepage) {
        page = new Page(homepage);
    }

    public void visit(String url) {
        page.right = new Page(url);
        page.right.left = page;
        page = page.right;
    }

    public String back(int steps) {
        while (page.left != null && steps-- > 0) {
            page = page.left;
        }
        return page.url;
    }

    public String forward(int steps) {
        while ((page.right != null && steps-- > 0)) {
            page = page.right;
        }
        return page.url;
    }
}
