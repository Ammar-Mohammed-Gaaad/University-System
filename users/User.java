package users;
public abstract class User{
    private String name;
    private Long id;
    private String password;
    private String email;
    private String role;
    public User(){
        
    }
    public User(String name ,Long id, String password , String email ,String role){
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.role = role;
    }
    public String getName(){
        return name;
    }
    public Long getID(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public String getRole(){
        return role;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setID(Long id){
        this.id = id;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    

}

