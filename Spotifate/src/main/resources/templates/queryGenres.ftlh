
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->\    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>
         Queried Genre Data
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
                            <a class="nav-link" href="artists">Artists</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="genres">Genres</a>
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

    <div class="container">
        <h1>Queried Genres Table | ${data?size} Results</h1>
        <br/>

        <p class="fs-6 fst-italic text-muted">Hold ctrl and click to select multiple columns</p>
        <form action="/genres-query" method="post">
            <div class="input-group mb-3" style="max-width:30%">
                <label class="input-group-text" for="columnSelect">SELECT</label>
                <select class="form-select w-20" id="columnSelect" name="columns" multiple="mutiple">
                    <option value="genres">Genres</option>
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
                <input readonly placeholder="Genre Table" class="input-group-text" for="columnSelect" name="from" value="data_by_genre"></input>
                <label class="input-group-text" for="columnSelect">WHERE</label>
                <select class="form-select w-20" id="columnSelect" name="where">
                    <option value="genres">Genres</option>
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
                    <option value="=">=</option>
                    <option value="<>">!=</option>
                    <option value="<"><</option>
                    <option value=">">></option>
                    <option value="<="><=</option>
                    <option value=">=">>=</option>
                    <option value="LIKE">LIKE</option>
                </select>

                <input type="text" class="form-control w-25" placeholder="Indie Rock" aria-label="Text input with dropdown button" name="search">
                <button class="btn btn-outline-primary" type="submit" id="searchButton">Search</button>
            </div>
        </form>

        <div style="overflow: scroll;max-height: 650px">
            <table class="table table-striped table-hover">
                <thead style="position: sticky;top: 0" class="table-dark">
                    <tr>
                        <#list columns as column>
                        <th scope="col">${column}</th>
                        </#list>
                    </tr>
                </thead>

                <tbody>
                    <#list data as data_by_genre>
                        <tr>
                            <#list columns as column>
                                <#if column == "genres"> 
                                    <#if data_by_genre.genres?has_content>
                                        <td>${data_by_genre.genres}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "acousticness">     
                                    <#if data_by_genre.acousticness?has_content>
                                        <td>${data_by_genre.acousticness}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "danceability"> 
                                    <#if data_by_genre.danceability?has_content>
                                        <td>${data_by_genre.danceability}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "duration_ms"> 
                                    <#if data_by_genre.duration?has_content>
                                        <td>${data_by_genre.duration}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "energy"> 
                                    <#if data_by_genre.energy?has_content>
                                        <td>${data_by_genre.energy}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "instrumentalness"> 
                                    <#if data_by_genre.instrumentalness?has_content>
                                        <td>${data_by_genre.instrumentalness}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "liveness"> 
                                    <#if data_by_genre.liveness?has_content>
                                        <td>${data_by_genre.liveness}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "loudness"> 
                                    <#if data_by_genre.loudness?has_content>
                                        <td>${data_by_genre.loudness}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "speechiness"> 
                                    <#if data_by_genre.speechiness?has_content>
                                        <td>${data_by_genre.speechiness}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "tempo"> 
                                    <#if data_by_genre.tempo?has_content>
                                        <td>${data_by_genre.tempo}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "valence"> 
                                    <#if data_by_genre.valence?has_content>
                                        <td>${data_by_genre.valence}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "popularity"> 
                                    <#if data_by_genre.popularity?has_content>
                                        <td>${data_by_genre.popularity}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "key_val"> 
                                    <#if data_by_genre.keyval?has_content>
                                        <td>${data_by_genre.keyval}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>

                                <#elseif column == "mode"> 
                                    <#if data_by_genre.mode?has_content>
                                        <td>${data_by_genre.mode}</td>
                                    <#else>
                                        <td>NULL</td>
                                    </#if>
                                </#if>
                            </#list>
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