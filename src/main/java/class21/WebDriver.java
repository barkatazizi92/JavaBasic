package class21;
/*
Create a webDirver Interface that will have the following unimplemented behavior:
 openBrowser(), closeBrowser(), maximizeWindow(), findelement(),
Create 2 classes that implements WebDriver interface: ChromeDeriver and FirefoxDeriver.
 */
public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("chrome open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("chrome close the browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("chrome maximize the window");
    }

    @Override
    public void findElement() {
        System.out.println("chrome find the elements");
    }
}
class fireFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("fireFox open the browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("fire fox close the browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("fire fox maximize the window");
    }

    @Override
    public void findElement() {
        System.out.println("fire fox find the element");
    }
}
