package com.example.loggo;

import androidx.lifecycle.ViewModel;

public class BacklogViewModel extends ViewModel {
    public enum Category {
        TV, MOVIE, GAME, BOOK, CLASS, COOK, MUSIC, PLACE
    }

    // TODO: set default category
    Category category;

    // Set Backlog to be loaded to button pressed
    public void setBacklog(int id) {
        switch (id) {
            case R.id.button_tv:
                category = Category.TV;
                break;
            case R.id.button_movie:
                category = Category.MOVIE;
                break;
            case R.id.button_game:
                category = Category.GAME;
                break;
            case R.id.button_book:
                category = Category.BOOK;
                break;
            case R.id.button_class:
                category = Category.CLASS;
                break;
            case R.id.button_cook:
                category = Category.COOK;
                break;
            case R.id.button_music:
                category = Category.MUSIC;
                break;
            case R.id.button_place:
                category = Category.PLACE;
                break;
            default:
                // uh oh... stinky
                break;
        }
    }

    public Category getBacklog() {
        return category;
    }
}
