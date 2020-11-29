
/// <reference types="cypress"/>

describe('API test suite', () => {


    it('Get', () => {

        cy.request('GET', 'http://dummy.restapiexample.com/api/v1/employees').then((response) =>{
            expect(response).to.have.property('status', 200)
            expect(response.body).to.not.be.null
            expect(response.body.data).to.have.length(24)
        })

    })


    it('Post', () => {

        const item = {"name":"test","salary":"123","age":"23"}
        cy.request('POST', 'http://dummy.restapiexample.com/api/v1/create', item)
        .its('body').its('data').should('include', {name:'test'})
    })


    it('Put - update', () => {

        const item = {'name':'test1'}
        cy.request('PUT', 'http://dummy.restapiexample.com/api/v1/update/21/1')

    })

})