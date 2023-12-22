package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.Collections.IIterable
import Windows.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MapStyleSheet.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Maps.MapStyleSheet;{ae54b2bf-8991-42ed-8d58-20473deede1d})")
@WinRTByReference(brClass = MapStyleSheet.ByReference::class)
public class MapStyleSheet(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IMapStyleSheet.WithDefault, IWinRTObject {
  private val __1495814905_Interface: IMapStyleSheet.WithDefault by lazy {
    as_1495814905()
  }


  public override val __1495814905_Ptr: JNAPointer? by lazy {
    __1495814905_Interface.__1495814905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1495814905_Interface)

  private fun as_1495814905(): IMapStyleSheet.WithDefault {
    if(pointer == NULL) {
      return(IMapStyleSheet.ABI.makeIMapStyleSheet(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapStyleSheet>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapStyleSheet.ABI.makeIMapStyleSheet(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapStyleSheet>
      {
    public override fun getValue() = MapStyleSheet(pointer.getPointer(0))

    public fun setValue(value: MapStyleSheet): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapStyleSheet, MemoryAddress> {
    public val IMapStyleSheetStatics_Instance: IMapStyleSheetStatics by lazy {
      createIMapStyleSheetStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMapStyleSheetStatics(): IMapStyleSheetStatics {
      val refiid = Guid.REFIID(IMapStyleSheetStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Maps.MapStyleSheet".toHandle(),refiid,interfacePtr)
      val result = IMapStyleSheetStatics.ABI.makeIMapStyleSheetStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MapStyleSheet {
      val address = segment.toRawLongValue()
      return MapStyleSheet(Pointer(address))
    }

    public override fun toNative(obj: MapStyleSheet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Aerial() = ABI.IMapStyleSheetStatics_Instance.Aerial()

    public fun AerialWithOverlay() = ABI.IMapStyleSheetStatics_Instance.AerialWithOverlay()

    public fun RoadLight() = ABI.IMapStyleSheetStatics_Instance.RoadLight()

    public fun RoadDark() = ABI.IMapStyleSheetStatics_Instance.RoadDark()

    public fun RoadHighContrastLight() = ABI.IMapStyleSheetStatics_Instance.RoadHighContrastLight()

    public fun RoadHighContrastDark() = ABI.IMapStyleSheetStatics_Instance.RoadHighContrastDark()

    public fun Combine(styleSheets: IIterable<MapStyleSheet?>) =
        ABI.IMapStyleSheetStatics_Instance.Combine(styleSheets)

    public fun ParseFromJson(styleAsJson: String) =
        ABI.IMapStyleSheetStatics_Instance.ParseFromJson(styleAsJson)

    public fun TryParseFromJson(styleAsJson: String, styleSheet: ByReference) =
        ABI.IMapStyleSheetStatics_Instance.TryParseFromJson(styleAsJson, styleSheet)
  }
}
