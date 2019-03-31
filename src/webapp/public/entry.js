var map = new BMap.Map("container");
// 创建地图实例
// 创建点坐标
// 初始化地图，设置中心点坐标和地图级别

$.ajax({
    url : './station/list',
    type : 'GET',
    complete : function (r, d) {
        var stations = JSON.parse(r.responseText).data;
        var lng = 0;
        var lat = 0;
        $.each(stations, function (i, station) {
            lng = (lng + station.lng) / 2;
            lat = (lat + station.lat) / 2;
            var p = new BMap.Point(station.lng, station.lat);
            var marker = new BMap.Marker(p);
            marker.addEventListener('click', function () {
                var opts = {
                    width : 250,     // 信息窗口宽度
                    height: 100,     // 信息窗口高度
                    title : station.name  // 信息窗口标题
                }
                var infoWindow = new BMap.InfoWindow("dock_count : " + station.dockCount, opts);  // 创建信息窗口对象
                map.openInfoWindow(infoWindow, p);      // 打开信息窗口
            });
            map.addOverlay(marker);
            console.log(station);
        });

        var p = new BMap.Point(lng, lat);
        map.centerAndZoom(p, 10);
    }
});


