package exp3;
import java.util.Scanner;
public class TestStudent {
	public static void main(String[] args) {
		Manage manage = new Manage();
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		while (flag){
			int input=9;
			System.out.println("1.���ѧ��\n2.ɾ��ѧ��\n3.��ѯѧ��\n4.�޸�ѧ��\n5.��ӡѧ��\n6.ͳ��ѧ��\n7.�˳�");
			try{
				input=scanner.nextInt();
			}catch(Exception e){
				System.out.println("����Ĳ���");
				flag = false;
			}
			switch(input){
			case 1:
				System.out.println("������Ϣ(ѧ��,����,��ѧ,Ӣ��,�����):");
			    Student student1 = new Student();
			    student1.setStuno(scanner.next());
			    student1.setName(scanner.next());
			    student1.setMath(scanner.nextFloat());
			    student1.setEnglish(scanner.nextFloat());
			    student1.setComputer(scanner.nextFloat());
			if(manage.addStudent(student1))
			    System.out.println("��ӳɹ�");
			else  
				System.out.println("���ʧ��");
			break;
			
			case 2:
				System.out.print("����ѧ��:");
			if(manage.removeStudent(scanner.next()))
				System.out.println("ɾ���ɹ�");
			else  
				System.out.println("ɾ��ʧ��");
			break;
			
			case 3:
				System.out.println("������������ѧ��:");
				Student student3=manage.findStudent(scanner.next());
				if(student3!=null){
					System.out.println("ѧ��\t����\t��ѧ\tӢ��\t�����");
					System.out.println(student3.getStuno()+"\t"+student3.getName()+"\t"+student3.getMath()+"\t"+student3.getEnglish()+"\t"+student3.getComputer());
				}
				else
					System.out.println("û�и�ѧ��");
				break;
				
			case 4:
				System.out.println("������ĵ���Ϣ(ѧ��,����,��ѧ,Ӣ��,�����):");
				Student student4=new Student();
				student4.setStuno(scanner.next());
				student4.setName(scanner.next());
				student4.setMath(scanner.nextFloat());
				student4.setEnglish(scanner.nextFloat());
				student4.setComputer(scanner.nextFloat());
				if(manage.changeStudent(student4))
					System.out.println("���ĳɹ�");
				else 
					System.out.println("����ʧ��");
				break;
				
			case 5:
				manage.print();
				break;
			case 6:
				try{
					manage.caculate();
					break;
					
				}catch(Exception e){
					System.out.println("û�и�ѧ��");
				}
			case 7:
				flag=false;
				System.out.println("�˳�.");
				break;
				default:
				System.out.println("����Ĳ���");
			}
		}
		
	}

}
