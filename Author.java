
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public char getGender(){
        return gender;
    }

    public String setName(){
        return name;
    }
    public String setEmail( ){
        return email;
    }

    public char setGender(){
        return gender;
    }
    public String toString(){
        return (name + gender + ",at" + email);
    }
}
