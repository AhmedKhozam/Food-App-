
package com.ahmedabdelmajeedkhozam.bonneappetit.view.home;

import com.ahmedabdelmajeedkhozam.bonneappetit.model.Categories;
import com.ahmedabdelmajeedkhozam.bonneappetit.model.Meals;


import java.util.List;

public interface HomeView {
    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);
}
