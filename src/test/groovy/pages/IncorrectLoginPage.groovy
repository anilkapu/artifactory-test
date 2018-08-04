package pages

import geb.Page

class IncorrectLoginPage extends Page{

    static at = {
        waitFor {
            InvalidUser.text() == "Username or Password Are Incorrect"
        }

    }

    static content = {
        InvalidUser {$(".jf-form-errors.preserve-lb.ng-binding.ng-scope")}
    }
}
