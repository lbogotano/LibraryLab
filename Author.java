public class Author {

    private String name;
    private int age;
    private PublishingCo publisher;

    Author(String name, int age, PublishingCo publisher) {
        this.name = name;
        this.age = age;
        this.publisher = publisher;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public PublishingCo getPublishingCompany(){
        return publisher;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPublisher(PublishingCo publisher) {
        this.publisher = publisher;
    }
    

    @Override
    public String toString() {
        return this.name + this.age + this.publisher;
    }

    
}