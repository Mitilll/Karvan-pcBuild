package pcBuild.Karvan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Pc")
public class Pc {

    @Id
    private String pcId;

    private String gpuId;

    private double TotalPriceRs;


}

