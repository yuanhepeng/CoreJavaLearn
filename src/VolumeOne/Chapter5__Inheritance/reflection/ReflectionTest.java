package VolumeOne.Chapter5__Inheritance.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * This program uses reflection to print all features of a class.
 * @author DELL
 * @version 1.8 2020��7��24��
 */
@SuppressWarnings({"rawtypes", "resource"})
public class ReflectionTest {

	public static void main(String[] args) {
		// read class name from command line args or user input
		String name;
		if (args.length >0) {
			name = args[0];
		}else {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date):");
			name = in.next();
		}
		
		try {
			//print class name and superclass name (if != Object)
			Class cl = Class.forName(name);
			Class supercl = cl.getSuperclass();
			String modifiers = Modifier.toString(cl.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print("class " + name);
			if (supercl != null && supercl != Object.class) {
				System.out.print(" extends " + supercl.getName());
			}
			System.out.print("\n{\n");
			printConstractors(cl);
			System.out.println();
			printMehtods(cl);
			System.out.println();
			printFields(cl);
			System.out.println("}");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	/**
	 * Prints all constructors of a class
	 * @param cl a class
	 */
	public static void printConstractors(Class cl){
		Constructor[] constructors = cl.getDeclaredConstructors();
		
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print("  ");
			String modifiers = Modifier.toString(c.getModifiers());
			if(modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.print(name + "(");
			
			//print paramater types
			Class[] paramTypes = c.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
	}
	
	
	/**
	 * Prints all methods of a class
	 * @param cl a class
	 */
	public static void printMehtods(Class cl){
		Method[] methods = cl.getDeclaredMethods();
		
		for (Method m : methods) {
			Class retType = m.getReturnType();
			String name = m.getName();
			
			System.out.print("  ");
			//print modifiers, return type and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(retType.getName() + " " + name + "(");
			//print parameter types
			Class[] paramTypes = m.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if (i > 0) {
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
		
	}
	
	/**
	 * Prints all fields of a class
	 * @param cl a class
	 */
	public static void printFields(Class cl){
		Field[] fields = cl.getDeclaredFields();
		
		for (Field f : fields) {
			Class type = f.getType();
			String name = f.getName();
			System.out.print("  ");
			String modifiers = Modifier.toString(f.getModifiers());
			if(modifiers.length() > 0){
				System.out.print(modifiers + " ");
			}
			System.out.println(type.getName() + " " + name + ";");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}