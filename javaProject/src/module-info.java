/**
 * 
 */
/**
 * @author User
 *
 */
module javaProject {
	requires java.sql;
	
	requires lombok; // '외부에서 추가한' lombok이란 (jar파일을) 써야하니까 requires 해줘야~
	
	exports com.shinhan.day01;
	exports com.shinhan.day02;
	exports com.shinhan.day03;
	exports com.shinhan.day04;
	exports com.shinhan.day05;
	exports com.shinhan.day06;
	
}