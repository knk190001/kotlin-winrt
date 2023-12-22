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

@ABIMarker(LineDisplayAttributes.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayAttributes;{c17de99c-229a-4c14-a6f1-b4e4b1fead92})")
@WinRTByReference(brClass = LineDisplayAttributes.ByReference::class)
public class LineDisplayAttributes(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayAttributes.WithDefault, IWinRTObject {
  private val __490494054_Interface: ILineDisplayAttributes.WithDefault by lazy {
    as_490494054()
  }


  public override val __490494054_Ptr: JNAPointer? by lazy {
    __490494054_Interface.__490494054_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__490494054_Interface)

  private fun as_490494054(): ILineDisplayAttributes.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayAttributes.ABI.makeILineDisplayAttributes(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayAttributes>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayAttributes.ABI.makeILineDisplayAttributes(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayAttributes> {
    public override fun getValue() = LineDisplayAttributes(pointer.getPointer(0))

    public fun setValue(value: LineDisplayAttributes): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayAttributes, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayAttributes {
      val address = segment.toRawLongValue()
      return LineDisplayAttributes(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
