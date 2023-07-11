package ocp.valid.password_hasher;

public interface PasswordHasher
{
    String hashPassword(String password);
}