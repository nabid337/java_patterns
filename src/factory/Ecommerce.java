package factory;

public class Ecommerce extends Website {
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
    }
}
