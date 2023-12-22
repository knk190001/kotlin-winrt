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

@ABIMarker(MagneticStripeReaderStatusUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderStatusUpdatedEventArgs;{09cc6bb0-3262-401d-9e8a-e80d6358906b})")
@WinRTByReference(brClass = MagneticStripeReaderStatusUpdatedEventArgs.ByReference::class)
public class MagneticStripeReaderStatusUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderStatusUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __725555903_Interface: IMagneticStripeReaderStatusUpdatedEventArgs.WithDefault by
      lazy {
    as_725555903()
  }


  public override val __725555903_Ptr: JNAPointer? by lazy {
    __725555903_Interface.__725555903_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__725555903_Interface)

  private fun as_725555903(): IMagneticStripeReaderStatusUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderStatusUpdatedEventArgs.ABI.makeIMagneticStripeReaderStatusUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderStatusUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderStatusUpdatedEventArgs.ABI.makeIMagneticStripeReaderStatusUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderStatusUpdatedEventArgs> {
    public override fun getValue() =
        MagneticStripeReaderStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderStatusUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderStatusUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        MagneticStripeReaderStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
