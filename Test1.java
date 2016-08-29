class Person
{
	String name;
	String address;
	
	public Person(String name, String address)
	{
		this.name=name;
		this.address=address;
	}
	String getName()
	{
		return name;
	}
	String getAddress()
	{
		return address;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	public String toString()
	{
		return "Person[name="+name+",address="+address+"]";
	}
	
}

class Student extends Person
{
	String program;
	int year;
	double fee;
	
	public Student(String name, String address, String program, int year, double fee)
	{
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	String getProgram()
	{
		return program;
	}
	void setProgram(String program)
	{
		this.program=program;
	}
	int getYear()
	{
		return year;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	double getFee()
	{
		return fee;
	}
	void setFee(double fee)
	{
		this.fee=fee;
	}
	@Override
	public String toString()
	{
		return "Student["+super.toString()+", program="+program+",year="+year+",fee="+fee+"]";
	}
}

class Staff extends Person
{
	String school;
	double pay;
	
	public Staff(String name, String address, String school, double pay)
	{
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	String getSchool()
	{
		return school;
	}
	void setSchool(String school)
	{
		this.school=school;
	}
	double getPay()
	{
		return pay;
	}
	void setPay(double pay)
	{
		this.pay=pay;
	}
	@Override
	public String toString()
	{
		//return "Staff[Person[name="+name+",address="+address+"], school="+school+",pay="+pay+"]";
		return "Staff["+super.toString()+", school="+school+",pay="+pay+"]";
	}
}

public class Test1{
	public static void main(String args[])
	{
		Student sd1=new Student("Teja","Hyderabad","B.tech",2016,10000);
		Staff st1=new Staff("Raj","Hyderabad","IIIT",15000);
		System.out.println(sd1);
		System.out.println(st1);
	}
}
