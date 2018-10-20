package edu.fatec.sjc.DemoIntroducaoJpa.model;

import java.text.ParseException;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 100)
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Size(max = 100)
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Size(max = 100)
	@NotNull
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_nascimento", nullable = false, columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private Date dataNascimento;

	@Override
	public String toString() {
		return String.format("Student[id=%d, firstName='%s', lastName='%s', email='%s']", getId(), getFirstName(),
				getLastName(), getEmail());
	}

	@PrePersist
	void prePersist() throws ParseException {
		if (this.email == null)
			this.email = "";
	}
}
