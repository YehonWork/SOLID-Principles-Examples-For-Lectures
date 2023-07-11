package ocp.violations.password_hasher;

public class PasswordHasher {
    public String hashPassword(String password,HashingType hashingType)
    {

        if(HashingType.BASE64.equals(hashingType))
        {
            hashedPassword="hashed with Base64";
        }
        else if(HashingType.MD5.equals(hashingType))
        {
            hashedPassword="hashed with MD5";
        }

        return hashedPassword;
    }
}