package edu.fje.clot.sudoku.scores;

import android.support.annotation.NonNull;

import java.util.Date;

/**
 * Created by oriol on 11/8/16.
 */

public class Score implements Comparable<Score> {

    private int _id;
    private int _value;
    private Date _date=new Date();
    private static int last_id;
    public Score() {
        int id=last_id+1;
        setId(id);
        last_id= id;
        setValue(0);
        setDate(new Date());
    }
    private Score(int id) {
        this();
        setId(id);
        last_id= id;
    }
    public Score(int id, int value, Date date) {
        this(id);
        setValue(value);
        setDate(date);
    }

    @Override
    public int compareTo(@NonNull Score score) {
       return score.getValue() - getValue();
    }

    public int getValue() {
        return _value;
    }

    public void setValue(int value) {
        this._value = value;
    }

    public void ValueIncrement(int increment){ this._value+=increment;}

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        this._date = date;
    }

    public int getId() { return _id; }

    public void setId(int id) { _id = id; }
}
