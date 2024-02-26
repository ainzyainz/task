package entity;

import lombok.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@EqualsAndHashCode(callSuper = false)
@Entity
@ToString
@Table(name = "address")
public class Address extends MultiID implements Serializable {

    @Column
    private String street;

    @Column
    private int house;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private List<People> people = new ArrayList<>();
}
