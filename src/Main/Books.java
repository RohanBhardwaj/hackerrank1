package Main;

import java.util.Scanner;

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
class Books {
    String BookName;
    String AuthorName;
    long ISBN;
    Scanner scanner = new Scanner(System.in);

    void Display() {
        int n = scanner.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                scanner.nextLine();
                String BookName = scanner.nextLine();
                String AuthorName = scanner.nextLine();
                long ISBN = scanner.nextLong();
                System.out.println("-----------------------------");
                System.out.println("Book Name:\t" + BookName);
                System.out.println("Author Name:\t" + AuthorName);
                System.out.println("ISBN:\t" + ISBN);
                System.out.println("-----------------------------");
            }
        } else
            System.out.println("N/A");
    }
}

