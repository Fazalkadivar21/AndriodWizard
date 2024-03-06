import android.os.Bundle
//import android.text.Layout.Alignment
import android.text.style.BackgroundColorSpan
import androidx.activity.compose.*
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(modifier = Modifier.fillMaxWidth()){
                Text(
                    text = "hey , Fazal",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Normal,
                    color = Color.Magenta,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.LineThrough,
                    modifier = Modifier.padding(10.dp)
                )
                /*helps styling different parts of text
                * modified text ( "h" and "f" here) goes into withStyle function*/

                Text(

                    modifier = Modifier.padding(10.dp),
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 50.sp,
                                color = Color.Green
                            )
                        ) {
                            append("H")
                        }
                        append("ey, ")
                        withStyle(
                            style = SpanStyle(
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 50.sp,
                                color = Color.Green
                            )
                        ) {
                            append("F")
                        }
                        append("azal")
                    }
                )
            }
        }
    }
}