package Windows.Devices.PointOfService

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(MagneticStripeReaderEncryptionAlgorithms.ABI::class)
@WinRTByReference(brClass = MagneticStripeReaderEncryptionAlgorithms.ByReference::class)
public class MagneticStripeReaderEncryptionAlgorithms(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderEncryptionAlgorithms> {
    public override fun getValue() = MagneticStripeReaderEncryptionAlgorithms(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderEncryptionAlgorithms): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderEncryptionAlgorithms, MemoryAddress> {
    public val IMagneticStripeReaderEncryptionAlgorithmsStatics_Instance:
        IMagneticStripeReaderEncryptionAlgorithmsStatics by lazy {
      createIMagneticStripeReaderEncryptionAlgorithmsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMagneticStripeReaderEncryptionAlgorithmsStatics():
        IMagneticStripeReaderEncryptionAlgorithmsStatics {
      val refiid = Guid.REFIID(IMagneticStripeReaderEncryptionAlgorithmsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.MagneticStripeReaderEncryptionAlgorithms".toHandle(),refiid,interfacePtr)
      val result =
          IMagneticStripeReaderEncryptionAlgorithmsStatics.ABI.makeIMagneticStripeReaderEncryptionAlgorithmsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        MagneticStripeReaderEncryptionAlgorithms {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderEncryptionAlgorithms(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderEncryptionAlgorithms): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_None() = ABI.IMagneticStripeReaderEncryptionAlgorithmsStatics_Instance.get_None()

    public fun get_TripleDesDukpt() =
        ABI.IMagneticStripeReaderEncryptionAlgorithmsStatics_Instance.get_TripleDesDukpt()

    public fun get_ExtendedBase() =
        ABI.IMagneticStripeReaderEncryptionAlgorithmsStatics_Instance.get_ExtendedBase()
  }
}
