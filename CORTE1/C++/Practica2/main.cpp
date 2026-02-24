#include <iostream>
#include <string>

using namespace std;

class Persona {
public:
    string nombre;
    int edad;

    void saludar() {
        cout << "Hola, soy " << nombre << " y tengo " << edad << " años.\n";
    }
};

int main() {
    Persona p1;
    p1.nombre = "Ana";
    p1.edad = 20;
    p1.saludar();

    Persona p2;
    p2.nombre = "Lina";
    p2.edad = 23;
    p2.saludar();

    Persona p3;
    p3.nombre = "Zach";
    p3.edad = 32;
    p3.saludar();

    return 0;
}