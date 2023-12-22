package Windows.Devices.PointOfService

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

@ABIMarker(LineDisplayMarquee.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayMarquee;{a3d33e3e-f46a-4b7a-bc21-53eb3b57f8b4})")
@WinRTByReference(brClass = LineDisplayMarquee.ByReference::class)
public class LineDisplayMarquee(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayMarquee.WithDefault, IWinRTObject {
  private val __407622797_Interface: ILineDisplayMarquee.WithDefault by lazy {
    as_407622797()
  }


  public override val __407622797_Ptr: JNAPointer? by lazy {
    __407622797_Interface.__407622797_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__407622797_Interface)

  private fun as_407622797(): ILineDisplayMarquee.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayMarquee.ABI.makeILineDisplayMarquee(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayMarquee>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayMarquee.ABI.makeILineDisplayMarquee(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayMarquee> {
    public override fun getValue() = LineDisplayMarquee(pointer.getPointer(0))

    public fun setValue(value: LineDisplayMarquee): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayMarquee, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayMarquee {
      val address = segment.toRawLongValue()
      return LineDisplayMarquee(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayMarquee): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
