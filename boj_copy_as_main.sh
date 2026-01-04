#!/bin/bash
FILE="$1"

sed '/^package /d' "$FILE" \
| sed -E 's/public class[[:space:]]+[A-Za-z0-9_]+/public class Main/' \
| pbcopy

echo "✅ Copied to clipboard as 'public class Main' (package removed)"
EOF

chmod +x /Users/sojeong/study/algorithm/boj_copy_as_main.sh
