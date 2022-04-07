Feature: Payment Functionality

  Scenario Outline: User should to be able to make payment by Pay by check.
    Given User open browser and navigate to automationpractice.com
    Then  Click on sign in menu located on the top of homepage
    And   User can enter "<email>" and "<password>" and then click sign in to account
    Then  Webpage will navigate user to My Account
    And   User can click [DRESS] button choose [EVENING DRESS] add item to the cart and click add to the cart
    Then  Webpage will navigate user to summary order and then user can click to proceed check out
    And   Next webpage will navigate user to delivery address and billing address details and user can update and comment all details and then click proceed to checkout
    And   Webpage will navigate user to shipping details user can click on term of service and then click proceed to check out
    And   Webpage will navigate user to  all details and payment about item : product,description,avail,unitprice,Qty and total.User click payment (pay by bank check)
    And   User will see all details about payment (pay by check) and then click [I confirm order]
    Then  Webpage will be display [Your order on My Store is complete] in the Bank check payment page.
    Examples:
      |email                  | password  |
      |crewxproject@gmail.com | Admin12$  |

  Scenario Outline: User should to be able to make payment by Pay by Bank Wire.
    Given User open browser and navigate to automationpractice.com
    Then  Click on sign in menu located on the top of homepage
    And   User can enter "<email>" and "<password>" and then click sign in to account
    Then  Webpage will navigate user to My Account
    And   User can click [SUMMER DRESS] button choose [CHIFFON DRESS] add item to the cart and click add to the cart
    Then  Webpage will navigate user to summary order and then user can click to proceed check out
    And   Next webpage will navigate user to delivery address and billing address details and user can update and comment all details and then click proceed to checkout
    And   Webpage will navigate user to shipping details user can click on term of service and then click proceed to check out
    And   Webpage will navigate user to  all details and payment about item : product,description,avail,unitprice,Qty and total.User click payment (pay by bank wire)
    And   User will see all details about payment (pay by bank wire) and then click [I confirm order]
    Then  Webpage will be display [Your order on My Store is complete] in the Bank wire payment page.

    Examples:
      |email                  | password  |
      |crewxproject@gmail.com | Admin12$  |

