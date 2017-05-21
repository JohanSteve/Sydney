package com.example.android.sydneytour;

/**
 * Created by johan on 24/04/2017.
 */

public class sydney {


    private int sydneyFhotos;
    private int sydneyPlaces;

    private int sydneyPlacesDescription;

    static final int VIEW_MODE_GRIDVIEW = 1;
    /**
     * create sydney object
     *  @param sydneyFhotosId
     * @param sydneyPlacesId
     * @param sydneyPlacesDescriptionId
     */
    public sydney(int sydneyFhotosId, int sydneyPlacesId, int sydneyPlacesDescriptionId){

        sydneyFhotos = sydneyFhotosId;
        sydneyPlaces = sydneyPlacesId;
        sydneyPlacesDescription = sydneyPlacesDescriptionId;

    }

    public int getSydneyDescriptionId(){return sydneyPlaces;}

    public  int getSydneyFhotosId(){return  sydneyFhotos;}

    public int getSydneyPlacesDescription() {return sydneyPlacesDescription;}


}
