
/// <reference types="cypress"/>

describe('Fixture', () => {


    //import fixture before test
    before(function() {
        cy.fixture('example').then(function(data){

            this.data = data

        })
    })


    it('Fixx', () => {
        
        //using example.json fixture
        cy.visit('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F')

        cy.get('input[type="email"]').type(this.data.email)
        cy.get('input[name="Password"]').type(this.data.password)


    })

  })
  