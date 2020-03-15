package com.ak93.exoplayerexample.api;

import com.ak93.exoplayerexample.models.LoadJason;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by iCT-3 on 07-Dec-16.
 */

public interface Api {

    @GET("bins/w8omi")
    Call<LoadJason> getAudioinfo();
}
