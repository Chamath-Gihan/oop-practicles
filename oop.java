Q1)
class Demo{
	public static void main(String args[]){
		int length;
		int width;
		int height;
		
		length = 10;
		width = 20;
		height = 30;
		
		int volume = length * width * height;
		System.out.println("Volume: " + volume);
	}
}

/////////////////////////////////////////////////////////////////////
Q2) From Q1
class Box  {
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public void printVolume() {
		int volume = length * width * height;
		System.out.println("Volume: " + volume);
	}
}
class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
	/*	int length;
		int width;
		int height;
		
		length = 10;
		width = 20;
		height = 30;
		
		int volume = length * width * height;
		System.out.println("Volume: " + volume); */
	}
}

/////////////////////////////////////////////////////////////////////
Q3)
class Box  {
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public void printVolume() {
		int volume = length * width * height;
		System.out.println("Volume: " + volume);
	}
}
class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.setSize(12, 5, 3);
	
		b1.printVolume();
	}
}

/////////////////////////////////////////////////////////////////////
Q4) Exercise

class Box  {
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public void printVolume() {
		int volume = length * width * height;
		System.out.println("Volume: " + volume);
	}
}
class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.setSize(12, 5, 3);
	
		b1.printVolume();	// Volume 6000
		
		b1.setLength(10);
		b1.setWidth(20);
		b1.setHeight(30);
	}
}

/////////////////////////////////////////////////////////////////////
Q5) From Q4
class Box  {
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public void printVolume() {
		int volume = length * width * height;
		System.out.println("Volume: " + volume);
	}
	
	public void setLength(int l) {
		length = l;
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.setSize(12, 5, 3);
	
		b1.printVolume();	// Volume 6000
		
		b1.setLength(10);
		b1.setWidth(20);
		b1.setHeight(30);
		
		b1.printVolume();	// Volume 6000
	}
}


/////////////////////////////////////////////////////////////////////
Q6) Exercise
class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.setSize(12, 5, 3);
	
		b1.printVolume();	// Volume 6000
		
		b1.setLength(10);
		b1.setWidth(20);
		b1.setHeight(30);
		
		b1.printVolume();	// Volume 6000
		
		System.out.println("b1.length: " + b1.length());
		System.out.println("b1.height: " + b1.height());
		System.out.println("b1.width: " + b1.width());
	}
}

/////////////////////////////////////////////////////////////////////
Q7) From Q6
class Box  {
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public void printVolume() {
		int volume = length * width * height;
		System.out.println("Volume: " + volume);
	}
	
	public void setLength(int l) {
		length = l;
	}
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getLength() {
		return length;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
}
class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		b1.setSize(12, 5, 3);
	
		b1.printVolume();	// Volume 6000
		
		b1.setLength(10);
		b1.setWidth(20);
		b1.setHeight(30);
		
		b1.printVolume();	// Volume 6000
		
		System.out.println("b1.length: " + b1.getLength());
		System.out.println("b1.height: " + b1.getHeight());
		System.out.println("b1.width: " + b1.getWidth());
	}
}


/////////////////////////////////////////////////////////////////////
Q8) Exercise

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		d1.setDay(25);
		d1.setMonth(07);
		d1.setYear(2004);
	}
}

/////////////////////////////////////////////////////////////////////
Q9) From Q8
class Date {
	int day;
	int month;
	int year;
	
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		d1.setDay(25);
		d1.setMonth(07);
		d1.setYear(2004);
	}
}


/////////////////////////////////////////////////////////////////////
Q10)Exercise
class Date {
	int day;
	int month;
	int year;
	
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		d1.setDay(25);
		d1.setMonth(7);
		d1.setYear(2004);
		
		d1.printDate();	// 25-7-2004
	}
}


/////////////////////////////////////////////////////////////////////
Q11) From Q10
class Date {
	int day;
	int month;
	int year;
	
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public void printDate() {
		System.out.println(day + "-" + month + "-" + year);
	}
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		d1.setDay(25);
		d1.setMonth(7);
		d1.setYear(2004);
		
		d1.printDate();	// 25-7-2004
	}
}


/////////////////////////////////////////////////////////////////////
Q12) Exercise
class Date {
	int day;
	int month;
	int year;
	
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public void printDate() {
		System.out.println(day + "-" + month + "-" + year);
	}
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		d1.setDay(25);
		d1.setMonth(7);
		d1.setYear(2004);
		
		d1.printDate();	// 25-7-2004
		
		d1.setDate(24, 10, 1998);
		
		d1.printDate();	// 24-10-1998
	}
}

/////////////////////////////////////////////////////////////////////
Q13) From Q12
class Date {
	int day;
	int month;
	int year;
	
	public void setDay(int d) {
		day = d;
	}
	public void setMonth(int m) {
		month = m;
	}
	public void setYear(int y) {
		year = y;
	}
	public void printDate() {
		System.out.println(day + "-" + month + "-" + year);
	}
	public void setDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		d1.setDay(25);
		d1.setMonth(7);
		d1.setYear(2004);
		
		d1.printDate();	// 25-7-2004
		
		d1.setDate(24, 10, 1998);
		
		d1.printDate();	// 24-10-1998
	}
}


/////////////////////////////////////////////////////////////////////
Q14)
class Date {
	int day;
	int month;
	int year;
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
	}
}

/////////////////////////////////////////////////////////////////////
Q15)
class Box {
	int length;
	int width;
	int height;
}

class Demo{
	public static void main(String args[]){
		Box b1;	//Object reference(Box)
		b1 = new Box();
		System.out.println(b1);
		
		Box b2;
		b2 = new Box();
	}
}

/////////////////////////////////////////////////////////////////////
    "this" keyword
/////////////////////////////////////////////////////////////////////
Q16)
class Box {
	int length;
	int width;
	int height;
	
	public void printAddress() {
		System.out.println(this);
	}
	
}

class Demo{
	public static void main(String args[]){
		Box b1;	//Object reference(Box)
		b1 = new Box();
		System.out.println(b1);
		
		b1.printAddress();
	}
}

/////////////////////////////////////////////////////////////////////
Q17)
class Box {
	int length;
	int width;
	int height;
	
	public void setSize(int length, int width, int height) {
		length = length;
		width = width;
		height = height;
	}
	
	public void printVolume() {
		int volume = length *  width * height;
		System.out.println("Volume: " + volume);
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		b1.setSize(12, 5, 3);
		
		b1.printVolume();   //Volume 0
	}
}

/////////////////////////////////////////////////////////////////////
Q18) From Q17
class Box {
	int length;
	int width;
	int height;
	
	public void setSize(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public void printVolume() {
		int volume = length *  width * height;
		System.out.println("Volume: " + volume);
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		b1.setSize(12, 5, 3);
		
		b1.printVolume();	//Volume 0
	}
}

/////////////////////////////////////////////////////////////////////
Q19) case I
class Box {
	int length;	// attribute declaration
	
	public void setSize(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	int height;	// attribute declaration
	
	public void printVolume() {
		int volume = length *  width * height;
		System.out.println("Volume: " + volume);
	}
	int width;	// attribute declaration
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		b1.setSize(12, 5, 3);
		
		b1.printVolume();	//Volume 0
	}
}

/////////////////////////////////////////////////////////////////////
Q20) case II
class Box {
	int length;	// attribute declaration
	
	length = 10;    // Illegal
	
	public void setSize(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	int height;	// attribute declaration
	
	public void printVolume() {
		int volume = length *  width * height;
		System.out.println("Volume: " + volume);
	}
	int width;	// attribute declaration
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		b1.setSize(12, 5, 3);
		
		b1.printVolume();	//Volume 0
	}
}

/////////////////////////////////////////////////////////////////////
Q21) case III
class Box {
	int length;	// attribute declaration
	int height;	// attribute declaration
	int width;	// attribute declaration
	
	public void setSize(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public void printVolume() {
		int volume = length *  width * height;
		System.out.println("Volume: " + volume);
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = null;
		
		b1.setSize(12, 5, 3);
		
		b1.printVolume();	//Volume 0
	}
}

/////////////////////////////////////////////////////////////////////
    "Constructor"
/////////////////////////////////////////////////////////////////////
Q22)
class Box {
	int length;	
	int height;	
	int width;	
	
	// compiler insert
	Box() {
		length = 0;
		height = 0;
		width = 0;
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		abc();
		
		System.out.println("length: " + b1.length);
		System.out.println("height: " + b1.height);
		System.out.println("width: " + b1.width);
	}
}

/////////////////////////////////////////////////////////////////////
Q23)
class Box {
	int length;	
	int height;	
	int width;	
	
	// compiler insert Constructor
	Box() {
		System.out.println("Constructor calling!");
	}
}

class Demo{
	public static void main(String args[]){
		new Box();
		new Box();
		new Box();
		
	}
}

/////////////////////////////////////////////////////////////////////
Q24)
class Box {
	int length;	
	int height;	
	int width;	
	
	//default constructor/no args
	Box() {
		System.out.println("Constructor()");
	}
	
	//parameterized constructor/ full args
	Box(int length, int height, int width) {
		System.out.println("Constructor(int, int, int)!");	
	}
}

class Demo{
	public static void main(String args[]){
		new Box();	// constructor calling
	}
}

/////////////////////////////////////////////////////////////////////
Q25)    Constructor Overloading
class Box {
	int length;	
	int height;	
	int width;	
	
	//default constructor/no args
	Box() {
		System.out.println("Constructor()");
	}
	
	//parameterized constructor/ full args
	Box(int length, int height, int width) {
		System.out.println("Constructor(int, int, int)!");	
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		Box b2 = new Box(10, 20, 30);
	}
}

/////////////////////////////////////////////////////////////////////
Q26) From Q25
class Box {
	int length;	
	int height;	
	int width;	
	
	Box() {
		System.out.println("Constructor()");
	}
	Box(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		Box b2 = new Box(10, 20, 30);
	}
}

/////////////////////////////////////////////////////////////////////
Q27) case I
class Box {
	int length;	
	int height;	
	int width;	
	
	Box(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
	}
}

/////////////////////////////////////////////////////////////////////
Q28)case II
class Box {
	int length = 10;	
	int height = 20;	
	int width = 30;	
	
	//compiler initialize values to attributes
	Box() {
		length = 10;
		height = 20;
		width = 30;
	}	
	Box(int length, int height, int width) {
		this.length = length;
		this.height = height;
		this.width = width;
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		System.out.println(b1.length);
		System.out.println(b1.width);
		System.out.println(b1.height);
	}
}

/////////////////////////////////////////////////////////////////////
    "private" access modifire
/////////////////////////////////////////////////////////////////////
Q29)
class Date {
	private int day;
	int month;
	int year;
	
	public void setDay(int day) {
		if(day > 1 && day < 31 ) {
			this.day = day;	
		} else {
			System.out.println("Invalid day");
		}	
	}
	public int getDay() {
		return day;
	}
}

class Demo{
	public static void main(String args[]){
		Date d1 = new Date();
		//d1.day = -10;	//Illegal
		d1.setDay(10);
		
		System.out.println(d1.getDay());
	}
}

/////////////////////////////////////////////////////////////////////
    "Encapsulation"
/////////////////////////////////////////////////////////////////////
Q30)    Tightly Encapsulated
class Date {
	private int day;
    private int month;
	private int year;
}

/////////////////////////////////////////////////////////////////////
Q31) Loosley Encapsulated 
   case I

class Date {
	private int day;
    private int month;
	int year;
}

class Demo{
	public static void main(String args[]){
		
	}
}


/////////////////////////////////////////////////////////////////////
Q32) case II
class Date {
	private int day;
    int month;
	int year;
}

class Demo{
	public static void main(String args[]){
		
	}
}

/////////////////////////////////////////////////////////////////////
Q33)    case III
class Date {
	int day;
    int month;
	int year;
}

class Demo{
	public static void main(String args[]){
		
	}
}

/////////////////////////////////////////////////////////////////////
Q34) Exercise 1 (Loosely Encap Alien class)
class Alien {
	int id;
	String name;
	String color;
	
	public void fly() {
		System.out.println("Alien can fly");
	}
	
	public void jump() {
		System.out.println("Alien can jump");
	}
}

