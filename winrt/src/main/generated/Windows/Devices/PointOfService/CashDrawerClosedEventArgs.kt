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

@ABIMarker(CashDrawerClosedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.CashDrawerClosedEventArgs;{69cb3bc1-147f-421c-9c23-090123bb786c})")
@WinRTByReference(brClass = CashDrawerClosedEventArgs.ByReference::class)
public class CashDrawerClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICashDrawerEventSourceEventArgs.WithDefault, IWinRTObject {
  private val __1289101765_Interface: ICashDrawerEventSourceEventArgs.WithDefault by lazy {
    as_1289101765()
  }


  public override val __1289101765_Ptr: JNAPointer? by lazy {
    __1289101765_Interface.__1289101765_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1289101765_Interface)

  private fun as_1289101765(): ICashDrawerEventSourceEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICashDrawerEventSourceEventArgs.ABI.makeICashDrawerEventSourceEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICashDrawerEventSourceEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICashDrawerEventSourceEventArgs.ABI.makeICashDrawerEventSourceEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CashDrawerClosedEventArgs> {
    public override fun getValue() = CashDrawerClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CashDrawerClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CashDrawerClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CashDrawerClosedEventArgs {
      val address = segment.toRawLongValue()
      return CashDrawerClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CashDrawerClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
