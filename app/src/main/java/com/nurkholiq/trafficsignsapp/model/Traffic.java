package com.nurkholiq.trafficsignsapp.model;


import android.os.Parcel;
import android.os.Parcelable;

public class Traffic implements Parcelable {
    private final Integer image;
    private final String name;
    private final String desc;

    public Traffic(Integer image, String name, String desc){
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    protected Traffic(Parcel in) {
        if (in.readByte() == 0) {
            image = null;
        } else {
            image = in.readInt();
        }
        name = in.readString();
        desc = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (image == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(image);
        }
        dest.writeString(name);
        dest.writeString(desc);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Traffic> CREATOR = new Creator<Traffic>() {
        @Override
        public Traffic createFromParcel(Parcel in) {
            return new Traffic(in);
        }

        @Override
        public Traffic[] newArray(int size) {
            return new Traffic[size];
        }
    };

    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
