package beans;

public class PersonBean implements java.io.Serializable {

    private String name;
    private boolean deceased;

    public PersonBean() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeceased() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }
}
