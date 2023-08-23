import java.util.ArrayList;
import java.util.Scanner;

public class TaskList{
    private byte choose;
    Scanner chooser = new Scanner(System.in);
    Scanner tasker = new Scanner(System.in);

    TaskList (){
        ArrayList<String> tasklist = new ArrayList();


        while (true) {
            choose = showMenu();

            switch (choose){
                case 1: {
                    System.out.println("Введите задачу для планирования:");

                    String task = tasker.nextLine();
                    tasklist.add(task);
                    System.out.println("Задача добавлена.");
                    System.out.println();
                    break;
                }
                case 2: {
                    showTasks(tasklist);


                    break;
                }
                case 3: {
                    showTasks(tasklist);

                    System.out.println("Введите номер задачи, которую необходимо удалить:");
                    int taskNum = tasker.nextByte();
                    tasklist.remove(taskNum - 1);
                    System.out.println("Задача удалена.");
                    System.out.println();


                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }

            }
        }
    }
    private byte showMenu(){
        System.out.println("Выберите действие:");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("0. Выход");
        System.out.println();

        return chooser.nextByte();

    }
    private void showTasks(ArrayList tasklist){
        System.out.println("Список задач:");
        for (int i = 0; i<tasklist.size(); i++){
            System.out.println( (i + 1) + ". " + tasklist.get(i).toString() );
        }
        System.out.println();
    }
}
