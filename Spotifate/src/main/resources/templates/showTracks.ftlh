
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->\    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>
         Data By Track
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
                            <a class="nav-link" href="/artists">Artists</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/genres">Genres</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="/tracks">Tracks</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/years">Years</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>

    <br/>
    <br/>
    <br/>
    <div class="container">
        <h1>Original Data Table | ${data?size} Values</h1>
        <br/>
        <p class="fs-6 fst-italic text-muted">Hold ctrl and click to select multiple columns</p>
        <form action="/tracks-query" method="post">
            <div class="input-group mb-3" style="max-width:30%">
                <label class="input-group-text" for="columnSelect">SELECT</label>
                <select class="form-select w-20" id="columnSelect" name="columns" multiple="mutiple">
                    <option value="id" selected="">Id</option>
                    <option value="year">Year</option>
                    <option value="name">Name</option>
                    <option value="explicit">Explicit</option>
                    <option value="artists">Artists</option>
                    <option value="release_date">Release Date</option>
                    <option value="acousticness">Acousticness</option>
                    <option value="danceability">Danceability</option>
                    <option value="duration_ms">Duration/ms</option>
                    <option value="energy">Energy</option>
                    <option value="instrumentalness">Instrumentalness</option>
                    <option value="liveness">Liveness</option>
                    <option value="loudness">Loudness</option>
                    <option value="speechiness">Speechiness</option>
                    <option value="tempo">Tempo</option>
                    <option value="valence">Valence</option>
                    <option value="popularity">Popularity</option>
                    <option value="key_val">Key</option>
                    <option value="mode">Mode</option>
                </select>
            </div>

            <div class="input-group mb-3 w-80">
                <label class="input-group-text" for="tableSelect">FROM</label>
                <input readonly placeholder="Genre Table" class="input-group-text" for="columnSelect" name="from" value="data_by_track"></input>
                <label class="input-group-text" for="columnSelect">WHERE</label>
                <select class="form-select w-20" id="columnSelect" name="where">
                    <option value="id">Id</option>
                    <option value="year">Year</option>
                    <option value="name">Name</option>
                    <option value="explicit">Explicit</option>
                    <option value="artists">Artists</option>
                    <option value="release_date">Release Date</option>
                    <option value="acousticness">Acousticness</option>
                    <option value="danceability">Danceability</option>
                    <option value="duration">Duration/ms</option>
                    <option value="energy">Energy</option>
                    <option value="instrumentalness">Instrumentalness</option>
                    <option value="liveness">Liveness</option>
                    <option value="loudness">Loudness</option>
                    <option value="speechiness">Speechiness</option>
                    <option value="tempo">Tempo</option>
                    <option value="valence">Valence</option>
                    <option value="popularity">Popularity</option>
                    <option value="key_val">Key</option>
                    <option value="mode">Mode</option>
                </select>

                <select class="form-select w-5" id="operatorSelect" name="operator">
                    <option value="LIKE">LIKE</option>
                    <option value="STARTS WITH">STARTS WITH</option>
                    <option value="ENDS WITH">ENDS WITH</option>
                    <option value="=">=</option>
                    <option value="<>">!=</option>
                    <option value="<"><</option>
                    <option value=">">></option>
                    <option value="<="><=</option>
                    <option value=">=">>=</option>
                </select>

                <input type="text" class="form-control w-25" placeholder="Indie Rock" aria-label="Text input with dropdown button" name="search">
                <button class="btn btn-outline-primary" type="submit" id="searchButton">Search</button>
            </div>
        </form>

        </br>

        <div style="overflow: scroll;max-height: 650px">
            <table class="table table-striped table-hover">
                <thead style="position: sticky;top: 0" class="table-dark">
                    <tr>
                    <td scope="col">Id</td>
                    <td scope="col">Year</td>
                    <td scope="col">Name</td>
                    <td scope="col">Explicit</td>
                    <td scope="col">Artists</td>
                    <td scope="col">Release-Date</td>
                    <td scope="col">Acousticness</td>
                    <td scope="col">Danceability</td>
                    <td scope="col">Duration/ms</td>
                    <td scope="col">Energy</td>
                    <td scope="col">Instrumentalness</td>
                    <td scope="col">Liveness</td>
                    <td scope="col">Loudness</td>
                    <td scope="col">Speechiness</td>
                    <td scope="col">Tempo</td>
                    <td scope="col">Valence</td>
                    <td scope="col">Popularity</td>
                    <td scope="col">Key</td>
                    <td scope="col">Mode</td>
                    </tr>
                </thead>

                <tbody>
                    <#list data as data_o>
                        <tr>
                            <#if data_o.id?has_content>
                                <td>${data_o.id}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.year?has_content>
                                <td>${data_o.year}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.name?has_content>
                                <td>${data_o.name}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.explicit?has_content>
                                <td>${data_o.explicit}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.artists?has_content>
                                <td>${data_o.artists}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.release_date?has_content>
                                <td>${data_o.release_date}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.acousticness?has_content>
                                <td>${data_o.acousticness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.danceability?has_content>
                                <td>${data_o.danceability}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.duration?has_content>
                                <td>${data_o.duration}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.energy?has_content>
                                <td>${data_o.energy}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.instrumentalness?has_content>
                                <td>${data_o.instrumentalness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.liveness?has_content>
                                <td>${data_o.liveness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.loudness?has_content>
                                <td>${data_o.loudness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.speechiness?has_content>
                                <td>${data_o.speechiness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.tempo?has_content>
                                <td>${data_o.tempo}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.valence?has_content>
                                <td>${data_o.valence}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.popularity?has_content>
                                <td>${data_o.popularity}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.keyval?has_content>
                                <td>${data_o.keyval}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                            <#if data_o.mode?has_content>
                                <td>${data_o.mode}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                        </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>

    <br/>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

  </body>
</html>






