
/// <reference types="cypress"/>

describe('Custom', () => {

    it('CustomCommand', () => {
        
        cy.loginn('admin@yourstore.com', 'admin')

    })

    it('AddCustomer', () => {
        
        cy.loginn('addCustomer@yourstore.com', 'addddddd')
        cy.log('@@@@@@Adding customer@@@@@@')

    })

    it('EditCustomer', () => {
        
        cy.loginn('editCustomer@yourstore.com', 'editttt')
        cy.log('#######Edit customer######')
    })

  })
  