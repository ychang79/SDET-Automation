
/// <reference types="cypress"/>

describe('TableSuite', () => {

    it('Table', () => {
        
        cy.visit('http://testautomationpractice.blogspot.com/')

        //check value anywhere in the table
        cy.get('table[name="BookTable"]').contains('td', 'Selenium').should('be.visible')
        
        //check value in specific row and column
        cy.get('#HTML1 > div.widget-content > table > tbody > tr:nth-child(4) > td:nth-child(3)').contains('Javascript').should('be.visible')

        //check value while iterating rows.
        //verify book name 'Master in Java' written by Author 'Amod'
        //cy.get('')
    })

  })
  