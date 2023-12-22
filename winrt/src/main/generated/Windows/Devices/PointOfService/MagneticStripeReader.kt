package Windows.Devices.PointOfService

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MagneticStripeReader.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReader;{1a92b015-47c3-468a-9333-0c6517574883})")
@WinRTByReference(brClass = MagneticStripeReader.ByReference::class)
public class MagneticStripeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReader.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1017330381_Interface: IMagneticStripeReader.WithDefault by lazy {
    as_1017330381()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1017330381_Ptr: JNAPointer? by lazy {
    __1017330381_Interface.__1017330381_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1017330381_Interface, __1260617006_Interface)

  private fun as_1017330381(): IMagneticStripeReader.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReader.ABI.makeIMagneticStripeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReader.ABI.makeIMagneticStripeReader(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReader> {
    public override fun getValue() = MagneticStripeReader(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReader, MemoryAddress> {
    public val IMagneticStripeReaderStatics2_Instance: IMagneticStripeReaderStatics2 by lazy {
      createIMagneticStripeReaderStatics2()
    }


    public val IMagneticStripeReaderStatics_Instance: IMagneticStripeReaderStatics by lazy {
      createIMagneticStripeReaderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMagneticStripeReaderStatics2(): IMagneticStripeReaderStatics2 {
      val refiid = Guid.REFIID(IMagneticStripeReaderStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.MagneticStripeReader".toHandle(),refiid,interfacePtr)
      val result =
          IMagneticStripeReaderStatics2.ABI.makeIMagneticStripeReaderStatics2(interfacePtr.value)
      return result
    }

    public fun createIMagneticStripeReaderStatics(): IMagneticStripeReaderStatics {
      val refiid = Guid.REFIID(IMagneticStripeReaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.MagneticStripeReader".toHandle(),refiid,interfacePtr)
      val result =
          IMagneticStripeReaderStatics.ABI.makeIMagneticStripeReaderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MagneticStripeReader {
      val address = segment.toRawLongValue()
      return MagneticStripeReader(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector(connectionTypes: PosConnectionTypes) =
        ABI.IMagneticStripeReaderStatics2_Instance.GetDeviceSelector(connectionTypes)

    public fun GetDefaultAsync() = ABI.IMagneticStripeReaderStatics_Instance.GetDefaultAsync()

    public fun FromIdAsync(deviceId: String) =
        ABI.IMagneticStripeReaderStatics_Instance.FromIdAsync(deviceId)

    public fun GetDeviceSelector() = ABI.IMagneticStripeReaderStatics_Instance.GetDeviceSelector()
  }
}
