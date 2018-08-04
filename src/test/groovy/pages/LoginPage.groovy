package pages

import geb.Page


class LoginPage extends Page {
    static url = "webapp/#/login"
    static at = {
        waitFor { loginform.isDisplayed() }
    }

    static content = {
        loginform { $("#login-form")}
        username { $("input", name: "user") }
        password { $("input", name: "password") }
        loginButton { $("button", id: "login") }
        InvalidUser {$(".jf-form-errors.preserve-lb.ng-binding.ng-scope")}

    }

     String doLogin(String strUser, String strPwd){
        username.value(strUser)
        password.value(strPwd)
        loginButton.click()



    }
}
