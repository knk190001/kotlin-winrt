package Windows.Devices.Bluetooth.GenericAttributeProfile

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(GattServiceProviderAdvertisingParameters.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProviderAdvertisingParameters;{e2ce31ab-6315-4c22-9bd7-781dbc3d8d82})")
@WinRTByReference(brClass = GattServiceProviderAdvertisingParameters.ByReference::class)
public class GattServiceProviderAdvertisingParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProviderAdvertisingParameters.WithDefault,
    IGattServiceProviderAdvertisingParameters2.WithDefault, IWinRTObject {
  private val __1522463933_Interface: IGattServiceProviderAdvertisingParameters.WithDefault by
      lazy {
    as_1522463933()
  }


  private val __48258383_Interface: IGattServiceProviderAdvertisingParameters2.WithDefault by lazy {
    as_48258383()
  }


  public override val __1522463933_Ptr: JNAPointer? by lazy {
    __1522463933_Interface.__1522463933_Ptr
  }


  public override val __48258383_Ptr: JNAPointer? by lazy {
    __48258383_Interface.__48258383_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1522463933_Interface, __48258383_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1522463933(): IGattServiceProviderAdvertisingParameters.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderAdvertisingParameters.ABI.makeIGattServiceProviderAdvertisingParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderAdvertisingParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderAdvertisingParameters.ABI.makeIGattServiceProviderAdvertisingParameters(ref.value))
  }

  private fun as_48258383(): IGattServiceProviderAdvertisingParameters2.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderAdvertisingParameters2.ABI.makeIGattServiceProviderAdvertisingParameters2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderAdvertisingParameters2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderAdvertisingParameters2.ABI.makeIGattServiceProviderAdvertisingParameters2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderAdvertisingParameters> {
    public override fun getValue() = GattServiceProviderAdvertisingParameters(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderAdvertisingParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderAdvertisingParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProviderAdvertisingParameters".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress):
        GattServiceProviderAdvertisingParameters {
      val address = segment.toRawLongValue()
      return GattServiceProviderAdvertisingParameters(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderAdvertisingParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
