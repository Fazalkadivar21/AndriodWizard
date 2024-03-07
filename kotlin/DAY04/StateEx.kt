import android.os.Bundle
//import android.text.Layout.Alignment
import android.text.style.BackgroundColorSpan
import androidx.activity.compose.*
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.myapp.ui.theme.MyAppTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                //exemple of internal state
                BoxState1(
                    Modifier.clip(RectangleShape))
                /*exemple of external state
                * it is when one element is used to change other element's state*/
                val color = remember {
                    mutableStateOf(Color.Blue)
                }
                Spacer(modifier = Modifier.padding(10.dp))
                BoxState2(
                    Modifier
                        .fillMaxSize()
                        .height(250.dp)
                        .clip(RectangleShape)) {
                    color.value = it
                }
                Box(
                    modifier = Modifier
                        .background(
                            color.value
                        )
                        .fillMaxWidth()
                        .height(250.dp)
                        .clip(RectangleShape)
                )
            }
        }
    }
}

//exemple of internal state
@Composable
fun BoxState1(modifier: Modifier = Modifier) {
    var color = remember {
        mutableStateOf(Color.Red)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(color.value)
            .clickable {
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            }
    ){
        Text(text = "Click me and i will change my color")
    }
}
/*exemple of external state
* it is when one element is used to change other element's state*/

@Composable
fun BoxState2(
    modifier: Modifier = Modifier,
    upVar: (Color) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.Magenta)
            .clickable {
                upVar(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            }
    ){
        Text(text = "Click me and I will channge the Bellow box's color",
            color = Color.White
        )
    }
}