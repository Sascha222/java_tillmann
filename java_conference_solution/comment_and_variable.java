public class comment_and_variable {
    public static void main(String[] args) {

        String conference_name = "Java conference";
        final int available_conference_tickets = 50;
        int rest_tickets = 20;

        System.out.println("Welcome to our " + conference_name);
        System.out.println("We have " + available_conference_tickets + " tickets available in sum");
        System.out.println("Only " + rest_tickets + " tickets are left");
        System.out.println("Get them now");
    }
}