class Demo{
	public static void main(String args[]){
		
	}
}

/////////////////////////////////////////////////////////////////////
Q35) From Q34
class Alien {
	private int id;
	private String name;
	private String color;
	
	public void fly() {
		System.out.println("Alien can fly");
	}
	
	public void jump() {
		System.out.println("Alien can jump");
	}
}

class Demo{
	public static void main(String args[]){
		
	}
}

/////////////////////////////////////////////////////////////////////
Q36)
class Alien {
	private int id;
	private String name;
	private String color;
	
	public void fly() {
		System.out.println("Alien can fly");
	}
	
	public void jump() {
		System.out.println("Alien can jump");
	}
}

class Demo{
	public static void main(String args[]){
		Alien a1 =new Alien();
		// a1.id = 1;   //Illegal (can't access directly from another class)
	}
}
/////////////////////////////////////////////////////////////////////
Q37) From Q36 
class Alien {
	private int id;
	private String name;
	private String color;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void fly() {
		System.out.println("Alien can fly");
	}
	
	public void jump() {
		System.out.println("Alien can jump");
	}
}

class Demo{
	public static void main(String args[]){
		Alien a1 =new Alien();
		//a1.id = 1;
		
		a1.setId(1);
		a1.setName("Hasindu");
		a1.setColor("Multi Color");
		
		System.out.println("Id: " + a1.getId());
		System.out.println("Name: " + a1.getName());
		System.out.println("Color: " + a1.getColor());
	}
}


/////////////////////////////////////////////////////////////////////
Q38) Exercise
class Demo{
	public static void main(String args[]){
		Car c1 = new Car();
	
		//c1.brand = "BMW";	//Illegal
	
		c1.setBrand("BMW");
		System.out.println("Brand: " + c1.getBrand());
		
		c1.printBrand();	//BMW
	}
}


/////////////////////////////////////////////////////////////////////
Q39)
class Car {
	private String brand;
	
	public Car() {
		
	}
	public Car(String brand) {
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
}

class Demo{
	public static void main(String args[]){
		Car c1 = new Car();
	
		//c1.brand = "BMW";	//Illegal
	
		c1.setBrand("BMW");
		System.out.println("Brand: " + c1.getBrand());
		
		c1.printBrand();	//BMW
	}
}

/////////////////////////////////////////////////////////////////////
    "Instance block" vs "property declaration" order
/////////////////////////////////////////////////////////////////////
Q40) case I
class Box {
	int length = 10;
	
	//instance block
	{
		System.out.println("instance");
		length = 100;
	}
	
	
	Box() {	
		System.out.println("constructor");
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		System.out.println(b1.length);
	}
}

/////////////////////////////////////////////////////////////////////
Q41)case II
class Box {
	//instance block
	{
		System.out.println("instance");
		length = 100;
	}
	int length = 10;
	
	Box() {	
		System.out.println("constructor");
	}
}

class Demo{
	public static void main(String args[]){
		Box b1 = new Box();
		
		System.out.println(b1.length);
	}
}

/////////////////////////////////////////////////////////////////////
    "toString()" Method
/////////////////////////////////////////////////////////////////////
Q42)
class Person {
	int id;
	String name;
	String address;
	
	Person(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return "Hello";
	}
}

class Demo {
	public static void main(String args[]) {
		Person p1 = new Person(1, "Kamal", "Galle");
		System.out.println(p1);	//
	}
}

/////////////////////////////////////////////////////////////////////
Q43)
class Person {
	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + " " + name;
	}
}
class Demo {
	public static void main(String[] args) {
		Person p1 = new Person(1, "Saman");
		System.out.println(p1);	//compile time compiler insert .toString()
	}
}

/////////////////////////////////////////////////////////////////////
Q44)Usages of Encapsulation
import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;

class Demo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r1 = new Random();
		
		JFrame f1 = new JFrame();
		
		f1.setSize(400, 300);
		f1.setTitle("Calculator");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
		
		f1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
    "Inheritance"
/////////////////////////////////////////////////////////////////////
Q42)
import javax.swing.JFrame;

class Calculator {
	
}

class Demo {
	public static void main(String[] args) {		
		Calculator c1 = new Calculator();
		
		c1.setSize(400, 300);
		c1.setTitle("Calculator");
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.setLocationRelativeTo(null);
		
		c1.setVisible(true);
	}
}


/////////////////////////////////////////////////////////////////////
Q43)
import javax.swing.JFrame;

class Calculator extends JFrame {
	
}

class Demo {
	public static void main(String[] args) {		
		Calculator c1 = new Calculator();
		
		c1.setSize(400, 300);
		c1.setTitle("Calculator");
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.setLocationRelativeTo(null);
		
		c1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q44)case I
import javax.swing.JFrame;

//Calculator IS-A JFrame
class Calculator extends JFrame {
	Calculator() {
		abc();	//Illegal ?
		setSize(400, 300);	//Legal ?
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}

class Demo {
	public static void main(String[] args) {		
		Calculator c1 = new Calculator();
		
		c1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q45)Exercise
class A {
	int a;
	
	public void printA() {
		System.out.println("a: " + a);
	}
}

//B IS-A A
class B extends A {
	int b; //B HAS-A b
	
	public void printB() {
		System.out.println("b: " + b);
	}
}

class Demo {
	public static void main(String[] args) {		
		B b1 = new B();
		b1.b = 200;
		b1.printB();
		
		b1.a = 100;	//?
		b1.printA();//?
	}
}

/////////////////////////////////////////////////////////////////////
    "Static Initialization"
/////////////////////////////////////////////////////////////////////
Q46)
class Employee {
	String id;
	double salary;
	//String ceoName;
	static String ceoName;
	
	public void printDetails() {
		System.out.println(id + " : " + salary + " : " + ceoName);
	}
}

class Demo{
	public static void main(String args[]){		
		Employee.ceoName = "Namal";
		
		Employee sahan = new Employee();
		sahan.id = "E001";
		sahan.salary = 1000;
		//sahan.ceoName = "Kamal";
		
		Employee nimna = new Employee();
		nimna.id = "E002";
		nimna.salary = 500;
		//nimna.ceoName = "Kamal";
	
		Employee dinil = new Employee();
		dinil.id = "E003";
		dinil.salary = 100000;
	//	dinil.ceoName = "Prasad";
		
		sahan.printDetails();
		nimna.printDetails();
		dinil.printDetails();
		
	}
}

/////////////////////////////////////////////////////////////////////
Q47)case III
class A {
	int a;
	
	static {
		System.out.println("Static Invoked A");
	}
	
	public void printA() {
		System.out.println("a: " + a);
	}
}

class B extends A {
	int b; 
	
	static {
		System.out.println("Static Invoked B");
	}
	
	public void printB() {
		System.out.println("b: " + b);
	}
}

class Demo {
	public static void main(String[] args) {		
		new B();
	}
}

/////////////////////////////////////////////////////////////////////
Q48)Exercise
import javax.swing.*;
class A {
	int a;
	
	static {
		System.out.println("Invoked A static ");	
	}
}
class B extends A {
	int b;
	
	static {
		System.out.println("Invoked B static ");	
	}
}

class C extends B {
	int c;
	
	static {
		System.out.println("Invoked C static ");	
	}
}

class D extends B {
	int d;
	
	static {
		System.out.println("Invoked D static ");	
	}
}

class Demo {
	public static void main(String args[]) {
		new D();
	}
}
/////////////////////////////////////////////////////////////////////
    "Invoking Super Class Constructor"
/////////////////////////////////////////////////////////////////////
Q49)case IV
import javax.swing.*;
class A {
	int a;
	
	A() {
		System.out.println("A()");
	}
	A(int i) {
		System.out.println("A(int i)");
	}
	A(int i, int j) {
		System.out.println("A(int i, int j)");
	}
}
class B extends A {
	int b;
	
	B() {
		//Invoke Super class Constructor
		System.out.println("B()");
	}
	B(int i) {
		System.out.println("B(int i)");
	}
	B(int i, int j) {
		System.out.println("B(int i, int j)");
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
	}
}


/////////////////////////////////////////////////////////////////////
Q50)Exercise
import javax.swing.*;
class A {
	int a;
	
	A() {
		System.out.println("A()");
	}
	A(int i) {
		System.out.println("A(int i)");
	}
	A(int i, int j) {
		System.out.println("A(int i, int j)");
	}
}
class B extends A {
	int b;
	
	B() {
		//Invoke Super class Constructor
		//A();	//Illegal
		super();	//compiler
		System.out.println("B()");
	}
	B(int i) {
		System.out.println("B(int i)");
	}
	B(int i, int j) {
		System.out.println("B(int i, int j)");
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
	}
}


/////////////////////////////////////////////////////////////////////
Q51)Exercise
import javax.swing.*;
class A {
	int a;
	
	A() {
		System.out.println("A()");
	}
	A(int i) {
		System.out.println("A(int i)");
	}
	A(int i, int j) {
		System.out.println("A(int i, int j)");
	}
}
class B extends A {
	int b;
	
	B() {
		//Invoke Super class Constructor
		//A();	//Illegal
		super();	//compiler
		System.out.println("B()");
	}
	B(int i) {
		super();
		System.out.println("B(int i)");
	}
	B(int i, int j) {
		super();
		System.out.println("B(int i, int j)");
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
		System.out.println("--------------");
		B b2 = new B(10);
		System.out.println("--------------");
		B b3 = new B(10, 20);
		System.out.println("--------------");
	}
}


/////////////////////////////////////////////////////////////////////
Q52)From Q51
import javax.swing.*;
class A {
	int a;
	
	A() {
		System.out.println("A()");
	}
	A(int i) {
		System.out.println("A(int i)");
	}
	A(int i, int j) {
		System.out.println("A(int i, int j)");
	}
}
class B extends A {
	int b;
	
	B() {
		//Invoke Super class Constructor
		//A();	//Illegal
		super();	//compiler
		System.out.println("B()");
	}
	B(int i) {
		super(i);
		System.out.println("B(int i)");
	}
	B(int i, int j) {
		super(i, j);
		System.out.println("B(int i, int j)");
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
		System.out.println("--------------");
		B b2 = new B(10);
		System.out.println("--------------");
		B b3 = new B(10, 20);
		System.out.println("--------------");
	}
}

/////////////////////////////////////////////////////////////////////
Q53) From Q52
import javax.swing.*;
class A {
	int a;
	
	A() {}
	
	A(int i) {
		System.out.println("A(int i)");
	}
}
class B extends A {
	int b;
	
	B(int i) {
		super();
		System.out.println("B(int i)");
	}
}

class Demo {
	public static void main(String args[]) {
		new B(10);
	}
}

/////////////////////////////////////////////////////////////////////
Q54)case V
class A{
	int a=10;
	static int b=20;
	A(){
		//insert code
	}
	A(int i){
		
	}
}
//this(a);
//this(b);

class B extends A{
	int x=100;
	static int y=200;
	B(int i){
		//insert code here
	}	
}
//super(a);
//super(b);
//super(x);
//super(y);

/////////////////////////////////////////////////////////////////////
    "Method Overriding"
/////////////////////////////////////////////////////////////////////
Q55)Case VI
class A {
	int a;
	
	public void print() {
		System.out.println("print A");
	}
}
class B extends A {
	int b;
	
	public void print() {
		System.out.println("print B");
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
		b1.print();
	}
}

/////////////////////////////////////////////////////////////////////
    "Method overriding Vs. Method overloading"
/////////////////////////////////////////////////////////////////////
Q56)
class A {
	int a;
	
	public void print() {
		System.out.println("print A");
	}
}
class B extends A {
	int b;
	
	public void print() {
		System.out.println("print B");
	}
	
	public void print(String text) {
		System.out.println(text);
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
		b1.print();	// method overriding
		b1.print("second print() method");	//method overloading
	}
}

/////////////////////////////////////////////////////////////////////
Q57)case VII (call Super class methods (super))
class A {
	int a;
	
	public void print() {
		System.out.println("print A");
	}
}
class B extends A {
	int b;
	
	public void print() {
		System.out.println("print B");
	}
	
	public void callPrints() {
		super.print();
		print();
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
		//b1.print();	// method overriding
		//b1.super.print(); //Illegal
		
		b1.callPrints();
	}
}

