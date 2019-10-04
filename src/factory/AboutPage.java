package factory;

public class AboutPage extends Page{
    public AboutPage(){
        setPageName();
    }
    @Override
    public void setPageName() {
        this.pageName = "About";
    }
}
