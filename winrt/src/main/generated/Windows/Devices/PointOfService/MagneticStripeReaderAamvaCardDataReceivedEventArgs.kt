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

@ABIMarker(MagneticStripeReaderAamvaCardDataReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderAamvaCardDataReceivedEventArgs;{0a4bbd51-c316-4910-87f3-7a62ba862d31})")
@WinRTByReference(brClass = MagneticStripeReaderAamvaCardDataReceivedEventArgs.ByReference::class)
public class MagneticStripeReaderAamvaCardDataReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderAamvaCardDataReceivedEventArgs.WithDefault, IWinRTObject
    {
  private val __1808409399_Interface:
      IMagneticStripeReaderAamvaCardDataReceivedEventArgs.WithDefault by lazy {
    as_1808409399()
  }


  public override val __1808409399_Ptr: JNAPointer? by lazy {
    __1808409399_Interface.__1808409399_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1808409399_Interface)

  private fun as_1808409399(): IMagneticStripeReaderAamvaCardDataReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderAamvaCardDataReceivedEventArgs.ABI.makeIMagneticStripeReaderAamvaCardDataReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderAamvaCardDataReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderAamvaCardDataReceivedEventArgs.ABI.makeIMagneticStripeReaderAamvaCardDataReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderAamvaCardDataReceivedEventArgs> {
    public override fun getValue() =
        MagneticStripeReaderAamvaCardDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderAamvaCardDataReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderAamvaCardDataReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MagneticStripeReaderAamvaCardDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderAamvaCardDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderAamvaCardDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
