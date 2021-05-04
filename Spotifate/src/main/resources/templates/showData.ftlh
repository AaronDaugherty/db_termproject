<!DOCTYPE html>
<html>
    <head>
        <title>Cities</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>List of cities</h2>

        <table>
            <tr>
                <th>Artist</th>
                <th>Genre</th>
                <th>Acousticness</th>
            </tr>

            <#list data as data_by_artist>
                <tr>
                    <td>${data_by_artist.artists}</td>
                    <td>${data_by_artist.genres}</td>
                    <td>${data_by_artist.acousticness}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>
