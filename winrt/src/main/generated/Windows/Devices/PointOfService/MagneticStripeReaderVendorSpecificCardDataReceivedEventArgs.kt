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

@ABIMarker(MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs;{af0a5514-59cc-4a60-99e8-99a53dace5aa})")
@WinRTByReference(brClass =
    MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.ByReference::class)
public class MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.WithDefault,
    IWinRTObject {
  private val __1770685489_Interface:
      IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.WithDefault by lazy {
    as_1770685489()
  }


  public override val __1770685489_Ptr: JNAPointer? by lazy {
    __1770685489_Interface.__1770685489_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1770685489_Interface)

  private fun as_1770685489():
      IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.ABI.makeIMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs.ABI.makeIMagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs> {
    public override fun getValue() =
        MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs,
      MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
