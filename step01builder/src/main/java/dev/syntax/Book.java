package dev.syntax;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//import lombok.Value;

@NoArgsConstructor //기본 생성자 메서드 자동 완성 어노테이션
//@AllArgsConstructor //모든 필드를 매개변수로 받는 생성자 어노테이션
@Setter @Getter
@ToString
//@Builder

//@Value(final 기입으로)

public class Book {
	private String name;
	private String author;
	private String publisher;
}
