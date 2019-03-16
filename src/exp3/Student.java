package exp3;

public class Student {
	String stuno;
	String name;
	float math;
	float english;
    float computer;
    Student(){
    }
   
    Student(String stuno,String name,float math,float english,float computer){
    	this.stuno=stuno;
    	this.name = name;
    	this.math = math;
    	this.english = english;
    	this.computer=computer;
    	
    }
    public void  setStuno(String s){
    	this.stuno=s;
    	
    }

    public void setName(String n){
    	this.name=n;
    }
    
    public void setMath(float m){
    	this.math=m;
    }
    
    public void setEnglish(float e){
    	this.english=e;
    }
    
    public void setComputer(float c){
    	this.computer=c;   	
    }
    
    public String getStuno(){
    	return stuno;   	
    }
    
    public String getName(){
    	return name;
    	
    }
    
    public float getMath(){
    	return math;
    }
    
    public float getEnglish(){
    	return english;
    }
    
    public float getComputer(){
    	return computer;
    }
    
    public float sum(){
    	return  math + english + computer;
    }
    
    public float avg(){
    	return  (math + english + computer)/3;
    }
    
    public double max(double max){
    	
    	if(math>=english){
    		if(math>=computer)
    			max = math;
    		else
    			max = computer;
    	}
    	else if (english>=computer){
    		max=english;
    	}
    	
    	return max; 
    }
    
    public double min(double min){
    	
    	if(math<=english){
    		if(math<=computer)
    			min=math;
    		else  min=computer;
    	}
    	else if(math >english){
    		if(computer>english)
    			min=english;
    		else  min=computer;
    	}
    	
    	return min;
    }   
}
