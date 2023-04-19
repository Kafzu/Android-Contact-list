package org.college.ahuntsic.laboratoire3;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;


public class Contact implements Parcelable {

    public static final char MALE = 'M';
    public static final char FEMALE = 'F';

    private String first_name;
    private String name;

    private char sex;
    private int phone;

    private String mail;



    public Contact(String first_name, String name, char sex, int phone, String mail) {
        this.setFirst_name(first_name);
        this.setName(name);
        this.setSex(sex);
        this.setPhone(phone);
        this.setMail(mail);
    }

    protected Contact(Parcel in) {
        first_name = in.readString();
        name = in.readString();
        phone = in.readInt();
        sex = (char) in.readInt();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getFirst_name() {
        return first_name;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(first_name);
        parcel.writeString(name);
        parcel.writeInt(phone);
        parcel.writeInt((int) sex);
    }

    public String toString() {
        String str = this.getName() + " " + this.getPhone();

        return str;
    }
}