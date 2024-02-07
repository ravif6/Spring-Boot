package com.SpringDemo.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import static jdk.internal.org.jline.utils.Colors.h;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {


		SpringApplication.run(DemoApplication.class, args);

////		Function<Integer,Integer> f = x -> x+5;
////		int fu = f.apply(5);
//		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<String> strings = List.of("ram","ravi");
//// Enter your code here
//		numbers.stream().forEach(x -> System.out.println(x*x));
//		numbers.stream().filter(x -> x%2==0).forEach(System.out ::println);
//		numbers = numbers.stream().map(x -> x*x).toList();
//		List<Integer> ls = strings.stream().map(String::length).toList();
//		strings.stream().filter(x -> !x.startsWith("T")).map(String::toUpperCase).toList();
//		strings.stream().filter(x ->!x.startsWith("T")).map(String::toUpperCase).sorted().toList();
//		numbers.stream().mapToInt(Integer::intValue).sum();
//		numbers.stream().reduce(Integer::sum);
//		numbers.stream().reduce(0,(x,y) -> x+y);
//		numbers.stream().map(x -> x*x).mapToInt(Integer::intValue).sum();
//		numbers.stream().max(Comparator.comparing(Integer::intValue));
//		numbers.stream().reduce((n1,n2) -> n1 >n2?n1:n2).get();
//		numbers.stream().distinct().toList();
//		strings.stream().mapToInt(String::length).average();
//		strings.stream().filter(x->x.length()>10).findFirst().get();
//
//
//
//
//
//
//
//
//
//
//
//


//		List<Integer> list = new ArrayList<>(Arrays.asList(2,3,4));
//		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("wtem1", "wtem12", "item123"));
//		ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("w", "wte", "item"));
//int er =list.stream().reduce(1,(n1,n2)-> n1*n2);
//		System.out.println(er+": sum");
//		er =Stream.of(1,2,35).min(Comparator.comparing(Integer::intValue)).get();
//		int max = list.stream().min(Comparator.comparing(Integer::intValue)).get();
//		int t =list.stream().filter(x -> x%2==0).mapToInt(Integer::intValue).sum();
//		List<String> h =arrayList.stream().filter(x -> x.startsWith("w")).toList();
//		System.out.println(h.toString());
//		h=Stream.conc
//
//	at(arrayList.stream(),arrayList2.stream()).sorted(Comparator.comparingInt(String::length)).toList();
//
//		System.out.println(h.toString());
//		@Getter
//		@Setter
//		class Employee {
//			String firstName;
//			int age;
//			Employee(String s,int v){
//				this.firstName =s;
//				this.age =v;
//			}
//		}
//
//		List<Employee> employees = new ArrayList<>();
//		Employee e1 = new Employee("Ajay",35);
//		Employee e2 = new Employee("Vijay",5);
//		Employee e3 = new Employee("Zack",30);
//		Employee e4 = new Employee("David",51);
//		//list.stream().sorted(Comparator.comparing(x:))
//		List<Employee> et = employees.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge)).collect(Collectors.toList());;
//
//		//System.out.println(et.get(0).toString());
//		List<Employee> sortedEmployees = employees.stream()
//				.filter(e -> e.getAge() > 30)
//				.sorted(Comparator.comparing(Employee::getFirstName))
//				.collect(Collectors.toList());
//		System.out.println(sortedEmployees.get(0).toString());
//
//
//		StringJoiner stj = new StringJoiner(" ");
//		stj.add("g");
//
//
//		List<String> lis1 = Arrays.asList("apple", "banana");
//		List<String> lis2 = Arrays.asList("orange", "grape");
//
//		List<List<String>> listOfLists = Arrays.asList(lis1, lis2);
//		int y=listOfLists.stream().flatMap(List::stream).mapToInt(String::length).sum();
//		// Separated the elements with a comma in between.
//
//		stj.add("Saket");
//		stj.add("John");
//		stj.add("Franklin");
//		stj.add("Ricky");
//		stj.add("Trevor");
	}

}
