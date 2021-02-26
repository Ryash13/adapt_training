function double(x) {
  return x * 2;
}

function square(x) {
  return x * x;
}

function composedValue(square, double) {
  var val = arguments.length <= 2 || arguments[2] === undefined ? 5 : arguments[2];

  return square(double(val));
}
console.log(composedValue(square, double, 5));
