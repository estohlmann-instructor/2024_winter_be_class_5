import java.util.*;

public class Class5 {
    public static void main(String[] args){
        Map<String, Double> studentsToGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        studentsToGrades.put(getName(scanner), getGrade(scanner));
        studentsToGrades.put(getName(scanner), getGrade(scanner));
        studentsToGrades.put(getName(scanner), getGrade(scanner));


        for (String key: studentsToGrades.keySet()) {
            System.out.println("Student " + key + " got grade " + studentsToGrades.get(key));
        }

    }

    private static String getName(Scanner scanner){
        System.out.print("Enter student name: ");
        return scanner.nextLine();
    }

    private static Double getGrade(Scanner scanner){
        System.out.print("Enter grade: ");
        Double grade = scanner.nextDouble();
        scanner.nextLine();
        return grade;
    }
    private static void sets(){
        Set<String> fastFoodJoints = new TreeSet<>();
        fastFoodJoints.add("McDonalds");
        fastFoodJoints.add("BK");
        fastFoodJoints.add("Taco Bell");
        fastFoodJoints.add("ChickFilA");
        fastFoodJoints.add("McDonalds");

        for(String place : fastFoodJoints){
            System.out.println(place);
        }
    }

    private static void lists(){
        List<String> footballTeams = new ArrayList<>();
        footballTeams.add("Eagles");
        footballTeams.add("Packers");
        footballTeams.add("Chiefs");
        footballTeams.add("49ers");
        footballTeams.add("Cowgirls");

        for(int i = 0; i < footballTeams.size(); i++){
            System.out.println(footballTeams.get(i));
        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        Collections.sort(footballTeams);
        footballTeams.forEach(team -> System.out.println(team));

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        Collections.sort(footballTeams, Collections.reverseOrder());

        footballTeams.remove("Chiefs");
        for(String team : footballTeams){
            System.out.println(team);
        }
    }

    private static void arrays(){
        String[] names = new String[]{"Evan", "Kayla", "Frank", "Pete", "Jesse"};
        names[0] = "Evan";
        names[1] = "Kayla";
        names[2] = "Frank";
        names[3] = "Pete";
        names[4] = "Jesse";

        for(int i = 0; i < names.length; i++){
            System.out.println("My name is " + names[i] + " at " + i + ".");
        }

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        Arrays.sort(names);
        for (String name : names) {
            System.out.println("My name is " + name);
        }
    }

}
