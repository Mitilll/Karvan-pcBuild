package pcBuild.Karvan.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pcBuild.Karvan.service.VideoCardService;

@RestController
@RequestMapping("/api/gpu")
public class VideoCardController {

    VideoCardService videoCardService;


}
