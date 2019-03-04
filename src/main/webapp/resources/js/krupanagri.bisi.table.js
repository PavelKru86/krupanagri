var ajaxUrl = 'ajax/profile/bisi/'
var datatableApi;
let context;
$(function () {
    datatableApi = $('#datatable').DataTable({
        sAjaxSource: ajaxUrl,
        sAjaxDataProp: "",
        bPaginate: false,
        bInfo : false,
        aoColumns : [
            {
                "data": "date_time",
                "mRender": function (date, type, row) {
                    if (type == 'dysplay') {
                        var dateObject = new Data(date);
                        return '<span>' + dateObject.toISOString().substring(0,10) + '</span>';
                    }
                    return date;

                }
            },
            {
                "data": "description"
            },
            {
                "data": "price"
            },
            {
                "render": renderEditBtn,
                "defaultContent": "",
                "orderable": false
            },
            {
                "render": renderDeleteBtn,
                "defaultContent": "",
                "orderable": false
            }
        ],
        "aaSorting": [
            [
                0,
                "asc"
            ]
        ],
        "fnCreatedRow": function (row, data, dataIndex) {
            if (!data.enabled) {
                $(row).css("text-decoration", "line-through");
            }

        },
        "fnInitComplete": makeEditable



    });
});



function makeEditable() {
    //context = ctx;
    form = $('#detailsForm');

    $('#add').click(function () {
        $('#id').val(0);
        $('#editRow').modal();

    });

    form.submit(function () {
        save();
        return false;
    });

    $(document).ajaxError(function (event, jqXHR, options, jsExc) {
        failNoty(jqXHR);
    });

    // solve problem with cache in IE: https://stackoverflow.com/a/4303862/548473
    /*$.ajaxSetup({cache: false});

    const token = $("meta[name='_csrf']").attr("content");
    const header = $("meta[name='_csrf_header']").attr("content");
    $(document).ajaxSend(function (e, xhr, options) {
        xhr.setRequestHeader(header, token);
    });*/
}

function updateFilteredTable() {
    $.ajax({
        type: "GET",
        url: mealAjaxUrl + "filter",
        data: $("#filter").serialize()
    }).done(updateTableByData);
}

function renderEditBtn(data, type, row) {
    if (type == 'display') {
        return '<a class = "btn btn-xs btn-primary" onclick="updateRow(' + row.id + ');">Edit</a>';
    }
    return data;
}

function renderDeleteBtn(data, type, row) {
    if (type == 'display') {
        return '<a class="btn btn-xs btn-danger" onclick= "deleteRow(' + row.id + ');">Delete</a>'
    }
    return data;
}

function updateRow(id) {
    $("#modalTitle").html(i18n["editTitle"]);
    $.get(ajaxUrl + id, function (data) {
        $.each(data, function (key, value) {
            form.find("input[name='" + key + "']").val(value);
        });
        $('#editRow').modal();
    });
}

function deleteRow(id) {
    $.ajax({
        url: ajaxUrl + id,
        type: "DELETE"
    }).done(function () {
        updateTable();
        successNoty("common.deleted");
    });
}

function updateTable() {
    $.get(ajaxUrl, function (data) {
        updateTableByData(data);
    });
}

function updateTableByData(data) {
    datatableApi.clear().rows.add(data).draw();
}


let failedNote;

function failNoty(jqXHR) {
    closeNoty();
    failedNote = new Noty({
        text: "<span class='fa fa-lg fa-exclamation-circle'></span> &nbsp;" + i18n["common.errorStatus"] + ": " + jqXHR.status + (jqXHR.responseJSON ? "<br>" + jqXHR.responseJSON : ""),
        type: "error",
        layout: "bottomRight"
    }).show();
}


function closeNoty() {
    if (failedNote) {
        failedNote.close();
        failedNote = undefined;
    }
}

function successNoty(key) {
    closeNoty();
    new Noty({
        text: "<span class='fa fa-lg fa-check'></span> &nbsp;" + i18n[key],
        type: 'success',
        layout: "bottomRight",
        timeout: 1000
    }).show();
}

