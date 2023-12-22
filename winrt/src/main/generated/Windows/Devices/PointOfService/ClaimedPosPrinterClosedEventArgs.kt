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

@ABIMarker(ClaimedPosPrinterClosedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedPosPrinterClosedEventArgs;{e2b7a27b-4d40-471d-92ed-63375b18c788})")
@WinRTByReference(brClass = ClaimedPosPrinterClosedEventArgs.ByReference::class)
public class ClaimedPosPrinterClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedPosPrinterClosedEventArgs.WithDefault, IWinRTObject {
  private val __1083832311_Interface: IClaimedPosPrinterClosedEventArgs.WithDefault by lazy {
    as_1083832311()
  }


  public override val __1083832311_Ptr: JNAPointer? by lazy {
    __1083832311_Interface.__1083832311_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1083832311_Interface)

  private fun as_1083832311(): IClaimedPosPrinterClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IClaimedPosPrinterClosedEventArgs.ABI.makeIClaimedPosPrinterClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedPosPrinterClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedPosPrinterClosedEventArgs.ABI.makeIClaimedPosPrinterClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedPosPrinterClosedEventArgs> {
    public override fun getValue() = ClaimedPosPrinterClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ClaimedPosPrinterClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedPosPrinterClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedPosPrinterClosedEventArgs {
      val address = segment.toRawLongValue()
      return ClaimedPosPrinterClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ClaimedPosPrinterClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
