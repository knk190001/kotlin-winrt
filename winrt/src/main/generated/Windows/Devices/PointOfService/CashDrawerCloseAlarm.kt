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

@ABIMarker(CashDrawerCloseAlarm.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawerCloseAlarm;{6bf88cc7-6f63-430e-ab3b-95d75ffbe87f})")
@WinRTByReference(brClass = CashDrawerCloseAlarm.ByReference::class)
public class CashDrawerCloseAlarm(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawerCloseAlarm.WithDefault, IWinRTObject {
  private val __1260314116_Interface: ICashDrawerCloseAlarm.WithDefault by lazy {
    as_1260314116()
  }


  public override val __1260314116_Ptr: JNAPointer? by lazy {
    __1260314116_Interface.__1260314116_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1260314116_Interface)

  private fun as_1260314116(): ICashDrawerCloseAlarm.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawerCloseAlarm.ABI.makeICashDrawerCloseAlarm(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawerCloseAlarm>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawerCloseAlarm.ABI.makeICashDrawerCloseAlarm(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CashDrawerCloseAlarm> {
    public override fun getValue() = CashDrawerCloseAlarm(pointer.getPointer(0))

    public fun setValue(value: CashDrawerCloseAlarm): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawerCloseAlarm, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CashDrawerCloseAlarm {
      val address = segment.toRawLongValue()
      return CashDrawerCloseAlarm(Pointer(address))
    }

    public override fun toNative(obj: CashDrawerCloseAlarm): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
