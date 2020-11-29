
describe('MyTestSuite', () => {

    it('TitleVerificationPositive', () => {
      
        cy.visit('http://demo.nopcommerce.com/')
        cy.title().should('eq', 'nopCommerce demo store')
    })

    it('TitleVerificationNegative', () => {
      
        cy.visit('http://demo.nopcommerce.com/')
        cy.title().should('eq', 'nopCommercestore')
    })
  })
  

//locator
/*cy.get(selector)   ---locate the element such as 
.class  ex.   .ico-login
#id   ex.  #small-searchterms
[attribute = value]   ex. [type=submit]
.class[attribute = value]     ex. product-box-add-to-cart-button[value='Add to cart']

*/