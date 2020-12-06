package assignment3;
import java.util.Map; // used in convertPostfix

class InfixCalculator 
//Calculates the Infix expression passed after converting it to a Postfix expression
//Allows for typing spaces between operands,operators and parentheses
//Allows for multi-digit integer operands 
{
    private String expression;
    private StackListBased<Integer> expStack;

    /**
     *Constructor for InfixCalculator 
     */
    InfixCalculator(String expression) 
    {
        this.expression = expression;
        expStack = new StackListBased<>();
    }

    private static int switchOperatorChoose(String expressionOperator, int noOne, int noTwo) 
    {
        
        // if operator is a provided operator (-+*/) then run it as a math operator on num1 and num2
        
        switch (expressionOperator) //Using switch to choose the operator(case) wanted 
        {
            
            case "+": //Addition - > first case
                return noOne + noTwo;
                
            case "-": //Subtraction - > second case
                return noOne - noTwo;
                
            case "*": //Multiplication - > third case
                return noOne * noTwo;
                
            case "/": //Division - > fourth case
                return noOne / noTwo;
                
            default: //Returns 0 - > default case 
                return 0;
                
        }
    }
    //first method required
    private String convertPostfix(String expressionInfix) 
    {
       
        Map<String, Integer> operationPrecedence = Map.of("+", 1, "-", 1, "*", 2, "/", 2);
         // Using map to differentiate between operations precedence using integers ("+" and "-" comes before "*" and "/")
         
        StringBuilder expressionPostfix = new StringBuilder();
        
        StackListBased<String> operatorList = new StackListBased<>();
        
        String[] tokenq = expressionInfix.replaceAll("\\s+", "").split("(?=[-+*/()])|(?<=[-+*/()])");
        //Removes white spaces 
        //parse String to tonkenq
        
        for (String mainToken : tokenq) 
        {
            if (mainToken.matches("\\d+")) 
            //If it is a number append(add) to prefix with a space - > parsing
            {
                expressionPostfix.append(mainToken);
                expressionPostfix.append(" ");
                
            } 
            else if (mainToken.equals("(")) 
            //If it is an opening bracket("(") push(move) to the Stack we have.
            {
                operatorList.push(mainToken);
            }
            else if (mainToken.equals(")")) 
            //If it is a closing bracket(")") pop(remove) from the Stack and append it to the the beginning with a space - > parsing (keep parsing until opening bracket is found)
            {
                while (!operatorList.peek().equals("(")) 
                {
                    expressionPostfix.append(operatorList.pop());
                    expressionPostfix.append(" ");
                }
                
                operatorList.pop();
                  }
            else if (mainToken.matches("[-+*/]")) 
            //If it is an expressionOperator Sort it by precedence then append(add) to expressionPostfix
            {
                while (!operatorList.isEmpty() && !operatorList.peek().equals("(") && (operationPrecedence.get(mainToken) <= operationPrecedence.get(operatorList.peek())))
                {
                    expressionPostfix.append(operatorList.pop()); //Appending
                    expressionPostfix.append(" "); 
                }
                operatorList.push(mainToken);
            }
        }
        while (!operatorList.isEmpty()) 
        //operatorList into postfix
        {
            expressionPostfix.append(operatorList.pop());
            expressionPostfix.append(" ");
        }
        expressionPostfix.deleteCharAt(expressionPostfix.lastIndexOf(" "));
        return expressionPostfix.toString();
    }
    //second method required
    private int getPostfix(String expressionPostfix) 
    {
        //Purse postFix expression by Preplaced spaces
        for (String token : expressionPostfix.split(" ")) 
        {
            //If token is a number push to the stack else run the token on the first two number from the stack
            if (token.matches("\\d+")) 
            {
                expStack.push(Integer.parseInt(token));
            } 
            else 
            {
                expStack.push(switchOperatorChoose(token, expStack.pop(), expStack.pop()));
            }
        }
        return expStack.pop();
    }
    //third method required and runs convertPostfix and getPostfix
    //called by the client program by w2
    /**
     *Prints the results of convertPostfix and getPostfix after running them.
     */
    void evaluateInfix() {
        System.out.println("infix: " + expression);
        expression = convertPostfix(expression);
        System.out.println("postfix: " + expression);
        System.out.println("result: " + getPostfix(expression));
    }
}