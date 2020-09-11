package live.elearners.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Offers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "imageId")
    @JsonIgnore
    private Long imageId;


    @Column(name = "basicOfferInPercentage")
    private String basicOfferInPercentage;

    @Column(name = "specialOfferInPercentage")
    private String specialOfferInPercentage;

    @Column(name = "specialOfferReason")
    private String specialOfferReason;

    @Column(name = "specialOfferStatDate")
    private String specialOfferStatDate;

    @Column(name = "specialOfferEndDate")
    private String specialOfferEndDate;
}
