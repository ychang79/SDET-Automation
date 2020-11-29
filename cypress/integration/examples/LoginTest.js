
/// <reference types="cypress"/>

describe('UI Element', () => {

    it('input and radio button', () => {
        
        //url verification
        cy.visit("http://demo.guru99.com/test/newtours/")
        cy.url().should('include', 'guru99')  //url() give current url of page.

        //login
        cy.get("input[name='userName']").should('be.visible').should('be.enabled').type('mercury')
        cy.get("input[name='password']").should('be.visible').should('be.enabled').type('mercury')
        cy.get("input[name='submit']").should('be.visible').click()
        
        //go flight
        cy.get("body > div:nth-child(5) > table > tbody > tr > td:nth-child(1) > table > tbody > tr > td > table > tbody > tr > td > table > tbody > tr:nth-child(2) > td:nth-child(2) > a").click()

        //radio button
        cy.get("input[value='roundtrip']").should('be.visible').should('be.checked')  //visibilty and whether it is checked
        cy.get("input[value='oneway']").should('be.visible').should('not.be.checked').click()  //click if not checked

        //continue
        cy.get('[name="findFlights"]').should('be.visible').click()
    })

  })
  
