
/// <reference types="cypress"/>

describe('BeforeSuite', () => {




            before(() => {
                // runs ONCE before all tests in the block
                cy.log('----------------Before all IT block-------------------------')
            })
            
            beforeEach(() => {
                // runs before EACH test in the block (MULTIPLE TIMES)
                cy.log('Before EACH IT BLOCKS')
            })
            
            afterEach(() => {
                // runs after EACH test in the block (MULTIPLE TIMES)
                cy.log('^^^^^^AFTER EACH IT BLOCKS^^^^^^^^')
            })
            
            after(() => {
                // runs ONCE after all tests in the block
                cy.log('----------------AFTER all IT block-------------------------')
            })





        
        it('search', function(){
            cy.log('@@@@@@SEARCHING Test block@@@@@@')
        })


        it('advanced search', function(){
            cy.log('######Advanced search scenario######')
        })


        it('listing products', function(){
            cy.log('%%%%%%list the product block%%%%%%')
        })



  })
  