import com.sun.tools.javac.Main;

import java.util.Scanner;

class Book {
    String title;
    String Author;
    boolean issued;
    void displayinfo(){
        System.out.println(title+"by"+Author);
    }

    public static void main(String[] args) {
        Book b = new Book();
        Scanner sc = new  Scanner(System.in);
        b.title = sc.nextLine();
        b.Author = sc.nextLine();
        b.displayinfo();
        b.displayinfo();

    }
}

