package exp3;

public class Manage extends Student {

	private Student[] student = new Student[100];
	private static int numberOfStudent = 0;
	int getNumberOfStudent(){     //�õ���ǰѧ������
		return numberOfStudent;
	}
	Student[] getStudent(){     //�õ�ѧ����Ϣ
		return student;
	}
	boolean addStudent(Student student){  //����ѧ��
		try{
			this.student[numberOfStudent] = student;
			numberOfStudent++;
			return true;
		}catch(Exception e){
			return false;
		}
	}
	boolean removeStudent(String stuno){   //ɾ��ѧ��
		boolean target=false;
		for(int i=0;i<numberOfStudent;i++)
			if(student[i].getStuno().equals(stuno)){
				student[i]=null;target=true;
			}
		return target;
		}
		
     Student findStudent(String s){                //��ѯѧ��
    	 for(int i=0;i<numberOfStudent;i++)
    		 if(student[i]!=null)
    			 if(student[i].getStuno().equals(s)||student[i].getName().equals(s))
    				 return student[i];
    	 return null;
     }
     boolean changeStudent(Student student){       //�޸�ѧ��
    	 for(int i=0;i<numberOfStudent;i++){
    		 if(this.student[i].getStuno().equals(student.getStuno())||this.student[i].getName().equals(student.getName())){
    			 this.student[i]=student;
    			 return true;}
    		
    		 }
    	 return false;
    	 }
     
     void print(){
    	 System.out.println("ѧ��\t����\t��ѧ\tӢ��\t�����");
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
    	 System.out.println("ѧ��\tƽ���ɼ�\t\t��߷�\t\t��ͷ�");
    	 System.out.println("��ѧ\t"+avg_math+"\t\t"+max_math+"\t\t"+min_math);
    	 System.out.println("Ӣ��\t"+avg_english+"\t\t"+max_english+"\t\t"+min_english);
    	 System.out.println("�����\t"+avg_computer+"\t\t"+max_computer+"\t1\t"+min_computer);
     }
     
}