package com.example.david.lab1;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by David on 2/05/2018.
 */

public class ParcelableItem implements Parcelable{
    private String name;
    private  int numberOfItem;
    private String value;

    public ParcelableItem(String name, int numberOfItem, String value) {
        this.name = name;
        this.numberOfItem = numberOfItem;
        this.value = value;
    }

    protected ParcelableItem(Parcel in) {
        name = in.readString();
        numberOfItem = in.readInt();
        value = in.readString();
    }

    public static final Creator<ParcelableItem> CREATOR = new Creator<ParcelableItem>() {
        @Override
        public ParcelableItem createFromParcel(Parcel in) {
            return new ParcelableItem(in);
        }

        @Override
        public ParcelableItem[] newArray(int size) {
            return new ParcelableItem[size];
        }
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ParcelableItem{" +
                "name='" + name + '\'' +
                ", numberOfItem=" + numberOfItem +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(numberOfItem);
        dest.writeString(value);
    }
}
