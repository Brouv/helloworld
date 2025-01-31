import java.util.Objects;

public record Author(String lastName, String name) {
    public Author(String lastName, String name){
        this.lastName = lastName;
        this.name = name ;
    }

    public String getLastName() {
        return this.lastName;
    }

    public  String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Автор - " + this.name + " " + this.lastName + ".";
    }

    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || this.getClass() != p.getClass()) return false;
        Author author = (Author) p;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(lastName);
    }
}
