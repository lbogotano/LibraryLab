public class PublishingCompany {
    
    private String publishingCo, website;

    PublishingCompany(String publishingCo, String website) {
        this.publishingCo = publishingCo;
        this.website = website;
    }

    public String getName() {
        return publishingCo;
    }

    public String getWebsite() {
        return website;
    }

    public void setName(String publishingCo) {
        this.publishingCo = publishingCo;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Published by " + this.publishingCo + " find more at " + this.website;
    }

    
}