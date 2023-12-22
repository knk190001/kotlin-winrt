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

@ABIMarker(CashDrawerEventSource.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawerEventSource;{e006e46c-f2f9-442f-8dd6-06c10a4227ba})")
@WinRTByReference(brClass = CashDrawerEventSource.ByReference::class)
public class CashDrawerEventSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawerEventSource.WithDefault, IWinRTObject {
  private val __37800178_Interface: ICashDrawerEventSource.WithDefault by lazy {
    as_37800178()
  }


  public override val __37800178_Ptr: JNAPointer? by lazy {
    __37800178_Interface.__37800178_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__37800178_Interface)

  private fun as_37800178(): ICashDrawerEventSource.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawerEventSource.ABI.makeICashDrawerEventSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawerEventSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawerEventSource.ABI.makeICashDrawerEventSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CashDrawerEventSource> {
    public override fun getValue() = CashDrawerEventSource(pointer.getPointer(0))

    public fun setValue(value: CashDrawerEventSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawerEventSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CashDrawerEventSource {
      val address = segment.toRawLongValue()
      return CashDrawerEventSource(Pointer(address))
    }

    public override fun toNative(obj: CashDrawerEventSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
