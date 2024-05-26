public class Switchupdate {
    public static void main(String[] args) {
        String day ="friday";
        String result= "";

         result = switch(day)
        {
            case "Saturday","Sunday" -> "8Am";
            case "Monday" -> "5.20Am";
            default -> "4 Am";
        };
        System.out.println(day + ":"+ result);
    }
    
}
