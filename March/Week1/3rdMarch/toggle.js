function popupshow() {
    var subs = document.getElementById("subscribe");
    var showbtn = document.getElementById("popupbutton");
    showbtn.classList.add("none");
    subs.classList.add("initial");
}
function popupclose() {
    var subs = document.getElementById("subscribe");
    var showbtn = document.getElementById("popupbutton");
    showbtn.classList.remove("none");
    subs.classList.remove("initial");
}