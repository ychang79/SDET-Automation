
/// <reference types="cypress"/>

describe('GoPages', () => {

    it('Page', () => {
        
        cy.visit('http://demo.nopcommerce.com/')
        cy.title().should('eq', 'nopCommerce demo store')  //home page

        cy.get('.ico-register').contains('Register').click()
        //cy.title().should('eq', 'nopCommerce demo store. Register')  //register page

        //go back page
        cy.go('back')
        //cy.title().should('eq', 'nopCommerce demo store')

        //go foward page
        cy.go('foward')
        //cy.title().should('eq', 'nopCommerce demo store. Register') 

        //go back page
        cy.go(-1)
        //cy.title().should('eq', 'nopCommerce demo store')

        //go foward page
        cy.go(1)
        //cy.title().should('eq', 'nopCommerce demo store. Register') 

        cy.reload()
    })

  })
  