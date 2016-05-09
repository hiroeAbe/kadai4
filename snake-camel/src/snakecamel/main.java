package snakecamel;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class main {
	public static void main(String[]args){
	SnakeCamelUtil sc = new SnakeCamelUtil();
	System.out.println(sc.snakeToCamelcase("abc"));
	System.out.println(sc.snakeToCamelcase("abc_def"));
	System.out.println(sc.snakeToCamelcase("abc_def_gh"));
	System.out.println(sc.snakeToCamelcase("abc__def___gf"));
	System.out.println(sc.snakeToCamelcase("_abc_def__"));
	
	System.out.println(sc.camelToSnakecase("Abc"));
	System.out.println(sc.camelToSnakecase("AbcDef"));
	System.out.println(sc.camelToSnakecase("AbcDefGh"));
	
	System.out.println(sc.capitalize("a"));
	System.out.println(sc.capitalize("xyz"));
	
	System.out.println(sc.uncapitalize("A"));
	System.out.println(sc.uncapitalize("Xyz"));
	}
}
