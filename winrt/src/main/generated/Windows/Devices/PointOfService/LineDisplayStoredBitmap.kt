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

@ABIMarker(LineDisplayStoredBitmap.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.LineDisplayStoredBitmap;{f621515b-d81e-43ba-bf1b-bcfa3c785ba0})")
@WinRTByReference(brClass = LineDisplayStoredBitmap.ByReference::class)
public class LineDisplayStoredBitmap(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILineDisplayStoredBitmap.WithDefault, IWinRTObject {
  private val __146628095_Interface: ILineDisplayStoredBitmap.WithDefault by lazy {
    as_146628095()
  }


  public override val __146628095_Ptr: JNAPointer? by lazy {
    __146628095_Interface.__146628095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__146628095_Interface)

  private fun as_146628095(): ILineDisplayStoredBitmap.WithDefault {
    if(pointer == NULL) {
      return(ILineDisplayStoredBitmap.ABI.makeILineDisplayStoredBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineDisplayStoredBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineDisplayStoredBitmap.ABI.makeILineDisplayStoredBitmap(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LineDisplayStoredBitmap> {
    public override fun getValue() = LineDisplayStoredBitmap(pointer.getPointer(0))

    public fun setValue(value: LineDisplayStoredBitmap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineDisplayStoredBitmap, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LineDisplayStoredBitmap {
      val address = segment.toRawLongValue()
      return LineDisplayStoredBitmap(Pointer(address))
    }

    public override fun toNative(obj: LineDisplayStoredBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
