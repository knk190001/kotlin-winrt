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

@ABIMarker(MapRouteFinderResult.ABI::class)
@Signature("rc(Windows.Services.Maps.MapRouteFinderResult;{a868a31a-9422-46ac-8ca1-b1614d4bfbe2})")
@WinRTByReference(brClass = MapRouteFinderResult.ByReference::class)
public class MapRouteFinderResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapRouteFinderResult.WithDefault, IMapRouteFinderResult2.WithDefault,
    IWinRTObject {
  private val __339139491_Interface: IMapRouteFinderResult.WithDefault by lazy {
    as_339139491()
  }


  private val __1923389579_Interface: IMapRouteFinderResult2.WithDefault by lazy {
    as_1923389579()
  }


  public override val __339139491_Ptr: JNAPointer? by lazy {
    __339139491_Interface.__339139491_Ptr
  }


  public override val __1923389579_Ptr: JNAPointer? by lazy {
    __1923389579_Interface.__1923389579_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__339139491_Interface, __1923389579_Interface)

  private fun as_339139491(): IMapRouteFinderResult.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteFinderResult.ABI.makeIMapRouteFinderResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteFinderResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteFinderResult.ABI.makeIMapRouteFinderResult(ref.value))
  }

  private fun as_1923389579(): IMapRouteFinderResult2.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteFinderResult2.ABI.makeIMapRouteFinderResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteFinderResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteFinderResult2.ABI.makeIMapRouteFinderResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapRouteFinderResult> {
    public override fun getValue() = MapRouteFinderResult(pointer.getPointer(0))

    public fun setValue(value: MapRouteFinderResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRouteFinderResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapRouteFinderResult {
      val address = segment.toRawLongValue()
      return MapRouteFinderResult(Pointer(address))
    }

    public override fun toNative(obj: MapRouteFinderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
