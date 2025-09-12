public class medicine {

    public String name;;
    public String useString;
    public String cloString;

    public medicine(String name, String useString, String cloString) {
        this.name = name;
        this.useString = useString;
        this.cloString = cloString;
    }
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUseString() {
        return useString;
    }

    public void setUseString(String useString) {
        this.useString = useString;
    }

    public String getCloString() {
        return cloString;
    }

    public void setCloString(String cloString) {
        this.cloString = cloString;
    }   
}