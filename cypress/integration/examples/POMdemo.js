
/// <reference types="cypress"/>

import LoginPage from '../PageObj/LoginPage'    //import LoginPage class method


describe('MyTestSuite', () => {

    it('LoginTest', () => {
        

        const lp = new LoginPage()  //creat obj

        lp.visit()
        lp.fillPassword('1111111111')
        lp.fillEmail('foxter@gmail.com')
        lp.submit()


    })

  })
  
