package homework;

public abstract  class User implements Report, Persister, Printer {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
