package pe.edu.cibertec.web_backoffice_lym.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer languageid;
    private String name;
    private Date lastupdate;

    @OneToMany(mappedBy = "language")
    private List<Film> films;
}