/////////////////////////////////////////////////////////////////////
Q58)  "@Override" Annotaion
class A {
	int a;
	
	public void print() {
		System.out.println("print A");
	}
}
class B extends A {
	int b;
	
	@Override	//Annotation
	public void printt() {	//Illegal
		System.out.println("print B");
	}
	
	public void callPrints() {
	
		print();
	}
}

class Demo {
	public static void main(String args[]) {
		B b1 = new B();
		b1.print();	// method overriding
	}
}

/////////////////////////////////////////////////////////////////////
    "Diamond Problem"   (Multiple Inheritance ara not support in JAVA)
/////////////////////////////////////////////////////////////////////
Q59)case VIII
class A {
	int a;
	
	public void print() {
		System.out.println("print A");
	}
}
class B {
	int b;
	
	public void print() {
		System.out.println("print B");
	}
}
class C extends A, B {  //Illegal
	
}

class Demo {
	public static void main(String args[]) {
		C c1 = new C();
		c1.print();	// Compiler confuse
	}
}

/////////////////////////////////////////////////////////////////////
Q60)case IX
class A {
	int a;
	
}
class B extends A{
	int b;
	
}

class Demo {
	public static void main(String args[]) {
		A a1 = new A();	//	Parent = Parent
		
		A a2 = new B();	//	Parent = Child
		
		B b1 = new A();	//Illegal	Child = Parent
	}
}

/////////////////////////////////////////////////////////////////////
Q61)case X
class A {
	int a;
	
	public void print() {
		System.out.println("Print A");
	}
	
}
class B extends A{
	int b;
	
	@Override
	public void print() {
		System.out.println("Print B");
	}
	
	public void callPrint() {
		super.print();
		print();
	}
}

class Demo {
	public static void main(String args[]) {
		A a1 = new A();
		a1.print();	//	Print A
		
		a1 = new B();
		a1.print();	//	Print B
		a1.callPrint();	// ?
	}
}

/////////////////////////////////////////////////////////////////////
    "Dynamic Method Dispatch"
/////////////////////////////////////////////////////////////////////
Q62)case XI
class A {
	int a;
	
	public void print() {
		System.out.println("Print A");
	}
	
}
class B extends A{
	int b;
	
	@Override
	public void print() {
		System.out.println("Print B");
	}
	
	public void callPrint() {
		super.print();
		print();
	}
}

class Demo {
	public static void main(String args[]) {
		A a1 = new A();
		a1.print();	//	Print A
		
		a1 = new B();
		a1.print();	//	Print B
		a1.callPrint();	// ?Compiler check super class has or not
	}
}

/////////////////////////////////////////////////////////////////////
Q63)Exercise
class A {
	int a;
	
	public void print() {
		System.out.println("Print A");
	}
	
}
class B extends A{
	int b;
	
	@Override
	public void print() {
		System.out.println("Print B");
	}
	
	public void callPrint() {
		super.print();
		print();
	}
}

class C extends B {
	@Override
	public void print() {
		System.out.println("Print C");
	}
}

class D extends C {
	@Override
	public void print() {
		System.out.println("Print D");
	}
}

class Demo {
	public static void main(String args[]) {
		A a1 = new A();
		a1.print();	//	Line1
		
		a1 = new B();
		a1.print();	//	Line2
		
		a1 = new C();
		a1.print();	//	Line3
		
		C c1 = new C();
		c1.print();	//	Line4
		
		c1 = new D();
		c1.print();	//Line5
		
		a1 = new D();
		a1.print();	//	Line6
	}
}

/////////////////////////////////////////////////////////////////////
Q64) From Q63
class A {
	int a;
	
	public void print() {
		System.out.println("Print A");
	}
	
}
class B extends A{
	int b;
	
	@Override
	public void print() {
		System.out.println("Print B");
	}
	
	public void callPrint() {
		super.print();
		print();
	}
}

class C extends B {
	@Override
	public void print() {
		System.out.println("Print C");
	}
}

class D extends C {
	@Override
	public void print() {
		System.out.println("Print D");
	}
}

class Demo {
	public static void main(String args[]) {
		A a1 = new A();
		a1.print();	//	Line1	NO
		
		a1 = new B();
		a1.print();	//	Line2	YES
		
		a1 = new C();
		a1.print();	//	Line3	YES
		
		C c1 = new C();
		c1.print();	//	Line4	NO
		
		c1 = new D();
		c1.print();	//Line5	YES
		
		a1 = new D();
		a1.print();	//	Line6	YES
	}
}

/////////////////////////////////////////////////////////////////////
    "Java Swing Application"
/////////////////////////////////////////////////////////////////////
Q65)
import javax.swing.*;

class Calculator extends JFrame {
	private JButton btn;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn = new JButton("Button 1");
		add(btn);
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q66)
import javax.swing.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		
		add(btn2);
		add(btn1);		
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q67)Solution I(an Old Version before JDK 1.4)
import javax.swing.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		btn5 = new JButton("Button 5");
		
		add("South", btn1);		
		add("North", btn2);
		add("East", btn3);
		add("West", btn4);
		add("Center", btn5);
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q68)Solution II (new solutio after jdk 1.4)
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		btn5 = new JButton("Button 5");
		
		add(btn1, BorderLayout.PAGE_START);		
		add(btn2, BorderLayout.LINE_START);
		add(btn3, BorderLayout.CENTER);
		add(btn4, BorderLayout.LINE_END);
		add(btn5, BorderLayout.PAGE_END);
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
    "Swing Layout Mangers"
/////////////////////////////////////////////////////////////////////
Q69)BorderLayout (default for JFrame)
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		btn5 = new JButton("Button 5");
		
		add(btn1, BorderLayout.PAGE_START);		
		add(btn2, BorderLayout.LINE_START);
		add(btn3, BorderLayout.CENTER);
		add(btn4, BorderLayout.LINE_END);
		add(btn5, BorderLayout.PAGE_END);
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}


/////////////////////////////////////////////////////////////////////
Q70)FlowLayout
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JTextField txt1;
	private JRadioButton rdBtn;
	private JTextField txt2;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		txt1 = new JTextField(35);
		rdBtn = new JRadioButton();
		txt2 = new JTextField(10);
		
		add(btn1);
		add(btn2);
		add(txt1);
		add(rdBtn);
		add(txt2);
		
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q71)Align Left
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JTextField txt1;
	private JRadioButton rdBtn;
	private JTextField txt2;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		txt1 = new JTextField(35);
		rdBtn = new JRadioButton();
		txt2 = new JTextField(10);
		
		add(btn1);
		add(btn2);
		add(txt1);
		add(rdBtn);
		add(txt2);
		
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q72)Align Right
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JTextField txt1;
	private JRadioButton rdBtn;
	private JTextField txt2;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		txt1 = new JTextField(35);
		rdBtn = new JRadioButton();
		txt2 = new JTextField(10);
		
		add(btn1);
		add(btn2);
		add(txt1);
		add(rdBtn);
		add(txt2);
		
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q73)pack() method
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JTextField txt1;
	private JRadioButton rdBtn;
	private JTextField txt2;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		txt1 = new JTextField(35);
		rdBtn = new JRadioButton();
		txt2 = new JTextField(10);
		
		add(btn1);
		add(btn2);
		add(txt1);
		add(rdBtn);
		add(txt2);
		
		pack();
		
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q74)GridLayout
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JTextField txt1;
	private JRadioButton rdBtn;
	private JTextField txt2;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new GridLayout(2, 4, 5, 8));
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		btn5 = new JButton("Button 5");
		txt1 = new JTextField(35);
		rdBtn = new JRadioButton();
		txt2 = new JTextField(10);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(rdBtn);
		add(txt1);
		add(txt2);		
	}
}

class Demo {
	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		c1.setVisible(true);
		
	}
}

/////////////////////////////////////////////////////////////////////
Q75)Exercise
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton btn1;	// attribute
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnDiv;
	private JButton btnSum;
	private JButton btnDif;
	private JButton btnMult;
	private JButton btnEqual;
	private JButton btnDot;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4, 4, 5, 5));
		
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnDiv = new JButton("/");
		btnDif = new JButton("-");
		btnSum = new JButton("+");
		btnMult = new JButton("*");
		btnEqual = new JButton("=");
		btnDot = new JButton(".");
		
		add(btn7);
		add(btn8);
		add(btn9);
		add(btnDif);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btnDiv);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btnSum);
		add(btn0);
		add(btnDot);
		add(btnEqual);
		add(btnMult);
	}
}

class Demo{
	public static void main(String args[]){
		Calculator c1 = new Calculator();
		c1.setVisible(true);
	}
}


/////////////////////////////////////////////////////////////////////
Q76)From Q75 StepI
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton[] buttons;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4, 4, 5, 5));
		
		buttons = new JButton[16];
		
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnDiv = new JButton("/");
		btnDif = new JButton("-");
		btnSum = new JButton("+");
		btnMult = new JButton("*");
		btnEqual = new JButton("=");
		btnDot = new JButton(".");
		
		add(btn7);
		add(btn8);
		add(btn9);
		add(btnDif);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btnDiv);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btnSum);
		add(btn0);
		add(btnDot);
		add(btnEqual);
		add(btnMult);
	}
}

class Demo{
	public static void main(String args[]){
		Calculator c1 = new Calculator();
		c1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q77) From Q75 Step II
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton[] buttons;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(4, 4, 5, 5));
		
		buttons = new JButton[16];
		String[] btnNames = {"7", "8", "9", "-", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "*"};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(btnNames[i]);
			add(buttons[i]);	
		}
	}
}

class Demo{
	public static void main(String args[]){
		Calculator c1 = new Calculator();
		c1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
    "JPanel"
/////////////////////////////////////////////////////////////////////
Q78)
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton[] buttons;
	private JPanel displayPanel;
	private JPanel buttonsPanel;
	private JTextField txt1;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		displayPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));	//FlowLayout
		buttonsPanel = new JPanel(new GridLayout(4, 4, 5, 5));
		
		txt1 = new JTextField(20);
		displayPanel.add(txt1);
		
		buttons = new JButton[16];
		String[] btnNames = {"7", "8", "9", "-", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "*"};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(btnNames[i]);
			buttonsPanel.add(buttons[i]);	
		}
		
		add(displayPanel, BorderLayout.PAGE_START);
		add(buttonsPanel, BorderLayout.CENTER);
	}
}

class Demo{
	public static void main(String args[]){
		Calculator c1 = new Calculator();
		c1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q79)Exercise
import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
	private JButton[] buttons;
	private JPanel displayPanel;
	private JPanel buttonsPanel;
	private JPanel namePanel;
	private JTextField txt1;
	private JLabel lblName;
	
	Calculator() {
		setSize(400, 300);
		setTitle("Calc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		displayPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));	//FlowLayout
		buttonsPanel = new JPanel(new GridLayout(4, 4, 5, 5));
		namePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		txt1 = new JTextField(20);
		displayPanel.add(txt1);
		
		lblName = new JLabel();
		lblName.setFont(new Font("Serif", Font.BOLD, 11));
		lblName.setText("Developed by Danuja");
		
		namePanel.add(lblName);
		
		buttons = new JButton[16];
		String[] btnNames = {"7", "8", "9", "-", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "*"};
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(btnNames[i]);
			buttonsPanel.add(buttons[i]);	
		}
		
		add(displayPanel, BorderLayout.PAGE_START);
		add(buttonsPanel, BorderLayout.CENTER);
		add(namePanel, BorderLayout.PAGE_END);
	}
}

class Demo{
	public static void main(String args[]){
		Calculator c1 = new Calculator();
		c1.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q80)Exercise
import javax.swing.*;
import java.awt.*;

class Window extends JFrame {
	private JButton btnClickMe;
	private JPanel panel;
	
	Window() {
		initComponents();
	}
	
