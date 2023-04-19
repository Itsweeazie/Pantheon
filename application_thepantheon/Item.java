package com.example.application_thepantheon;

import android.app.AlertDialog;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Item implements Parcelable {
    private String name;
    private String description;
    private int imageId;

    public Item(String name, String description, int imageResId) {
        this.name = name;
        this.description = description;
        this.imageId = imageResId;
    }

    protected Item(Parcel in) {
        name = in.readString();
        description = in.readString();
        imageId = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getimageId() {
        return imageId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeInt(imageId);
    }
}