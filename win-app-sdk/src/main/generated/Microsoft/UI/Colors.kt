package Microsoft.UI

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Colors.ABI::class)
@Signature("rc(Microsoft.UI.Colors;{8cf15863-8411-5afd-946c-328e04da2f2f})")
@WinRTByReference(brClass = Colors.ByReference::class)
public class Colors(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IColors.WithDefault, IWinRTObject {
  private val __836521755_Interface: IColors.WithDefault by lazy {
    as_836521755()
  }


  public override val __836521755_Ptr: JNAPointer? by lazy {
    __836521755_Interface.__836521755_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__836521755_Interface)

  private fun as_836521755(): IColors.WithDefault {
    if(pointer == NULL) {
      return(IColors.ABI.makeIColors(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColors>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColors.ABI.makeIColors(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Colors> {
    public override fun getValue() = Colors(pointer.getPointer(0))

    public fun setValue(value: Colors): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Colors, MemoryAddress> {
    public val IColorsStatics_Instance: IColorsStatics by lazy {
      createIColorsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorsStatics(): IColorsStatics {
      val refiid = Guid.REFIID(IColorsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Colors".toHandle(),refiid,interfacePtr)
      val result = IColorsStatics.ABI.makeIColorsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Colors {
      val address = segment.toRawLongValue()
      return Colors(Pointer(address))
    }

    public override fun toNative(obj: Colors): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AliceBlue() = ABI.IColorsStatics_Instance.get_AliceBlue()

    public fun get_AntiqueWhite() = ABI.IColorsStatics_Instance.get_AntiqueWhite()

    public fun get_Aqua() = ABI.IColorsStatics_Instance.get_Aqua()

    public fun get_Aquamarine() = ABI.IColorsStatics_Instance.get_Aquamarine()

    public fun get_Azure() = ABI.IColorsStatics_Instance.get_Azure()

    public fun get_Beige() = ABI.IColorsStatics_Instance.get_Beige()

    public fun get_Bisque() = ABI.IColorsStatics_Instance.get_Bisque()

    public fun get_Black() = ABI.IColorsStatics_Instance.get_Black()

    public fun get_BlanchedAlmond() = ABI.IColorsStatics_Instance.get_BlanchedAlmond()

    public fun get_Blue() = ABI.IColorsStatics_Instance.get_Blue()

    public fun get_BlueViolet() = ABI.IColorsStatics_Instance.get_BlueViolet()

    public fun get_Brown() = ABI.IColorsStatics_Instance.get_Brown()

    public fun get_BurlyWood() = ABI.IColorsStatics_Instance.get_BurlyWood()

    public fun get_CadetBlue() = ABI.IColorsStatics_Instance.get_CadetBlue()

    public fun get_Chartreuse() = ABI.IColorsStatics_Instance.get_Chartreuse()

    public fun get_Chocolate() = ABI.IColorsStatics_Instance.get_Chocolate()

    public fun get_Coral() = ABI.IColorsStatics_Instance.get_Coral()

    public fun get_CornflowerBlue() = ABI.IColorsStatics_Instance.get_CornflowerBlue()

    public fun get_Cornsilk() = ABI.IColorsStatics_Instance.get_Cornsilk()

    public fun get_Crimson() = ABI.IColorsStatics_Instance.get_Crimson()

    public fun get_Cyan() = ABI.IColorsStatics_Instance.get_Cyan()

    public fun get_DarkBlue() = ABI.IColorsStatics_Instance.get_DarkBlue()

    public fun get_DarkCyan() = ABI.IColorsStatics_Instance.get_DarkCyan()

    public fun get_DarkGoldenrod() = ABI.IColorsStatics_Instance.get_DarkGoldenrod()

    public fun get_DarkGray() = ABI.IColorsStatics_Instance.get_DarkGray()

    public fun get_DarkGreen() = ABI.IColorsStatics_Instance.get_DarkGreen()

    public fun get_DarkKhaki() = ABI.IColorsStatics_Instance.get_DarkKhaki()

    public fun get_DarkMagenta() = ABI.IColorsStatics_Instance.get_DarkMagenta()

    public fun get_DarkOliveGreen() = ABI.IColorsStatics_Instance.get_DarkOliveGreen()

    public fun get_DarkOrange() = ABI.IColorsStatics_Instance.get_DarkOrange()

    public fun get_DarkOrchid() = ABI.IColorsStatics_Instance.get_DarkOrchid()

    public fun get_DarkRed() = ABI.IColorsStatics_Instance.get_DarkRed()

    public fun get_DarkSalmon() = ABI.IColorsStatics_Instance.get_DarkSalmon()

    public fun get_DarkSeaGreen() = ABI.IColorsStatics_Instance.get_DarkSeaGreen()

    public fun get_DarkSlateBlue() = ABI.IColorsStatics_Instance.get_DarkSlateBlue()

    public fun get_DarkSlateGray() = ABI.IColorsStatics_Instance.get_DarkSlateGray()

    public fun get_DarkTurquoise() = ABI.IColorsStatics_Instance.get_DarkTurquoise()

    public fun get_DarkViolet() = ABI.IColorsStatics_Instance.get_DarkViolet()

    public fun get_DeepPink() = ABI.IColorsStatics_Instance.get_DeepPink()

    public fun get_DeepSkyBlue() = ABI.IColorsStatics_Instance.get_DeepSkyBlue()

    public fun get_DimGray() = ABI.IColorsStatics_Instance.get_DimGray()

    public fun get_DodgerBlue() = ABI.IColorsStatics_Instance.get_DodgerBlue()

    public fun get_Firebrick() = ABI.IColorsStatics_Instance.get_Firebrick()

    public fun get_FloralWhite() = ABI.IColorsStatics_Instance.get_FloralWhite()

    public fun get_ForestGreen() = ABI.IColorsStatics_Instance.get_ForestGreen()

    public fun get_Fuchsia() = ABI.IColorsStatics_Instance.get_Fuchsia()

    public fun get_Gainsboro() = ABI.IColorsStatics_Instance.get_Gainsboro()

    public fun get_GhostWhite() = ABI.IColorsStatics_Instance.get_GhostWhite()

    public fun get_Gold() = ABI.IColorsStatics_Instance.get_Gold()

    public fun get_Goldenrod() = ABI.IColorsStatics_Instance.get_Goldenrod()

    public fun get_Gray() = ABI.IColorsStatics_Instance.get_Gray()

    public fun get_Green() = ABI.IColorsStatics_Instance.get_Green()

    public fun get_GreenYellow() = ABI.IColorsStatics_Instance.get_GreenYellow()

    public fun get_Honeydew() = ABI.IColorsStatics_Instance.get_Honeydew()

    public fun get_HotPink() = ABI.IColorsStatics_Instance.get_HotPink()

    public fun get_IndianRed() = ABI.IColorsStatics_Instance.get_IndianRed()

    public fun get_Indigo() = ABI.IColorsStatics_Instance.get_Indigo()

    public fun get_Ivory() = ABI.IColorsStatics_Instance.get_Ivory()

    public fun get_Khaki() = ABI.IColorsStatics_Instance.get_Khaki()

    public fun get_Lavender() = ABI.IColorsStatics_Instance.get_Lavender()

    public fun get_LavenderBlush() = ABI.IColorsStatics_Instance.get_LavenderBlush()

    public fun get_LawnGreen() = ABI.IColorsStatics_Instance.get_LawnGreen()

    public fun get_LemonChiffon() = ABI.IColorsStatics_Instance.get_LemonChiffon()

    public fun get_LightBlue() = ABI.IColorsStatics_Instance.get_LightBlue()

    public fun get_LightCoral() = ABI.IColorsStatics_Instance.get_LightCoral()

    public fun get_LightCyan() = ABI.IColorsStatics_Instance.get_LightCyan()

    public fun get_LightGoldenrodYellow() = ABI.IColorsStatics_Instance.get_LightGoldenrodYellow()

    public fun get_LightGreen() = ABI.IColorsStatics_Instance.get_LightGreen()

    public fun get_LightGray() = ABI.IColorsStatics_Instance.get_LightGray()

    public fun get_LightPink() = ABI.IColorsStatics_Instance.get_LightPink()

    public fun get_LightSalmon() = ABI.IColorsStatics_Instance.get_LightSalmon()

    public fun get_LightSeaGreen() = ABI.IColorsStatics_Instance.get_LightSeaGreen()

    public fun get_LightSkyBlue() = ABI.IColorsStatics_Instance.get_LightSkyBlue()

    public fun get_LightSlateGray() = ABI.IColorsStatics_Instance.get_LightSlateGray()

    public fun get_LightSteelBlue() = ABI.IColorsStatics_Instance.get_LightSteelBlue()

    public fun get_LightYellow() = ABI.IColorsStatics_Instance.get_LightYellow()

    public fun get_Lime() = ABI.IColorsStatics_Instance.get_Lime()

    public fun get_LimeGreen() = ABI.IColorsStatics_Instance.get_LimeGreen()

    public fun get_Linen() = ABI.IColorsStatics_Instance.get_Linen()

    public fun get_Magenta() = ABI.IColorsStatics_Instance.get_Magenta()

    public fun get_Maroon() = ABI.IColorsStatics_Instance.get_Maroon()

    public fun get_MediumAquamarine() = ABI.IColorsStatics_Instance.get_MediumAquamarine()

    public fun get_MediumBlue() = ABI.IColorsStatics_Instance.get_MediumBlue()

    public fun get_MediumOrchid() = ABI.IColorsStatics_Instance.get_MediumOrchid()

    public fun get_MediumPurple() = ABI.IColorsStatics_Instance.get_MediumPurple()

    public fun get_MediumSeaGreen() = ABI.IColorsStatics_Instance.get_MediumSeaGreen()

    public fun get_MediumSlateBlue() = ABI.IColorsStatics_Instance.get_MediumSlateBlue()

    public fun get_MediumSpringGreen() = ABI.IColorsStatics_Instance.get_MediumSpringGreen()

    public fun get_MediumTurquoise() = ABI.IColorsStatics_Instance.get_MediumTurquoise()

    public fun get_MediumVioletRed() = ABI.IColorsStatics_Instance.get_MediumVioletRed()

    public fun get_MidnightBlue() = ABI.IColorsStatics_Instance.get_MidnightBlue()

    public fun get_MintCream() = ABI.IColorsStatics_Instance.get_MintCream()

    public fun get_MistyRose() = ABI.IColorsStatics_Instance.get_MistyRose()

    public fun get_Moccasin() = ABI.IColorsStatics_Instance.get_Moccasin()

    public fun get_NavajoWhite() = ABI.IColorsStatics_Instance.get_NavajoWhite()

    public fun get_Navy() = ABI.IColorsStatics_Instance.get_Navy()

    public fun get_OldLace() = ABI.IColorsStatics_Instance.get_OldLace()

    public fun get_Olive() = ABI.IColorsStatics_Instance.get_Olive()

    public fun get_OliveDrab() = ABI.IColorsStatics_Instance.get_OliveDrab()

    public fun get_Orange() = ABI.IColorsStatics_Instance.get_Orange()

    public fun get_OrangeRed() = ABI.IColorsStatics_Instance.get_OrangeRed()

    public fun get_Orchid() = ABI.IColorsStatics_Instance.get_Orchid()

    public fun get_PaleGoldenrod() = ABI.IColorsStatics_Instance.get_PaleGoldenrod()

    public fun get_PaleGreen() = ABI.IColorsStatics_Instance.get_PaleGreen()

    public fun get_PaleTurquoise() = ABI.IColorsStatics_Instance.get_PaleTurquoise()

    public fun get_PaleVioletRed() = ABI.IColorsStatics_Instance.get_PaleVioletRed()

    public fun get_PapayaWhip() = ABI.IColorsStatics_Instance.get_PapayaWhip()

    public fun get_PeachPuff() = ABI.IColorsStatics_Instance.get_PeachPuff()

    public fun get_Peru() = ABI.IColorsStatics_Instance.get_Peru()

    public fun get_Pink() = ABI.IColorsStatics_Instance.get_Pink()

    public fun get_Plum() = ABI.IColorsStatics_Instance.get_Plum()

    public fun get_PowderBlue() = ABI.IColorsStatics_Instance.get_PowderBlue()

    public fun get_Purple() = ABI.IColorsStatics_Instance.get_Purple()

    public fun get_Red() = ABI.IColorsStatics_Instance.get_Red()

    public fun get_RosyBrown() = ABI.IColorsStatics_Instance.get_RosyBrown()

    public fun get_RoyalBlue() = ABI.IColorsStatics_Instance.get_RoyalBlue()

    public fun get_SaddleBrown() = ABI.IColorsStatics_Instance.get_SaddleBrown()

    public fun get_Salmon() = ABI.IColorsStatics_Instance.get_Salmon()

    public fun get_SandyBrown() = ABI.IColorsStatics_Instance.get_SandyBrown()

    public fun get_SeaGreen() = ABI.IColorsStatics_Instance.get_SeaGreen()

    public fun get_SeaShell() = ABI.IColorsStatics_Instance.get_SeaShell()

    public fun get_Sienna() = ABI.IColorsStatics_Instance.get_Sienna()

    public fun get_Silver() = ABI.IColorsStatics_Instance.get_Silver()

    public fun get_SkyBlue() = ABI.IColorsStatics_Instance.get_SkyBlue()

    public fun get_SlateBlue() = ABI.IColorsStatics_Instance.get_SlateBlue()

    public fun get_SlateGray() = ABI.IColorsStatics_Instance.get_SlateGray()

    public fun get_Snow() = ABI.IColorsStatics_Instance.get_Snow()

    public fun get_SpringGreen() = ABI.IColorsStatics_Instance.get_SpringGreen()

    public fun get_SteelBlue() = ABI.IColorsStatics_Instance.get_SteelBlue()

    public fun get_Tan() = ABI.IColorsStatics_Instance.get_Tan()

    public fun get_Teal() = ABI.IColorsStatics_Instance.get_Teal()

    public fun get_Thistle() = ABI.IColorsStatics_Instance.get_Thistle()

    public fun get_Tomato() = ABI.IColorsStatics_Instance.get_Tomato()

    public fun get_Transparent() = ABI.IColorsStatics_Instance.get_Transparent()

    public fun get_Turquoise() = ABI.IColorsStatics_Instance.get_Turquoise()

    public fun get_Violet() = ABI.IColorsStatics_Instance.get_Violet()

    public fun get_Wheat() = ABI.IColorsStatics_Instance.get_Wheat()

    public fun get_White() = ABI.IColorsStatics_Instance.get_White()

    public fun get_WhiteSmoke() = ABI.IColorsStatics_Instance.get_WhiteSmoke()

    public fun get_Yellow() = ABI.IColorsStatics_Instance.get_Yellow()

    public fun get_YellowGreen() = ABI.IColorsStatics_Instance.get_YellowGreen()
  }
}
