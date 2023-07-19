package Problem2;

public class Using_trim_and_replace_Runner {
    public static void main(String[] args) {
        String something=" Emon Khan ";
        Using_trim_and_replace object = new Using_trim_and_replace();
        System.out.println(object.useTrim(something));
        System.out.println(object.useReplaceAllSpaces(object.useTrim(something)));
    }
}
