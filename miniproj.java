
import java.util.Scanner;

 class miniproject1 
	{
	public static void main(String args[])
	{
	int CHE=70;
	int BEE=73;
	int EDC=75;
	double Year1_totmarks=(CHE+BEE+EDC)/300d*100;
	int PHY=71;
	int M_1=75;
	int ECAD=72;
	double Year2_totmarks=(PHY+M_1+ECAD)/300d*100;
	int DSD=88;
	int ECA=90;
	int SSP=82;
	double Year3_totmarks=(DSD+ECA+SSP)/300d*100;
	int AWP=91;
	int EMTL=86;
	int DCNS=95;
	double Year4_totmarks=(AWP+EMTL+DCNS)/300d*100;
	System.out.println("enter  year number to get marks:");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	switch(i)
	{
	case 1:
	System.out.println("year_1 marks:");
	int k=sc.nextInt();
	if(k==1)
	{
	System.out.println("CHE: "+CHE);
	System.out.println("BEE: "+BEE);
	System.out.println("EDC: "+EDC);
	System.out.println("Year1_Result: "+Year1_totmarks);
	}
	break;
	case 2:
	System.out.println("year_2 marks:");
	int m=sc.nextInt();
	if(m==2)
	{
	System.out.println("PHY: "+PHY);
	System.out.println("M_1: "+M_1);
	System.out.println("ECAD: "+ECAD);
	System.out.println("Year2_Result: "+Year2_totmarks);
	}
	break;
	case 3:
	System.out.println("year_3 marks:");
	int n=sc.nextInt();
	if(n==3)
	{
	System.out.println("DSD: "+DSD);
	System.out.println("ECA: "+ECA);
	System.out.println("SSP: "+SSP);
	System.out.println("Year3_Result: "+Year3_totmarks);
	}
	break;
	case 4:
	System.out.println("year_4 marks:");
	int p=sc.nextInt();
	if(p==4)
	{
	System.out.println("AWP: "+AWP);
	System.out.println("EMTL: "+EMTL);
	System.out.println("DCNS: "+DCNS);
	System.out.println("Year4_Result: "+Year4_totmarks);
	}
	break;
	case 5:
	System.out.println("overall grade");
	int o=sc.nextInt();
	if(o==5)
	{
	double OVERALL_GRADE=(Year1_totmarks+Year2_totmarks+Year3_totmarks+Year4_totmarks)/4;
	System.out.println("OVERALL_GRADE: "+OVERALL_GRADE);
	}
	break;
	default:
	{
	System.out.println("no details");
	}
	sc.close();
	}
	}
	}