	public void initComponents() {
		setSize(400, 300);
		setTitle("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		btnClickMe = new JButton("Click Me!");
		btnClickMe.setFont(new Font("Serif", Font.PLAIN, 12));
		btnClickMe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel.add(btnClickMe);
		
		add(panel, BorderLayout.CENTER);
	}
}

class Demo{
	public static void main(String args[]){
		new Window().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q81)From Q80 Step I
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window extends JFrame {
	private JButton btnClickMe;
	private JPanel panel;
	
	Window() {
		initComponents();
	}
	
	public void initComponents() {
		setSize(400, 300);
		setTitle("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		btnClickMe = new JButton("Click Me!");
		btnClickMe.setFont(new Font("Serif", Font.PLAIN, 12));
		btnClickMe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnClickMe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("Pressed!");
			}
		});
		
		panel.add(btnClickMe);
		
		add(panel, BorderLayout.CENTER);
	}
}

class Demo{
	public static void main(String args[]){
		new Window().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q82) From Q80 StepII
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window extends JFrame implements ActionListener {
	private JButton btnClickMe;
	private JPanel panel;
	
	Window() {
		initComponents();
	}
	
	public void initComponents() {
		setSize(400, 300);
		setTitle("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		btnClickMe = new JButton("Click Me!");
		btnClickMe.setFont(new Font("Serif", Font.PLAIN, 12));
		btnClickMe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnClickMe.addActionListener(this);
		
		panel.add(btnClickMe);
		
		add(panel, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Pressed!");
	}
}

class Demo{
	public static void main(String args[]){
		new Window().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q83)Exercise
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window extends JFrame implements ActionListener {
	private JButton btnExit;
	private JButton btnBack;
	private JPanel panel;
	
	Window() {
		initComponents();
	}
	
	public void initComponents() {
		setSize(400, 300);
		setTitle("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Serif", Font.PLAIN, 12));
		btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Serif", Font.PLAIN, 12));
		btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		
		btnExit.addActionListener(this);
		btnBack.addActionListener(this);
		
		panel.add(btnExit);
		panel.add(btnBack);
		
		add(panel, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Exit")) {
			System.exit(0);	
		} else if(event.getActionCommand().equals("Back")) {
			System.out.println(event.getActionCommand() + " pressed!");
		}
		
	}
}

class Demo{
	public static void main(String args[]){
		new Window().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q84)Exercise
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Window extends JFrame implements ActionListener {
	private JButton btnClick;
	private JTextField txt;
	private JLabel lbl;
	private JPanel displayPanel;
	private JPanel btnPanel;
	private JPanel lblPanel;
	
	Window() {
		initComponents();
	}
	
	public void initComponents() {
		setSize(400, 300);
		setTitle("Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		displayPanel = new JPanel();
		btnPanel = new JPanel();
		lblPanel = new JPanel();
		
		txt = new JTextField(20);
		
		btnClick = new JButton("Click");
		btnClick.addActionListener(this);
		
		lbl = new JLabel();
		lbl.setFont(new Font("Serif", Font.BOLD, 24));
		lbl.setText("Label is here");
		
		displayPanel.add(txt);
		btnPanel.add(btnClick);
		lblPanel.add(lbl);
		
		add(displayPanel, BorderLayout.PAGE_START);
		add(btnPanel, BorderLayout.CENTER);
		add(lblPanel, BorderLayout.PAGE_END);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand().equals("Click")) {
			String text = txt.getText();
			lbl.setText(text);
		}
		
	}
}

class Demo{
	public static void main(String args[]){
		new Window().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q85)Evalution Step I
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatRoom extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	ChatRoom(String userName) {
		this.userName = userName;
		initComponents(this.userName);
	}
	void initComponents(String userName) {
		setSize(400, 300);
		setTitle(this.userName + "'s Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	
	}
}
class MainWindow extends JFrame {
	private JButton btnJoin;
	private JTextField txtUserName;
	private JPanel pnlName;
	private JPanel pnlBtn;
	
	MainWindow() {
		initComponents();
	}
	void initComponents() {
		setSize(400, 300);
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pnlName = new JPanel();
		pnlBtn = new JPanel();
		
		txtUserName = new JTextField(35);
		txtUserName.addActionListener((event) -> {
			btnJoin.doClick();
		});
		
		btnJoin = new JButton("Join");
		btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnJoin.addActionListener((event) -> {
			String userName = txtUserName.getText();
			new ChatRoom(userName).setVisible(true);
			txtUserName.setText("");
		});
		
		pnlName.add(txtUserName);
		pnlBtn.add(btnJoin);
		
		add(pnlName, BorderLayout.PAGE_START);
		add(pnlBtn, BorderLayout.CENTER);

	}
}

class Demo {
	public static void main(String args[]) {
		new MainWindow().setVisible(true);
	}	
}

/////////////////////////////////////////////////////////////////////
Q86)From Q85 Step II
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatRoom extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	ChatRoom(String userName) {
		this.userName = userName;
		initComponents(this.userName);
	}
	void initComponents(String userName) {
		setSize(400, 300);
		setTitle(this.userName + "'s Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			String msg = txtMsg.getText();
			txtMsg.setText("");
			//txtMsgArea.setText(this.userName + ": " + msg);
			txtMsgArea.append(this.userName + ": " + msg + "\n");
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	
	}
}
class MainWindow extends JFrame {
	private JButton btnJoin;
	private JTextField txtUserName;
	private JPanel pnlName;
	private JPanel pnlBtn;
	
	MainWindow() {
		initComponents();
	}
	void initComponents() {
		setSize(400, 300);
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		pnlName = new JPanel();
		pnlBtn = new JPanel();
		
		txtUserName = new JTextField(35);
		txtUserName.addActionListener((event) -> {
			btnJoin.doClick();
		});
		
		btnJoin = new JButton("Join");
		btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnJoin.addActionListener((event) -> {
			String userName = txtUserName.getText();
			new ChatRoom(userName).setVisible(true);
			txtUserName.setText("");
		});
		
		pnlName.add(txtUserName);
		pnlBtn.add(btnJoin);
		
		add(pnlName, BorderLayout.PAGE_START);
		add(pnlBtn, BorderLayout.CENTER);

	}
}

class Demo {
	public static void main(String args[]) {
		new MainWindow().setVisible(true);
	}	
}

/////////////////////////////////////////////////////////////////////
Q87)Exercise Step I
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatRoom1 extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	private ChatRoom2 c2;
	
	ChatRoom1() {
		initComponents();
	}
	void initComponents() {
		setSize(400, 300);
		setTitle("Kamal's Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	}
	public void setChatRoom(ChatRoom2 c2) {
		this.c2 = c2;
	}
}
class ChatRoom2 extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	private ChatRoom1 c1;
	
	ChatRoom2() {
		initComponents();
	}
	void initComponents() {
		setSize(400, 300);
		setTitle("Nimal's Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	}
	public void setChatRoom(ChatRoom1 c1) {
		this.c1 = c1;
	}
}


class Demo {
	public static void main(String args[]) {
		ChatRoom1 c1 = new ChatRoom1();	
		ChatRoom2 c2 = new ChatRoom2();	
		
		c1.setChatRoom(c2);
		c2.setChatRoom(c1);
		
		c1.setVisible(true);
		c2.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q88)From Q87 Step II
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatRoom1 extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	private ChatRoom2 c2;
	
	ChatRoom1(String userName) {
		this.userName = userName;
		initComponents();
	}
	
	public JTextArea getTextArea() {
		return txtMsgArea;
	}
	
	void initComponents() {
		setSize(400, 300);
		setTitle(this.userName + "'s Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			String msg = txtMsg.getText();
			txtMsgArea.append("Me: " + msg + "\n");
			c2.getTextArea().append(this.userName + ": " + msg + "\n");
			txtMsg.setText("");
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	}
	public void setChatRoom(ChatRoom2 c2) {
		this.c2 = c2;
	}
}
class ChatRoom2 extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	private ChatRoom1 c1;
	
	public String getUserName() {
		return userName;
	}
	
	public JTextArea getTextArea() {
		return txtMsgArea;
	}
	
	ChatRoom2(String userName) {
		this.userName = userName;
		initComponents();
	}
	void initComponents() {
		setSize(400, 300);
		setTitle(this.userName + "'s Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			String msg = txtMsg.getText();
			txtMsgArea.append("Me: " + msg + "\n");
			c1.getTextArea().append(this.userName + ": " + msg + "\n");
			txtMsg.setText("");
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	}
	public void setChatRoom(ChatRoom1 c1) {
		this.c1 = c1;
	}
}


class Demo {
	public static void main(String args[]) {
		ChatRoom1 c1 = new ChatRoom1("Kamal");	
		ChatRoom2 c2 = new ChatRoom2("Nimal");	
		
		c1.setChatRoom(c2);
		c2.setChatRoom(c1);
		
		c1.setVisible(true);
		c2.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q89)Exericse Step I
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatRoom extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	ChatRoom(String userName) {
		this.userName = userName;
		initComponents(this.userName);
	}
	void initComponents(String userName) {
		setSize(400, 300);
		setTitle(this.userName + "'s Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			String msg = txtMsg.getText();
			txtMsg.setText("");
			//txtMsgArea.setText(this.userName + ": " + msg);
			txtMsgArea.append(this.userName + ": " + msg + "\n");
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	
	}
}
class MainWindow extends JFrame {
	private JButton btnJoin;
	private JTextField txtUserName;
	private JPanel pnlName;
	private JPanel pnlBtn;
	
	private ChatRoom[] chatRooms;
	
	MainWindow() {
		initComponents();
	}
	
	void extendsArray() {
		ChatRoom[] temp = new ChatRoom[chatRooms.length + 1];
		for (int i = 0; i < chatRooms.length; i++) {
			temp[i] = chatRooms[i];
		}
		chatRooms = temp;
		
	}
	
	void initComponents() {
		setSize(400, 300);
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		chatRooms = new ChatRoom[0];
		
		pnlName = new JPanel();
		pnlBtn = new JPanel();
		
		txtUserName = new JTextField(35);
		txtUserName.addActionListener((event) -> {
			btnJoin.doClick();
		});
		
		btnJoin = new JButton("Join");
		btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnJoin.addActionListener((event) -> {
			String userName = txtUserName.getText();
			
			extendsArray();
			
			ChatRoom c1 = new ChatRoom(userName);
			chatRooms[chatRooms.length - 1] = c1;
			
			System.out.println(chatRooms.length);
			
			c1.setVisible(true);
			txtUserName.setText("");
		});
		
		pnlName.add(txtUserName);
		pnlBtn.add(btnJoin);
		
		add(pnlName, BorderLayout.PAGE_START);
		add(pnlBtn, BorderLayout.CENTER);

	}
}

class Demo {
	public static void main(String args[]) {
		new MainWindow().setVisible(true);
	}	
}

/////////////////////////////////////////////////////////////////////
Q90)From Q89 Step II
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ChatRoom extends JFrame {
	private JTextArea txtMsgArea;
	private JTextField txtMsg;
	private JPanel pnlTxt;
	private JScrollPane msgScrollPane;
	private String userName;
	
	ChatRoom(String userName) {
		this.userName = userName;
		initComponents(this.userName);
	}
	
	void initComponents(String userName) {
		setSize(400, 300);
		setTitle(this.userName + "'s Room");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		txtMsgArea = new JTextArea();
		msgScrollPane = new JScrollPane(txtMsgArea);
		
		txtMsg = new JTextField();
		txtMsg.addActionListener((event) -> {
			String msg = txtMsg.getText();
			
			for (int i = 0; i < MainWindow.chatRooms.length; i++) {
				if(MainWindow.chatRooms[i].userName.equals(this.userName)) {
					MainWindow.chatRooms[i].txtMsgArea.append("Me: " + msg + "\n");
				} else {
					MainWindow.chatRooms[i].txtMsgArea.append(this.userName + ": " + msg + "\n");	
				}
			}
			
			
			txtMsg.setText("");
		});
		
		add(msgScrollPane, BorderLayout.CENTER);
		add(txtMsg, BorderLayout.PAGE_END);
	
	}
}
class MainWindow extends JFrame {
	private JButton btnJoin;
	private JTextField txtUserName;
	private JPanel pnlName;
	private JPanel pnlBtn;
	
	static ChatRoom[] chatRooms;
	
	MainWindow() {
		initComponents();
	}
	
	void extendsArray() {
		ChatRoom[] temp = new ChatRoom[chatRooms.length + 1];
		for (int i = 0; i < chatRooms.length; i++) {
			temp[i] = chatRooms[i];
		}
		chatRooms = temp;
		
	}
	
	void initComponents() {
		setSize(400, 300);
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		chatRooms = new ChatRoom[0];
		
		pnlName = new JPanel();
		pnlBtn = new JPanel();
		
		txtUserName = new JTextField(35);
		txtUserName.addActionListener((event) -> {
			btnJoin.doClick();
		});
		
		btnJoin = new JButton("Join");
		btnJoin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnJoin.addActionListener((event) -> {
			String userName = txtUserName.getText();
			
			extendsArray();
			
			ChatRoom c1 = new ChatRoom(userName);
			chatRooms[chatRooms.length - 1] = c1;
			
			System.out.println(chatRooms.length);
			
			c1.setVisible(true);
			txtUserName.setText("");
		});
		
		pnlName.add(txtUserName);
		pnlBtn.add(btnJoin);
		
		add(pnlName, BorderLayout.PAGE_START);
		add(pnlBtn, BorderLayout.CENTER);

	}
}

class Demo {
	public static void main(String args[]) {
		new MainWindow().setVisible(true);
	}	
}


/////////////////////////////////////////////////////////////////////
    "WaterTank"
/////////////////////////////////////////////////////////////////////
Q91)
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif",1,25));
		add(label);
		
		displayText = new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		displayWindow = new DisplayWindow();
		
		waterLevelSlider = new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		displayWindow = new DisplayWindow();
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				//displayWindow.displayText.setText(waterLevel + "");
				displayWindow.setWaterLevel(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}

Q92) From Q91
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		displayWindow = new DisplayWindow();
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				//displayWindow.displayText.setText(waterLevel + "");
				displayWindow.setWaterLevel(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q93)Exercise (Adding AlarmWindow)
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		displayWindow = new DisplayWindow();
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				//displayWindow.displayText.setText(waterLevel + "");
				displayWindow.setWaterLevel(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q94)From Q93
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				//displayWindow.displayText.setText(waterLevel + "");
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}


/////////////////////////////////////////////////////////////////////
Q95)Frmo Q94    (using Instance Block)
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	
	{
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
	}
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				//displayWindow.displayText.setText(waterLevel + "");
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}


/////////////////////////////////////////////////////////////////////
Q96)Exercise (Adding GateWindow)
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class GateWindow extends JFrame{
	private JLabel splitterLabel;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		splitterLabel = new JLabel("ON/OFF");
		splitterLabel.setFont(new Font("",1,25));
		add(splitterLabel);
		setVisible(true);
	}	
}

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	
	{
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
	}
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				//displayWindow.displayText.setText(waterLevel + "");
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q97)From Q96
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class GateWindow extends JFrame{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
}

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	private GateWindow gateWindow;
	
	{
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
		gateWindow = new GateWindow();
	}
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
				gateWindow.executeGate(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		new WaterTank().setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q98)Exercise
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class GateWindow extends JFrame{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
}

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	private GateWindow gateWindow;
	
	/*{
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
		gateWindow = new GateWindow();
	}*/
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
				gateWindow.executeGate(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
}
class Demo{
	public static void main(String args[]){
		WaterTank waterTank = new WaterTank();
		waterTank.setDisplayWindow(new DisplayWindow());
		waterTank.setAlarmWindow(new AlarmWindow());
		waterTank.setGateWindow(new GateWindow());
		
		waterTank.setVisible(true);
	}
}


