package class19;

public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.openWebsite();
        chrome.performTesting();
        chrome.closeBrowser();
        System.out.println();

        Safari safari = new Safari();
        safari.openBrowser();
        safari.openWebsite();
        safari.performTesting();
        safari.closeBrowser();
        System.out.println();

        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.openWebsite();
        fireFox.performTesting();
        fireFox.closeBrowser();

    }
}
