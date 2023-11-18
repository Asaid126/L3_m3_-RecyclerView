package com.example.ibraimkulov_hw3__recyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

  private RecyclerView rvFilms;
  private ArrayList<String>filmList=new ArrayList<>();
  private FilmAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
       adapter=new FilmAdapter(filmList);
       rvFilms.setAdapter(adapter);
    }

    private void loadData() {
        filmList.add("Мышь");
        filmList.add("Начало");
        filmList.add("Сумерки");
        filmList.add("Бэтмен");
        filmList.add("Последняя игра");
        filmList.add("Алиса в стране чудес");
        filmList.add("Королина в стране кошмаров");
        filmList.add("Супернянь 2");
        filmList.add("Поворот туда");
        filmList.add("Назад в будущее");
        filmList.add("Поезд в Пусан");
        filmList.add("Леон");
        filmList.add("Король лев");

    }

    private void initView() {
     rvFilms=requireActivity().findViewById(R.id.rv_films);
    }
}