/////////////////////////////////////////////////////////////////////
Q99)From Q98 StepI
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class GateWindow extends JFrame{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
}

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	private GateWindow gateWindow;
	
	/*{
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
		gateWindow = new GateWindow();
	}*/
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
				gateWindow.executeGate(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
	public void setDisplayWindow(DisplayWindow displayWindow) {
		
	}
	public void setAlarmWindow(AlarmWindow alarmWindow) {
		
	}
	public void setGateWindow(GateWindow gateWindow) {
		
	}
}
class Demo{
	public static void main(String args[]){
		WaterTank waterTank = new WaterTank();
		waterTank.setDisplayWindow(new DisplayWindow());
		waterTank.setAlarmWindow(new AlarmWindow());
		waterTank.setGateWindow(new GateWindow());
		
		waterTank.setVisible(true);
	}
}


/////////////////////////////////////////////////////////////////////
Q100)From Q99   Step II
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class GateWindow extends JFrame{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
}

class AlarmWindow extends JFrame{
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}
}

class DisplayWindow extends JFrame{
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	private GateWindow gateWindow;
	
	/*{
		displayWindow = new DisplayWindow();
		alarmWindow = new AlarmWindow();
		gateWindow = new GateWindow();
	}*/
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
				displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
				gateWindow.executeGate(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
	public void setDisplayWindow(DisplayWindow displayWindow) {
		this.displayWindow = displayWindow;
	}
	public void setAlarmWindow(AlarmWindow alarmWindow) {
		this.alarmWindow = alarmWindow;
	}
	public void setGateWindow(GateWindow gateWindow) {
		this.gateWindow = gateWindow;
	}
}
class Demo{
	public static void main(String args[]){
		WaterTank waterTank = new WaterTank();
		waterTank.setDisplayWindow(new DisplayWindow());
		waterTank.setAlarmWindow(new AlarmWindow());
		waterTank.setGateWindow(new GateWindow());
		
		waterTank.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
    "NumberPatternBuckets"
/////////////////////////////////////////////////////////////////////
Q101)
new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);	
					}catch(Exception e){}
					
					//Code here
				}		
			}
		}.start();

/////////////////////////////////////////////////////////////////////
    "Polymorphism" (Single Interface Many Forms)
/////////////////////////////////////////////////////////////////////
Q102)Compile-time Polymorphism
class Demo{
	public static void main(String args[]){	
		int x = -19;
		byte b = -32;
		short s = -343;
		double d = -234;
		
		System.out.println(Math.abs(x));
		System.out.println(Math.abs(b));
		System.out.println(Math.abs(s));
		System.out.println(Math.abs(d));
		System.out.println(Math.abs(d, x));
	}
}

/////////////////////////////////////////////////////////////////////
Q103)Runtime Polymorphism
class Human {
	public void talk() {
		System.out.println("Human Talk");
	}
}

class Customer extends Human {
	@Override
	public void talk() {
		System.out.println("Customer Talk");
	}
}
class Student extends Human {
	@Override
	public void talk() {
		System.out.println("Student Talk");
	}
}
class Lecturer extends Human {
	@Override
	public void talk() {
		System.out.println("Lecturer Talk");
	}
}

class Demo{
	public static void main(String args[]){	
		Human human = new Customer();
		human.talk();	//1
		
		human = new Student();
		human.talk();	//2
		
		human = new Lecturer();
		human.talk();	//3
	}
}

/////////////////////////////////////////////////////////////////////
Q104)Exercise
class Human {
	public void talk() {
		System.out.println("Human Talk");
	}
}

class Customer extends Human {
	
	@Override
	public void talk() {
		System.out.println("Customer Talk");
	}
}
class Student extends Human {
	
	@Override
	public void talk() {
		System.out.println("Student Talk");
	}
}
class Lecturer extends Human {
	
	@Override
	public void talk() {
		System.out.println("Lecturer Talk");
	}
}

class Demo{
	public static void main(String args[]){	
		Human[] humans = {new Customer(), new Student(), new Lecturer()};
		
		for(Human human : humans) {
			human.talk();
		}
	}
}

/////////////////////////////////////////////////////////////////////
Q105)WaterTank using Polymorphism
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class WaterTankObserver extends JFrame {
	public void update(int waterLevel) {
		System.out.println("WaterTankObserver");
	}
}

class GateWindow extends WaterTankObserver{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	
	@Override
	public void update(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
	
	/*public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}*/
}

class AlarmWindow extends WaterTankObserver {
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	
	@Override
	public void update(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");	
	}
	
	/*public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}*/
}

class DisplayWindow extends WaterTankObserver {
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	
	@Override
	public void update(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}
	
	/*public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}*/	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private DisplayWindow displayWindow;
	private AlarmWindow alarmWindow;
	private GateWindow gateWindow;
	
	WaterTank(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
			/*	displayWindow.setWaterLevel(waterLevel);
				alarmWindow.operateAlaram(waterLevel);
				gateWindow.executeGate(waterLevel);	*/
				
				displayWindow.update(waterLevel);
				alarmWindow.update(waterLevel);
				gateWindow.update(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}	
	public void setDisplayWindow(DisplayWindow displayWindow) {
		this.displayWindow = displayWindow;
	}
	public void setAlarmWindow(AlarmWindow alarmWindow) {
		this.alarmWindow = alarmWindow;
	}
	public void setGateWindow(GateWindow gateWindow) {
		this.gateWindow = gateWindow;
	}
}
class Demo{
	public static void main(String args[]){
		WaterTank waterTank = new WaterTank();
		waterTank.setDisplayWindow(new DisplayWindow());
		waterTank.setAlarmWindow(new AlarmWindow());
		waterTank.setGateWindow(new GateWindow());
		
		waterTank.setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
Q106)Adding Controller Room Step I
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class WaterTankObserver extends JFrame {
	public void update(int waterLevel) {
		System.out.println("WaterTankObserver");
	}
}

class GateWindow extends WaterTankObserver{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	
	@Override
	public void update(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
	
	/*public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}*/
}

class AlarmWindow extends WaterTankObserver {
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	
	@Override
	public void update(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");	
	}
	
	/*public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}*/
}

class DisplayWindow extends WaterTankObserver {
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	
	@Override
	public void update(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}
	
	/*public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}*/	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private WaterLevelController waterLevelController;
	
	WaterTank(WaterLevelController waterLevelController){
		this.waterLevelController = waterLevelController;
		
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
				displayWindow.update(waterLevel);
				alarmWindow.update(waterLevel);
				gateWindow.update(waterLevel);
			}
		});
		add(waterLevelSlider);
		
	}
}

class WaterLevelController {
	private AlarmWindow alarmWindow;
	private DisplayWindow displayWindow;
	private GateWindow gateWindow;
	
	public void setAlarmWindow(AlarmWindow alarmWindow) {
		this.alarmWindow = alarmWindow;
	}
	public void setDisplayWindow(DisplayWindow displayWindow) {
		this.displayWindow = displayWindow;
	}
	public void setGateWindow(GateWindow gateWindow) {
		this.gateWindow = gateWindow;
	}
}

class Demo{
	public static void main(String args[]){
		AlarmWindow alarmWindow = new AlarmWindow();
		DisplayWindow displayWindow = new DisplayWindow();
		GateWindow gateWindow = new GateWindow();
		
		WaterLevelController waterLevelController = new WaterLevelController();
	//	waterLevelController.alarmWindow = alarmWindow;
		waterLevelController.setAlarmWindow(alarmWindow);
		waterLevelController.setDisplayWindow(displayWindow);
		waterLevelController.setGateWindow(gateWindow);
		
		new WaterTank(waterLevelController).setVisible();
	}
}

/////////////////////////////////////////////////////////////////////
Q107)From Q109 Step II
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class WaterTankObserver extends JFrame {
	public void update(int waterLevel) {
		System.out.println("WaterTankObserver");
	}
}

class GateWindow extends WaterTankObserver{
	private JLabel gateLbl;
	
	GateWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Gate Window");
		setLayout(new FlowLayout());
		
		gateLbl = new JLabel("OPEN/CLOSE");
		gateLbl.setFont(new Font("",1,25));
		add(gateLbl);
		setVisible(true);
	}	
	
	@Override
	public void update(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}
	
	/*public void executeGate(int waterLevel) {
		gateLbl.setText(waterLevel >= 180 ? "OPEN" : "CLOSE");
	}*/
}

class AlarmWindow extends WaterTankObserver {
	private JLabel alarmLabel;
	
	AlarmWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Alarm Window");
		setLayout(new FlowLayout());
		
		alarmLabel=new JLabel("ON/OFF");
		alarmLabel.setFont(new Font("",1,25));
		add(alarmLabel);
		setVisible(true);
	}	
	
	@Override
	public void update(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");	
	}
	
	/*public void operateAlaram(int waterLevel) {
		alarmLabel.setText(waterLevel >= 150 ? "ON" : "OFF");
	}*/
}

