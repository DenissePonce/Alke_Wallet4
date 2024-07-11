let balance = 0;

function updateBalance() {
    document.getElementById('balance').innerText = `Saldo: $${balance}`;
}

function deposit() {
    let amount = parseFloat(document.getElementById('amount').value);
    if (amount > 0) {
        balance += amount;
        updateBalance();
    } else {
        alert("Por favor, ingrese una cantidad válida.");
    }
}

function withdraw() {
    let amount = parseFloat(document.getElementById('amount').value);
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        updateBalance();
    } else {
        alert("Por favor, ingrese una cantidad válida que no exceda su saldo.");
    }
}

function convert() {
    const conversionRate = 0.85; // Ejemplo de tasa de conversión de USD a EUR
    let convertedBalance = balance * conversionRate;
    alert(`Su saldo en euros es: €${convertedBalance.toFixed(2)}`);
}
