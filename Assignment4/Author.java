class Author{

    private String name, email;
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

    public String toString(){
        return ("Author[name = " + name + "\nemail = " + email + "\ngender = " + gender);
    }

    public static void main(String[] args){
        Author a = new Author("Mr. Eagle", "Eagle01@gmail.com", 'm');
        System.out.println(a);
    }
}