class DisplayWindow extends WaterTankObserver {
	private JTextField displayText;
	private JLabel label;
	
	DisplayWindow(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Display Window");
		setLayout(new FlowLayout());
		
		label=new JLabel("      Water Level        ");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("",1,25));
		add(label);
		
		displayText=new JTextField(10);
		displayText.setFont(new Font("",1,25));
		add(displayText);
		setVisible(true);
	}
	
	@Override
	public void update(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}
	
	/*public void setWaterLevel(int waterLevel) {
		displayText.setText(waterLevel + " ");
	}*/	
}
class WaterTank extends JFrame{
	private JSlider waterLevelSlider;
	
	private WaterLevelController waterLevelController;
	
	WaterTank(WaterLevelController waterLevelController){
		this.waterLevelController = waterLevelController;
		
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Water Tank");
		setLayout(new FlowLayout());
		
		waterLevelSlider=new JSlider(JSlider.VERTICAL,0,200,100);
		waterLevelSlider.setFont(new Font("",1,25));
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				int waterLevel = waterLevelSlider.getValue();
				
				waterLevelController.setWaterLevel(waterLevel);
				
				/*displayWindow.update(waterLevel);
				alarmWindow.update(waterLevel);
				gateWindow.update(waterLevel);*/
				
			}
		});
		add(waterLevelSlider);
		
	}
}

class WaterLevelController {
	private AlarmWindow alarmWindow;
	private DisplayWindow displayWindow;
	private GateWindow gateWindow;
	
	private int waterLevel;
	
	public void setWaterLevel(int waterLevel) {
		this.waterLevel = waterLevel;
		
		alarmWindow.update(this.waterLevel);
		displayWindow.update(this.waterLevel);
		gateWindow.update(this.waterLevel);
	}
	
	public void setAlarmWindow(AlarmWindow alarmWindow) {
		this.alarmWindow = alarmWindow;
	}
	public void setDisplayWindow(DisplayWindow displayWindow) {
		this.displayWindow = displayWindow;
	}
	public void setGateWindow(GateWindow gateWindow) {
		this.gateWindow = gateWindow;
	}
}

class Demo{
	public static void main(String args[]){
		/*AlarmWindow alarmWindow = new AlarmWindow();
		DisplayWindow displayWindow = new DisplayWindow();
		GateWindow gateWindow = new GateWindow();*/
		
		WaterLevelController waterLevelController = new WaterLevelController();
		
		waterLevelController.setAlarmWindow(new AlarmWindow());
		waterLevelController.setDisplayWindow(new DisplayWindow());
		waterLevelController.setGateWindow(new GateWindow());
		
		new WaterTank(waterLevelController).setVisible(true);
	}
}

/////////////////////////////////////////////////////////////////////
    "Object" class
/////////////////////////////////////////////////////////////////////
Q108)
class Human {
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void eat() {
		System.out.println("Human Eat");
	}
}

class Demo{
	public static void main(String args[]){
		Human human = new Human(1, "Kamal");
		human.eat();	//
		//human.talk();	//?
		human.toString();
		human.getClass();
		human.hashCode();
		human.equals(human);
	}
}

/////////////////////////////////////////////////////////////////////
Q109)
class Human extends Object {	//compiler insert at compile time
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void eat() {
		System.out.println("Human Eat");
	}
}

class Demo{
	public static void main(String args[]){
		Human human = new Human(1, "Kamal");
		human.eat();	//
		//human.talk();	//?
		human.toString();
		human.getClass();
		human.hashCode();
		human.equals(human);
	}
}

/////////////////////////////////////////////////////////////////////
Q110)
class Alien {	//compiler insert
	
}

class Human extends Alien {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void eat() {
		System.out.println("Human Eat");
	}
}

class Animal {
	
}

class Demo{
	public static void main(String args[]){
		Human human = new Human(1, "Kamal");
		human.eat();	//
		//human.talk();	//?
		human.toString();
		human.getClass();
		human.hashCode();
		human.equals(human);
		
		Animal animal = new Animal();
		animal.toString();
		animal.hashCode();
		animal.getClass();
		animal.equals(animal);
	}
}

/////////////////////////////////////////////////////////////////////
Q111)
class Alien {	//compiler insert
	
}

class Human extends Alien {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	Object eat() {
		return new Animal();
	}
}

class Animal {
	
}

class Demo{
	public static void main(String args[]){
		Object obj;
		obj = new Alien();
		obj = new Human(1, "Kamal");
		obj = new Animal();
		obj = new int[10];
	}
}


/////////////////////////////////////////////////////////////////////
Q112)
class Demo{
	public static void main(String args[]){
		String s = "Kamal";	//new String("Kamal")
		s.toString();
		s.hashCode();
		
	}
}

/////////////////////////////////////////////////////////////////////
    "public Class getClass()" method
/////////////////////////////////////////////////////////////////////
Q113)
class Human {
	
}

class Demo{
	public static void main(String args[]){
		Human human = new Human();
		Class cls = human.getClass();
		
		System.out.println("Class: " + cls);
		
		String className = cls.getName();
		System.out.println("Class Name: " + className);
		
		System.out.println(human.getClass().getName());
	}
}

/////////////////////////////////////////////////////////////////////
Q114)
class Human {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Demo{
	public static void main(String args[]){
		Human h1 = new Human(1, "Kamal");
		Human h2 = new Human(2, "Saman");
		Human h3 = new Human(1, "Kamal");
		
		int hash1 = h1.hashCode();
		int hash2 = h2.hashCode();
		int hash3 = h3.hashCode();
		
		System.out.println("h1: " + hash1);
		System.out.println("h2: " + hash2);
		System.out.println("h3: " + hash3);
	}
}

/////////////////////////////////////////////////////////////////////
    "public String toString()" method
/////////////////////////////////////////////////////////////////////
Q115)
class Human {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//toString() method in Object class
	public String toString() {
		return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
	}
}

class Demo{
	public static void main(String args[]){
		Human h1 = new Human(1, "Kamal");
		
		System.out.println("h1: " + h1);
		
		int hash = h1.hashCode();
		System.out.println("toString(): " + h1.getClass().getName() + "@" + Integer.toHexString(hash));
		
		
	}
}

/////////////////////////////////////////////////////////////////////
Q116)
class Human {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//override
	@Override
	public String toString() {
		return id + " - " + name;
	}
}

class Demo{
	public static void main(String args[]){
		Human h1 = new Human(1, "Kamal");
		
		System.out.println("h1: " + h1);
		
	}
}

/////////////////////////////////////////////////////////////////////
    "publc boolean equals(Object obj)" method
/////////////////////////////////////////////////////////////////////
Q117)
class Human {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//equals() method in Object class
	public boolean equals(Object obj) {
		return (this == obj);
	}
}

class Demo{
	public static void main(String args[]){
		Human h1 = new Human(1, "Kamal");
		Human h2 = new Human(2, "Saman");
		Human h3 = new Human(1, "Kamal");
		
		Human h4 = h1;
		
		System.out.println(h1.equals(h2));	//?	
		System.out.println(h1.equals(h3));	//?	
		System.out.println(h1.equals(h4));	//?
		
	}
}

/////////////////////////////////////////////////////////////////////
Q118)
class Human {	
	int id;
	String name;
	
	Human(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//equals() Override
	@Override
	public boolean equals(Object obj) {
		Human human = (Human)obj;
		return (this.id == human.id);
	}
}

class Demo{
	public static void main(String args[]){
		Human h1 = new Human(1, "Kamal");
		Human h2 = new Human(2, "Saman");
		Human h3 = new Human(1, "Kamal");
		
		Human h4 = h1;
		
		System.out.println(h1.equals(h2));	//?	
		System.out.println(h1.equals(h3));	//?	
		System.out.println(h1.equals(h4));	//?
		
	}
}

/////////////////////////////////////////////////////////////////////
    "Abstraction"
/////////////////////////////////////////////////////////////////////
Q119)
class Animal {
	void eat();
}
class Dog extends Animal {
	@Override
	void eat() {
		String animalName = getClass().getName();
		System.out.println(animalName + " eat");
	}
}
class Cat extends Animal {
	@Override
	void eat() {
		String animalName = getClass().getName();
		System.out.println(animalName + " eat");
	}
}
class Bird extends Animal {
	@Override
	void eat() {
		String animalName = getClass().getName();
		System.out.println(animalName + " eat");
	}
}

class Demo{
	public static void main(String args[]){
		Animal animal;
		
		animal = new Dog();
		animal.eat();	//?
		
		animal = new Cat();
		animal.eat();	//?
		
		animal = new Bird();
		animal.eat();	//?
	}
}

/////////////////////////////////////////////////////////////////////
Q120)
abstract class Animal {
	abstract void eat();
}
class Dog extends Animal {
	@Override
	void eat() {
		String animalName = getClass().getName();
		System.out.println(animalName + " eat");
	}
}
class Cat extends Animal {
	@Override
	void eat() {
		String animalName = getClass().getName();
		System.out.println(animalName + " eat");
	}
}
class Bird extends Animal {
	@Override
	void eat() {
		String animalName = getClass().getName();
		System.out.println(animalName + " eat");
	}
}

class Demo{
	public static void main(String args[]){
		Animal animal;
		
		animal = new Dog();
		animal.eat();	//?
		
		animal = new Cat();
		animal.eat();	//?
		
		animal = new Bird();
		animal.eat();	//?
	}
}

/////////////////////////////////////////////////////////////////////
Q121)
abstract class Agreement {
	abstract void noChatWithAnotherGirls();
	abstract void noDrinks();
}

class Boy extends Agreement {
	@Override
	void noChatWithAnotherGirls() {
		System.out.println("No Chats");
	}
	
	@Override
	void noDrinks() {
		System.out.println("No Drinks");
	}
}

class Demo{
	public static void main(String args[]){
		
	}
}

/////////////////////////////////////////////////////////////////////
Q122)case I
abstract class Agreement {
	abstract void noChatWithAnotherGirls();
	
	void run() {
		System.out.println("run");
	}
}

/////////////////////////////////////////////////////////////////////
Q123)case II
abstract class Agreement {
	abstract void noChatWithAnotherGirls();
	
	void run() {
		System.out.println("run");
	}
}

class Demo{
	public static void main(String args[]){
		new Agreement();
	}
}


/////////////////////////////////////////////////////////////////////
Q124)case III
abstract class Agreement {
	abstract void noChatWithAnotherGirls();
	
	void run() {
		System.out.println("run");
	}
}

class Boy extends Agreement {
	@Override
	void noChatWithAnotherGirls() {
		System.out.println("no chats");
	}
}


/////////////////////////////////////////////////////////////////////
Q125)case IV
abstract class Agreement {
	abstract void noChatWithAnotherGirls();
	
	Agreement() {}
	
	void run() {
		System.out.println("run");
	}
}
/////////////////////////////////////////////////////////////////////
Q126)case V
abstract class Animal {
	private abstract void eat();
	final abstract void sleep();
	static abstract void live();
}

/////////////////////////////////////////////////////////////////////
    "Interface"
/////////////////////////////////////////////////////////////////////
Q127)
//abstract class Animal {
//    abstract void eat();
//    abstract void sleep();
//    abstract void live();
//}
interface Animal {
    void eat();
    void sleep();
    void live();
}

class Dog implements Animal {

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void live() {
    }


    
}

class Cat implements Animal {

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void live() {
    }
}

class Bird implements Animal {

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void live() {
    }

}
/////////////////////////////////////////////////////////////////////
Q128)
interface Car {
	void horn();
	void fly();
	void reverse();
	void go();
}

class BMW implements Car {
	
}

class Toyota implements Car {
	
}

/////////////////////////////////////////////////////////////////////
Q129)
abstract class TV1 {
	//audio
	public void audio() {
		System.out.println("audio");
	}
	//radio
	public void radio() {
		System.out.println("radio");
	}
	
	//video
	abstract void video();
	
	//channel
	abstract void channel();
}
abstract class TV2 extends TV1 {
	void video() {
		System.out.println("video");
	}
	//channel
	abstract void channel();
}

