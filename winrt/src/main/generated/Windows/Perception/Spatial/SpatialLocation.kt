package Windows.Perception.Spatial

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

@ABIMarker(SpatialLocation.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialLocation;{1d81d29d-24a1-37d5-8fa1-39b4f9ad67e2})")
@WinRTByReference(brClass = SpatialLocation.ByReference::class)
public class SpatialLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialLocation.WithDefault, ISpatialLocation2.WithDefault, IWinRTObject {
  private val __895281290_Interface: ISpatialLocation.WithDefault by lazy {
    as_895281290()
  }


  private val __1983916164_Interface: ISpatialLocation2.WithDefault by lazy {
    as_1983916164()
  }


  public override val __895281290_Ptr: JNAPointer? by lazy {
    __895281290_Interface.__895281290_Ptr
  }


  public override val __1983916164_Ptr: JNAPointer? by lazy {
    __1983916164_Interface.__1983916164_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__895281290_Interface, __1983916164_Interface)

  private fun as_895281290(): ISpatialLocation.WithDefault {
    if(pointer == NULL) {
      return(ISpatialLocation.ABI.makeISpatialLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialLocation.ABI.makeISpatialLocation(ref.value))
  }

  private fun as_1983916164(): ISpatialLocation2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialLocation2.ABI.makeISpatialLocation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialLocation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialLocation2.ABI.makeISpatialLocation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialLocation> {
    public override fun getValue() = SpatialLocation(pointer.getPointer(0))

    public fun setValue(value: SpatialLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialLocation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialLocation {
      val address = segment.toRawLongValue()
      return SpatialLocation(Pointer(address))
    }

    public override fun toNative(obj: SpatialLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
