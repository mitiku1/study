package hellograils

class CustomerController {
    def scaffold=true;
    def index() {
        List mylist=new ArrayList();
        mylist.add("1. One")
        [list:mylist]
    }
}
