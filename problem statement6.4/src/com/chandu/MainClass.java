package com.chandu;
import java.util.Vector;
public class Mainclass {

	
		public static void main(String[] args) {
			Vector<Employee> v = addInput();
			display(v);
			}

		private static Vector<Employee> addInput() {
			Employee e1=new Employee (101,"ram", "konidala");
			Employee e2=new Employee (102,"benny", "dakka");
			Employee e3=new Employee (103,"siva", "hospet");
			Vector<Employee> v=new Vector<Employee>();
			v.add(e1);
			v.add(e2);
			v.add(e3);
			return v;
		
			}

		private static void display(Vector<Employee> v) {
			for(Employee e:v)
			{
				System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			}
			
		}

		
	

	}


