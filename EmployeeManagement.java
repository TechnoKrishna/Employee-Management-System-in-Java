// EMPLOYEE MANAGEMENT SYSTEM
// 1.ID,2.NAME,3.PHONE_NO,4.ADDRESS,5.CITY,6.DOB,7.DOJ,8.SALARY,9.GENDER,10.EDUCATION,11.DESIGNATION,12.EMAIL_ID;


// IMPORT PACKAGE FILE.
import java.io.*;
//import java.util.*;
    // CLASS.
class Employee
{
    // SCANNER CLASS.

    //Scanner sc = new Scanner(System.in);

    // INPUTSTREAM-READER CLASS
    
    InputStreamReader converter = new InputStreamReader(System.in);

    //BUFFER-READER CLASS.

    BufferedReader br = new BufferedReader(converter);

    // VARIABLE.

    public int[]    Id = new int[20];               
    public int[]    Salary = new int[20];           
    public String[] Phone = new String[20];         
    public String[] Address = new String[20];       
    public String[] City = new String[20];          
    public String[] DOB = new String[20];           
    public String[] DOJ = new String[20];           
    public String[] Gender = new String[20];        
    public String[] Education = new String[20];     
    public String[] Designation = new String[20];   
    public String[] Email = new String[20];         
    public String[] Name = new String[20];          
    public String[] Temp = new String[20];
    public String[] Tphone =  new String[20];
    public String[] tAddress =  new String[20];
    public String[] TCity =  new String[20];
    public String[] TDOB = new String[20];
    public String[] TDOJ = new String[20];
    public String[] TGender = new String[20];
    public String[] TEducation = new String[20];
    public String[] TDesignation = new String[20];
    public String[] TEmail = new String[20];
    public String[] TName = new String[20];  
    public int[] TId = new int[20];
    public int[] TSalary = new int[20];

    public int i,j,rank = 1;
    public int Search;

