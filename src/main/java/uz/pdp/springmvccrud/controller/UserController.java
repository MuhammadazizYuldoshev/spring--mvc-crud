package uz.pdp.springmvccrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.view.RedirectView;
import uz.pdp.springmvccrud.dao.UserDaoImpl;
import uz.pdp.springmvccrud.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDaoImpl userDao;



    @RequestMapping("/")
    public ModelAndView allUsers(ModelAndView modelAndView) throws Exception{
        List<User> userList = userDao.getAllUsers();
        modelAndView.addObject("userlist",userList);
        modelAndView.setViewName("home-page");

        return modelAndView;
    }



    //user formasiga request jonatiladi
    @RequestMapping("/userform")
    public ModelAndView userForm(ModelAndView modelAndView){
        User user = new User();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("user-form");

        return modelAndView;

    }




    //userni saqlash
    @RequestMapping(value = "/saveuser",method = RequestMethod.POST)
    public RedirectView saveUser(@ModelAttribute User user,HttpServletRequest request){

        userDao.saveUser(user);
        System.out.println(user);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/");
        return redirectView;
    }



    //userni ochirish
    @RequestMapping("/deleteuser/{id}")
    public RedirectView deleteUser(@PathVariable("id") int id, HttpServletRequest request){
        userDao.delete(id);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/");
        return redirectView;
    }



    //edit user
    @RequestMapping(value = "/edituser/{id}")
    public ModelAndView editUser(@PathVariable("id") int id,HttpServletRequest request){

        User user = userDao.getUser(id);
        ModelAndView modelAndView = new ModelAndView("edit-form");
        modelAndView.addObject("user",user);

        return modelAndView;

    }

    @RequestMapping(value = "/updateuser",method = RequestMethod.POST)
    public RedirectView updateUser(@ModelAttribute User user,HttpServletRequest request){
        userDao.updateUser(user);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(request.getContextPath() + "/");
        return redirectView;
    }



}
