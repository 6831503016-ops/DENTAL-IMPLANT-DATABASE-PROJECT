package th.mfu.dental.model;

import jakarta.persistence.*;

@Entity
@Table(name = "implant_image")
public class ImplantImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    private String imageUrl;
    private String imageType;
    private String caption;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private ImplantModel model;

    public ImplantImage() {
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ImplantModel getModel() {
        return model;
    }

    public void setModel(ImplantModel model) {
        this.model = model;
    }
}