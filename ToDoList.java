static class ToDoList {
        private TaskNode head;

        // Add task to end
        public void addTask(String title) {
            TaskNode newNode = new TaskNode(title);
            if (head == null) {
                head = newNode;
            } else {
                TaskNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            System.out.println("\nTask added!");
        }

        // Delete task by title
        public void deleteTask(String title) {
            if (head == null) {
                System.out.println("\nNo tasks to delete.");
                return;
            }

            if (head.title.equalsIgnoreCase(title)) {
                head = head.next;
                System.out.println("\nTask deleted!");
                return;
            }

            TaskNode current = head;
            while (current.next != null && !current.next.title.equalsIgnoreCase(title)) {
                current = current.next;
            }

            if (current.next == null) {
                System.out.println("\nTask not found.");
            } else {
                current.next = current.next.next;
                System.out.println("\nTask deleted!");
            }
        }

        // Print all tasks
        public void printTasks() {
            if (head == null) {
                System.out.println("\nNo tasks available.");
                return;
            }

            System.out.println("\nYour Tasks:");
            TaskNode current = head;
            while (current != null) {
                System.out.println("- " + current.title);
                current = current.next;
            }
        }

        // Search for a task
        public boolean contains(String title) {
            TaskNode current = head;
            while (current != null) {
                if (current.title.equalsIgnoreCase(title)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // BONUS: Count number of tasks
        public int countTasks() {
            int count = 0;
            TaskNode current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        // BONUS: Insert task at a specific index
        public void insertTaskAt(int index, String title) {
            TaskNode newNode = new TaskNode(title);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
                System.out.println("\nTask inserted at index " + index);
                return;
            }

            TaskNode current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                System.out.println("\nInvalid index.");
                return;
            }

            newNode.next = current.next;
            current.next = newNode;
            System.out.println("\nTask inserted at index " + index);
        }
    }
