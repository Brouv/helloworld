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
}
