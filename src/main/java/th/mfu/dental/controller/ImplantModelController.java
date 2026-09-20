package th.mfu.dental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import th.mfu.dental.model.ImplantModel;
import th.mfu.dental.repository.ImplantModelRepository;

import java.util.Optional;

@Controller
public class ImplantModelController {

    private final ImplantModelRepository implantModelRepository;

    public ImplantModelController(
            ImplantModelRepository implantModelRepository) {

        this.implantModelRepository = implantModelRepository;
    }

    @GetMapping("/implants")
    public String implants(Model model) {

        model.addAttribute(
                "implants",
                implantModelRepository.findAll()
        );

        return "implants";
    }

    @GetMapping("/implants/search")
    public String search(
            @RequestParam String keyword,
            Model model) {

        model.addAttribute(
                "implants",
                implantModelRepository
                        .findByModelNameContainingIgnoreCase(keyword)
        );

        return "implants";
    }

    @GetMapping("/implants/{id}")
    public String implantDetails(
            @PathVariable Long id,
            Model model) {

        Optional<ImplantModel> implant =
                implantModelRepository.findById(id);

        if (implant.isEmpty()) {
            return "redirect:/implants";
        }

        model.addAttribute(
                "implant",
                implant.get()
        );

        return "implant-details";
    }
}