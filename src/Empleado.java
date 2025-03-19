public class Empleado {

    void incrementarSueldo(int porcentajeincremento){
        this.sueldo += sueldo *(1+porcentajeincremento/100.00);
    }



    void incrementarEdad(){
        edad+=1;
    }

    private String nombre;
    private int edad;
    private double sueldo;

}
