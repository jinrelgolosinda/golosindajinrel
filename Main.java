  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todo = new ToDoList();
        int choice;

        do {
            System.out.println("\n1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. View all tasks");
            System.out.println("4. Search task");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter a number:");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    todo.addTask(title);
                    break;
                case 2:
                    System.out.print("Enter task title to delete: ");
                    String delTitle = scanner.nextLine();
                    todo.deleteTask(delTitle);
                    break;
                case 3:
                    todo.printTasks();
                    break;
                case 4:
                    System.out.print("Enter task title to search: ");
                    String searchTitle = scanner.nextLine();
                    if (todo.contains(searchTitle)) {
                        System.out.println("\nTask found!");
                    } else {
                        System.out.println("\nTask not found.");
                    }
                    break;
                case 5:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
    }
