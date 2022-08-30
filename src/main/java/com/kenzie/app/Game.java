package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

/*** File created by Brandon Januska-Wilson ***/
/*** Methods created and implemented by Brandon Januska-Wilson ***/

public class Game {

    @JsonProperty("canon")
    private boolean canon;
    @JsonProperty("aired")
    private String aired;

    public boolean getCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    public String getAired() {
        return aired;
    }

    public void setAired(String aired) {
        this.aired = aired;
    }
}
