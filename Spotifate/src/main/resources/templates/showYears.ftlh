
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->\    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>
         Data By Year
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
                            <a class="nav-link" href="/tracks">Tracks</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="/years">Years</a>
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
        <h1>Years Table | ${data?size} Values</h1>
        <br/>

        <p class="fs-6 fst-italic text-muted">Hold ctrl and click to select multiple columns</p>
        <form action="/years-query" method="post">
            <div class="input-group mb-3" style="max-width:30%">
                <label class="input-group-text" for="columnSelect">SELECT</label>
                <select class="form-select w-20" id="columnSelect" name="columns" multiple="mutiple">
                    <option value="years">Year</option>
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
                <input readonly placeholder="Genre Table" class="input-group-text" for="columnSelect" name="from" value="data_by_year"></input>
                <label class="input-group-text" for="columnSelect">WHERE</label>
                <select class="form-select w-20" id="columnSelect" name="where">
                    <option value="years" selected="">Year</option>
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
                    <option value="keyval">Key</option>
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
                        <th scope="col">Year</th>
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
                    </tr>
                </thead>

                <tbody>
                    <#list data as data_by_year>
                        <tr>
                            <#if data_by_year.years?has_content>
                                <td>${data_by_year.years}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.acousticness?has_content>
                                <td>${data_by_year.acousticness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.danceability?has_content>
                                <td>${data_by_year.danceability}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.duration?has_content>
                                <td>${data_by_year.duration}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.energy?has_content>
                                <td>${data_by_year.energy}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.instrumentalness?has_content>
                                <td>${data_by_year.instrumentalness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.liveness?has_content>
                                <td>${data_by_year.liveness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.loudness?has_content>
                                <td>${data_by_year.loudness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.speechiness?has_content>
                                <td>${data_by_year.speechiness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.tempo?has_content>
                                <td>${data_by_year.tempo}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.valence?has_content>
                                <td>${data_by_year.valence}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.popularity?has_content>
                                <td>${data_by_year.popularity}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.keyval?has_content>
                                <td>${data_by_year.keyval}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_year.mode?has_content>
                                <td>${data_by_year.mode}</td>
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

    <div class="container">
        <p class="fs-6 fst-italic text-muted">
            Mode - 0 if Minor or 1 if Major 
            <br> 
            Key  - 0 to 11 From notes C to B
        </p>
    </div>

    <br/>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

  </body>
</html>