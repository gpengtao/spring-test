<html>
<body>
<h2>sse</h2>

<div id="fromPush"/>

</body>

<script type="javascript" src="https://q.qunarzz.com/jquery/prd/jquery-1.7.2.js"/>

<script type="javascript">
    if (!!window.EventSource) {
        var source = new EventSource('push');
        s = '';
        source.addEventListener('message', function (e) {
            s += e.data + "<br/>"
            $("#fromPush").html(s);
        });
    } else {
        console.log("=============================")
    }
</script>

</html>
