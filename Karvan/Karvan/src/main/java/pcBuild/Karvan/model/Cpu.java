package pcBuild.Karvan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CPU")
public class Cpu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cpu;

    private String microarchitecture;
    private String name;

    private String tdp;
    private String graphics;

    private int core_count;
    private int core_clock;
    private float boost_clock;


}
