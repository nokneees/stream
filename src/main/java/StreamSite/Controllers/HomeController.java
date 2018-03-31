package StreamSite.Controllers;

import StreamSite.Services.AdminService;
import StreamSite.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    private AdminService adminService;
    private GameService gameService;

    @Autowired
    public HomeController(AdminService adminService, GameService gameService) {
        this.adminService = adminService;
        this.gameService = gameService;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(Model model, HttpSession session){
        adminService.updatePageCount(1);
        try {
            model.addAttribute("game_list", gameService.getHomePageGames());

            return "webpage/home";

        } catch (Exception e){

            return "webpage/error_page";
        }

    }


}
