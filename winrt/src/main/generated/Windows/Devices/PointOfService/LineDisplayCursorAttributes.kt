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

@ABIMarker(LineDisplayCursorAttributes.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayCursorAttributes;{4e2d54fe-4ffd-4190-aae1-ce285f20c896})")
@WinRTByReference(brClass = LineDisplayCursorAttributes.ByReference::class)
public class LineDisplayCursorAttributes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayCursorAttributes.WithDefault, IWinRTObject {
  private val __934989084_Interface: ILineDisplayCursorAttributes.WithDefault by lazy {
    as_934989084()
  }


  public override val __934989084_Ptr: JNAPointer? by lazy {
    __934989084_Interface.__934989084_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__934989084_Interface)

  private fun as_934989084(): ILineDisplayCursorAttributes.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayCursorAttributes.ABI.makeILineDisplayCursorAttributes(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayCursorAttributes>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayCursorAttributes.ABI.makeILineDisplayCursorAttributes(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayCursorAttributes> {
    public override fun getValue() = LineDisplayCursorAttributes(pointer.getPointer(0))

    public fun setValue(value: LineDisplayCursorAttributes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayCursorAttributes, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayCursorAttributes {
      val address = segment.toRawLongValue()
      return LineDisplayCursorAttributes(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayCursorAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