class TV3 extends TV2 {
	void channel() {
		System.out.println("channel");
	}
}

class Demo{
	public static void main(String args[]){
		new TV3();
	}
}

/////////////////////////////////////////////////////////////////////
    "Interface"
/////////////////////////////////////////////////////////////////////
Q130)
interface TV {
	void radio();
	void channel();
	void video();
	void audio();
}
/////////////////////////////////////////////////////////////////////   
Q131)case I
interface Human {
//    void eat();
}

class Customer extends Human {} //Illegal
class Student implements Human {}   //Legal

/////////////////////////////////////////////////////////////////////
Q132)case II
interface Human {
    private void eat();
    protected void eat();
}

/////////////////////////////////////////////////////////////////////
Q133)case III
interface Human {
    void eat() {    //Illegal
        
    }
    
    void sleep();   //Legal
}

/////////////////////////////////////////////////////////////////////
Q134)case IV
interface Human {
    void eat();
    
    void sleep();  
    
    default void die() {    //since JDK 1.8
        
    }
}

/////////////////////////////////////////////////////////////////////
Q135)case V
interface Human {
    void eat();
    
    void sleep();  
    
    default void die() {    //since JDK 1.8
        System.out.println("finnaly die");
    }
}

class Customer implements Human {

    @Override
    public void eat() {
        
    }

    @Override
    public void sleep() {
        
    }
    
}

/////////////////////////////////////////////////////////////////////
Q136)case VI
interface Human {
    void eat();
    
    void sleep();  
    
    static void sing() {    //since JDK1.8
        System.out.println("human sing");
    }
}

/////////////////////////////////////////////////////////////////////
Q137)case VII
interface Human {
    void eat();
    
    void sleep();  
    
    void talk();
}
class Customer implements Human{

    @Override
    public void eat() {
        
    }

    @Override
    public void sleep() {
        
    }

    @Override
    public void talk() {
        
    }
    
}

/////////////////////////////////////////////////////////////////////
Q138)case VIII
interface Human {
    void eat();
    
    void sleep();  
    
    void talk();
}

public class Main {
    public static void main(String[] args) {
        new Human();    //Illegal
    }
}

/////////////////////////////////////////////////////////////////////
Q139)case IX
interface Human {
    void eat();
    
    void sleep();  
    
    void talk();
}

class Customer implements Human {

    @Override
    public void eat() {
        System.out.println("customer eat");
    }

    @Override
    public void sleep() {
        
    }

    @Override
    public void talk() {
        
    }
    
}

public class Main {
    public static void main(String[] args) {
        Human human = new Customer();
        human.eat();    //dynamic  method dispatch
    }
}

/////////////////////////////////////////////////////////////////////
Q140)case X
interface Human {
    
    public static final int a;  //Illegal   /// Implicitly final, static, public
    int b = 10; //Legal
    
    void eat();
}

public class Main {
    public static void main(String[] args) {
        Human human = new Customer();
        
        System.out.println("Human.b: " + Human.b);
    }
}

/////////////////////////////////////////////////////////////////////
Q141)case XI
interface Human {
    
    Human() {}  //Illegal
    
    void eat();
}

/////////////////////////////////////////////////////////////////////
Q142)case XII
class A {}
class B {}

interface X {}
interface Y {}
interface Z {}

class Human extends A,B {}  //Illegal

class Student implements X, Y, Z {} //Legal

/////////////////////////////////////////////////////////////////////
Q143)case XIII
class A {}
class B {}

interface X {}
interface Y {}
interface Z {}

class Student extends A implements X, Y, Z {}

/////////////////////////////////////////////////////////////////////
Q144)case XIV
interface Animal {
    void die();
}

//interface Human implements Animal {}    //Illegal
interface Human extends Animal{}    //Legal

/////////////////////////////////////////////////////////////////////
Q145)case XV
class Animal {
    void die() {}
}

//interface Human extends Animal {}   //Illeagl
interface Human implements Anima {} //Illegal

/////////////////////////////////////////////////////////////////////
Q146) Advantage of Dynamic method dispatch
interface Human {

    void eat();
}

class Student implements Human {

    @Override
    public void eat() {
        System.out.println("student eat!");
    }

}

public class Main {

    public static void main(String[] args) {
//        Student st = new Student();
//        st.eat();

        Human human = new Student();
        human.eat();    //dynamic method dispatch
    }
}
/////////////////////////////////////////////////////////////////////
Q147)
interface GoodGirl {
    void chatWithBoy();
}

class Girl implements GoodGirl {
    
    public void chatWithAnotherBoy() {
        System.out.println("chat with another boy");
    }

    @Override
    public void chatWithBoy() {
        System.out.println("chat with boy");
    }
}

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.chatWithBoy();
        girl.chatWithAnotherBoy();
        
        GoodGirl gg = new Girl();
        gg.chatWithBoy();   //dynamic method dispatch
        gg.chatWithAnotherBoy();    //Illegal
    }
}
/////////////////////////////////////////////////////////////////////
   "Java Inner Class/Nested Class"
/////////////////////////////////////////////////////////////////////
Q148) (Member/Regular Inner class)
class Outer {

    int a;

    void showOuter() {
        System.out.println("show outer!");
    }

    class Inner {

        int b;

        void showInner() {
            System.out.println("show inner!");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.a = 10;
        outer.showOuter();
        
        Outer.Inner inner = outer.new Inner();
        inner.b = 20;
        inner.showInner();
    }
}
/////////////////////////////////////////////////////////////////////
Q149)(static inner class)
class Outer {

    static int a;

    static void showOuter() {
        System.out.println("show outer!");
    }

    static class Inner {

        int b;
        static int x;

        void showInner() {
            System.out.println("show inner!");
        }
        
        static void test(){}
    }
}

public class Main {

    public static void main(String[] args) {
        Outer.a = 10;
        Outer.showOuter();
        
        Outer.Inner inner = new Outer.Inner();
        inner.b = 20;
        inner.showInner();
        
        Outer.Inner.x = 30;
        Outer.Inner.test();
        
    }
}

/////////////////////////////////////////////////////////////////////
Q150)Exercise
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Calculator extends JFrame {

    JTextField textField;
    JButton setButton;

    public Calculator() {
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        textField.setFont(new Font("", 1, 25));

        setButton = new JButton("Set Title");
        setButton.setFont(new Font("", 1, 25));

        setButton.addActionListener(new SetButtonAction(this));

        add(textField);
        add(setButton);

    }

}

class SetButtonAction implements ActionListener {

    Calculator c1;

    public SetButtonAction(Calculator c1) {
        this.c1 = c1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = c1.textField.getText();
        c1.setTitle(text);
    }

}

public class Main {

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

/////////////////////////////////////////////////////////////////////
Q151)From Q150 (using Inner class)
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Calculator extends JFrame {

    JTextField textField;
    JButton setButton;

    public Calculator() {
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        textField.setFont(new Font("", 1, 25));

        setButton = new JButton("Set Title");
        setButton.setFont(new Font("", 1, 25));

        //-- start of the Inner class
        class SetButtonAction implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                setTitle(text);
            }

        }

        //-- end of the Inner class
        setButton.addActionListener(new SetButtonAction());

        add(textField);
        add(setButton);
    }

}

public class Main {

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

/////////////////////////////////////////////////////////////////////
    "Annonymous Inner class"
/////////////////////////////////////////////////////////////////////
Q152)
class Human {
    void eat() {
        System.out.println("Human eat!");
    }
}

class Customer extends Human {
    @Override
    void eat() {
        System.out.println("Customer eat");
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Customer();
        human.eat();
    }
}

/////////////////////////////////////////////////////////////////////
Q153) (using annonymous inner class)
class Human {
    void eat() {
        System.out.println("Human eat!");
    }
}

//class Customer extends Human {
//    @Override
//    void eat() {
//        System.out.println("Customer eat");
//    }
//}

public class Main {
    public static void main(String[] args) {
        Human human = new Human()
        {
            @Override
            void eat() {
                System.out.println("customer eat");
            }
        
        };
        
        human.eat();    //customer eat
        
    }
}

/////////////////////////////////////////////////////////////////////
Q154)
class Human {

    void eat() {
        System.out.println("Human eat!");
    }
}

public class Main {

    public static void main(String[] args) {
        Human human = new Human() {
            @Override
            void eat() {
                System.out.println("customer eat");
            }

        };

        human.eat();    //customer eat

        Human student = new Human() {
            @Override
            void eat() {
                String name = "student";
                System.out.println(name + " eat!");
            }

        };
        student.eat();

        new Human() {
            
            int a;
            
            {
                System.out.println("here is Boy's instance block!");
            }
            
            @Override
            void eat() {
                System.out.println("Boy eat!");
            }

        }.eat();
        
    }
}

/////////////////////////////////////////////////////////////////////
    "Interface types"
/////////////////////////////////////////////////////////////////////
Q155)
interface Human {   //Normal Interface
    void eat();
    void sleep();
}

interface Human {   //Functional Interface Eg:- ActionListener
    void eat();
}

interface Human {}  //Marker Interface Eg:- Serializable

/////////////////////////////////////////////////////////////////////
    "Lambda Expression"
/////////////////////////////////////////////////////////////////////
Q156)
interface Human {   //Functional interface
    void eat();
}

class Student implements Human {

    @Override
    public void eat() {
        System.out.println("student eat!");
    }
    
}


public class Main {
    public static void main(String[] args) {
        Human student = new Student();
        student.eat();
        
    }
}

/////////////////////////////////////////////////////////////////////
Q157)step I
interface Human {   //Functional interface
    void eat();
}

//class Student implements Human {

//    @Override
//    public void eat() {
//        System.out.println("student eat!");
//    }
//    
//}


public class Main {
    public static void main(String[] args) {
        Human student = new Human(){
            @Override
            public void eat() {
                System.out.println("student eat!");
            }
        };
        
        student.eat();
        
    }
}

/////////////////////////////////////////////////////////////////////
Q158)step II (using lambda expression)
interface Human {   //Functional interface
    void eat();
}

//class Student implements Human {
//
//    @Override
//    public void eat() {
//        System.out.println("student eat!");
//    }
//    
//}


public class Main {
    public static void main(String[] args) {
        
        //Lambda expression
        Human student = () -> System.out.println("student eat!");
        
        student.eat();
        
    }
}

/////////////////////////////////////////////////////////////////////
Q159)
interface Human {   //Functional interface

    void eat();
}

public class Main {

    public static void main(String[] args) {

        Human customer = () -> {
            System.out.println("customer statement 1!");
            System.out.println("customer statement 2!");
        };

        customer.eat();

    }
}

/////////////////////////////////////////////////////////////////////
Q160)From Q151
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Calculator extends JFrame {

    JTextField textField;
    JButton setButton;

    public Calculator() {
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        textField.setFont(new Font("", 1, 25));

        setButton = new JButton("Set Title");
        setButton.setFont(new Font("", 1, 25));

        //-- start of the Inner class
//        class SetButtonAction implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String text = textField.getText();
//                setTitle(text);
//            }
//
//        }
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                setTitle(text);
            }
        };

        //-- end of the Inner class
        setButton.addActionListener(al);

        add(textField);
        add(setButton);
    }

}

public class Main {

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}

/////////////////////////////////////////////////////////////////////
Q161)From Q160 (using lambda expression)
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Calculator extends JFrame {

    JTextField textField;
    JButton setButton;

    public Calculator() {
        setSize(400, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        textField.setFont(new Font("", 1, 25));

        setButton = new JButton("Set Title");
        setButton.setFont(new Font("", 1, 25));

//        ActionListener al = (ActionEvent e) -> {
//
//            String text = textField.getText();
//            setTitle(text);
//
//        };

        setButton.addActionListener((ActionEvent e) -> {
            String text = textField.getText();
            setTitle(text);
        });

        add(textField);
        add(setButton);
    }

}

public class Main {

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}
/////////////////////////////////////////////////////////////////////
Q162)Exercise
interface Even {
    void findEven();
}

interface Odd {
    void findOdd();
}

interface PrintName {
    void print(String name);
}

public class Main {
    public static void main(String[] args) {
        
    }
}

/////////////////////////////////////////////////////////////////////
Q163)From Q162 Step I
interface Even {
    void findEven();
}

