package ma.enset;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    @XmlAttribute
    private Long RIB ;
    private Date dateReleve ;
    private Double solde ;
    @XmlElement(name = "Operations")
    private List<Operations> operationsList=new ArrayList<>() ;

    public Releve() {
    }

    public Releve(Long RIB, Date dateReleve, Double solde, List<Operations> operationsList) {
        this.RIB = RIB;
        this.dateReleve = dateReleve;
        this.solde = solde;
        this.operationsList = operationsList;
    }

    public Long getRIB() {
        return RIB;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public Double getSolde() {
        return solde;
    }

    public List<Operations> getOperationsList() {
        return operationsList;
    }

    public void setRIB(Long RIB) {
        this.RIB = RIB;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setOperationsList(List<Operations> operationsList) {
        this.operationsList = operationsList;
    }

    @Override
    public String toString() {
        return "Releve{" +
                "RIB=" + RIB +
                ", dateReleve=" + dateReleve +
                ", solde=" + solde +
                ", operationsList=" + operationsList +
                '}';
    }
}
