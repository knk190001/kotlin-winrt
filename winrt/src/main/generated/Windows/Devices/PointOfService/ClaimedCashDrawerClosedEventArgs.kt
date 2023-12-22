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

@ABIMarker(ClaimedCashDrawerClosedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedCashDrawerClosedEventArgs;{cc573f33-3f34-4c5c-baae-deadf16cd7fa})")
@WinRTByReference(brClass = ClaimedCashDrawerClosedEventArgs.ByReference::class)
public class ClaimedCashDrawerClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedCashDrawerClosedEventArgs.WithDefault, IWinRTObject {
  private val __1700206229_Interface: IClaimedCashDrawerClosedEventArgs.WithDefault by lazy {
    as_1700206229()
  }


  public override val __1700206229_Ptr: JNAPointer? by lazy {
    __1700206229_Interface.__1700206229_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1700206229_Interface)

  private fun as_1700206229(): IClaimedCashDrawerClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IClaimedCashDrawerClosedEventArgs.ABI.makeIClaimedCashDrawerClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedCashDrawerClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedCashDrawerClosedEventArgs.ABI.makeIClaimedCashDrawerClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedCashDrawerClosedEventArgs> {
    public override fun getValue() = ClaimedCashDrawerClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ClaimedCashDrawerClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedCashDrawerClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedCashDrawerClosedEventArgs {
      val address = segment.toRawLongValue()
      return ClaimedCashDrawerClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ClaimedCashDrawerClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
