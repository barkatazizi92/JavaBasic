package class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] web = {new ChromeDriver(),new fireFoxDriver()};
        for(WebDriver webDriver: web){
            webDriver.openBrowser();
            webDriver.maximizeWindow();
            webDriver.findElement();
            webDriver.closeBrowser();
            System.out.println();
        }
    }
}
