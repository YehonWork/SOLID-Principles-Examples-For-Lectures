package lsp.valid.password_hasher;

public abstract class Hash {
    PasswordHasher passwordHasher;
    String hash;

    public void generateHash(String password) {
        hash = passwordHasher.hashPassword(password);
    }
}
