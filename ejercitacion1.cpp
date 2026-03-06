#include <iostream>
using namespace std;
#include <string>
#include <vector>

struct Empleado{
    string nombre;
    string apellido;
    int fecha_nacimiento;
    string sexo;
    int salario;
};

Empleado empleadoConMayorSueldo(vector<Empleado> trabajadores, vector <Empleado> &vacio){

    Empleado empl;
    int ms = 0;

    for(int i=0; i< trabajadores.size(); i++){

        if (trabajadores[i].salario <= 400000){

            vacio.push_back(trabajadores[i]);
        }

        if (trabajadores[i].salario > ms){

            ms = trabajadores[i].salario;
            empl = trabajadores[i];
        }
    }
        return empl;
}

int main (){

    Empleado resu;
    vector <Empleado> vacio;
    vector <Empleado> trabajadores;

    Empleado empleado2;
    empleado2.nombre = "Lucca";
    empleado2.salario = 44455;

    Empleado empleado1;
    empleado1.nombre ="Facu";
    empleado1.salario=856000;

    Empleado empleado3;
    empleado3.nombre ="Pablo";
    empleado3.salario=56000;

    Empleado empleado4;
    empleado4.nombre ="Tomas";
    empleado4.salario=66000;

    trabajadores.push_back(empleado1);
    trabajadores.push_back(empleado2);
    trabajadores.push_back(empleado3);
    trabajadores.push_back(empleado4);


    resu = empleadoConMayorSueldo(trabajadores, vacio);
    cout<<"Nombre mayor salario: "<< resu.nombre <<endl;
    cout<<"Salario mayor: "<< resu.salario<<endl;

    for (int j = 0;j< vacio.size();j++){

        cout<<"Nombre: "<< vacio[j].nombre <<endl;
        cout<<"Salario: "<< vacio[j].salario<<endl;
    }
   
}