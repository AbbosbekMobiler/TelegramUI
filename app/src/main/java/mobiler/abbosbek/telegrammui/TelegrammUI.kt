package mobiler.abbosbek.telegrammui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelegramUI() {

    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(name = "Foydalanuvchi", modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.height(4.dp))

        PostTabView(imageWithText = listOf(
            ImageWithText(image = painterResource(id = R.drawable.ic_grid_com), name = "Bosh Sahifa", title = ""),
            ImageWithText(image = painterResource(id = R.drawable.ic_profile), name = "Bosh Sahifa", title = ""),
            ImageWithText(image = painterResource(id = R.drawable.ic_groups), name = "Bosh Sahifa", title = ""),
            ImageWithText(image = painterResource(id = R.drawable.ic_channels), name = "Bosh Sahifa", title = ""),
            ImageWithText(image = painterResource(id = R.drawable.ic_robot), name = "Bosh Sahifa", title = ""),
        )){
            selectedTabIndex = it
        }

        when(selectedTabIndex){
            0 -> PostSection(posts = listOf(
                ImageWithText(image = painterResource(id = R.drawable.inline), name = "Inline-Live", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.quranuz), name = "Quran.UZ", title = "Inson uchun eng yaxshi libos"),
                ImageWithText(image = painterResource(id = R.drawable.mubashshirahmad), name = "Mubashshir Ahmad", title = "Imom Abul Abbos Ahmad Zarruq"),
                ImageWithText(image = painterResource(id = R.drawable.arabicuz), name = "Arabic.uz(hikmatlar)", title = "Umidsizlikka tushib qoldingizmi...(unda ushbu"),
                ImageWithText(image = painterResource(id = R.drawable.kitoblar), name = "Kitoblar Xo'jand", title = "Ma'naviy yetimlik qanday bo'ladi"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "Kompyuterni Tashkillashtirish", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "Ehtimollar va Statistika", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "DIK ISE 004-2", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.yakubov), name = "Javohir Yakubov #android", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.sinfdoshlar), name = "4-DIMI SINFDOSHLAR", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.tgscan), name = "TgScanRobot", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.azizbek), name = "A.Azizbek", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.mobilerblog), name = "Mobiler-Blogs", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "Inline-Live", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "Inline-Live", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "Inline-Live", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
                ImageWithText(image = painterResource(id = R.drawable.abbosbek), name = "Inline-Live", title = "Avgustni kutmang, bugunoq talaba bo''ling"),
            ))
        }
    }
}

@Composable
fun TopBar(
    name : String,
    modifier: Modifier = Modifier
) {
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.abbosbek),
            contentDescription = "Abbosbek",
            modifier = Modifier
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color.White,
                    shape = CircleShape
                )
                .size(55.dp)
        )
        Text(
            text = name,
            overflow = TextOverflow.Ellipsis,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Icon(
            imageVector = Icons.Default.Lock,
            contentDescription = "Lock",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Lock",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "VertMenu",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
    }
}


@Composable
fun PostTabView(
    modifier: Modifier = Modifier,
    imageWithText: List<ImageWithText>,
    onTabSelected : (selectedIndex : Int) -> Unit
) {
    var selectedIndex by remember {
        mutableStateOf(0)
    }

    val inactiveColor = Color(0xFF777777)

    TabRow(selectedTabIndex = selectedIndex,
        backgroundColor = Color.Transparent,
        contentColor = Color.Black,
        modifier = modifier) {
        imageWithText.forEachIndexed { index, item ->
            Tab(
                selected = selectedIndex == 0,
                selectedContentColor = Color.Black,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedIndex = index
                    onTabSelected(index)
                }
            ){
                Icon(
                    item.image,
                    contentDescription = item.name,
                    tint = if (selectedIndex == index) Color.Black else inactiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(24.dp)
                )
            }
        }
    }
}


@Composable
fun PostSection(
    posts : List<ImageWithText>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = Modifier.scale(1.0f)){
        items(posts.size){
            Box(modifier = modifier.padding(12.dp), contentAlignment = Alignment.Center){
                Row(modifier = modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = posts[it].image,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.White
                            )
                            .clip(CircleShape)
                            .size(60.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Column(
                        modifier = Modifier.fillMaxWidth().padding(top = 4.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth().padding(start = 8.dp),
                            text = posts[it].name,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Start
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth().padding(start = 8.dp),
                            text = posts[it].title,
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            textAlign = TextAlign.Start,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1
                        )
                    }
                }
            }
        }
    }
}