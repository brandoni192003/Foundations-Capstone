package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/*** File created by Brandon Januska-Wilson ***/
/*** Methods created and implemented by Brandon Januska-Wilson ***/

public class CluesDTOList {

    @JsonProperty("clues")
    private List<CluesDTO> clues;

    public List<CluesDTO> getClues() {
        return this.clues;
    }

    public void setClues(List<CluesDTO> clues) {
        this.clues = clues;
    }
}
