import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

        public static void main(String[] args) {
            List<Task> allTasks = new ArrayList<>();
            for (int first = 2; first <= 9; first++) {
                for (int second = first; second <= 9; second++) {
                    allTasks.add(new Task(first, second));
                }
            }
            Collections.shuffle(allTasks);
            List<Task> chosenPairs = allTasks.subList(0, 15);

            System.out.println();
            System.out.print(chosenPairs);
            System.out.println();
        }
    }
