$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Calculator.feature");
formatter.feature({
  "name": "Calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add two numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.iHaveCalculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add 2 and 2",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.iAddAnd(int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Result is 4",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.resultIs(int)"
});
formatter.result({
  "status": "passed"
});
});