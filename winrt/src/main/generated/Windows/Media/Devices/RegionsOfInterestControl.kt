package Windows.Media.Devices

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

@ABIMarker(RegionsOfInterestControl.ABI::class)
@Signature("rc(Windows.Media.Devices.RegionsOfInterestControl;{c323f527-ab0b-4558-8b5b-df5693db0378})")
@WinRTByReference(brClass = RegionsOfInterestControl.ByReference::class)
public class RegionsOfInterestControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRegionsOfInterestControl.WithDefault, IWinRTObject {
  private val __683214882_Interface: IRegionsOfInterestControl.WithDefault by lazy {
    as_683214882()
  }


  public override val __683214882_Ptr: JNAPointer? by lazy {
    __683214882_Interface.__683214882_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__683214882_Interface)

  private fun as_683214882(): IRegionsOfInterestControl.WithDefault {
    if(pointer == NULL) {
      return(IRegionsOfInterestControl.ABI.makeIRegionsOfInterestControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRegionsOfInterestControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRegionsOfInterestControl.ABI.makeIRegionsOfInterestControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RegionsOfInterestControl> {
    public override fun getValue() = RegionsOfInterestControl(pointer.getPointer(0))

    public fun setValue(value: RegionsOfInterestControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RegionsOfInterestControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RegionsOfInterestControl {
      val address = segment.toRawLongValue()
      return RegionsOfInterestControl(Pointer(address))
    }

    public override fun toNative(obj: RegionsOfInterestControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
