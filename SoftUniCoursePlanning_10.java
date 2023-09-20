package List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> topics = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("course start")) {
            String [] commandParts = command.split(":");
            String commandName = commandParts[0]; //Add, Insert, Remove, Swap, Exercise
            String topic = commandParts[1];

            switch (commandName) {
                case "Add" :
                    if (!topics.contains(topic)){
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if (!topics.contains(topic)) {
                        topics.add(index, topic);
                    }
                    break;
                case "Remove":
                    int indexTopic = topics.indexOf(topic);
                    String exercise = topic + "-Exercise";

                    boolean hasExercise = topics.get(indexTopic + 1).equals(exercise);

                    if (topics.contains(topic)) {
                        topics.remove(topic);

                        if(topics.contains(topic)) {
                            topics.remove(exercise);
                        }
                    }
                    break;
                case "Swap":
                    String topic2 = commandParts[2];
                    if(topics.contains(topic) && topics.contains(topic2)) {
                        int indexFirst = topics.indexOf(topic);
                        int indexSecond = topics.indexOf(topic2);
                        topics.set(indexFirst, topic2);
                        topics.set(indexSecond, topic);

                        String exeFirts = topic + "-Exercise";
                        String exeSecond = topic2 + "_Exercise";
                        if(topics.contains(exeFirts)) {
                            topics.remove(exeFirts);
                            topics.add(topics.indexOf(topic) + 1, exeFirts);

                        }
                        if(topics.contains(exeSecond)) {
                            topics.remove(exeSecond);
                            topics.add(topics.indexOf(topic2) + 1, exeSecond);
                        }
                    }
                    break;
                case "Exercise":
                    String exerciseName = topic + "-Exercise";
                    if (topics.contains(topic)) {
                        int index1 = topics.indexOf(topic);
                        if(index1 == topics.size() - 1) {
                            topics.add(index1 + 1, exerciseName);
                        }else if (topics.get(index1 + 1).equals(exerciseName)) {
                            topics.add(index1 + 1, exerciseName);
                        }
                    }else {
                      topics.add(topic);
                      topics.add(exerciseName);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        int count = 1;
        for (String topic : topics) {
            System.out.println(count + "." + topic);
            count++;
        }
    }
}
