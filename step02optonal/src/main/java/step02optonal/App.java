package step02optonal;

import java.util.Optional;

public class App {

	public static void main(String[] args) {
		//Optional�� ����
		//1. of(): null�� �ƴ� ���� ������ Optional�� ������ �� ����ϴ� �޼�,
		Optional<String> optWithValue = Optional.of("� ���ڿ� ��");//"� ���ڿ� ��"�� ������ ������ �ִ� Optional ��ü ����
		System.out.println(optWithValue); //Optional�� �����ִ� ����

		//2.ofNullable(): null�� ���� �մ� � ���� ������ Optional ��ü�� ������ �� ����ϴ� �޼���
		//-> �μ��� ������ ���� null �̾ NPE(NULLPointer Exception)�� �߻����� ����, ���� ����(�Ҵ���� ����)Optional ��ü�� �����ϰԵ�
		Optional<String> opWithNullValue = Optional.ofNullable(null);
		System.out.println(opWithNullValue);
		
		//get(): Optional�� �������ִ� �� ����ϴ� �޼���
		String str = optWithValue.get();
		System.out.println(str);
		
		//3.empty(): ���� ���� Optonal ��ü �� ��ü�� ������ �� ����ϴ� �޼���
		Optional<String> optWithEmptyValue = Optional.empty();
		System.out.println(optWithEmptyValue);
		
		//optWithEmptyValue.get();//���� ����ִ� Optional�� get()�� ȣ���� ���, NoSuchElementException �߻�
		
		//4.Optional ���� ���� �ִ��� ������ Ȯ��(?isPresent(), [isEmpty(),Java 11���� ��밡��]
		System.out.println(optWithValue.isPresent());
		System.out.println(optWithValue.isEmpty());
		
		
		//���� ���� ��쿡 ���� ���� (if -else) -ifPrsenet(),ifPrsenetOrElse() -> Optional ��ü ���� �ִ� ���� null�̸� ~~�ϰ�, null�� �ƴϸ� ~~�ض�� ����
		optWithValue.ifPresent(value -> doSome(value)); //if(value!=null) doSome(value);�� ���� �ڵ�
		optWithEmptyValue.ifPresentOrElse(value -> doSome(value), () -> doOther());
		
		//Optional ���� ���� ���� �� �ٸ� ������ ��ü�Ͽ� ����Ϸ��� �Ҷ�
		//(ex) ���ϴ� ���� "� ���ڿ� ��"�ε� ���� ������ "�ٸ� ���ڿ� ��"���� ��ü�Ͽ� ����Ϸ��� ���
		String result = optWithValue.orElse("�⺻��");
		System.out.println("result: " + result);
		String result1 = optWithEmptyValue.orElse("�⺻��");
		System.out.println("result: " + result1);
		
		//orElseThow(), ���� ���� ��� ���� �߻���Ŵ, ���� ��� �ش� �� ��ȯ(get())
		String result3 = optWithValue.orElseThrow();
		System.out.println("result3" + result3);
		
		//String result4 = optWithEmptyValue.orElseThrow();
		//System.out.println("result4" + result4);
		
		String result5 = optWithEmptyValue.orElseThrow(() -> new RuntimeException("�׷� �� ���µ���?"));
		
	}//ctrl shift p
	
	public static void doSome(String value) {
		System.out.println(value + "�� �Ѵ�");
	}
	
	public static void doOther() {
		System.out.println("�ٸ� ���� �Ѵ�.");
	}
	
	

}