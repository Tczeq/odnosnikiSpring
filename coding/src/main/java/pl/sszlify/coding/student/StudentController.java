package pl.sszlify.coding.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewUser (@RequestParam String firstName
            , @RequestParam String lastName) {

        Student n = new Student();
        n.setFirstName(firstName);
        n.setLastName(lastName);
        studentRepository.save(n);
        return "Saved";
    }

//    @GetMapping(path="/all")
//    public @ResponseBody Iterable<Student> getAllUsers() {
//        // This returns a JSON or XML with the users
//        return studentRepository.findAll();
//    }

    @GetMapping()
    public String get() {
        return "student/list";
    }


    @GetMapping("/allNames")
    public String getAllNames(Model model) {
        StudentList studentList = new StudentList();
        model.addAttribute("students", studentList.getStudents());
        return "student/allNames";
    }

    @ResponseBody
    @GetMapping("/allJSON")
    public List<Student> getAll() {
        StudentList studentList = new StudentList();
        return studentList.getStudents();
    }


    @GetMapping("/any")
    public String getAny() {
        return "student/any";
    }

    @GetMapping("/first")
    public String getFirst() {
        return "student/first";
    }

}
