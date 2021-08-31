using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using ShoppingWebsite.Models;

namespace ShoppingWebsite.Controllers
{
    public class AdminController : Controller
    {

        DbEntity db=new DbEntity();
        // GET: Admin
        public ActionResult Login()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Login(AdminTb admin)
        {
            var verify = db.AdminTbs.Where(a => a.Email.Equals(admin.Email) && a.Password.Equals(admin.Password)).SingleOrDefault();
            if (verify != null)
            {
                Session["Admin"] = admin.Email;

                return RedirectToAction("Dashboard");
            }
            else
            {
                ViewBag.error = "Password or Email is Wrong";
                return View();
            }
        }
        public ActionResult Dashboard() 
        {
            if (Session["Admin"] == null) 
            {
                return RedirectToAction("Login");
            }
            return View();
        }
    }
}