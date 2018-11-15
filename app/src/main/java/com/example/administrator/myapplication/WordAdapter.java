package com.example.administrator.myapplication;

import android.app.Activity;
import android.arch.core.executor.TaskExecutor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView;
        if (convertView==null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.text_view,parent,false);
        else listItemView = convertView;

        Word word = getItem(position);
        TextView Chinese = (TextView) convertView.findViewById(R.id.show1);
        Chinese.setText(word.getChineseWord());//操作的对象是TextView类的对象；
        TextView English = (TextView) convertView.findViewById(R.id.show2);
        English.setText(word.getEnglishWord());

        return listItemView;

    }

    public WordAdapter(Activity context, ArrayList<Word> word){
        super(context,0,word);//这里不懂啊！这个word干嘛用的？
    }
}
