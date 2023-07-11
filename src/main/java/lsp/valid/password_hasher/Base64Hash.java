package lsp.valid.password_hasher;

public class Base64Hash extends Hash {
    public Base64Hash() {
        this.passwordHasher = new Base64Hasher();
    }
}

// Give example of a class that would violate LSP