    // CONSTRUCTER.
    public Employee()
    {
        ClearScreen();
        System.out.println("\n\n\n\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\n\n\t\t\t\tEMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("\n\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        Delay();
        ClearScreen();
    }
    // DELAY METHOD.
    public void Delay()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    // CLEAR SCREEN.
    public void ClearScreen()  
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
    // INSERT EMPLOYEE METHOD.
    public void Insert_Employee() throws IOException
    {
        ClearScreen();
        a:
        for(i=rank;i<=rank;i++)
        {
            System.out.println("\n\t\t\tEMPLOYEE");
            System.out.println("\tENTER ID :- ");
            Id[i] =  Integer.valueOf(br.readLine()); 
            // Temp[i] =  br.readLine();

            // UNIQUE ID CHECKER.
                for(j=1;j<rank;j++)
                {
                    if(Id[i] == Id[j])
                    {
                        System.out.println("\n\tID ALREADY EXIST : " + Id[i]);
                        rank--;
                        i--;
                        Delay();
                       
                        // System.out.println("PRESS ANY NO TO CONTINUE : ");
                        // cte = sc.nextInt();
                        
                        break a;
                    }
                   else
                    {
                        // ELSE STATEMENT.
                    }
                }        
                        System.out.println("\tENTER NAME :- ");
                        Name[i] = br.readLine();
                        System.out.println("\tENTER DOB(DD/MM/YYYY) :- ");
                        DOB[i] = br.readLine();
                        System.out.println("\tENTER CITY :- ");
                        City[i] = br.readLine();
                        System.out.println("\tENTER ADDRESS :-");
                        Address[i] = br.readLine();
                        System.out.println("\tENTER PH :- ");
                        Phone[i] = br.readLine();
                        System.out.println("\tENTER GENDER(M/F) :-");
                        Gender[i] = br.readLine();
                        System.out.println("\tENTER DOJ(DD/MM/YYYY) :-");
                        DOJ[i] = br.readLine();
                        System.out.println("\tENTER EDUCATION :-");
                        Education[i] = br.readLine();
                        System.out.println("\tENTER DESIGNATION :- ");
                        Designation[i] = br.readLine();
                        System.out.println("\tEMAIL :-"); 
                        Email[i] = br.readLine();                        
                        System.out.println("\tSALARY :-");
                        Salary[i] =  Integer.valueOf(br.readLine()); 
                        System.out.println("\n\t// PRESS ENTER TO CONTINUE \\");                        
                        Temp[i] = br.readLine();
                        System.out.println("\n\t\tINSERTING........");
                        Delay();      
                        System.out.println("\n\t\tINSERTED SUCCEESULLY.....");       
                        Delay();          
        }
                        rank++;
    }
    // SHOW EMPLOYEEE.
    public void Show_Employee() throws IOException
    {
       ClearScreen();
        if(rank>1)
        {
            for(i = 1 ; i <rank ; i++)
            {
                System.out.println("-------------------------------------------------------");
                System.out.println("     \tID                  | " + Id[i]);
                System.out.println("     \tNAME                | " + Name[i]);
                System.out.println("     \tDOB                 | " + DOB[i]);
                System.out.println("     \tCITY                | " + City[i]);
                System.out.println("     \tADDRESS             | " + Address[i]);
                System.out.println("     \tPhone No            | " + Phone[i]);
                System.out.println("     \tGender              | " + Gender[i]);
                System.out.println("     \tDOJ                 | " + DOJ[i]);
                System.out.println("     \tEDUCATION           | " + Education[i]);
                System.out.println("     \tDESIGNATION         | " + Designation[i]);
                System.out.println("     \tEMAIL               | " + Email[i]);
                System.out.println("     \tSALARY              | " + Salary[i]);
                System.out.println("-------------------------------------------------------");
            }       
        }
        else
        {
            System.out.println("\n\n\n\t!!! DATA NOT FOUND !!!!");
        }
            System.out.println("\n\n\tPRESS ENTER TO EXIT : ");
            Temp[i] = br.readLine();
            System.out.println("\n\n\t|| LOADING ||");
            Delay();
    }
    // SEARCH EMPLOYEE.
    public void Search_Employee() throws IOException
    {
        ClearScreen();
        if(rank>1)
        {
            System.out.println("ENTER ID : ");
            Search = Integer.valueOf(br.readLine());
                System.out.println("-------------------------------------------------------");
                System.out.println("     \tID                  | " + Id[Search]);
                System.out.println("     \tNAME                | " + Name[Search]);
                System.out.println("     \tDOB                 | " + DOB[Search]);
                System.out.println("     \tCITY                | " + City[Search]);
                System.out.println("     \tADDRESS             | " + Address[Search]);
                System.out.println("     \tPhone No            | " + Phone[Search]);
                System.out.println("     \tGender              | " + Gender[Search]);
                System.out.println("     \tDOJ                 | " + DOJ[Search]);
                System.out.println("     \tEDUCATION           | " + Education[Search]);
                System.out.println("     \tDESIGNATION         | " + Designation[Search]);
                System.out.println("     \tEMAIL               | " + Email[Search]);
                System.out.println("     \tSALARY              | " + Salary[Search]);
                System.out.println("-------------------------------------------------------");
        }
        else
        {
            System.out.println("\n\n\n\t!!! DATA NOT FOUND !!!!");
        }
            System.out.println("\n\n\tPRESS ENTER TO EXIT : ");
            Temp[i] = br.readLine();
            System.out.println("\n\n\t|| LOADING ||");
        Delay();
    }
    // UPDATE EMPLOYEE.
    public void Update_Employee() throws IOException
    {
        ClearScreen();
        if(rank>1)
        {
            System.out.println("ENTER EMPOLYEE ID : ");
            Search = Integer.valueOf(br.readLine());
            System.out.println("-------------------------------------------------------");
            System.out.println("     \tBEFORE ID                  | " + Id[Search]);
            TId[Search] =  Integer.valueOf(br.readLine());
            System.out.println("     \tBEFORE NAME                | " + Name[Search]);
            TName[Search] = br.readLine();
            System.out.println("     \tBEFORE DOB                 | " + DOB[Search]);
            TDOB[Search] = br.readLine();
            System.out.println("     \tBEFORE CITY                | " + City[Search]);
            TCity[Search] = br.readLine();
            System.out.println("     \tBEFORE ADDRESS             | " + Address[Search]);
            tAddress[Search] = br.readLine();
            System.out.println("     \tBEFORE Phone No            | " + Phone[Search]);
            Tphone[Search] = br.readLine();
            System.out.println("     \tBEFORE Gender              | " + Gender[Search]);
            TGender[Search] = br.readLine();
            System.out.println("     \tBEFORE DOJ                 | " + DOJ[Search]);
            TDOJ[Search] = br.readLine();
            System.out.println("     \tBEFORE EDUCATION           | " + Education[Search]);
            TEducation[Search] = br.readLine();
            System.out.println("     \tBEFORE DESIGNATION         | " + Designation[Search]);
            TDesignation[Search] = br.readLine();
            System.out.println("     \tBEFORE EMAIL               | " + Email[Search]);
            TEmail[Search] = br.readLine();
            System.out.println("     \tBEFORE SALARY              | " + Salary[Search]);
            TSalary[Search] =  Integer.valueOf(br.readLine());
            System.out.println("-------------------------------------------------------");
            System.out.println("\n\n\tARE YOU SURE TO UPDATE(YES/NO) : ");
            Temp[1] = br.readLine();
                if(Temp[1].equals("YES") || Temp[1].equals("yes"))
                {
                    System.out.println("\n\n\tUPDATING......");
                    System.out.println("\n\n\tUPDATED SUCCESSFULLY......");
                        for(i=Search;i<2;i++)
                        {
                            Id[Search] = TId[Search];
                            Name[Search] = TName[Search];
                            DOB[Search] = TDOB[Search];
                            City[Search] = TCity[Search];
                            Address[Search] = tAddress[Search];
                            Phone[Search] = Tphone[Search];
                            Gender[Search] = TGender[Search];
                            DOJ[Search] = TDOJ[Search];
                            Education[Search] = TEducation[Search];
                            Email[Search] = TEmail[Search];
                            Salary[Search]  = TSalary[Search];
                        }
                }
                else if(Temp[1].equals("NO") || Temp[1].equals("no"))
                {
                    System.out.println("\n\n\tOK SURE....");
                }
                else
                {
                    System.out.println("\n\n\tINVALID CHOICE....");
                }
        }
        else
        {
            System.out.println("\n\n\n\t!!! DATA NOT FOUND !!!!");
        }
            System.out.println("\n\n\tPRESS ENTER TO EXIT : ");
            Temp[i] = br.readLine();
            System.out.println("\n\n\t|| LOADING ||");
        Delay();
    }
    // DELETE EMPLOYEE.
    public void Delete_Employee() throws IOException
    {
        ClearScreen();
        if(rank>1)
        {
            System.out.println("ENTER EMPOLYEE ID : ");
            Search = Integer.valueOf(br.readLine());

            System.out.println("-------------------------------------------------------");
            System.out.println("     \tID                  | " + Id[Search]);
            System.out.println("     \tNAME                | " + Name[Search]);
            System.out.println("     \tDOB                 | " + DOB[Search]);
            System.out.println("     \tCITY                | " + City[Search]);
            System.out.println("     \tADDRESS             | " + Address[Search]);
            System.out.println("     \tPhone No            | " + Phone[Search]);
            System.out.println("     \tGender              | " + Gender[Search]);
            System.out.println("     \tDOJ                 | " + DOJ[Search]);
            System.out.println("     \tEDUCATION           | " + Education[Search]);
            System.out.println("     \tDESIGNATION         | " + Designation[Search]);
            System.out.println("     \tEMAIL               | " + Email[Search]);
            System.out.println("     \tSALARY              | " + Salary[Search]);
            System.out.println("-------------------------------------------------------");
           
            System.out.println("\n\n\tARE YOU SURE TO DELETE(YES/NO) : ");
            Temp[1] = br.readLine();
                if(Temp[1].equals("YES") || Temp[1].equals("yes"))
                {
                    System.out.println("\n\n\tDELETING....");
                    System.out.println("\n\n\tDELETED SUCCESSFULLY....");
                            Name[Search] = "NULL";
                            DOB[Search] = "NULL";
                            City[Search] = "NULL";
                            Address[Search] = "NULL";
                            Phone[Search] = "NULL";
                            Gender[Search] = "NULL";
                            DOJ[Search] = "NULL";
                            Education[Search] = "NULL";
                            Designation[Search] = "NULL";
                            Email[Search] = "NULL";
                            Salary[Search]  = 0;
                }
                else if(Temp[1].equals("NO") || Temp[1].equals("no"))
                {
                    System.out.println("\n\n\tOK SURE....");
                }
                else
                {
                    System.out.println("\n\n\tINVALID CHOICE....");
                }
        }
        else
        {
            System.out.println("\n\n\n\t!!! DATA NOT FOUND !!!!");
        }
            System.out.println("\n\n\tPRESS ENTER TO EXIT : ");
            Temp[i] = br.readLine();
            System.out.println("\n\n\t|| LOADING ||");
        Delay();
    }

}
    // MAIN CLASS. 
public class EmployeeManagement
{
    // MAIN METHOD.
    public static void main(String[] args) throws IOException
    {
        //Scanner sc = new Scanner(System.in);
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(converter);
        Employee Emp = new Employee();
        String User,Password;
        int ch;
        do
        {
            System.out.println("\n\n\t\t\t| EMPLOYEE MANAGEMENT SYSTEM |");
            System.out.println("\n\n\tENTER USER ID :- ");
            User = br.readLine();
            System.out.println("\n\n\tENTER PASSWORD :- ");
            Password = br.readLine();
                if(User.equals("admin") && Password.equals("admin"))
                {
                    System.out.println("\n\t||| ACCESS |||");
                    Emp.Delay();
                    Emp.ClearScreen();
                    do
                    {
                        System.out.println("\t\t|| EMPLOYEE MANAGEMENT SYSTEM ||");
                        System.out.println("\n\t\t1 > ADMIN : ");
                        System.out.println("\n\t\t2 > EXIT"); 
                        System.out.println("\n\t\tENTER CHOICE : ");
                        ch =  Integer.valueOf(br.readLine());
                        switch(ch)
                        {
                            case 1:
                                do
                                {
                                    try
                                    {
                                        Emp.ClearScreen();
                                        System.out.println("\t\t|| EMPLOYEE MANAGEMENT SYSTEM ||");
                                        System.out.println("\n\t\t1 > ADD EMPLOYEE");
                                        System.out.println("\n\t\t2 > VIEW TABLE");
                                        System.out.println("\n\t\t3 > SEARCH EMPLOYEE");
                                        System.out.println("\n\t\t4 > UPDATE EMPLOYEE");
                                        System.out.println("\n\t\t5 > DELETE EMPLOYEE");
                                        System.out.println("\n\t\t6 > BACK");
                                        System.out.println("\n\t\tENTER CHOICE : ");
                                        ch =  Integer.valueOf(br.readLine());
                                            switch(ch)
                                            {
                                                case 1:
                                                Emp.ClearScreen();
                                                Emp.Insert_Employee();
                                                break;
                                                case 2:
                                                Emp.ClearScreen();
                                                Emp.Show_Employee();
                                                break;
                                                case 3:
                                                Emp.ClearScreen();
                                                Emp.Search_Employee();
                                                break;
                                                case 4:
                                                Emp.ClearScreen();
                                                Emp.Update_Employee();
                                                break;
                                                case 5:
                                                Emp.ClearScreen();
                                                Emp.Delete_Employee();
                                                break;
                                                case 6:
                                                System.out.println("\n\t\t|| LOADING ||");
                                                break;
                                                default:
                                                System.out.println("\n\t\t|| INVALID CHOICE ||");
                                                Emp.Delay();
                                                break;
                                            }
                                    }
                                    catch (Exception e)
                                    {
                                        System.out.println("\n\t\t|| ENTER YOUR VALID CHOICE ||");
                                        Emp.Delay();
                                    }  
                                }while(ch<6 || ch>6);                            
                            break;
                            case 2:
                            System.out.println("\n\t\t|| EXITING ||");
                            break;
                            default:
                            System.out.println("\n\t\t || INVALID CHOICE ||");
                            break;
                        }
                            Emp.Delay();
                            Emp.ClearScreen();
                    }while(ch < 2 || ch > 2);
                }
                else
                {
                    System.out.println("\n\t||| DENIED |||");
                    Emp.Delay();
                    Emp.ClearScreen();
                }
        }while(!(User.equals("admin") && Password.equals("admin")));
    }    
}
