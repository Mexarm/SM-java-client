# DefaultApi

All URIs are relative to *https://scrum-metrics.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSprint**](DefaultApi.md#checkSprint) | **POST** /api/sprintstatus | 
[**deleteAccount**](DefaultApi.md#deleteAccount) | **POST** /api/deluser | 
[**deleteMember**](DefaultApi.md#deleteMember) | **POST** /api/deletemember | 
[**editStory**](DefaultApi.md#editStory) | **PUT** /api/editstory | 
[**endSprint**](DefaultApi.md#endSprint) | **PUT** /api/endsprint | 
[**getCurSprint**](DefaultApi.md#getCurSprint) | **POST** /api/currsprint | 
[**getMemebers**](DefaultApi.md#getMemebers) | **POST** /api/projmembers | 
[**getNextSprint**](DefaultApi.md#getNextSprint) | **POST** /api/getnextsprint | 
[**getProject**](DefaultApi.md#getProject) | **POST** /api/lastproject | Returns last created project id
[**getProjectInfo**](DefaultApi.md#getProjectInfo) | **POST** /api/projectinfo | 
[**getSprints**](DefaultApi.md#getSprints) | **POST** /api/getsprints | 
[**getStories**](DefaultApi.md#getStories) | **POST** /api/getstories | 
[**getUnfinishedStories**](DefaultApi.md#getUnfinishedStories) | **POST** /api/unfinishedstories | 
[**getUserInfo**](DefaultApi.md#getUserInfo) | **POST** /api/user | Queries info from the given user
[**getUserName**](DefaultApi.md#getUserName) | **POST** /api/username | 
[**getUserProjects**](DefaultApi.md#getUserProjects) | **POST** /api/userprojs | Returns the projects a user is in
[**getUsersMGetUsersA**](DefaultApi.md#getUsersMGetUsersA) | **GET** /api/usersquery | Get user info from database
[**loginUser**](DefaultApi.md#loginUser) | **POST** /api/login | Checks user/password to log in
[**moveStory**](DefaultApi.md#moveStory) | **PUT** /api/movestory | 
[**newSprint**](DefaultApi.md#newSprint) | **POST** /api/setsprint | 
[**setMember**](DefaultApi.md#setMember) | **POST** /api/postmember | 
[**setNewDesc**](DefaultApi.md#setNewDesc) | **PUT** /api/setnewdesc | 
[**setProject**](DefaultApi.md#setProject) | **POST** /api/postproject | Creates a project in the database
[**setStory**](DefaultApi.md#setStory) | **POST** /api/poststory | 
[**setUser**](DefaultApi.md#setUser) | **POST** /api/postuser | Post a user in the database
[**updRole**](DefaultApi.md#updRole) | **PUT** /api/updmemrole | 
[**updStoryCol**](DefaultApi.md#updStoryCol) | **PUT** /api/updstorycol | 
[**updateAll**](DefaultApi.md#updateAll) | **PUT** /api/allupd | Updates user&#39;s name and email
[**updateMail**](DefaultApi.md#updateMail) | **PUT** /api/mailupd | Updates user&#39;s email
[**updateName**](DefaultApi.md#updateName) | **PUT** /api/nameupd | Updates user&#39;s name
[**updatePass**](DefaultApi.md#updatePass) | **PUT** /api/passupd | Updates user&#39;s password


<a name="checkSprint"></a>
# **checkSprint**
> checkSprint(body)



Retrieves the current sprint&#39;s status

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Sprintstatus body = new Sprintstatus(); // Sprintstatus | 
try {
    apiInstance.checkSprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkSprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Sprintstatus**](Sprintstatus.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccount"></a>
# **deleteAccount**
> deleteAccount(body)



Deletes the user&#39;s account

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Deluserbody body = new Deluserbody(); // Deluserbody | 
try {
    apiInstance.deleteAccount(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Deluserbody**](Deluserbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMember"></a>
# **deleteMember**
> deleteMember(body)



Delete a member from a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Deletemember body = new Deletemember(); // Deletemember | 
try {
    apiInstance.deleteMember(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Deletemember**](Deletemember.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editStory"></a>
# **editStory**
> editStory(body)



Edits a story

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Editstory body = new Editstory(); // Editstory | 
try {
    apiInstance.editStory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#editStory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Editstory**](Editstory.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="endSprint"></a>
# **endSprint**
> endSprint(body)



Set the sprint&#39;s status to done

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Endsprint body = new Endsprint(); // Endsprint | 
try {
    apiInstance.endSprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#endSprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Endsprint**](Endsprint.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurSprint"></a>
# **getCurSprint**
> getCurSprint(body)



Gets the current sprint

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Currsprint body = new Currsprint(); // Currsprint | 
try {
    apiInstance.getCurSprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCurSprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Currsprint**](Currsprint.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMemebers"></a>
# **getMemebers**
> getMemebers(body)



Retrieves the members in a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Projmembody body = new Projmembody(); // Projmembody | 
try {
    apiInstance.getMemebers(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getMemebers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Projmembody**](Projmembody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNextSprint"></a>
# **getNextSprint**
> getNextSprint(body)



Gets a story&#39;s sprint

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Nextsprint body = new Nextsprint(); // Nextsprint | 
try {
    apiInstance.getNextSprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getNextSprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Nextsprint**](Nextsprint.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProject"></a>
# **getProject**
> getProject(body)

Returns last created project id

Query for returning the project id that had just been created

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Lastprojectbody body = new Lastprojectbody(); // Lastprojectbody | 
try {
    apiInstance.getProject(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Lastprojectbody**](Lastprojectbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProjectInfo"></a>
# **getProjectInfo**
> getProjectInfo(body)



Queries the given project&#39;s info as name and description

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Projectinfobody body = new Projectinfobody(); // Projectinfobody | 
try {
    apiInstance.getProjectInfo(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProjectInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Projectinfobody**](Projectinfobody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSprints"></a>
# **getSprints**
> getSprints(body)



Gets all the sprints in a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Getsprints body = new Getsprints(); // Getsprints | 
try {
    apiInstance.getSprints(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSprints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Getsprints**](Getsprints.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStories"></a>
# **getStories**
> getStories(body)



Retrieves a project&#39;s stories

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Getstories body = new Getstories(); // Getstories | 
try {
    apiInstance.getStories(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Getstories**](Getstories.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUnfinishedStories"></a>
# **getUnfinishedStories**
> getUnfinishedStories(body)



Retrieves all the stories that are not in the Done column

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Unfinishedstories body = new Unfinishedstories(); // Unfinishedstories | 
try {
    apiInstance.getUnfinishedStories(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUnfinishedStories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Unfinishedstories**](Unfinishedstories.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserInfo"></a>
# **getUserInfo**
> getUserInfo(body)

Queries info from the given user

Returns name, email and user id from the database with the given username

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Userbody body = new Userbody(); // Userbody | 
try {
    apiInstance.getUserInfo(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Userbody**](Userbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserName"></a>
# **getUserName**
> getUserName(body)



Returns a user&#39;s name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Usernamebody body = new Usernamebody(); // Usernamebody | 
try {
    apiInstance.getUserName(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Usernamebody**](Usernamebody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserProjects"></a>
# **getUserProjects**
> getUserProjects(body)

Returns the projects a user is in

Queries the project ids from the database with the given user id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Userprojectsbody body = new Userprojectsbody(); // Userprojectsbody | 
try {
    apiInstance.getUserProjects(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserProjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Userprojectsbody**](Userprojectsbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsersMGetUsersA"></a>
# **getUsersMGetUsersA**
> getUsersMGetUsersA()

Get user info from database

Get user id and username from every user in the database

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.getUsersMGetUsersA();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUsersMGetUsersA");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loginUser"></a>
# **loginUser**
> loginUser(body)

Checks user/password to log in

Grant user and password to confirm with the database of it&#39;s existance, proceeds to log in.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Loginbody body = new Loginbody(); // Loginbody | 
try {
    apiInstance.loginUser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#loginUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Loginbody**](Loginbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveStory"></a>
# **moveStory**
> moveStory(body)



Moves a story to another sprint

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Movestory body = new Movestory(); // Movestory | 
try {
    apiInstance.moveStory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#moveStory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Movestory**](Movestory.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newSprint"></a>
# **newSprint**
> newSprint(body)



Creates a sprint for the current project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Setsprint body = new Setsprint(); // Setsprint | 
try {
    apiInstance.newSprint(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#newSprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Setsprint**](Setsprint.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMember"></a>
# **setMember**
> setMember(body)



Inserts into the database every new member

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Memberbody body = new Memberbody(); // Memberbody | 
try {
    apiInstance.setMember(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Memberbody**](Memberbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setNewDesc"></a>
# **setNewDesc**
> setNewDesc(body)



Updates a project&#39;s description

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Setnewdescbody body = new Setnewdescbody(); // Setnewdescbody | 
try {
    apiInstance.setNewDesc(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setNewDesc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Setnewdescbody**](Setnewdescbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setProject"></a>
# **setProject**
> setProject(body)

Creates a project in the database

Creates a new project on the database with the given information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Postprojectbody body = new Postprojectbody(); // Postprojectbody | 
try {
    apiInstance.setProject(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Postprojectbody**](Postprojectbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setStory"></a>
# **setStory**
> setStory(body)



Creates a new story in the sprint

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Setstory body = new Setstory(); // Setstory | 
try {
    apiInstance.setStory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setStory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Setstory**](Setstory.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setUser"></a>
# **setUser**
> setUser(body)

Post a user in the database

Create a new user entry in the database.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Postuserbody body = new Postuserbody(); // Postuserbody | 
try {
    apiInstance.setUser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#setUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Postuserbody**](Postuserbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updRole"></a>
# **updRole**
> updRole(body)



Update a member&#39;s role in a project

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Updmemrole body = new Updmemrole(); // Updmemrole | 
try {
    apiInstance.updRole(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Updmemrole**](Updmemrole.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updStoryCol"></a>
# **updStoryCol**
> updStoryCol(body)



Updates the column a story is in

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Updstorycol body = new Updstorycol(); // Updstorycol | 
try {
    apiInstance.updStoryCol(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updStoryCol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Updstorycol**](Updstorycol.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAll"></a>
# **updateAll**
> updateAll(body)

Updates user&#39;s name and email

Updates the given username&#39;s name and email with the new given name and email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Allupdbody body = new Allupdbody(); // Allupdbody | 
try {
    apiInstance.updateAll(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Allupdbody**](Allupdbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMail"></a>
# **updateMail**
> updateMail(body)

Updates user&#39;s email

Updates the given username&#39;s email with the new given email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Emailupdbody body = new Emailupdbody(); // Emailupdbody | 
try {
    apiInstance.updateMail(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateMail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Emailupdbody**](Emailupdbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateName"></a>
# **updateName**
> updateName(body)

Updates user&#39;s name

Updates the given username&#39;s name with the new given name

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Nameupdbody body = new Nameupdbody(); // Nameupdbody | 
try {
    apiInstance.updateName(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Nameupdbody**](Nameupdbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePass"></a>
# **updatePass**
> updatePass(body)

Updates user&#39;s password

Updates the given username&#39;s password with the new given one

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Passupdbody body = new Passupdbody(); // Passupdbody | 
try {
    apiInstance.updatePass(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updatePass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Passupdbody**](Passupdbody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

