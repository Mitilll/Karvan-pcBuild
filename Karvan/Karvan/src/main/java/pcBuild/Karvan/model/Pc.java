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

    private String imagePixel;

    private String motherBoardId;

    private String psuId;

    private String cpuCoolerId;

    private String caseId;

    private String cpuId;

    private String gpuId;

    private String ramId;

    private String storageId ;

    private double TotalPriceRs;

}

