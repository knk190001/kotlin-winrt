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

@ABIMarker(MapLocationFinderResult.ABI::class)
@Signature("rc(Windows.Services.Maps.MapLocationFinderResult;{43f1f179-e8cc-45f6-bed2-54ccbf965d9a})")
@WinRTByReference(brClass = MapLocationFinderResult.ByReference::class)
public class MapLocationFinderResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapLocationFinderResult.WithDefault, IWinRTObject {
  private val __895565049_Interface: IMapLocationFinderResult.WithDefault by lazy {
    as_895565049()
  }


  public override val __895565049_Ptr: JNAPointer? by lazy {
    __895565049_Interface.__895565049_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__895565049_Interface)

  private fun as_895565049(): IMapLocationFinderResult.WithDefault {
    if(pointer == NULL) {
      return(IMapLocationFinderResult.ABI.makeIMapLocationFinderResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapLocationFinderResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapLocationFinderResult.ABI.makeIMapLocationFinderResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MapLocationFinderResult> {
    public override fun getValue() = MapLocationFinderResult(pointer.getPointer(0))

    public fun setValue(value: MapLocationFinderResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapLocationFinderResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapLocationFinderResult {
      val address = segment.toRawLongValue()
      return MapLocationFinderResult(Pointer(address))
    }

    public override fun toNative(obj: MapLocationFinderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
