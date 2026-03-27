class Persona:
    def __init__(self):
        self.nombre = ""
        self.años = 0
    def saludar(self):
        print(f"Hola, my nombre es {self.nombre} y tengo {self.años} años.")

def main():
    p1 = Persona()
    p1.nombre = "Zara"
    p1.años = 24
    p1.saludar()

if __name__ == "__main__":
     main()
