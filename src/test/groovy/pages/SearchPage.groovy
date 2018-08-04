package pages

import geb.Page


class SearchPage extends Page{
    static url = "webapp/#/search/quick/"
    static at = {

        waitFor { searchForm.text() == "Search Artifacts"}

    }
    static content = {
        searchTxt {$(".ng-binding")}
        //searchForm {$(".ng-pristine.ng-scope.ng-invalid.ng-invalid-required.ng-valid-maxlength.ng-valid-min.ng-valid-max")}
        searchForm {$(".ng-binding","ng-bind":"SearchController.title")}
        searchInput {$("#criterion-string-0")}
        searchSubmit {$(".btn.btn-primary", "ng-click":"queryMaker.search()")}
        searchResultElement {$(".ui-grid-cell-contents.autotest-quick-artifact.ng-binding.ng-scope")}
        errorPopUP{$(".toast-message").$(".ng-binding.ng-scope")}

    }
}
