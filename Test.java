import java.util.Scanner;
//THis is the test file to check all the fuctions
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
        System.out.println("3.Insert at middle");
        System.out.println("4.Insert at a pos");
        System.out.println("5.Reverse List");
        System.out.println("6.view List");
        System.out.println("7.View length");
        System.out.println("8.Delete at middle");
        System.out.println("9.Delete at position");
        System.out.println("10.Delete by value");
        System.out.println("11.Exit");
        int choice = scanner.nextInt();
        int value,pos;
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
            System.out.println("Enter value of item");
            System.out.println();
            value =scanner.nextInt();
            list.insertAtMiddle(value);
            break;

            case 4:
            System.out.println("Enter position of item");
            pos = scanner.nextInt();
            System.out.println("Enter value of item");
            System.out.println();
            value =scanner.nextInt();
            list.insertAtpos(pos,value);
                break;

            case 5:
            System.out.println();
            list.printreverse();
                break;
            case 6:
            list.printList();
                break;
            case 7:
            int len = list.length();
            System.out.println("Length of DoublyLinkList is:"+len);
                break;
            case 8:
            list.deleteAtmiddle();
            break;
            case 9:
            System.out.println("Enter pos you want to delete an element");
            list.deleteAtpos(scanner.nextInt());
            break;
            case 10:
            System.out.println("Enter element you want to delete");
            list.deleteByValue(scanner.nextInt());
            break;
            case 11:
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