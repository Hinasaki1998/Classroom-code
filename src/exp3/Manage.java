package exp3;

public class Manage extends Student {

	private Student[] student = new Student[100];
	private static int numberOfStudent = 0;
	int getNumberOfStudent(){     //得到当前学生人数
		return numberOfStudent;
	}
	Student[] getStudent(){     //得到学生信息
		return student;
	}
	boolean addStudent(Student student){  //添加学生
		try{
			this.student[numberOfStudent] = student;
			numberOfStudent++;
			return true;
		}catch(Exception e){
			return false;
		}
	}
	boolean removeStudent(String stuno){   //删除学生
		boolean target=false;
		for(int i=0;i<numberOfStudent;i++)
			if(student[i].getStuno().equals(stuno)){
				student[i]=null;target=true;
			}
		return target;
		}
		
     Student findStudent(String s){                //查询学生
    	 for(int i=0;i<numberOfStudent;i++)
    		 if(student[i]!=null)
    			 if(student[i].getStuno().equals(s)||student[i].getName().equals(s))
    				 return student[i];
    	 return null;
     }
     boolean changeStudent(Student student){       //修改学生
    	 for(int i=0;i<numberOfStudent;i++){
    		 if(this.student[i].getStuno().equals(student.getStuno())||this.student[i].getName().equals(student.getName())){
    			 this.student[i]=student;
    			 return true;}
    		
    		 }
    	 return false;
    	 }
     
     void print(){
    	 System.out.println("学号\t姓名\t数学\t英语\t计算机");
    	 for(int i=0;i<numberOfStudent;i++)
    		 if(student[i]!=null){
    			 System.out.println(student[i].getStuno()+"\t"+student[i].getName()+"\t"+student[i].getMath()+"\t"+student[i].getMath()+"\t"+student[i].getComputer());
    		 }
     }
     void caculate(){
    	 float max_math=0,min_math=student[0].getMath(),sum_math=0;
    	 for(int i=0;i<numberOfStudent;i++){
    		 sum_math+=student[i].getMath();
    		 if(student[i].getMath()>max_math)
    			 max_math=student[i].getMath();
    		 else if (student[i].getMath()<min_math)
    			 min_math=student[i].getMath();
    	 }
    	 float avg_math=sum_math/numberOfStudent;
    	 
    	 float max_english=0,min_english=student[0].getEnglish(),sum_english=0;
    	 for(int i=0;i<numberOfStudent;i++){
    		 sum_english+=student[i].getEnglish();
    		 if(student[i].getEnglish()>max_english)
    			 max_english=student[i].getEnglish();
    		 else if(student[i].getEnglish()<min_english)
    			 min_english=student[i].getEnglish();
    		     	 }
    	 float avg_english = sum_english/numberOfStudent;
    	 
    	 float max_computer=0,min_computer=student[0].getComputer(),sum_computer=0;
    	 for(int i=0;i<numberOfStudent;i++){
    		 sum_computer+=student[i].getComputer();
    		 if(student[i].getComputer()>max_computer)
    			 max_computer=student[i].getComputer();
    		 else if (student[i].getComputer()<min_computer)
    			 min_computer=student[i].getComputer();
    	 }
    	 float avg_computer=sum_computer/numberOfStudent;
    	 System.out.println("学科\t平均成绩\t\t最高分\t\t最低分");
    	 System.out.println("数学\t"+avg_math+"\t\t"+max_math+"\t\t"+min_math);
    	 System.out.println("英语\t"+avg_english+"\t\t"+max_english+"\t\t"+min_english);
    	 System.out.println("计算机\t"+avg_computer+"\t\t"+max_computer+"\t1\t"+min_computer);
     }
     
}
