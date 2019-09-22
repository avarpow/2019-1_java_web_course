package authorbook;
public class Author {
    private String name, email;
    private Character gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name = " + this.name + ", email = " + this.email + ", gender = " +gender + "]";
    }
}