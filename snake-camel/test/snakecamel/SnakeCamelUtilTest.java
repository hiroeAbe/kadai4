package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*
;public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseTest() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc__def___gh");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelcaseToSnakecaseTest() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = sc.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	@Test
	public void capitalizeTest() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = sc.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeTest() {
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = sc.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
}
