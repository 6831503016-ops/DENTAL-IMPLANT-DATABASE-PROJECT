package th.mfu.dental.model;

import jakarta.persistence.*;

@Entity
@Table(name = "implant_specification")
public class ImplantSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long specificationId;

    private String platform;
    private String connectionType;
    private String surfaceTreatment;

    @Column(length = 1000)
    private String description;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private ImplantModel model;

    public ImplantSpecification() {
    }

    public Long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Long specificationId) {
        this.specificationId = specificationId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String getSurfaceTreatment() {
        return surfaceTreatment;
    }

    public void setSurfaceTreatment(String surfaceTreatment) {
        this.surfaceTreatment = surfaceTreatment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImplantModel getModel() {
        return model;
    }

    public void setModel(ImplantModel model) {
        this.model = model;
    }
}