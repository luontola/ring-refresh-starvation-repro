1. Run `lein ring server-headless`
2. Open http://localhost:3000/ in a browser and also open network dev tools
3. Refresh the page tens of times
   - Or navigate from page to page. Chromium seems to get stuck after just a few page navigations. Firefox takes longer.
4. Eventually the `GET /` request gets stuck in pending state for tens of seconds  
