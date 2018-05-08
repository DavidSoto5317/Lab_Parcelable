package com.example.david.lab1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by David on 8/05/2018.
 */

public class direccion implements Parcelable {
    private int calle;
    private int avenida;
    private int zona;

    public direccion(int calle, int avenida, int zona) {
        this.calle = calle;
        this.avenida = avenida;
        this.zona = zona;
    }

    protected direccion(Parcel in) {
        calle = in.readInt();
        avenida = in.readInt();
        zona = in.readInt();
    }

    public static final Creator<direccion> CREATOR = new Creator<direccion>() {
        @Override
        public direccion createFromParcel(Parcel in) {
            return new direccion(in);
        }

        @Override
        public direccion[] newArray(int size) {
            return new direccion[size];
        }
    };

    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getAvenida() {
        return avenida;
    }

    public void setAvenida(int avenida) {
        this.avenida = avenida;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "direccion{" +
                "calle=" + calle +
                ", avenida=" + avenida +
                ", zona=" + zona +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(calle);
        dest.writeInt(avenida);
        dest.writeInt(zona);
    }
}