function cross() {
    document.getElementById('popup').classList.replace('popup' ,'zoom');
}
function show(n) {
    document.getElementById('popup').classList.replace('zoom' ,'popup');
    document.getElementById('def_img').src = document.getElementById(`img${n}`).src;

}
