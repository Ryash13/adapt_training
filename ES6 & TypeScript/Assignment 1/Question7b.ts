let Organization = {
    name: 'Capgemini' , 
    address: {
        pincode: 845401,
        city: 'Motihari',
        state: 'Bihar',
        country: 'India'
    }
}

function pinCode(org){
    return org.address.pincode;
}

console.log(pinCode(Organization));
