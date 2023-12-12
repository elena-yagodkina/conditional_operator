public class Task5 {
    public static void main(String[] args) {
        int age = 3;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            if (age >= 14)
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
        }
    }
}
