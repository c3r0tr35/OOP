#include <iostream>
#include <string>
using namespace std;

class Persona{
public:
  string nombre;
  int edad;
  
  void saludar(){
    cout << "Hola,soy " << nombre << " y tengo " << edad << " años.\n";
}
};
int main(){

 Persona p1;
 Persona p2;
 Persona p3;

 p1.nombre = "Lia";
 p1.edad = 14;
 p2.nombre = "Ana";
 p2.edad = 42;
 p3.nombre = "Tomas";
 p3.edad = 34;

 p1.saludar();
 p2.saludar();
 p3.saludar();
 return 0;
}
