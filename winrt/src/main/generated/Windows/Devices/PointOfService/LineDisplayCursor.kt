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

@ABIMarker(LineDisplayCursor.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayCursor;{ecdffc45-754a-4e3b-ab2b-151181085605})")
@WinRTByReference(brClass = LineDisplayCursor.ByReference::class)
public class LineDisplayCursor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayCursor.WithDefault, IWinRTObject {
  private val __558063131_Interface: ILineDisplayCursor.WithDefault by lazy {
    as_558063131()
  }


  public override val __558063131_Ptr: JNAPointer? by lazy {
    __558063131_Interface.__558063131_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__558063131_Interface)

  private fun as_558063131(): ILineDisplayCursor.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayCursor.ABI.makeILineDisplayCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayCursor.ABI.makeILineDisplayCursor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayCursor> {
    public override fun getValue() = LineDisplayCursor(pointer.getPointer(0))

    public fun setValue(value: LineDisplayCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayCursor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayCursor {
      val address = segment.toRawLongValue()
      return LineDisplayCursor(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
