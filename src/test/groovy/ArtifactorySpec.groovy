import geb.spock.GebSpec
import pages.AdminPage
import pages.HomePage
import pages.LoginPage
import pages.SearchPage
import sun.rmi.runtime.Log

class ArtifactorySpec extends GebSpec{
    def "verify login page"() {
        given:
        to HomePage
        at HomePage

        when:
        loginnav.click()

        then:
        at LoginPage
    }

    def "verify incorrect login"()  {
        given:
        to LoginPage
        at LoginPage

        when:
        username.value("admin")
        password.value("passord")
        loginButton.click()

        then:
        waitFor {InvalidUser.text() } == "Username or Password Are Incorrect"

    }

     def "verify correct login"()  {
         given:
         to LoginPage
         at LoginPage

         when:
         username.value("admin")
         password.value("password")
         loginButton.click()

         then:
         at AdminPage


    }

    def "search item"(){
        given:
        to HomePage
        at HomePage

        when:
        searchbtn.click()

        then:
        at SearchPage

        searchInput.value("demofile.rtf")
        sleep(2000)
        searchSubmit.click()

        then:
        at SearchPage
        sleep(5000)
        searchResultElement.text() == "demofile.rtf"


    }

    def "search incorrect item"(){
        given:
        to HomePage
        at HomePage

        when:
        searchbtn.click()

        then:
        at SearchPage

        searchInput.value("deofile.rtf")
        sleep(2000)
        searchSubmit.click()

        then:
        at SearchPage
        sleep(5000)
        errorPopUP.text() == "No artifacts found. You can broaden your search by using the * and ? wildcards"


    }


}
