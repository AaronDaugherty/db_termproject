
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->\    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>
         Data By Genres
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
        <h1>Data Sorted By Genres</h1>

        <div class="input-group mb-3 w-80">
            <label class="input-group-text" for="columnSelect">SELECT</label>
            <select class="form-select w-20" id="columnSelect">
                <option value="*">*</option>
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
            <label class="input-group-text" for="tableSelect">FROM</label>
            <select class="form-select w-20" id="tableSelect">
                <option value="artists">Artists</option>
                <option value="artists">Genres</option>
                <option value="artists">Years</option>
                <option value="artists">Tracks</option>
            </select>
            <label class="input-group-text" for="columnSelect">WHERE</label>
            <select class="form-select w-20" id="columnSelect">
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
            <select class="form-select w-5" id="operatorSelect">
                <option value="equals">=</option>
                <option value="lessThan"><</option>
                <option value="grThan">></option>
            </select>

            <input type="text" class="form-control w-25" placeholder="Indie Rock" aria-label="Text input with dropdown button">
            <button class="btn btn-outline-primary" type="submit" id="searchButton">Search</button>
        </div>

        </br>

        <div style="overflow: scroll;max-height: 500px">
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                    <tr>
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
                    </tr>
                </thead>

                <tbody>
                    <#list data as data_by_genre>
                        <tr>
                            <#if data_by_genre.genres?has_content>
                                <td>${data_by_genre.genres}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.acousticness?has_content>
                                <td>${data_by_genre.acousticness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.danceability?has_content>
                                <td>${data_by_genre.danceability}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.duration?has_content>
                                <td>${data_by_genre.duration}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.energy?has_content>
                                <td>${data_by_genre.energy}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.instrumentalness?has_content>
                                <td>${data_by_genre.instrumentalness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.liveness?has_content>
                                <td>${data_by_genre.liveness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.loudness?has_content>
                                <td>${data_by_genre.loudness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.speechiness?has_content>
                                <td>${data_by_genre.speechiness}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.tempo?has_content>
                                <td>${data_by_genre.tempo}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.valence?has_content>
                                <td>${data_by_genre.valence}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.popularity?has_content>
                                <td>${data_by_genre.popularity}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.keyval?has_content>
                                <td>${data_by_genre.keyval}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>

                            <#if data_by_genre.mode?has_content>
                                <td>${data_by_genre.mode}</td>
                            <#else>
                                <td>NULL</td>
                            </#if>
                        </tr>
                    </#list>
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

  </body>
