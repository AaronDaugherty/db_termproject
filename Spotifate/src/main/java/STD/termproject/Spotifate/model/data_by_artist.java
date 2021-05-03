
package STD.termproject.Spotifate;

import javax.persistence.Entity;
import javax.persistence.GenerateValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //tells hibernate to make a table
public class data_by_artist {
	@Id
	@GeneratedValue(strategy=GeneratedType.AUTO)

	private String genres;

	private String artists;

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

	private Integer key_val;

	private Bit mode;

	private Integer count;

}
