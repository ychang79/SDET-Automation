
/// <reference types="cypress"/>

describe('MyTestSuite', () => {

    it('Procurement', () => {
        
        //search macbook
        cy.visit('http://demo.nopcommerce.com/')
        cy.get("#small-searchterms").type("Apple MacBook pro 13")  //id
        cy.get("[type='submit']").click()  //attribute

        //add to cart
        cy.get(".product-box-add-to-cart-button[value='Add to cart']").click()  //class+attribute
        cy.get("#product_enteredQuantity_4").clear().type("5")  //id //clear and then input new value
        cy.get("#add-to-cart-button-4").click() //id
        cy.get("#topcartlink > a > span.cart-label").click() //xpath css selector


    })
/*
    it('PriceVerification', () => {
        //verify
        cy.get(".product-unit-price").contains('$1,800.00')
    })
*/
  })
  
