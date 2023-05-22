package com;
import java.io.*;
import java.util.*;
public class StudentRecord {
    static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void addRecords() throws IOException {
        PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("st.txt",true)));
        String studentname, address;
        int studentid, rollno, Class;
        float marks;
        String s;
        boolean addmore= false;
        do {
            System.out.print("Enter student Name : ");
            studentname= br.readLine();

            System.out.print("StudeInt Id : ");
            studentid= Integer.parseInt(br.readLine());

            System.out.print("Roll no : ");
            rollno= Integer.parseInt(br.readLine());

            System.out.print("Address: ");
            address= br.readLine();

            System.out.print("Class: ");
            Class= Integer.parseInt(br.readLine());

            System.out.print("Marks : ");
            marks= Float.parseFloat(br.readLine());

            pw.println(studentname+" "+studentid+" "+rollno+" "+address+" "+Class+" "+marks);
            System.out.println("\nRecords added successfually !\n\nDo you want to add more records ? (y/n) : ");
            s= br.readLine();
            if(s.equalsIgnoreCase("y")) {
                addmore= true;
                System.out.println();
            }
            else
                addmore= false;
        }
        while(addmore);
        pw.close();
        showMenu();
    }
    public void readRecords() throws IOException {
        try {
            BufferedReader file= new BufferedReader(new
                    FileReader("st.txt"));
            String name;
            int i=1;
            while((name= file.readLine()) != null) {
                System.out.println(name);
                System.out.println("");
            }
            file.close();
            showMenu();
        }
        catch(FileNotFoundException e) {
            System.out.println("\nError : File Not Found !!!");
        }
    }
    public void searchRecords() throws IOException
    {
        try
        {
            BufferedReader file= new BufferedReader(new FileReader("st.txt"));
            String name;
            int flag=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter an id of the student you want to search: ");
            String searchname= sc.next();
            while((name= file.readLine()) != null)
            {

                String[] line= name.split(" ");
                if(searchname.equalsIgnoreCase(line[1])){
                    System.out.println("Record found");
                    System.out.println(name);
                    System.out.println("");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println("Record not found");
            file.close();
            showMenu();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("\nERROR : File not Found !!!");
        }
    }
    public void deleteRecords() throws IOException
    {
        try
        {
            BufferedReader file1= new BufferedReader(new FileReader("st.txt"));
            PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("st1.txt",true)));
            String name;
            int flag=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of student you want to delete: ");
            String searchname=sc.next();
            while((name= file1.readLine()) !=null)
            {

                String[] line= name.split(" ");
                if(!searchname.equalsIgnoreCase(line[0])){
                    pw.println(name);
                    flag=0;
                }
                else
                {
                    System.out.println("Record Found");
                    flag=1;

                }
            }
            file1.close();
            pw.close();
            File delName= new File("st.txt");
            File oldName= new File("st1.txt");
            File newName= new File("st.txt");
            if(delName.delete())
                System.out.println("deleted successfually");
            else
                System.out.println("Error");

            if(oldName.renameTo(newName))
                System.out.println("Renamed successfually");
            else
                System.out.println("Error");
            showMenu();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("\nError : File not Found !!!");
        }
    }
    public void updateRecords() throws IOException
    {
        try
        {
            BufferedReader file1= new BufferedReader(new FileReader("st.txt"));
            PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("st1.txt",true)));
            String name;
            int flag=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the name of student you want to update: ");
            String searchname=sc.next();
            while((name= file1.readLine()) !=null)
            {

                String[] line= name.split(" ");
                if(!searchname.equalsIgnoreCase(line[0])){
                    pw.println(name);
                    flag=0;
                }
                else
                {
                    System.out.println("Record Found");
                    System.out.println("Enter updated marks: ");
                    String up_mark=sc.next();
                    pw.println(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+line[5]+" "+line[6]);
                    flag=1;
                }
            }
            file1.close();
            pw.close();
            File delName= new File("st.txt");
            File oldName= new File("st1.txt");
            File newName= new File("st.txt");
            if(delName.delete())
                System.out.println("record updated successfually");
            else
                System.out.println("Error");

            if(oldName.renameTo(newName))
                System.out.println("Renamed successfually");
            else
                System.out.println("Error");

            showMenu();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("\nError : File not Found !!!");
        }
    }
    public void clear(String filename) throws IOException
    {
        PrintWriter pw= new PrintWriter(new BufferedWriter(new FileWriter("st1.txt",true)));
        pw.close();
        System.out.println("\nAll Records cleared successfually !");
        for(int i=0; i<999999999;i++);
        showMenu();
    }
    public void showMenu() throws IOException
    {
        System.out.println("");
        System.out.println("1. Add Records\n2. Display Records\n3. clear All Record\n4. Serach Records\n5. Delete Records\n6. Update Records\n7. Exit\n\nYour Choice : ");
        int choice = Integer.parseInt(br.readLine());
        System.out.println("");
        switch (choice)
        {
            case 1:
                addRecords();
                break;
            case 2:
                readRecords();
                break;
            case 3:
                clear("st.txt");
                break;
            case 4:
                searchRecords();
            case 5:
                deleteRecords();
            case 6:
                updateRecords();
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid choice !");
                break;
        }
    }
    public static void main(String args[]) throws IOException {
        StudentRecord call = new StudentRecord();
        call.showMenu();
    }
}
