
/// <reference types="cypress"/>

describe('UI Element', () => {

    it('check button', () => {
        
        //visit
        cy.visit("http://demo.automationtesting.in/Register.html")

        //check box
        cy.get("#checkbox1").check().should("be.checked").and('have.value', 'Cricket')     //and() -- additional validation 
        cy.get("#checkbox2").check().should("be.checked").and('have.value', 'Movies')  
        cy.get("#checkbox3").check().should("be.checked").and('have.value', 'Hockey')  

        //uncheck box
        cy.get("#checkbox1").uncheck().should('not.be.checked')
        cy.get("#checkbox2").uncheck().should('not.be.checked')
        cy.get("#checkbox3").uncheck().should('not.be.checked')

        //check box single line of code
        cy.get('[type=checkbox]').check(['Cricket', 'Hockey'])  //specify which checkbox. give value attribute
    })

    it('drop down button', () => {
        
        cy.get('#Skills').select('C++').should('have.value', 'C++')

    })

    it('multi dropdown', () => {

        //multi dropdown selection
        cy.get('#msdd').click()
        cy.get('.ui-corner-all').contains('Korean').click()
        cy.get('.ui-corner-all').contains('Urdu').click()
        cy.get('.ui-corner-all').contains('Czech').click()
    })

    it('search dropdown', () => {

        //type dropdown selection
        cy.get('#select2-country-container').click({force:true})  //force click hiding element by previous test function
        cy.get('.select2-search__field').type('Japan').type('{enter}') //type and press enter
    })
    
  })
  
