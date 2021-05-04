
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>
         Data By Artists
    </title>
  </head>

  <body>
    <div>
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark vw-100">
          <div class="container-fluid">
            <a class="navbar-brand" href="/">SPOTIFATE</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="artists">Artists</a>
                    </li>
                <li class="nav-item">
                  <a class="nav-link" href="genres">Genres</a>
                </li>
                    <li class="nav-item">
                        <a class="nav-link" href="tracks">Tracks</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="year">Year</a>
                    </li>
              </ul>
            </div>
          </div>
        </nav>
    </div>

    <br/>
    <br/>
    <br/>
    <br/>

    <div class="container">
        <h1>Data Sorted By Artists</h1>

        </br>

        <table class="table table-striped table-hover">
            <thead class="table-dark">
                <tr>
                    <th scope="col">Artist</th>
                    <th scope="col">Genres</th>
                    <th scope="col">Acousticness</th>
                    <th scope="col">Danceability</th>
                    <th scope="col">Duration/ms</th>
                    <th scope="col">Energy</th>
                    <th scope="col">Instrumentalness</th>
                    <th scope="col">Liveness</th>
                    <th scope="col">Loudness</th>
                    <th scope="col">Speechiness</th>
                    <th scope="col">Tempo</th>
                    <th scope="col">Valence</th>
                    <th scope="col">Popularity</th>
                    <th scope="col">Key</th>
                    <th scope="col">Mode</th>
                    <th scope="col">Count</th>
                </tr>
            </thead>

            <tbody>            
                <#list data as data_by_artist>
                    <tr>
                        <#if data_by_artist.artists?has_content>
                            <td>${data_by_artist.artists}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.genres?has_content>
                            <td>${data_by_artist.genres}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.acousticness?has_content>
                            <td>${data_by_artist.acousticness}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.danceability?has_content>
                            <td>${data_by_artist.danceability}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.duration?has_content>
                            <td>${data_by_artist.duration}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.energy?has_content>
                            <td>${data_by_artist.energy}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.instrumentalness?has_content>
                            <td>${data_by_artist.instrumentalness}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.liveness?has_content>
                            <td>${data_by_artist.liveness}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.loudness?has_content>
                            <td>${data_by_artist.loudness}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.speechiness?has_content>
                            <td>${data_by_artist.speechiness}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.tempo?has_content>
                            <td>${data_by_artist.tempo}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.valence?has_content>
                            <td>${data_by_artist.valence}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.popularity?has_content>
                            <td>${data_by_artist.popularity}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.keyval?has_content>
                            <td>${data_by_artist.keyval}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.mode?has_content>
                            <td>${data_by_artist.mode}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>

                        <#if data_by_artist.count?has_content>
                            <td>${data_by_artist.count}</td>
                        <#else>
                            <td>NULL</td>
                        </#if>
                    </tr>
                </#list>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

  </body>
