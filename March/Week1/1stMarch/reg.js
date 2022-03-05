function check_the_password(form){
    password_1= form.password_1.value;
    password_2=form.password_2.value;
    if(password_1!= password_2){
        alert("\nPassword is not correct enter again");
        return false;
    }
    else{
        alert("Registration successful");
        return true;
    }
}