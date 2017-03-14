package com.example.owais.testapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Owais on 3/14/2017.
 */
public class UserDetail implements Parcelable {
    private String firstName;
    private  String lastName;

    public UserDetail(){}
    public UserDetail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }

    protected UserDetail(Parcel in) {
        this.firstName = in.readString();
        this.lastName = in.readString();
    }

    public static final Parcelable.Creator<UserDetail> CREATOR = new Parcelable.Creator<UserDetail>() {
        @Override
        public UserDetail createFromParcel(Parcel source) {
            return new UserDetail(source);
        }

        @Override
        public UserDetail[] newArray(int size) {
            return new UserDetail[size];
        }
    };
}