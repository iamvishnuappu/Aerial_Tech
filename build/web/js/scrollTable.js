/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#dtDynamicVerticalScrollExample').DataTable({
        "scrollY": "50vh",
        "scrollCollapse": true
    });
    $('.dataTables_length').addClass('bs-select');
});