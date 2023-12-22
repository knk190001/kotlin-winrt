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

@ABIMarker(MagneticStripeReaderErrorOccurredEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderErrorOccurredEventArgs;{1fedf95d-2c84-41ad-b778-f2356a789ab1})")
@WinRTByReference(brClass = MagneticStripeReaderErrorOccurredEventArgs.ByReference::class)
public class MagneticStripeReaderErrorOccurredEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderErrorOccurredEventArgs.WithDefault, IWinRTObject {
  private val __1527677219_Interface: IMagneticStripeReaderErrorOccurredEventArgs.WithDefault by
      lazy {
    as_1527677219()
  }


  public override val __1527677219_Ptr: JNAPointer? by lazy {
    __1527677219_Interface.__1527677219_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1527677219_Interface)

  private fun as_1527677219(): IMagneticStripeReaderErrorOccurredEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderErrorOccurredEventArgs.ABI.makeIMagneticStripeReaderErrorOccurredEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderErrorOccurredEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderErrorOccurredEventArgs.ABI.makeIMagneticStripeReaderErrorOccurredEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderErrorOccurredEventArgs> {
    public override fun getValue() =
        MagneticStripeReaderErrorOccurredEventArgs(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderErrorOccurredEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderErrorOccurredEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MagneticStripeReaderErrorOccurredEventArgs {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderErrorOccurredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderErrorOccurredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
