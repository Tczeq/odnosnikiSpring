package pl.sszlify.coding.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping()
    public String get(Model model) {
        return "student/list";
    }
    @GetMapping("/all")
    public String getAll(Model model) {
        return "student/all";
    }


    @GetMapping("/any")
    public String getAny(Model model) {
        return "student/any";
    }

    @GetMapping("/first")
    public String getFirst(Model model) {
        return "student/first";
    }

}
