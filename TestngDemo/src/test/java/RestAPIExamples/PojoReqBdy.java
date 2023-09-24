package RestAPIExamples;

public class PojoReqBdy {

    private String Description;
    private String name;

    //constructor
//    public PojoReqBdy(String description, String name) {
//        this.Description = description;
//        this.name = name;
//    }

    //getters and setters
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
