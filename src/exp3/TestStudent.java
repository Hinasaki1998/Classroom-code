package exp3;
import java.util.Scanner;
public class TestStudent {
	public static void main(String[] args) {
		Manage manage = new Manage();
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		while (flag){
			int input=9;
			System.out.println("1.添加学生\n2.删除学生\n3.查询学生\n4.修改学生\n5.打印学生\n6.统计学生\n7.退出");
			try{
				input=scanner.nextInt();
			}catch(Exception e){
				System.out.println("错误的操作");
				flag = false;
			}
			switch(input){
			case 1:
				System.out.println("输入信息(学号,姓名,数学,英语,计算机):");
			    Student student1 = new Student();
			    student1.setStuno(scanner.next());
			    student1.setName(scanner.next());
			    student1.setMath(scanner.nextFloat());
			    student1.setEnglish(scanner.nextFloat());
			    student1.setComputer(scanner.nextFloat());
			if(manage.addStudent(student1))
			    System.out.println("添加成功");
			else  
				System.out.println("添加失败");
			break;
			
			case 2:
				System.out.print("输入学号:");
			if(manage.removeStudent(scanner.next()))
				System.out.println("删除成功");
			else  
				System.out.println("删除失败");
			break;
			
			case 3:
				System.out.println("输入姓名或者学号:");
				Student student3=manage.findStudent(scanner.next());
				if(student3!=null){
					System.out.println("学号\t姓名\t数学\t英语\t计算机");
					System.out.println(student3.getStuno()+"\t"+student3.getName()+"\t"+student3.getMath()+"\t"+student3.getEnglish()+"\t"+student3.getComputer());
				}
				else
					System.out.println("没有该学生");
				break;
				
			case 4:
				System.out.println("输入更改的信息(学号,姓名,数学,英语,计算机):");
				Student student4=new Student();
				student4.setStuno(scanner.next());
				student4.setName(scanner.next());
				student4.setMath(scanner.nextFloat());
				student4.setEnglish(scanner.nextFloat());
				student4.setComputer(scanner.nextFloat());
				if(manage.changeStudent(student4))
					System.out.println("更改成功");
				else 
					System.out.println("更改失败");
				break;
				
			case 5:
				manage.print();
				break;
			case 6:
				try{
					manage.caculate();
					break;
					
				}catch(Exception e){
					System.out.println("没有该学生");
				}
			case 7:
				flag=false;
				System.out.println("退出.");
				break;
				default:
				System.out.println("错误的操作");
			}
		}
		
	}

}
