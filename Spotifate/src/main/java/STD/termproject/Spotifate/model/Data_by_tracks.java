package STD.termproject.Spotifate.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
*@author Aaron
*@param Description Data_by_tracks defines the table in the database where
*data that is measured relative to different tracks is stored.
*
*
*/
@Entity
@Table(name = "data_o")
public class Data_by_tracks {

    @Id
    private String Id;
    private String year;
    private String name;
    private int explicit;
    private String artists;
    private String release_date;
    private String acousticness;
    private String danceability;
    private String duration_ms;
    private String energy;
    private String instrumentalness;
    private String liveness;
    private String loudness;
    private String speechiness;
    private String tempo;
    private String valence;
    private String popularity;
    private int key_val;
    private int mode;

    public Data_by_tracks() {
    }

    public Data_by_tracks(String Id, String release_date, int explicit, String tracks, String acousticness, String danceability,
        String duration_ms, String energy, String instrumentalness, String liveness, String loudness,
        String speechiness, String tempo, String valence, String popularity, int key_val, int mode) {

        this.Id = Id;
        this.explicit = explicit;
        this.year = year;
        this.artists = artists;
        this.name = name;
        this.acousticness = acousticness;
        this.danceability = danceability;
        this.duration_ms = duration_ms;
        this.energy = energy;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.loudness = loudness;
        this.speechiness = speechiness;
        this.tempo = tempo;
        this.valence = valence;
        this.popularity = popularity;
        this.key_val = key_val;
        this.mode = mode; 
        this.release_date = release_date;
    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }


    public int getExplicit() {
        return explicit;
    }
    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }


    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }


    public String getArtists() {
        return artists;
    }
    public void setArtists(String artists) {
        this.artists = artists;
    }


    public String getRelease_date() {
        return release_date;
    }
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getname() {
        return name;
    }
    public void setname(String tracks) {
        this.name = name;
    }

    public String getAcousticness() {
        return acousticness;
    }
    public void setAcousticness(String acousticness) {
        this.acousticness = acousticness;
    }

    public String getDanceability() {
        return danceability;
    }
    public void setDanceability(String danceability) {
        this.danceability = danceability;
    }

    public String getDuration() {
        return duration_ms;
    }
    public void setDuration(String duration_ms) {
        this.duration_ms = duration_ms;
    }

    public String getEnergy() {
        return energy;
    }
    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getInstrumentalness() {
        return instrumentalness;
    }
    public void setInstrumentalness(String instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public String getLiveness() {
        return liveness;
    }
    public void setLiveness(String liveness) {
        this.liveness = liveness;
    }

    public String getLoudness() {
        return loudness;
    }
    public void setLoudness(String loudness) {
        this.loudness = loudness;
    }

    public String getSpeechiness() {
        return speechiness;
    }
    public void setSpeechiness(String speechiness) {
        this.speechiness = speechiness;
    }

    public String getTempo() {
        return tempo;
    }
    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getValence() {
        return valence;
    }
    public void setValence(String valence) {
        this.valence = valence;
    }

    public String getPopularity() {
        return popularity;
    }
    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public int getKeyval() {
        return key_val;
    }
    public void setKeyVal(int key_val) {
        this.key_val = key_val;
    }

    public int getMode() {
        return mode;
    }
    public void setMode(int mode) {
        this.mode = mode;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final City other = (City) obj;
        if (this.population != other.population) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();

    }
    */
}