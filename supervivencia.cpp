#include <iostream>
using namespace std;
#include <string>
#include <vector>

void recibir_mordida(float &salud){
float daño = 5;
salud = salud - daño;
}

struct zombie {

    string tipo;
    float daño;
    int velocidad;
};


int main(void){

vector<string> mochila;    
float salud = 100;
string nombre;
bool infectado = false;
int municion = 30;


zombie Z;
string item = "botiquin";

mochila.push_back(item);

Z.tipo= "gordo";
Z.daño = 15;
Z.velocidad = 25;

cout << "ingrese el nombre del jugador: ";
cin>> nombre;

if(municion > 0){
   cout<<"disparo efectuado: ";
    municion = municion - 1;
    cout<< "Municion restante: "<< municion << endl;
}

else{

    cout<<"!CLICK! Sin municion, a correr"<<endl;
}

while (salud>0){
    cout<< "sigues vivo..."<<endl;
    salud--;
}

for (int i = 0; i < 5; i++)
{
    cout<<"revisando caja #"<<i<<endl;
}

}

