package kr.ac.hansung.cse.hellospringhateos.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString(exclude = "albums")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="actor")
public class ActorEntity implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String birthDate;

    @ManyToMany(cascade=CascadeType.ALL)    //actor만 저장해도 album 저장됨
    @JoinTable(
            name = "actor_album",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "album_id"))
    private List<AlbumEntity> albums;


    //생성자 부분
    public ActorEntity(String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}