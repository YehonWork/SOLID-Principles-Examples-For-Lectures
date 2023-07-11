package dip.violation.password_service;

public class PasswordService {
    private Base64Hasher hasher = new Base64Hasher();

    void hashPassword(String password) {
        hasher.hashPassword(password);
    }
}