interface Odd {
    void findOdd();
}

interface PrintName {
    void print(String name);
}

public class Main {
    public static void main(String[] args) {
        Even even = new Even(){
            @Override
            public void findEven() {
                int num = 10;
                System.out.println((num % 2 == 0) ? "even" : "odd");
            }
        };
        even.findEven();
    }
}

/////////////////////////////////////////////////////////////////////
Q164)Step II (using annonymous class)
interface Even {
    void findEven();
}

interface Odd {
    void findOdd();
}

interface PrintName {
    void print(String name);
}

public class Main {
    public static void main(String[] args) {
        Even even = new Even(){
            @Override
            public void findEven() {
                int num = 10;
                System.out.println((num % 2 == 0) ? "even" : "odd");
            }
        };
        even.findEven();
        
        new Odd(){
            @Override
            public void findOdd() {
                int num = 11;
                System.out.println((num % 2 == 0) ? "even" : "odd");
            }
        }.findOdd();
        
//        PrintName pn = new PrintName() {
//            @Override
//            public void print(String name) {
//                System.out.println("Name: " + name);
//            }
//        };
//        
//        pn.print("Kamal");
        
        new PrintName() {
            @Override
            public void print(String name) {
                System.out.println("Name: " + name);
            }
        }.print("Kamal");
    }
}

/////////////////////////////////////////////////////////////////////
Q165)step III (using Lambda expression)
interface Even {

    void findEven();
}

interface Odd {

    void findOdd();
}

interface PrintName {

    void print(String name);
}

public class Main {

    public static void main(String[] args) {
        Even even = () -> {

            int num = 10;
            System.out.println((num % 2 == 0) ? "even" : "odd");

        };
        even.findEven();

        Odd odd = () -> {

            int num = 11;
            System.out.println((num % 2 == 0) ? "even" : "odd");

        };

        odd.findOdd();

        PrintName pn = (String name) -> {

            System.out.println("Name: " + name);

        };

        pn.print("Kamal");
    }
}

/////////////////////////////////////////////////////////////////////
Q166)case I
interface Human {
    void eat();
}

public class Main {

    public static void main(String[] args) {
        Human customer = () -> System.out.println("customer eat!");
        customer.eat();
        
        Human boy = () -> System.out.println("boy eat!");
        boy.eat();
    }
}

/////////////////////////////////////////////////////////////////////
Q167)case II
interface Human {

    void eat();
}

public class Main {

    public static void main(String[] args) {
        Human customer = () -> {
            System.out.println("customer statement 1");
            System.out.println("customer statement 2");
        };
        customer.eat();

        Human boy = () -> {
            System.out.println("boy statement 1");
            System.out.println("boy statement 2");
        };
        boy.eat();
    }
}

/////////////////////////////////////////////////////////////////////
Q168)case III
interface Human {

    void eat(int qty);
}

public class Main {

    public static void main(String[] args) {
        Human customer = (int q) ->System.out.println("Qty: " + q);
        customer.eat(10);
        
        Human boy = (qty) -> System.out.println("Qty: " + qty);
        boy.eat(20);
    }
}

/////////////////////////////////////////////////////////////////////
Q169)case IV
interface Human {

    void eat(int qty);
}

interface Animal {
    void sleep(int time, int day);
}

public class Main {

    public static void main(String[] args) {
        Human customer = (int q) ->System.out.println("Qty: " + q);
        customer.eat(10);
        
        Human boy = (qty) -> System.out.println("Qty: " + qty);
        boy.eat(20);
        
        Animal bird = (int time, int day) -> System.out.println("bird");
        bird.sleep(10, 1);
        
        Animal dog = (t, d) -> System.out.println("dog");
        bird.sleep(10, 1);
        
        
    }
}

/////////////////////////////////////////////////////////////////////
Q170)case V
interface Human {

    int eat();
}

public class Main {

    public static void main(String[] args) {
        Human boy = () -> 10 + 5;
        
        System.out.println(boy.eat());
        
        Human customer = () -> { 
            return 10;
        };
        System.out.println("customer: " + customer.eat());
        
    }
}

/////////////////////////////////////////////////////////////////////
Q171)case VI
interface Human {

    void eat();
    void sleep();
}

public class Main {

    public static void main(String[] args) {
        Human boy = () -> { //Illegal
            System.out.println("boy");
        };
        
    }
}

/////////////////////////////////////////////////////////////////////
Q172)case VII
interface Human {   //still functional interface
    void eat();
    
    default void die()  {
        System.out.println("die");
    }
}

public class Main {

    public static void main(String[] args) {
        Human boy = () -> System.out.println("boy");
        
    }
}

/////////////////////////////////////////////////////////////////////
Q173)case VIII
abstract class Human {
    abstract void eat();
}

public class Main {

    public static void main(String[] args) {
        Human boy = () -> System.out.println("boy");    //Illegal
        
    }
}


/////////////////////////////////////////////////////////////////////
    "Garbage Collection"
/////////////////////////////////////////////////////////////////////
Q174)
class DB {
    long[] data = new long[100000];
}

public class Main {
    public static void main(String[] args) {
        System.out.println("start main");
        
        for (int i = 0; i < 10000; i++) {
            System.out.println("i: " + (i+1));
            
            new DB();
        }
        
        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q175)
class DB {

    long[] data = new long[100000];
}

public class Main {

    public static void main(String[] args) {

        DB[] temp = new DB[10000];

        System.out.println("start main");

        for (int i = 0; i < 10000; i++) {
            System.out.println("i: " + (i + 1));

//            new DB();
            temp[i] = new DB();
        }

        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
    "finalize()" -> Object class
/////////////////////////////////////////////////////////////////////
Q176)case I
class DB extends Object {

    long[] data = new long[100000];
    
    @Override
    public void finalize() {
        System.out.println("deleted: " + this);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("start main");

        for (int i = 0; i < 10000; i++) {
            System.out.println("i: " + (i + 1));

            new DB();
        }

        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q177)case II
class DB {

    long[] data = new long[100000];
    
    @Override
    public void finalize() {
        System.out.println("deleted: " + this);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("start main");

        new DB();
        new DB();
        new DB();

        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q178)case III
class DB {

    int a;
    long[] data = new long[100000];

    DB(int a) {
        this.a = a;
    }

    @Override
    public void finalize() {
        System.out.println("deleted: " + a);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("start main");

        new DB(100);
        new DB(200);
        new DB(300);

        System.gc();    //invoke garbage collecter
        
        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        
        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q179)case IV
class DB {

    int a;

    DB(int a) {
        this.a = a;
    }

    @Override
    public void finalize() {
        System.out.println("deleted: " + a);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("start main");

        DB db1 = new DB(100);

        db1 = null;
        
        System.gc();    //invoke garbage collecter
        
        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        
        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q180)case V
class DB {

    int a;

    DB(int a) {
        this.a = a;
    }

    @Override
    public void finalize() {
        System.out.println("deleted: " + a);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("start main");

        DB db1;
        
        db1 = new DB(100);
        
        db1 =  new DB(200);
        db1 = new DB(300);
        
        System.gc();    //invoke garbage collecter
        
        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        
        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q181)case VI
class DB {

    int a;

    DB(int a) {
        this.a = a;
    }

    @Override
    public void finalize() {
        System.out.println("deleted: " + a);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("start main");

        int x = 100;
        
        if(x > 0) {
            int num = 100;
            
            DB db1 = new DB(100);
            DB db2 = new DB(200);
            DB db3 = new DB(300);
        }
        
        //System.out.println(num);//Illegal
        
        System.gc();    //invoke garbage collecter
        
        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        
        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
Q182)case VII
class DB {

    int a;

    DB(int a) {
        this.a = a;
    }

    @Override
    public void finalize() {
        System.out.println("deleted: " + a);
    }
}

public class Main {

    public static void ObjInitializer() {
        DB db1 = new DB(100);
        DB db2 = new DB(200);
        DB db3 = new DB(300);
    }

    public static void main(String[] args) {

        System.out.println("start main");

        ObjInitializer();
        
        System.gc();

        try {Thread.sleep(2000);} catch (InterruptedException ex) {}

        System.out.println("end main");
    }
}

/////////////////////////////////////////////////////////////////////
    "Java Enumeration/Enum" -> since JDK 1.5
/////////////////////////////////////////////////////////////////////
Q183)
class Demo{
  	public static void main(String[] args) {
		System.out.println("Start main");
		  	
	}	
}
int x = 10;

/////////////////////////////////////////////////////////////////////
Q184)
//class Season {
//    public static final String SUMMER = "SUMMER";
//    public static final String WINTER = "WINTER";
//    public static final String SPRING = "SPRING";
//    public static final String FALL = "FALL";
//}

enum Season {
    SUMMER, SPRING, WINTER, FALL
}

/////////////////////////////////////////////////////////////////////
Q185)
enum Season {
    SUMMER, SPRING, WINTER, FALL
}

public class Main {
    public static void main(String[] args) {
        
        Season s1 = Season.FALL;
        
        System.out.println(s1); //toString()
        
        System.out.println(Season.SUMMER);
    }
}

/////////////////////////////////////////////////////////////////////
Q186)case I
public class Main {

    enum Season {
        SUMMER, SPRING, WINTER, FALL
    }

    public static void main(String[] args) {

        Season s1 = Season.FALL;

        System.out.println(s1); //toString()

        System.out.println(Season.SUMMER);
    }
}

/////////////////////////////////////////////////////////////////////
Q187)case II
public class Main {

    enum Season {
        SUMMER, SPRING, WINTER, FALL
    }

    public static void main(String[] args) {

        Season s1;
        new Season();   //Illegal
    }
}

/////////////////////////////////////////////////////////////////////
Q188)case III
public class Main {

    enum Season {
        SUMMER, SPRING, WINTER, FALL
    }

    public static void main(String[] args) {

        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER:
                System.out.println("summer");
                break;
            case SPRING:
                System.out.println("spring");
                break;
            case WINTER:
                System.out.println("winter");
                break;
            case FALL:
                System.out.println("fall");
                break;
        }
    }
}

/////////////////////////////////////////////////////////////////////
Q189)case IV (value())
enum Season {
    SUMMER, SPRING, WINTER, FALL
}

public class Main {

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        
        for (Season season : seasons) {
            System.out.println(season);
        }
    }
}

/////////////////////////////////////////////////////////////////////
Q190)case V (ordinal())
enum Season {
    SUMMER, SPRING, WINTER, FALL
}

public class Main {

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        
        for (Season season : seasons) {
            System.out.println(season.ordinal());
        }
    }
}

/////////////////////////////////////////////////////////////////////
Q191)case VI
enum Season {
    SUMMER(10), SPRING(20), WINTER(30), FALL(40);
    
    int a;
    private Season(int a) {
        this.a = a;
    }
}

public class Main {

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        
        for (Season season : seasons) {
            System.out.println(season + " - " + season.a);
        }
    }
}

/////////////////////////////////////////////////////////////////////
    "Variable Arguments/Var Args"
/////////////////////////////////////////////////////////////////////
Q192)
public class Main {

    public static void printNumber(int i, int j, int k) {
        System.out.println("number: " + i + "" + j + "" + k);
    }
    public static void printNumber(int i, int j) {
        System.out.println("number: " + i + "" + j);
    }
    public static void printNumber(int i) {
        System.out.println("number: " + i);
    }
    public static void printNumber() {
        System.out.println("number: ");
    }

    public static void main(String[] args) {
        printNumber();
        
        printNumber(1);
        
        printNumber(1,2);
        
        printNumber(1, 2, 3);
    }
}
/////////////////////////////////////////////////////////////////////
Q193)
public class Main {
    public static void printNumber(int... xr) { // -> int[] xr
        System.out.println(xr.length);
        
        for (int i = 0; i < xr.length; i++) {
            System.out.println("i: " + xr[i]);
        }
    }

    public static void main(String[] args) {
//        printNumber();    // {}
        
//        printNumber(1);   // new int[]{1}
        
//        printNumber(1,2); // {1, 2}
        
        printNumber(100, 200, 300);   // {1, 2, 3}
    }
}

/////////////////////////////////////////////////////////////////////
