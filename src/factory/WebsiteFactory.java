package factory;

public class WebsiteFactory {
    public static Website getWebsite(String type){
        switch (type){
            case "blog" : {
                return new Blog();
            }
            case "online_shop" : {
                return new Ecommerce();
            }
            default: {
                return null;
            }
        }

    }
}
