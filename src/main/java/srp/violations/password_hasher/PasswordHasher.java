package srp.violations.password_hasher;

public class PasswordHasher {
    public String hashAndSavePassword(String password) {
        hashPassword();
        savePassword();
    }

    public void hashPassword() {
        //hashing implementation
    }

    public void savePassword() {
        //save to the db
    }
}
