import com.sun.org.apache.xalan.internal.xsltc.dom.StepIterator;

import java.util.ArrayList;
import java.util.Scanner;

public class CallApp {

    private ArrayList<UserModel> userArrayList;
    private Scanner getinput;

    public CallApp() {
        userArrayList = new ArrayList<>();
        getinput = new Scanner(System.in);
        choice();
    }

    public void choice() {

        int i = 0;
        System.out.println("....!select any one option!.......");
        System.out.println("...1 call details enter");
        System.out.println("...2 see the call details");
        System.out.println("...3 exit");

        System.out.println("Enter your choice");
        i = getinput.nextInt();


        switch (i) {
            case 1:
                calldetailsenter();
                break;
            case 2:
                seethecalldetails();
                break;
            case 3:
                System.exit(1);
                break;
            default:
                System.out.println("Not Right Choice");

                break;
        }

    }

    public void calldetailsenter() {


        UserModel userModel = new UserModel();

//        userModel.

        System.out.println("Enter the nummber");
        final int number = getinput.nextInt();

        System.out.println("Enter Name");
        final String name = getinput.next();

        System.out.println("Enter DATE  ");
        final String date = getinput.next();

        System.out.println("Enter Pic Status");
        final boolean picStatus = getinput.nextBoolean();

        System.out.println("Enter OutGoing Call ");
        final int outgoing = getinput.nextInt();

        System.out.println("Enter Incoming Call ");
        final int incoming = getinput.nextInt();

        System.out.println("Enter Missed Call");
        final int missedcall = getinput.nextInt();


        userArrayList.add(new UserModel(number, name, picStatus, date, incoming, outgoing, missedcall));
        // System.out.println(userArrayList);
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getNumber() +
                    "" + userArrayList.get(i).getName() + "" +
                    userArrayList.get(i).getMisscall() + "" +
                    userArrayList.get(i).getOutgoing() + "" + userArrayList.get(i).getIncoming()
                    + "" + userArrayList.get(i).getDate());
        }
        choice();


    }

    public void seethecalldetails() {
        int i = 0;
        System.out.println(" 1 If you want to see the misscall");
        System.out.println(" 2 If you want to see the incoming call ");
        System.out.println(" 3 If you want to see the outgoing call");
        System.out.println(" 4 If you want to see the all the call list");
        System.out.println("Enter choice");
        i = getinput.nextInt();


        switch (i) {
            case 1:
                misscall();
                break;
            case 2:
                incoming();
                break;
            case 3:
                outgoing();
                break;
            case 4:
                alldetails();
                break;


        }


    }

    public void misscall() {
        int i = 0;
        System.out.println(" 1 If you want to see all  misscall of user");
        System.out.println(" 2 If you want to see particular user misscall ");
        System.out.println("Enter choice");
        i = getinput.nextInt();
        switch (i) {

            case 1:
                allmisscall();
                break;
            case 2:
                usermisscall();
        }

    }

    public void allmisscall() {
        int i;

        for (i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getMisscall() + "" + userArrayList.get(i).getName());
        }

    }

    public void usermisscall() {
        for (int i = 0; i < userArrayList.size(); i++) {
            System.out.println(i + ". " + userArrayList.get(i).getName());

        }
        System.out.println("enter your choice");
        int choice=getinput.nextInt();
        System.out.println(userArrayList.get(choice).getName());

    }

    public void incoming() {
        int i = 0;
        System.out.println(" 1 If you want to see all  incoming of user");
        System.out.println(" 2 If you want to see particular user incoming ");
        System.out.println("Enter choice");
        i = getinput.nextInt();
        switch (i) {

            case 1:
                allincomingcall();
                break;
            case 2:
                userincomingcall();
        }

    }

    public void allincomingcall() {
        int i;

        for (i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getIncoming() + "" + userArrayList.get(i).getName());
        }


    }

    public void userincomingcall() {

    }

    public void outgoing() {
        int i = 0;
        System.out.println(" 1 If you want to see all  incoming of user");
        System.out.println(" 2 If you want to see particular user incoming ");
        System.out.println("Enter choice");
        i = getinput.nextInt();
        switch (i) {

            case 1:
                alloutgoingcall();
                break;
            case 2:
                useroutgoingcall();
        }

    }

    public void alloutgoingcall() {
        int i;

        for (i = 0; i < userArrayList.size(); i++) {
            System.out.println(userArrayList.get(i).getOutgoing() + "" + userArrayList.get(i).getName());
        }


    }

    public void useroutgoingcall() {

    }

    public void alldetails() {
        for (int i = 0; i < userArrayList.size(); i++) {

            System.out.println(userArrayList.get(i).getName() + "" + userArrayList.get(i).getNumber() + "" + userArrayList.get(i).getDate() + "" + userArrayList.get(i).getMisscall() + "" + userArrayList.get(i).getIncoming() + "" + userArrayList.get(i).getOutgoing());


        }

    }


}







