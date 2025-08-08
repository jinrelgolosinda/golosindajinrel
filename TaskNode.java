import java.util.Scanner;

public class ToDoListManager {

    // --- TaskNode class ---
    static class TaskNode {
        String title;
        TaskNode next;

        public TaskNode(String title) {
            this.title = title;
            this.next = null;
        }
    }
