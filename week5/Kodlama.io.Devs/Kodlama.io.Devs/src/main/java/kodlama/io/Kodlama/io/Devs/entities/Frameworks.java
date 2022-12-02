package kodlama.io.Kodlama.io.Devs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "frameworks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Frameworks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id yi sen otomatik arttır
	@Column(name="frameworkid")
	private int frameworkId;

	@Column(name="name")
	private String name;

	@ManyToOne()
	@JoinColumn(name = "id")
	private Language languages;
}
