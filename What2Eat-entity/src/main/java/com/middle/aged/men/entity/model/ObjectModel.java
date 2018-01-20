package com.middle.aged.men.entity.model;

public interface ObjectModel<T> extends Model<T> {
    T getObj();

    Model setObj(T var1);
}
