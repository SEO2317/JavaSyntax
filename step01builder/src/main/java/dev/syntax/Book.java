package dev.syntax;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//import lombok.Value;

@NoArgsConstructor //�⺻ ������ �޼��� �ڵ� �ϼ� ������̼�
//@AllArgsConstructor //��� �ʵ带 �Ű������� �޴� ������ ������̼�
@Setter @Getter
@ToString
//@Builder

//@Value(final ��������)

public class Book {
	private String name;
	private String author;
	private String publisher;
}