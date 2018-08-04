package pages

import geb.Page

class AdminPage extends Page{
    static url = "webapp/#/home"
    static at = {
        waitFor { adminbar.isDisplayed()}
    }
    static content = {
        adminbar { $(".user-header-section.ng-scope")}
        adminbtn { $(".navbar-link.username-header.ng-binding")}

    }


}
