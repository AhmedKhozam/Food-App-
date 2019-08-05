
package com.ahmedabdelmajeedkhozam.bonneappetit.view.detail;

import android.support.annotation.NonNull;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailPresenter {
    private DetailView view;

    public DetailPresenter(DetailView view) {
        this.view = view;
    }

    void getMealById(String mealName) {
        
        //TODO #5 Call the void show loading before starting to make a request to the server
        
        //TODO #6 Make a request to the server (Don't forget to hide loading when the response is received)
        
        //TODO #7 Set response (meal)
    }
}
