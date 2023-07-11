package dip.valid.password_service;

public class PasswordService {
    private PasswordHasher passwordHasher;

    public PasswordService(PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

    void hashPassword(String password) {
        this.passwordHasher.hashPassword(password);
    }
}