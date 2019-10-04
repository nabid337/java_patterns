package factory;

public class Main {
    public static void main (String args[]){

        Website blogSite = WebsiteFactory.getWebsite("blog");
        System.out.println(blogSite.getPages().get(0).pageName);

        Website ecomSite = WebsiteFactory.getWebsite("online_shop");
        System.out.println(ecomSite.getPages());

    }
}
