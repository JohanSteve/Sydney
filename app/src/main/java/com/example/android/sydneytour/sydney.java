package com.example.android.sydneytour;

/**
 * Created by johan on 24/04/2017.
 */

public class sydney {


    private int sydneyFhotos;

    private int sydneyPlaces;



    /**
     * create sydney object
     *
     * @param sydneyFhotosId
     * @param sydneyPlacesId
     */

    public sydney(int sydneyFhotosId, int sydneyPlacesId){

        sydneyFhotos = sydneyFhotosId;
        sydneyPlaces = sydneyPlacesId;

    }





    public int getSydneyDescriptionId(){return sydneyPlaces;}

    public  int getSydneyFhotosId(){return  sydneyFhotos;}



}
