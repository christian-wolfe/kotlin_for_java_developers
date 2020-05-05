package appendix;

public class SwitchStatements {

    public void printSwitch() {

        int x = 5;

        switch(x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("BIG!");
                break;
        }
    }

    public void assignmentSwitch() {
        int x = 5;
        String s = "";

        switch(x) {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            default:
                s = "None";
                break;
        }
    }

    public void multipleCasesSwitch() {
        int x = 1;

        switch(x) {
            case 1:
            case 2:
                System.out.println("one or two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("None");
                break;
        }
    }

    public static void main(String[] args) {

        new SwitchStatements().printSwitch();
        new SwitchStatements().assignmentSwitch();
        new SwitchStatements().multipleCasesSwitch();
    }
}
