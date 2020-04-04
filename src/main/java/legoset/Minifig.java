package legoset;

import lombok.Data;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {

    @XmlAttribute
    private int count;

    @XmlValue
    private String minifig_name;

    public Minifig(int count, String minifig_name){
        this.count=count;
        this.minifig_name=minifig_name;
    }
}
