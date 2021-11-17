package edu.asu.cidse.se.covid_analytics.model;

public class State {
    private String country;
    private String state_name;
    private String county;

    public State(){

    }

    /**
     * Creating a constructor that contains variables that define the state information.
     * @param country
     * @param state_name
     * @param county
     */
    public State(String country, String state_name, String county){
        this.country = country;
        this.state_name = state_name;
        this.county = county;
    }

    /**
     * will grab the country name that the state is on
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     * this will be setting the country the state is on
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }
    //will get the name of the state
    public String getState_name() {
        return state_name;
    }

    /**
     * will set the name of the state.
     * @param state_name
     */
    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    /**
     * will get the county of the state
     * @return
     */
    public String getCounty() {
        return county;
    }

    /**
     * will set the county of the state
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }
}
