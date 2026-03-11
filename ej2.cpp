#include <iostream>
using namespace std;
#include <string>
#include <vector>

struct Productos {
    string nombre;
    int codigoBarra;
    string marca;
    int precio;
    bool fechaVencimiento;

};

const int F = 4;
const int C = 3;

void CargarGondola(Productos gondola [F] [C]){
Productos prod;

prod.nombre = "fideos";
prod.codigoBarra = 132443234 ;
prod.marca = "luchetti";
prod.precio = 1000;
prod.fechaVencimiento = false;
gondola[0] [0] = prod;

prod.nombre = "chocolate";
prod.codigoBarra = 65437345;
prod.marca = "Milka";
prod.precio = 550;
prod.fechaVencimiento = false;
gondola[0] [1] = prod;

prod.nombre = "queso";
prod.codigoBarra = 19283743;
prod.marca = "casancream";
prod.precio = 850;
prod.fechaVencimiento = true;
gondola[0] [2] = prod;

prod.nombre = "leche";
prod.codigoBarra = 14527689;
prod.marca = "laSerenisima";
prod.precio = 700;
prod.fechaVencimiento = true; 
gondola[0] [3] = prod;

prod.nombre = "huevo";
prod.codigoBarra = 42537824;
prod.marca = "monumental";
prod.precio = 1000;
prod.fechaVencimiento = true; 
gondola[1] [0] = prod;

prod.nombre = "refresco";
prod.codigoBarra = 14653628;
prod.marca = "cocaCola";
prod.precio = 1500;
prod.fechaVencimiento = true; 
gondola[1] [1] = prod;




}



