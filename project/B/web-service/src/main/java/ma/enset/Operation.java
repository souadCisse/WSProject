package ma.enset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    @XmlAttribute
    private OperationType type;
    @XmlAttribute
    private Date date ;
    @XmlAttribute
    private Double montant ;
    @XmlAttribute
    private String description;

    public Operation(OperationType type, Date date, Double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public Operation() {
    }

    public OperationType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public Double getMontant() {
        return montant;
    }

    public String getDescription() {
        return description;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}
