package com.example.david.lab1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by David on 8/05/2018.
 */

public class usuario implements Parcelable {
    private String nombre;
    private int edad;
    private int numero;
    private direccion adress;

    public usuario(String nombre, int edad, int numero, direccion adress) {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
        this.adress = adress;
    }

    protected usuario(Parcel in) {
        nombre = in.readString();
        edad = in.readInt();
        numero = in.readInt();
        adress = in.readParcelable(direccion.class.getClassLoader());
    }

    public static final Creator<usuario> CREATOR = new Creator<usuario>() {
        @Override
        public usuario createFromParcel(Parcel in) {
            return new usuario(in);
        }

        @Override
        public usuario[] newArray(int size) {
            return new usuario[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public direccion getAdress() {
        return adress;
    }

    public void setAdress(direccion adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numero=" + numero +
                ", adress=" + adress +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(edad);
        dest.writeInt(numero);
        dest.writeParcelable(adress, flags);
    }
}