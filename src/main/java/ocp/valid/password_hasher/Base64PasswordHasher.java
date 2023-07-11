package ocp.valid.password_hasher;

public class Base64PasswordHasher implements PasswordHasher
{
    @Override
    public String hashPassword(String password)
    {
        return "hashed with 64";
    }
}
