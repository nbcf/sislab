/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sislab.proteomica.engine.triplicataQuantificacao;

import java.beans.PropertyChangeSupport;
import javax.persistence.Column;

/**
 *
 * @author nil_b
 */
public class getSetMedia {
     private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
      private String media;
public getSetMedia() {
    }
    
        public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
      
 String oldMedia = this.media;
 media = this.media;
        this.media = media;
        changeSupport.firePropertyChange("media", oldMedia, media);

    }
    
}
