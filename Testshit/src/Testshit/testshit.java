package Testshit;

//laber
public class testshit {

public static void main(String[] args) {
        
        
class A { int x = 10;

void f() {
    x++; System.out.println(x);
}

void g() {
    x += x; System.out.println(x); 
}
}
class B extends A {
void f() { 
    x--; 
    System.out.println(x); 
}
}
    
A a = new A(); 
B b = new B(); 
a.f(); b.f();
b.g(); 
a.g();
a.f(); 
b.f();

   
}
}