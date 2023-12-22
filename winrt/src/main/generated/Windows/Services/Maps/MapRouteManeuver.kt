package Windows.Services.Maps

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

@ABIMarker(MapRouteManeuver.ABI::class)
@Signature("rc(Windows.Services.Maps.MapRouteManeuver;{ed5c17f0-a6ab-4d65-a086-fa8a7e340df2})")
@WinRTByReference(brClass = MapRouteManeuver.ByReference::class)
public class MapRouteManeuver(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapRouteManeuver.WithDefault, IMapRouteManeuver2.WithDefault,
    IMapRouteManeuver3.WithDefault, IWinRTObject {
  private val __1105241773_Interface: IMapRouteManeuver.WithDefault by lazy {
    as_1105241773()
  }


  private val __97243455_Interface: IMapRouteManeuver2.WithDefault by lazy {
    as_97243455()
  }


  private val __97243456_Interface: IMapRouteManeuver3.WithDefault by lazy {
    as_97243456()
  }


  public override val __1105241773_Ptr: JNAPointer? by lazy {
    __1105241773_Interface.__1105241773_Ptr
  }


  public override val __97243455_Ptr: JNAPointer? by lazy {
    __97243455_Interface.__97243455_Ptr
  }


  public override val __97243456_Ptr: JNAPointer? by lazy {
    __97243456_Interface.__97243456_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1105241773_Interface, __97243455_Interface, __97243456_Interface)

  private fun as_1105241773(): IMapRouteManeuver.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteManeuver.ABI.makeIMapRouteManeuver(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteManeuver>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteManeuver.ABI.makeIMapRouteManeuver(ref.value))
  }

  private fun as_97243455(): IMapRouteManeuver2.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteManeuver2.ABI.makeIMapRouteManeuver2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteManeuver2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteManeuver2.ABI.makeIMapRouteManeuver2(ref.value))
  }

  private fun as_97243456(): IMapRouteManeuver3.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteManeuver3.ABI.makeIMapRouteManeuver3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteManeuver3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteManeuver3.ABI.makeIMapRouteManeuver3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapRouteManeuver> {
    public override fun getValue() = MapRouteManeuver(pointer.getPointer(0))

    public fun setValue(value: MapRouteManeuver): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRouteManeuver, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapRouteManeuver {
      val address = segment.toRawLongValue()
      return MapRouteManeuver(Pointer(address))
    }

    public override fun toNative(obj: MapRouteManeuver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
