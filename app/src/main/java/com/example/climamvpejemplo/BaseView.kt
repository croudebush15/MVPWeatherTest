package com.example.climamvpejemplo

interface BaseView<T> {
    fun setPresenter(presenter : T)
}