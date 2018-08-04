package pages

import geb.Page
class HomePage extends Page{
    static url = "http://localhost:8081/artifactory"
    static at = {title.contains("Artifactory")}

    static content = {

        heading {$(".home-header-happily ng-binding ng-scope")}
        loginnav(to: LoginPage) {$("#login-link", "ng-click":"jfHeader.login()")}

        searchbtn {$("#search")}
    }

}

