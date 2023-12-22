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

@ABIMarker(CashDrawerStatus.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawerStatus;{6bbd78bf-dca1-4e06-99eb-5af6a5aec108})")
@WinRTByReference(brClass = CashDrawerStatus.ByReference::class)
public class CashDrawerStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawerStatus.WithDefault, IWinRTObject {
  private val __1272194101_Interface: ICashDrawerStatus.WithDefault by lazy {
    as_1272194101()
  }


  public override val __1272194101_Ptr: JNAPointer? by lazy {
    __1272194101_Interface.__1272194101_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1272194101_Interface)

  private fun as_1272194101(): ICashDrawerStatus.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawerStatus.ABI.makeICashDrawerStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawerStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawerStatus.ABI.makeICashDrawerStatus(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CashDrawerStatus> {
    public override fun getValue() = CashDrawerStatus(pointer.getPointer(0))

    public fun setValue(value: CashDrawerStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawerStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CashDrawerStatus {
      val address = segment.toRawLongValue()
      return CashDrawerStatus(Pointer(address))
    }

    public override fun toNative(obj: CashDrawerStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
