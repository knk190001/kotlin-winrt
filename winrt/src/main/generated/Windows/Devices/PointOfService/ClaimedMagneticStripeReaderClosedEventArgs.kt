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

@ABIMarker(ClaimedMagneticStripeReaderClosedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedMagneticStripeReaderClosedEventArgs;{14ada93a-adcd-4c80-acda-c3eaed2647e1})")
@WinRTByReference(brClass = ClaimedMagneticStripeReaderClosedEventArgs.ByReference::class)
public class ClaimedMagneticStripeReaderClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedMagneticStripeReaderClosedEventArgs.WithDefault, IWinRTObject {
  private val __1105194789_Interface: IClaimedMagneticStripeReaderClosedEventArgs.WithDefault by
      lazy {
    as_1105194789()
  }


  public override val __1105194789_Ptr: JNAPointer? by lazy {
    __1105194789_Interface.__1105194789_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1105194789_Interface)

  private fun as_1105194789(): IClaimedMagneticStripeReaderClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IClaimedMagneticStripeReaderClosedEventArgs.ABI.makeIClaimedMagneticStripeReaderClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedMagneticStripeReaderClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedMagneticStripeReaderClosedEventArgs.ABI.makeIClaimedMagneticStripeReaderClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedMagneticStripeReaderClosedEventArgs> {
    public override fun getValue() =
        ClaimedMagneticStripeReaderClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ClaimedMagneticStripeReaderClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedMagneticStripeReaderClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ClaimedMagneticStripeReaderClosedEventArgs {
      val address = segment.toRawLongValue()
      return ClaimedMagneticStripeReaderClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ClaimedMagneticStripeReaderClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
