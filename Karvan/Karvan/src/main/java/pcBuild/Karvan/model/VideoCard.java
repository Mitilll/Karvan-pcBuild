package pcBuild.Karvan.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "GPU")
public class VideoCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_gpu;

    private String name;
    private String chipset;

    private int memory;
    private int coreClock;

    private int length;



}


