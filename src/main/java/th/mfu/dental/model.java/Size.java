package th.mfu.dental.model;

import jakarta.persistence.*;

@Entity
@Table(name = "size")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sizeId;

    private double diameterMm;
    private double lengthMm;

    public Size() {
    }

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public double getDiameterMm() {
        return diameterMm;
    }

    public void setDiameterMm(double diameterMm) {
        this.diameterMm = diameterMm;
    }

    public double getLengthMm() {
        return lengthMm;
    }

    public void setLengthMm(double lengthMm) {
        this.lengthMm = lengthMm;
    }
}