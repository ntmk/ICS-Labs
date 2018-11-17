function calcFutureValue(principal, rate, years) { 
    if (principal <= 0) {
    throw new Error("Principal value must be greater than zero");
    }
    if (rate <= 0){
        throw new Error("Rate value must be greater than zero");
    }
    if (years <= 0) {
        throw new Error("Years value must be greater than zero");
    }
    var monthlyRate = ((rate / 12) / 100);
    var months = years * 12;
    var futureValue = 0;
    for (i = 1; i <= months; i++) {
        futureValue = ((futureValue + principal) * (1 + monthlyRate));
        
    }
    return futureValue.toFixed(2);
}
calc = function test() {
try{
    investment = 10;
    annualRate = 4;
    years = 5;
    futureValue = calcFutureValue(investment, annualRate, years);
    return futureValue;
}
    catch(Error){
        console.log(Error.message);
    }
};