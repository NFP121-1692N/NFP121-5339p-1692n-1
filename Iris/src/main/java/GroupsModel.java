public class GroupsModel {
    
    private int gID;
    private String name;
    private String description;

    public GroupsModel() {}

    public int getgID() {
        return gID;
    }

    public void setgID(int gID) {
        this.gID = gID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GroupsModel(int gID, String name, String description) {
        this.gID = gID;
        this.name = name;
        this.description = description;
    }       
}