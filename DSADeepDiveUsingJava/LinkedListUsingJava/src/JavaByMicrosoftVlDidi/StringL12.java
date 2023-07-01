package JavaByMicrosoftVlDidi;

public class StringL12 {
    public static void main(String[] args) {
        String firstName ="Tony";
        String lastName ="Stark";
        String fullName=firstName + "@" +lastName ;
        System.out.println(fullName.length());
        System.out.println(fullName);
        for (int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
