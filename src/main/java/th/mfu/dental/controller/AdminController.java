package th.mfu.dental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import th.mfu.dental.model.ImplantModel;
import th.mfu.dental.repository.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final ImplantModelRepository implantModelRepository;
    private final BrandRepository brandRepository;
    private final ImplantTypeRepository typeRepository;
    private final MaterialRepository materialRepository;

    public AdminController(
            ImplantModelRepository implantModelRepository,
            BrandRepository brandRepository,
            ImplantTypeRepository typeRepository,
            MaterialRepository materialRepository) {

        this.implantModelRepository = implantModelRepository;
        this.brandRepository = brandRepository;
        this.typeRepository = typeRepository;
        this.materialRepository = materialRepository;
    }

    @GetMapping
    public String admin(Model model) {

        model.addAttribute(
                "implants",
                implantModelRepository.findAll()
        );

        model.addAttribute(
                "implantModel",
                new ImplantModel()
        );

        model.addAttribute(
                "brands",
                brandRepository.findAll()
        );

        model.addAttribute(
                "types",
                typeRepository.findAll()
        );

        model.addAttribute(
                "materials",
                materialRepository.findAll()
        );

        return "admin";
    }

    @PostMapping("/add")
    public String addImplant(
            @ModelAttribute ImplantModel implantModel) {

        implantModelRepository.save(implantModel);

        return "redirect:/admin";
    }

    @PostMapping("/delete/{id}")
    public String deleteImplant(
            @PathVariable Long id) {

        implantModelRepository.deleteById(id);

        return "redirect:/admin";
    }
}