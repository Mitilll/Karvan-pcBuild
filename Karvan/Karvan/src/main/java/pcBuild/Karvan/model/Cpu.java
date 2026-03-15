package pcBuild.Karvan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cpu")
public class Cpu {

    @Id
    private Long cpuId;

    private String image;

    private double priceRs;


}
