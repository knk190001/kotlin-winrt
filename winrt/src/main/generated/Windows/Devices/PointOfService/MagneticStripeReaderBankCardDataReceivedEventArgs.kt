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

@ABIMarker(MagneticStripeReaderBankCardDataReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderBankCardDataReceivedEventArgs;{2e958823-a31a-4763-882c-23725e39b08e})")
@WinRTByReference(brClass = MagneticStripeReaderBankCardDataReceivedEventArgs.ByReference::class)
public class MagneticStripeReaderBankCardDataReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderBankCardDataReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1127474861_Interface: IMagneticStripeReaderBankCardDataReceivedEventArgs.WithDefault
      by lazy {
    as_1127474861()
  }


  public override val __1127474861_Ptr: JNAPointer? by lazy {
    __1127474861_Interface.__1127474861_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1127474861_Interface)

  private fun as_1127474861(): IMagneticStripeReaderBankCardDataReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderBankCardDataReceivedEventArgs.ABI.makeIMagneticStripeReaderBankCardDataReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderBankCardDataReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderBankCardDataReceivedEventArgs.ABI.makeIMagneticStripeReaderBankCardDataReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderBankCardDataReceivedEventArgs> {
    public override fun getValue() =
        MagneticStripeReaderBankCardDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderBankCardDataReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderBankCardDataReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MagneticStripeReaderBankCardDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderBankCardDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderBankCardDataReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
