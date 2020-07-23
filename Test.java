import java.util.Scanner;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        boolean flag = true;

        while (flag) {
        System.out.println();
        System.out.println("1.Add item to the list at start");
        System.out.println("2.Add item to the last at the list");
        System.out.println("3.Reverse List");
        System.out.println("4.view List");
        System.out.println("5.View length");
        System.out.println("6.Exit");
        int choice = scanner.nextInt();
        int value;
        switch (choice) {
            case 1:
            System.out.println("Enter value of item");
            System.out.println();
            value = scanner.nextInt();
            list.addAtFirst(value);
                
                break;
            case 2:
            System.out.println("Enter value of item");
            System.out.println();
            value = scanner.nextInt();
            list.addNode(value);
                break;       
            case 3:
            System.out.println();
            list.printreverse();
                break;
            case 4:
            list.printList();
                break;
            case 5:
            int len = list.length();
            System.out.println("Length of DoublyLinkList is:"+len);
            break;
            case 6:
            flag = false;
            break;
            default:
                System.out.println("Invalid Choice"); 
                break; 
        }
    }
    scanner.close();
    }
}