This question involves extracting the history from the archived files and locate the flag.

Since we already know that it is running firefox, we now know what file to hunt for.

We need the places.sqlite file.

Once you find the file let's examine the internals.
![Mount_Image](/Herbert/Places/examine.png?raw=true)

As we can see it seems like a pretty normal places.sqlite file for firefox, so let's run a SQL command to extract the information about history.
SELECT datetime(moz_historyvisits.visit_date/1000000, 'unixepoch', 'localtime'), moz_places.url FROM moz_places, moz_historyvisits WHERE moz_places.id = moz_historyvisits.place_id;

Once we get the results, export the file and see what we have.

As we see in the results there is one search entry that catches our eye.
2017-09-20 21:37:19,https://search.yahoo.com/yhs/search?p=flag%7Bshhh_we_n3eded_the_story_to_continue%7D

The flag is: flag{shhh_we_n3eded_the_story_to_continue}