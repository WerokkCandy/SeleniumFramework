Feature: Socials links working as expected

  Scenario Outline: Twitter link
    Given user visits <page>
    When user clicks on the twitter icon
    Then twitter page is opened

    Examples: 
      | page                                |
      | https://www.candyspace.com/         |
      | https://www.candyspace.com/work/    |
      #| https://insights.candyspace.com/    |
      | https://www.candyspace.com/team/    |
      | https://www.candyspace.com/careers/ |
      | https://www.candyspace.com/contact/ |

  Scenario Outline: Linkedin link
    Given user visits <page>
    Then linkedin icon points to the correct URL

    Examples: 
      | page                                |
      | https://www.candyspace.com/         |
      | https://www.candyspace.com/work/    |
      #| https://insights.candyspace.com/    |
      | https://www.candyspace.com/team/    |
      | https://www.candyspace.com/careers/ |
      | https://www.candyspace.com/contact/ |
