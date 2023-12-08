
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Garces_finalPortfolio {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        //INSTANTIATIONS
        Scanner input = new Scanner(System.in);

    
        char response = 'y';

        //DATA STRUCTURES MENU
        while (response == 'y') {
            mainMenu();

            System.out.print("\nDo you want to try again? y/n: ");// response
            response = input.next().charAt(0);
            if (response == 'n') {
                System.exit(0);
            }
        }
    }

    //METHODS
    public static void mainMenu() {

        //VARIABLES
        int algoOption;

// Inside mainMenu method
        System.out.println("┌────────────────────────────────────────┐");
        System.out.println("│       DATA STRUCTURES MENU         │");
        System.out.println("├────────────────────────────────────────┤");
        System.out.println("│ 1 - List                           │");
        System.out.println("│ 2 - Linked List                    │");
        System.out.println("│ 3 - Stack                          │");
        System.out.println("│ 4 - Queue                          │");
        System.out.println("│ 5 - Tree                           │");
        System.out.println("│ 6 - Binary Tree                    │");
        System.out.println("│ 7 - Graph                          │");
        System.out.println("│ 0 - EXIT                           │");
        System.out.println("└────────────────────────────────────────┘");
        System.out.print("\nEnter Your Choice: ");

        if (input.hasNextInt()) {
            algoOption = input.nextInt();
            switch (algoOption) {
                case 1:
                    listMenu(input, list);
                    break;

                case 2:
                    linkedlistMenu();
                    break;

                case 3:
                    StackMenu();
                    break;

                case 4:
                    QueueMenu();
                    break;

                case 5:
                    Tree();
                    break;

                case 6:
                    BinaryTree();
                    break;

                case 7:
                    Graph();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please try again.");
            input.next();
        }
    }

    public static void listMenu(Scanner input, ArrayList<String> list) {
        char response = 'y';
        int listOption;

        while (response == 'y') {
            System.out.println("┌──────── LIST ────────┐");
            System.out.println(" 1 - ADD ITEM           ");
            System.out.println(" 2 - DELETE ITEM        ");
            System.out.println(" 3 - PRINT LIST         ");
            System.out.println(" 0 - BACK               ");
            System.out.println("------------------------");
            System.out.print("Enter Your Choice: ");

            if (input.hasNextInt()) {
                listOption = input.nextInt();
                switch (listOption) {
                    case 1:
                        System.out.print("Enter a number to add: ");
                        input.nextLine();
                        String itemList = input.nextLine();
                        list.add(itemList);
                        break;

                    case 2:
                        System.out.print("Enter a number to delete: ");
                        input.nextLine();
                        itemList = input.nextLine();
                        if (!list.isEmpty() && list.contains(itemList)) {
                            list.remove(itemList);
                        } else if (list.isEmpty()) {
                            System.out.println("\nList is Empty");
                        } else {
                            System.out.println("\nNumber does not exist in the list.");
                        }
                        break;

                    case 3:
                        System.out.println("List: " + list);
                        break;

                    case 0:
                        System.out.println("\n\n");
                        return;
                    default:
                        System.out.println("Invalid Input. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please try again.");
                input.next();
            }
            System.out.print("\nDo you want to try again? y/n: ");
            response = input.next().charAt(0);
            if (response == 'n') {
                System.exit(0);
            }
        }
    }

    public static void linkedlistMenu() {

        //FOR LINKED LIST
        int LinkedlistOption;
        int singleLinkedlist, doublyLinkedlist, circularLinkedlist;
        int insert, delete;
        char response = 'y';

        //INSTANTIATION
        Scanner input = new Scanner(System.in);

        System.out.println("┌─────── LINKED LIST ────────┐");
        System.out.println("|1| - SINGLY LINKED LIST");
        System.out.println("|2| - DOUBLY LINKED LIST");
        System.out.println("|3| - CIRCULAR LINKED LIST");
        System.out.println("|0| - BACK");
        System.out.println("---------------------------");
        System.out.print("Enter Your Choice: ");

        if (input.hasNextInt()) {
            LinkedlistOption = input.nextInt();
            switch (LinkedlistOption) {
                case 1:
                    SinglyLinkedList singlelist = new SinglyLinkedList();
                    while (response == 'y') {

                        System.out.println("┌──────── SINGLY LINKED LIST ────────┐");
                        System.out.println(" 1 - INSERT ITEM                      ");
                        System.out.println(" 2 - DELETE ITEM                      ");
                        System.out.println(" 3 - PRINT LIST                    ");
                        System.out.println(" 0 - BACK                             ");
                        System.out.println("----------------------------------");
                        System.out.print("Enter Your Choice: ");

                        if (input.hasNextInt()) {
                            singleLinkedlist = input.nextInt();
                            switch (singleLinkedlist) {
                                case 1:
                                    System.out.print("Enter a number to insert: ");
                                    if (input.hasNextInt()) {
                                        insert = input.nextInt();
                                        singlelist.insert(insert);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }

                                    break;

                                case 2:
                                    System.out.print("Enter the number to delete: ");
                                    if (input.hasNextInt()) {
                                        delete = input.nextInt();
                                        singlelist.delete(delete);
                                    } else {
                                        System.out.println("Invalid input. Please try again..");
                                        input.next();
                                    }
                                    break;

                                case 3:
                                    System.out.println("Singly Linked List: ");
                                    singlelist.print();
                                    break;

                                case 0:
                                    System.out.println("\n\n");
                                    linkedlistMenu();
                                    break;

                                default:
                                    System.out.println("Invalid Input. Please try again.");
                                    break;

                            }
                        } else {
                            System.out.println("Invalid input. Please try again");
                            input.next();
                        }
                        System.out.print("\nDo you want to try again? y/n: ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    DoublyLinkedList doublylist = new DoublyLinkedList();

                    while (response == 'y') {
                        System.out.println("┌──── DOUBLY LINKED LIST ────┐");
                        System.out.println("1 - INSERT ITEM");
                        System.out.println("2 - DELETE ITEM");
                        System.out.println("3 - PRINT LIST");
                        System.out.println("0 - BACK");
                        System.out.println("---------------------------");

                        System.out.print("Enter Your Choice: ");

                        if (input.hasNextInt()) {
                            doublyLinkedlist = input.nextInt();
                            switch (doublyLinkedlist) {
                                case 1:
                                    System.out.print("Enter a number to insert: ");
                                    if (input.hasNextInt()) {
                                        insert = input.nextInt();
                                        doublylist.insert(insert);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }

                                    break;

                                case 2:
                                    System.out.print("Enter a number to delete: ");
                                    if (input.hasNextInt()) {
                                        delete = input.nextInt();
                                        doublylist.delete(delete);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }
                                    break;

                                case 3:
                                    System.out.println("Doubly Linked List: ");
                                    doublylist.print();
                                    break;

                                case 0:
                                    System.out.println("\n\n");
                                    linkedlistMenu();
                                    break;

                                default:
                                    System.out.println("Invalid Input. Please try again.");
                                    break;

                            }
                        } else {
                            System.out.println("Invalid input. Please try again.");
                            input.next();
                        }
                        System.out.print("\nDo you want try again? y/n: ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            System.exit(0);
                        }
                    }
                    break;

                case 3:
                    CircularLinkedList circularlist = new CircularLinkedList();
                    while (response == 'y') {
                        System.out.println("┌──── CIRCULAR LINKED LIST ────┐");
                        System.out.println("1 - INSERT ITEM");
                        System.out.println("2 - DELETE ITEM");
                        System.out.println("3 - PRINT LIST");
                        System.out.println("0 - BACK");
                        System.out.println("------------------------------");

                        System.out.print("Enter Your Choice: ");

                        if (input.hasNextInt()) {
                            circularLinkedlist = input.nextInt();
                            switch (circularLinkedlist) {
                                case 1:
                                    System.out.print("Enter a number to add: ");
                                    if (input.hasNextInt()) {
                                        insert = input.nextInt();
                                        circularlist.insert(insert);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }

                                    break;

                                case 2:
                                    System.out.print("Enter a number to delete: ");
                                    if (input.hasNextInt()) {
                                        delete = input.nextInt();
                                        circularlist.delete(delete);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }
                                    break;

                                case 3:
                                    System.out.println("Circular Linked List: ");
                                    circularlist.print();
                                    break;

                                case 0:
                                    System.out.println("\n\n");
                                    linkedlistMenu();
                                    break;

                                default:
                                    System.out.println("Invalid Input. Please try again.");
                                    break;

                            }
                        } else {
                            System.out.println("Invalid input. Please try again.");
                            input.next();
                        }
                        System.out.print("\nDo you want to try again? y/n: ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            System.exit(0);
                        }
                    }
                    break;

                case 0:
                    System.out.println("\n\n");
                    mainMenu();
                    break;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;

            }
        } else {
            System.out.println("Invalid input. Please try again.");
            input.next();
        }
        System.out.print("\nDo you want to try again? y/n: ");
        response = input.next().charAt(0);
        if (response == 'n') {
            System.exit(0);
        }
    }

    //CLASSES FOR LINKEDLIST METHOD
    public static class SinglyLinkedList {

        private Node head;

        // Node class for singly-linked list
        private static class Node {

            int item;
            Node next;

            Node(int item) {
                this.item = item;
                this.next = null;
            }
        }

        // Method to print the list
        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.item + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to insert a new node
        public void insert(int item) {
            Node newNode = new Node(item);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to delete a node
        public void delete(int key) {
            Node current = head, prev = null;
            if (current != null && current.item == key) {
                head = current.next;
                return;
            }
            while (current != null && current.item != key) {
                prev = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }
            prev.next = current.next;
        }

    }

    public static class DoublyLinkedList {

        private Node head;
        private Node tail;

        // Node class for doubly-linked list
        private static class Node {

            int item;
            Node prev;
            Node next;

            Node(int item) {
                this.item = item;
                this.prev = null;
                this.next = null;
            }
        }

        // Method to print the list
        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.item + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to insert a new node
        public void insert(int item) {
            Node newNode = new Node(item);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        // Method to delete a node
        public void delete(int key) {
            Node current = head;
            if (current != null && current.item == key) {
                head = current.next;
                if (head != null) {
                    head.prev = null;
                }
                return;
            }
            while (current != null && current.item != key) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }

    }

    public static class CircularLinkedList {

        private Node head;
        private Node tail;

        // Node class for circular linked list
        private static class Node {

            int item;
            Node next;

            Node(int item) {
                this.item = item;
                this.next = null;
            }
        }

        // Method to print the list
        public void print() {
            if (head != null) {
                Node current = head;
                do {
                    System.out.print(current.item + " ");
                    current = current.next;
                } while (current != head);
                System.out.println();
            }
        }

        // Method to insert a new node
        public void insert(int item) {
            Node newNode = new Node(item);
            if (head == null) {
                head = tail = newNode;
                newNode.next = head;
            } else {
                tail.next = newNode;
                newNode.next = head;
                tail = newNode;
            }
        }

        // Method to delete a node
        public void delete(int key) {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }

            do {
                if (current.item == key) {
                    if (current == head && current == tail) {
                        head = tail = null;
                    } else if (current == head) {
                        head = current.next;
                        tail.next = head;
                    } else if (current == tail) {
                        Node prevToTail = head;
                        while (prevToTail.next != tail) {
                            prevToTail = prevToTail.next;
                        }
                        prevToTail.next = head;
                        tail = prevToTail;
                    } else {
                        Node prev = head;
                        while (prev.next != current) {
                            prev = prev.next;
                        }
                        prev.next = current.next;
                    }
                    return;
                }
                current = current.next;
            } while (current != head);
        }

    }

    public static void StackMenu() {
        //INSTANTIATION
        Scanner input = new Scanner(System.in);

        //FOR STACK
        int stackOption, stack;
        int push, size;
        String infix;
        char response = 'y';

        System.out.println("┌────── STACK ───────┐");
        System.out.println("1 - STACK OPERATIONS");
        System.out.println("2 - STACK APPLICATION");
        System.out.println("0 - BACK");
        System.out.println("--------------------");
        System.out.print("Enter Your Choice: ");

        if (input.hasNextInt()) {
            stack = input.nextInt();
            switch (stack) {
                case 1:
                    StackClass stackInput = new StackClass();
                    while (response == 'y') {

                        System.out.println("┌──── STACK OPERATIONS ────┐");
                        System.out.println("1 - INITIALIZE STACK SIZE");
                        System.out.println("2 - PUSH TOP");
                        System.out.println("3 - POP TOP");
                        System.out.println("4 - PRINT STACK");
                        System.out.println("0 - BACK");
                        System.out.println("--------------------------");
                        System.out.print("Enter Your Choice: ");

                        if (input.hasNextInt()) {
                            stackOption = input.nextInt();
                            switch (stackOption) {
                                case 1:
                                    System.out.print("Enter the size of the stack: ");
                                    if (input.hasNextInt()) {
                                        size = input.nextInt();
                                        stackInput.initStack(size);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }
                                    break;

                                case 2:
                                    System.out.print("Enter a number to push: ");
                                    if (input.hasNextInt()) {
                                        push = input.nextInt();
                                        stackInput.push(push);
                                    } else {
                                        System.out.println("Invalid input. Please try again.");
                                        input.next();
                                    }
                                    break;

                                case 3:
                                    System.out.println("The top " + stackInput.getTop() + " has been popped");
                                    stackInput.pop();
                                    break;

                                case 4:
                                    System.out.println("Stack: ");
                                    stackInput.printStack();
                                    break;

                                case 0:
                                    System.out.println("\n\n");
                                    StackMenu();
                                    break;

                                default:
                                    System.out.println("Invalid Input. Please try again.");
                                    break;

                            }
                        } else {
                            System.out.println("Invalid input. Please try again.");
                            input.next();
                        }
                        System.out.print("\nDo you want to try again? y/n: ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    InfixToPostfixConverter postfix = new InfixToPostfixConverter();
                    InfixToPrefixConverter prefix = new InfixToPrefixConverter();
                    PostfixCalculation calculate = new PostfixCalculation();

                    while (response == 'y') {
                        System.out.println("┌── STACK APPLICATION ──┐");
                        System.out.print("Enter an Infix Expression: ");
                        input.nextLine();
                        infix = input.nextLine();
                        System.out.println("POSTFIX: " + postfix.infixToPostfix(infix));
                        System.out.println("PREFIX: " + prefix.infixToPrefix(infix));
                        char b[] = postfix.infixToPostfix(infix).toCharArray();
                        System.out.print("\nValue of the expression is: " + calculate.eval(b));

                        System.out.print("\nDo you want try again? y/n: ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            StackMenu();
                        }
                    }
                    break;

                case 0:
                    System.out.println("\n\n");
                    mainMenu();
                    break;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;

            }
        } else {
            System.out.println("Invalid input. Please try again.");
            input.next(); 
        }
        System.out.print("\nDo you want to try again? y/n: ");
        response = input.next().charAt(0);
        if (response == 'n') {
            System.exit(0);
        }
    }

    //STACK CLASSES
    public static class StackClass {

        // store elements of stack
        private int arr[];
        // represent top of stack
        private int top;
        // total capacity of the stack
        private int capacity;

        StackClass() {

        }

        // Creating a stack
        public void initStack(int size) {
            // initialize the array
            // initialize the stack variables
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public int getTop() {
            return arr[top];
        }

        // push elements to the top of stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Limit Exceeded.");
                return;
            }

            if (capacity == 0) {
                System.out.println("Please input a size first.");
                return;
            }

            // insert element on top of stack
            System.out.println(x + "Inserted");
            arr[++top] = x;
        }

        // pop elements from top of stack
        public int pop() {

            // if stack is empty
            // no element to pop
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }

            // pop element from top of stack
            return arr[top--];
        }

        // return size of the stack
        public int getSize() {
            return top + 1;
        }

        // check if the stack is empty
        public Boolean isEmpty() {
            return top == -1;
        }

        // check if the stack is full
        public Boolean isFull() {
            return top == capacity - 1;
        }

        // display elements of stack
        public void printStack() {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static class InfixToPostfixConverter {

        InfixToPostfixConverter() {

        }

        // Function to check if a character is an operator
        private static boolean isOperator(char ch) {
            return ch == '+' || ch == '-' || ch == '*' || ch == '/';
        }

        // Function to get the precedence of an operator
        private static int getPrecedence(char operator) {
            switch (operator) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
            }
            return -1; // For non-operators
        }

        // Function to convert infix expression to postfix
        public static String infixToPostfix(String infix) {
            StringBuilder postfix = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            for (char ch : infix.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    postfix.append(ch);
                } else if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop());
                    }
                    stack.pop(); // Pop the '('
                } else if (isOperator(ch)) {
                    while (!stack.isEmpty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            // Pop any remaining operators from the stack
            while (!stack.isEmpty()) {
                postfix.append(stack.pop());
            }

            return postfix.toString();
        }
    }

    public static class InfixToPrefixConverter {

        // Function to check if a character is an operator
        private static boolean isOperator(char ch) {
            return ch == '+' || ch == '-' || ch == '*' || ch == '/';
        }

        // Function to get the precedence of an operator
        private static int getPrecedence(char operator) {
            switch (operator) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
            }
            return -1; // For non-operators
        }

        // Function to reverse a string
        private static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }

        // Function to convert infix expression to prefix
        public static String infixToPrefix(String infix) {
            StringBuilder prefix = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            // Reverse the infix expression
            infix = reverseString(infix);

            for (char ch : infix.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    prefix.append(ch);
                } else if (ch == ')') {
                    stack.push(ch);
                } else if (ch == '(') {
                    while (!stack.isEmpty() && stack.peek() != ')') {
                        prefix.append(stack.pop());
                    }
                    stack.pop(); // Pop the ')'
                } else if (isOperator(ch)) {
                    while (!stack.isEmpty() && getPrecedence(ch) < getPrecedence(stack.peek())) {
                        prefix.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            // Pop any remaining operators from the stack
            while (!stack.isEmpty()) {
                prefix.append(stack.pop());
            }

            // Reverse the final prefix expression
            return reverseString(prefix.toString());
        }
    }

    public static class PostfixCalculation {

        double a[] = new double[20];
        int top;

        PostfixCalculation() {
            top = -1;
        }

        void push(double x) {
            top++;
            a[top] = x;
        }

        double pop() {
            if (top == -1) {
                System.out.println("\nImproper expression !" + (char) 7);
                StackMenu();
            }
            return a[top--];
        }

        boolean isdigit(char x) {
            return (x >= '0' & x <= '9');
        }

        double val(double v1, double v2, char x) {
            switch (x) {
                case '+':
                    return v1 + v2;
                case '-':
                    return v1 - v2;
                case '*':
                    return v1 * v2;
                case '/':
                    return v1 / v2;
                case '%':
                    return v1 % v2;
                case '^':
                    return Math.pow(v1, v2);
                default:
                    System.out.println("Improper Operation" + (char) 7);
                    StackMenu();
            }
            return 1;
        }

        double eval(char b[]) {
            double v1, v2, v3, v;
            for (int i = 0; i < b.length; i++) {
                if (isdigit(b[i])) {
                    push((double) b[i] - 48);
                } else {
                    v2 = pop();
                    v1 = pop();
                    v = val(v1, v2, b[i]);
                    push(v);
                }
            }
            if (top != 0) {
                System.out.println("\nImproper expression" + (char) 7);
                StackMenu();
            }
            return pop();
        }
    }

    public static void QueueMenu() {
        //INSTANTIATION
        Scanner input = new Scanner(System.in);


        
        int queue, queueOption; 
        int queueSize, shift;
        String enQueue, clearText;
        char response = 'y';

        System.out.println("┌────── QUEUE ──────┐");
        System.out.println("1 - QUEUE OPERATIONS");
        System.out.println("2 - QUEUE ENCRYPTION");
        System.out.println("0 - BACK");
        System.out.println("----------------------");

        System.out.print("Enter Your Choice: ");

        if (input.hasNextInt()) {
            queue = input.nextInt();
            switch (queue) {
                case 1:
                    QueueMethods queueInput = new QueueMethods();
                    while (response == 'y') {
                        System.out.println("┌──── QUEUE OPERATIONS ─────┐");
                        System.out.println("1 - INITIALIZE QUEUE SIZE");
                        System.out.println("2 - ENQUEUE");
                        System.out.println("3 - DEQUEUE");
                        System.out.println("4 - DISPLAY QUEUE");
                        System.out.println("0 - BACK");
                        System.out.println("--------------------------");
                        System.out.print("Enter Your Choice: ");

                        if (input.hasNextInt()) {
                            queueOption = input.nextInt();
                            switch (queueOption) {
                                case 1:
                                    System.out.print("Enter the Queue size: ");
                                    if (input.hasNextInt()) {
                                        queueSize = input.nextInt();
                                        queueInput.initQueue(queueSize);
                                    } else {
                                        System.out.println("Invalid input. Please enter a valid number.");
                                        input.next(); 
                                    }
                                    break;

                                case 2:
                                    System.out.print("Enter value to enqueue: ");
                                    input.nextLine();
                                    enQueue = input.nextLine();
                                    queueInput.enQueue(enQueue);
                                    break;

                                case 3:
                                    queueInput.deQueue();
                                    break;

                                case 4:
                                    System.out.println("Queue: ");
                                    queueInput.display();
                                    break;

                                case 0:
                                    System.out.println("\n\n");
                                    QueueMenu();
                                    break;

                                default:
                                    System.out.println("Invalid Input. Please try again.");
                                    break;

                            }
                        } else {
                            System.out.println("Invalid input. Please try again.");
                            input.next(); // Consume the invalid input to prevent an infinite loop
                        }
                        System.out.print("\nDo you want to try again? y/n: ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                QueueEncrypt encryption = new QueueEncrypt();
                    while (response == 'y') {
                        System.out.println("┌── QUEUE ENCRYPTION ──┐");
                        System.out.print("Enter CLEARTEXT: ");
                        input.nextLine();
                        clearText = input.nextLine();
                        System.out.print("Enter shift value: ");
                        shift = input.nextInt();

                        String encrypted = encryption.encrypt(clearText, shift);

                        System.out.println("CIHPER TEXT: " + encrypted);

                        System.out.print("\nDo you want to try again?[y/n] = ");
                        response = input.next().charAt(0);
                        if (response == 'n') {
                            QueueMenu();
                        }
                    }
                    break;

                case 0:
                    System.out.println("\n\n");
                    mainMenu();
                    break;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;

            }
        } else {
            System.out.println("Invalid input. Please try again.");
            input.next(); 
        }
        System.out.print("\nDo you want to try again? y/n: ");
        response = input.next().charAt(0);
        if (response == 'n') {
            System.exit(0);
        }
    }

    //QUEUE CLASSES
    public static class QueueMethods {

        //TODO: FIX METHOD ERRORS
        int front, back;
        int Length;
        String items[];

        void initQueue(int queueSize) {
            this.Length = queueSize;
            this.items = new String[Length];
            this.front = -1;
            this.back = -1;
        }

        boolean isFull() {
            if (back == Length - 1) {
                return true;
            } else {
                return false;
            }
        }

        boolean isEmpty() {
            if (front == -1 && back == -1) {
                return true;
            } else {
                return false;
            }
        }

        void enQueue(String itemValue) {
            if (isFull()) {
                System.out.println("The queue is already full.");
            } else if (front == -1 && back == -1) {
                front = back = 0;
                items[back] = itemValue;
            } else if (this.items == null) {
                System.out.println("Please input the queue size first.");
            } else {
                back++;
                items[back] = itemValue;
            }
        }

        void deQueue() {
            if (isEmpty()) {
                System.out.println("The queue is already empty.");
            } else if (Length == 0) {
                System.out.println("Please input the queue size first.");
            } else if (front == back) {
                System.out.println("Front " + peek() + " has been dequeued");
                front = back = -1;
            } else {
                System.out.println("Front " + peek() + " has been dequeued");
                front++;
            }
        }

        void display() {
            int i;

            if (isEmpty()) {
                System.out.println("The queue is empty.");
            } else {
                for (i = front; i <= back; i++) {
                    System.out.print(items[i] + " ");
                }
            }
        }

        String peek() {
            return items[front];
        }
    }

    public static class QueueEncrypt {

        private static final int ALPHABET = 26;

        public static String encrypt(String text, int shift) {
            Queue<Character> queue = new LinkedList<>();
            for (char c : text.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    c = (char) ((c - base + shift) % ALPHABET + base);
                }
                queue.add(c);
            }

            StringBuilder encryptedText = new StringBuilder();
            while (!queue.isEmpty()) {
                encryptedText.append(queue.poll());
            }

            return encryptedText.toString();
        }
    }

    public static void Tree() {
        //INSTANTIATION
        Scanner input = new Scanner(System.in);
          

        //FOR TREE 
        int treeOption; //OPTIONS
        char response = 'y';

        while (response == 'y') {
            System.out.println("┌────── TREE ──────┐");
            System.out.println("1 - ADD NODE");
            System.out.println("2 - DELETE NODE");
            System.out.println("3 - UPDATE NODE");
            System.out.println("4 - PRINT TREE");
            System.out.println("0 - BACK");
            System.out.println("------------------");
            System.out.print("Enter Your Choice: ");

             Tree treeInput = new Tree("Root");
             
            if (input.hasNextInt()) {
                treeOption = input.nextInt();
                switch (treeOption) {
                    case 1:
                        treeInput.addNode();
                        break;

                    case 2:
                        treeInput.deleteNode();
                        break;

                    case 3:
                        treeInput.updateTree();
                        break;

                    case 4:
                        System.out.println("\nTree:");
                        treeInput.printTree(treeInput.getRoot(), "", true);
                        break;

                    case 0:
                        System.out.println("\n\n");
                        mainMenu();
                        break;

                    default:
                        System.out.println("Invalid Input. Please try again.");
                        break;

                }
            } else {
                System.out.println("Invalid input. Please try again.");
                input.next(); 
            }
            System.out.print("\nDo you want to try again? y/n: ");
            response = input.next().charAt(0);
            if (response == 'n') {
                System.exit(0);
            }
        }
    }

    //TREE CLASSES
    public static class TreeNode {

        private String data;
        private List<TreeNode> children;

        public TreeNode(String data) {
            this.data = data;
            this.children = new ArrayList<>();
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public List<TreeNode> getChild() {
            return children;
        }

        public void addChild(TreeNode child) {
            children.add(child);
        }

        public void removeChild(TreeNode child) {
            children.remove(child);
        }
    }

    public static class Tree {

        private TreeNode root;

        public Tree(String rootData) {
            this.root = new TreeNode(rootData);
        }

        public TreeNode getRoot() {
            return root;
        }

        public void printTree(TreeNode node, String prefix, boolean isTail) {
            System.out.println(prefix + (isTail ? "'-- " : "|-- ") + node.getData());
            List<TreeNode> children = node.getChild();
            for (int i = 0; i < children.size() - 1; i++) {
                printTree(children.get(i), prefix + (isTail ? "    " : "|   "), false);
            }
            if (children.size() > 0) {
                printTree(children.get(children.size() - 1), prefix + (isTail ? "    " : "|   "), true);
            }
        }

       public void addNode() {
  Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the new node: ");
            String newData = scanner.nextLine();

            System.out.print("Enter the parent node (use 'root' to add to the root): ");
            String parentData = scanner.nextLine();

            TreeNode parentNode;

            if (parentData.equalsIgnoreCase("root")) {
                parentNode = root;
            } else {
                parentNode = findNode(root, parentData);
            }

            if (parentNode != null) {
                TreeNode newNode = new TreeNode(newData);
                parentNode.addChild(newNode);
                System.out.println("Node added.");
            } else {
                System.out.println("Parent node not found.");
            }
        }

        public void deleteNode() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the node to delete: ");
            String dataToDelete = scanner.nextLine();

            TreeNode nodeToDelete = findNode(root, dataToDelete);

            if (nodeToDelete != null) {
                TreeNode parentNode = findParentNode(root, dataToDelete);
                if (parentNode != null) {
                    parentNode.removeChild(nodeToDelete);
                    System.out.println("Node deleted.");
                } else {
                    System.out.println("Error deleting node.");
                }
            } else {
                System.out.println("Node not found.");
            }
        }

        public void updateTree() {
           Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the node to update: ");
            String dataToUpdate = scanner.nextLine();

            TreeNode nodeToUpdate = findNode(root, dataToUpdate);

            if (nodeToUpdate != null) {
                System.out.print("Enter the new node: ");
                String newData = scanner.nextLine();
                nodeToUpdate.setData(newData);
                System.out.println("Node updated.");
            } else {
                System.out.println("Node not found.");
            }
        }

 

        private boolean findPathHelper(TreeNode currentNode, TreeNode endNode, List<String> path) {
            if (currentNode == null) {
                return false;
            }

            path.add(currentNode.getData());

            if (currentNode == endNode) {
                return true;
            }

            for (TreeNode child : currentNode.getChild()) {
                if (findPathHelper(child, endNode, path)) {
                    return true;
                }
            }

            // If the end node is not found in the current subtree, backtrack
            path.remove(path.size() - 1);
            return false;
        }

        private TreeNode findParentNode(TreeNode currentNode, String data) {
            for (TreeNode child : currentNode.getChild()) {
                if (child.getData().equals(data)) {
                    return currentNode;
                }

                TreeNode result = findParentNode(child, data);
                if (result != null) {
                    return result;
                }
            }

            return null;
        }

        private TreeNode findNode(TreeNode currentNode, String data) {
            if (currentNode.getData().equals(data)) {
                return currentNode;
            }

            for (TreeNode child : currentNode.getChild()) {
                TreeNode result = findNode(child, data);
                if (result != null) {
                    return result;
                }
            }

            return null;
        }
    }

    
    
    
    
    public static void BinaryTree() {
      // Instantiate Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Initializing a tree: ");
       // Adding nodes to the tree
       BinaryTree binaryTree = new BinaryTree("ROOT");
        binaryTree.addNode("ROOT", "A", "left");// Add node 'A' to the left of 'ROOT'
        binaryTree.addNode("ROOT", "B", "right");// Add node 'B' to the right of 'ROOT'
        binaryTree.addNode("A", "C", "left");// Add node 'C' to the left of 'A'
        binaryTree.addNode("A", "D", "right");// Add node 'D' to the right of 'A'
        binaryTree.addNode("B", "E", "left");// Add node 'E' to the left of 'B'
        binaryTree.addNode("B", "F", "right");// Add node 'F' to the right of 'B'

        int binarytreeOption;
        char response = 'y';

        while (response == 'y') {
            System.out.println("┌─────── BINARY TREE ───────┐");
            System.out.println("1 - DISPLAY TREE");
            System.out.println("2 - TRAVERSAL OPTIONS");
            System.out.println("0 - BACK");
            System.out.println("----------------------------");
            System.out.print("Enter Your Choice: ");

            if (input.hasNextInt()) {
                binarytreeOption = input.nextInt();
                switch (binarytreeOption) {
                    case 1:
                        binaryTree.displayTree();
                        break;

                    case 2:
                        traversalOptions(binaryTree, input);
                        break;

                    case 0:
                        System.out.println("\n\n");
                        // Your existing code for going back to the main menu
                        break;

                    default:
                        System.out.println("Invalid Input. Please try again.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please try again.");
                input.next();
            }
            System.out.print("\nDo you want to try again? y/n: ");
            response = input.next().charAt(0);
            if (response == 'n') {
                System.exit(0);
            }
        }
    }

    private static void traversalOptions(BinaryTree binaryTree, Scanner input) {
        System.out.println("┌─────── TRAVERSAL OPTIONS ───────┐");
        System.out.println("1 - Inorder Traversal");
        System.out.println("2 - Preorder Traversal");
        System.out.println("3 - Postorder Traversal");
        System.out.println("----------------------------");
        System.out.print("Enter Your Choice: ");

        int traversalOption;
        if (input.hasNextInt()) {
            traversalOption = input.nextInt();
            switch (traversalOption) {
                case 1:
                    System.out.print("Inorder Traversal: ");
                    binaryTree.inorderTraversalDisplay();
                    break;

                case 2:
                    System.out.print("Preorder Traversal: ");
                    binaryTree.preorderTraversalDisplay();
                    break;

                case 3:
                    System.out.print("Postorder Traversal: ");
                    binaryTree.postorderTraversalDisplay();
                    break;

                default:
                    System.out.println("Invalid Input. Please try again.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please try again.");
            input.next();
        }
    }

    private static class BinaryTree {
        private BinaryNode root;

        public BinaryTree(String rootData) {
            this.root = new BinaryNode(rootData);
        }

        // Add a node to the binary tree
        public void addNode(String parentData, String newData, String direction) {
            if (root == null) {
                System.out.println("Tree is empty. Cannot add node.");
                return;
            }

            BinaryNode parentNode = findNode(root, parentData);

            if (parentNode == null) {
                System.out.println("Parent node not found.");
                return;
            }

            if (direction.equalsIgnoreCase("left")) {
                if (parentNode.left == null) {
                    parentNode.left = new BinaryNode(newData);
                    System.out.println("Node added to the left of " + parentData);
                } else {
                    System.out.println("Left child already exists for " + parentData);
                }
            } else if (direction.equalsIgnoreCase("right")) {
                if (parentNode.right == null) {
                    parentNode.right = new BinaryNode(newData);
                    System.out.println("Node added to the right of " + parentData);
                } else {
                    System.out.println("Right child already exists for " + parentData);
                }
            } else {
                System.out.println("Invalid direction. Use 'left' or 'right'.");
            }
        }

        private BinaryNode findNode(BinaryNode root, String data) {
            if (root == null || root.data.equals(data)) {
                return root;
            }

            BinaryNode leftResult = findNode(root.left, data);
            if (leftResult != null) {
                return leftResult;
            }

            return findNode(root.right, data);
        }

        // Display the binary tree
        public void displayTree() {
            displayTreeRecursive(root, "", true);
        }

        private void displayTreeRecursive(BinaryNode root, String prefix, boolean isTail) {
            if (root != null) {
                System.out.println(prefix + (isTail ? "'-- " : "|-- ") + root.data);
                displayTreeRecursive(root.right, prefix + (isTail ? "    " : "|   "), false);

                if (root.left != null || root.right != null) {
                    displayTreeRecursive(root.left, prefix + (isTail ? "    " : "|   "), true);
                }
            }
        }

        // Traversal methods
        public void inorderTraversalDisplay() {
            inorderTraversalDisplayRecursive(root);
            System.out.println();
        }

        private void inorderTraversalDisplayRecursive(BinaryNode root) {
            if (root != null) {
                inorderTraversalDisplayRecursive(root.left);
                System.out.print(root.data + " ");
                inorderTraversalDisplayRecursive(root.right);
            }
        }

        public void preorderTraversalDisplay() {
            preorderTraversalDisplayRecursive(root);
            System.out.println();
        }

        private void preorderTraversalDisplayRecursive(BinaryNode root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderTraversalDisplayRecursive(root.left);
                preorderTraversalDisplayRecursive(root.right);
            }
        }

        public void postorderTraversalDisplay() {
            postorderTraversalDisplayRecursive(root);
            System.out.println();
        }

        private void postorderTraversalDisplayRecursive(BinaryNode root) {
            if (root != null) {
                postorderTraversalDisplayRecursive(root.left);
                postorderTraversalDisplayRecursive(root.right);
                System.out.print(root.data + " ");
            }
        }

        private static class BinaryNode {
            String data;
            BinaryNode left, right;

            public BinaryNode(String item) {
                this.data = item;
                this.left = this.right = null;
            }
        }
    }
    
    
    
    public static void Graph() {
          Scanner scanner = new Scanner(System.in);
        GraphHandler graphHandler = null;

        while (true) {
            System.out.println("┌─────── GRAPH ───────┐");
            System.out.println("|1| - Enter the number of vertices and edges");
            System.out.println("|2| - Add edge");
            System.out.println("|3| - Delete edge");
            System.out.println("|4| - Display the graph");
            System.out.println("|0| - Back");
            System.out.println("--------------------");
            System.out.print("Enter Your Choice: ");

            if (scanner.hasNextInt()) {
                int userChoice = scanner.nextInt();
                switch (userChoice) {
                    case 1:
                        graphHandler = initializeGraph(scanner);
                        break;

                    case 2:
                        addConnections(graphHandler, scanner);
                        break;

                    case 3:
                        deleteConnections(graphHandler, scanner);
                        break;

                    case 4:
                        displayGraph(graphHandler);
                        break;

                    case 0:
                        return;

                    default:
                        System.out.println("Invalid Input. Please enter the right option.");
                        break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }
    }

    private static GraphHandler initializeGraph(Scanner scanner) {
        System.out.print("Enter number of Vertices: ");
        int vertices = scanner.nextInt();
        GraphHandler graphHandler = new GraphHandler(vertices);
        System.out.print("Enter the number of Edges: ");
        int edges = scanner.nextInt();
        graphHandler.setTotalEdges(edges);
        return graphHandler;
    }

    private static void addConnections(GraphHandler graphHandler, Scanner scanner) {
        if (graphHandler == null) {
            System.out.println("Error: Set the number of vertices first.");
            return;
        }

        if (graphHandler.getEdgeCount() == graphHandler.getTotalEdges() - 1) {
            System.out.println("Maximum Edges Reached");
            return;
        }

        for (int i = 0; i < graphHandler.getTotalEdges(); i++) {
            System.out.print("Enter edge " + (i + 1) + " (source): ");
            int source = scanner.nextInt();
            System.out.print("Enter edge " + (i + 1) + " (destination): ");
            int destination = scanner.nextInt();

            if (graphHandler.isValidVertex(source) && graphHandler.isValidVertex(destination)) {
                graphHandler.addEdge(source, destination);
            } else {
                System.out.println("Invalid vertex. Please enter vertices within the valid range.");
                graphHandler.resetEdges();
                break;
            }

            graphHandler.setEdgeCount(i);
        }
    }

    private static void deleteConnections(GraphHandler graphHandler, Scanner scanner) {
        if (graphHandler == null) {
            System.out.println("Error: Graph is Empty.");
            return;
        }

        System.out.print("Enter source to delete: ");
        int source = scanner.nextInt();
        System.out.print("Enter destination delete: ");
        int destination = scanner.nextInt();

        if (graphHandler.isValidVertex(source) && graphHandler.isValidVertex(destination)) {
            graphHandler.deleteEdge(source, destination);
        } else {
            System.out.println("Invalid vertex. Please enter vertices within the valid range.");
        }
    }

    private static void displayGraph(GraphHandler graphHandler) {
        if (graphHandler == null) {
            System.out.println("Error: Set the number of vertices first.");
            return;
        }
        graphHandler.printGraph();
    }

    public static class GraphHandler {
        private int totalVertices;
        private int totalEdges;
        private int edgeCount;
        private Map<Integer, List<Integer>> adjacencyList;

        public GraphHandler(int vertices) {
            this.totalVertices = vertices;
            this.adjacencyList = new HashMap<>();
            for (int i = 1; i <= vertices; i++) {
                adjacencyList.put(i, new LinkedList<>());
            }
        }

        public void setTotalEdges(int edges) {
            totalEdges = edges;
        }

        public int getTotalEdges() {
            return totalEdges;
        }

        public void setEdgeCount(int count) {
            edgeCount = count;
        }

        public int getEdgeCount() {
            return edgeCount;
        }

        public void resetEdges() {
            adjacencyList.clear();
        }

        public void addEdge(int source, int destination) {
            if (!adjacencyList.containsKey(source)) {
                adjacencyList.put(source, new ArrayList<>());
            }

            if (!adjacencyList.containsKey(destination)) {
                adjacencyList.put(destination, new ArrayList<>());
            }

            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);

            System.out.println("Edge added: " + source + " -> " + destination);
        }

        public void deleteEdge(int source, int destination) {
            List<Integer> sourceList = adjacencyList.get(source);
            List<Integer> destinationList = adjacencyList.get(destination);

            if (sourceList == null || destinationList == null
                    || !sourceList.contains(destination) || !destinationList.contains(source)) {
                System.out.println("Connection does not exist. Please try again");
            } else {
                sourceList.remove(Integer.valueOf(destination));
                destinationList.remove(Integer.valueOf(source));

                System.out.println("Edge removed: " + source + " -> " + destination);
            }
        }

        public boolean isValidVertex(int vertex) {
            return vertex >= 1 && vertex <= totalVertices;
        }

        public void printGraph() {
            System.out.println("Graph Representation:");
            for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
                System.out.print(entry.getKey() + " -> ");
                for (Integer neighbor : entry.getValue()) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
}
