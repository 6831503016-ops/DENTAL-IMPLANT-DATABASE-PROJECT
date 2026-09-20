package th.mfu.dental.model;

import jakarta.persistence.*;

@Entity
@Table(name = "implant_specification_size")
public class ImplantSpecificationSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "specification_id")
    private ImplantSpecification specification;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;

    public ImplantSpecificationSize() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ImplantSpecification getSpecification() {
        return specification;
    }

    public void setSpecification(ImplantSpecification specification) {
        this.specification = specification;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}