package Exceptions;

public class Test {
    public static void main(String[] args) {
        //String username = "kamal";
        String username = "kamalerr";
        String password = "kamal7989";
        boolean isValid = false;
        try {
            if(isValid(username, password))
                System.out.println("Valid user");
            //if (isValid)
            /*else
                System.out.println("Wrong username or password");*/
        }catch(NullPointerException e){
            System.out.println("username or password is null");
        }catch(InvalidUserException e){
            System.out.println(e.getMessage());

        }

    }

    private static boolean isValid(String username, String password) throws NullPointerException,InvalidUserException{
        boolean isValid = false;
        if (username.equals("kamal") && password.equals("kamal7989"))
            isValid = true;
        else
            throw new InvalidUserException("wrong userneme or password");
        return isValid;

        /*try {
            if (username.equals("kamal") && password.equals("kamal7989"))
                isValid = true;
        }catch{
            System.out.println("Username or Password is null");
        }
        return isValid;*/
    }
}
