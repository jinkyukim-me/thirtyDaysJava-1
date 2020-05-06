/*
인터페이스 상속
인터페이스 간에 상속이 가능
구현이 없으므로 extends 뒤에 여러 인터페이스를 상속받을 수 있음
구현 내용이 없으므로 타입 상속(type inheritance)라고 함
 */

package interfaceex;

public interface MyInterface extends X, Y {

    void myMethod();

}
