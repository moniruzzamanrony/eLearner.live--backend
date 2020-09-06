package live.elearners.controller;

import live.elearners.services.AdminService;
import live.elearners.services.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@AllArgsConstructor
@RequestMapping("courses")
@CrossOrigin("*")
public class AdminController {
    private final AuthService authService;
    private final AdminService adminService;

    @PutMapping("/{courseId}/learners/{leanerId}/enrollment/verify")
    public ResponseEntity<Void> enrollmentVerify(HttpServletRequest httpServletRequest, @PathVariable String courseId, @PathVariable String leanerId) {
        authService.pink(httpServletRequest);
        return adminService.enrollmentVerify(courseId, leanerId);
    }

}
