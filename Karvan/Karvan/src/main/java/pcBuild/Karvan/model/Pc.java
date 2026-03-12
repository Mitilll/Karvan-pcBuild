package pcBuild.Karvan.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PC")
public class Pc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pc;

    @OneToMany
    @JoinColumn(name = "id_gpu")
    private VideoCard videoCard;

    @OneToMany
    @JoinColumn(name = "id_cpu")
    private Cpu cpu;

}

