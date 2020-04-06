package telran.data;

public class User {

    private String name;
    private int secretCode;

    public User(String name, int secretCode) {
        this.name = name;
        this.secretCode = secretCode;
    }

    @Override
    public String toString() {
        return "User {" + name +
                ", " + secretCode +
                "}\n";
    }

    public String getName() {
        return name;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static User getUserByName(User[] users, String name){
        for (int i = 0; i < users.length; i++) {
            if(users[i].getName().equalsIgnoreCase(name)){
                return users[i];
            }
        }
        return null;
    }

    public boolean checkSecretCode(int code) {
        if (code == this.secretCode) {
            return true;
        } else {
            return false;
        }
    }

}
