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

@ABIMarker(GattLocalCharacteristicParameters.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalCharacteristicParameters;{faf73db4-4cff-44c7-8445-040e6ead0063})")
@WinRTByReference(brClass = GattLocalCharacteristicParameters.ByReference::class)
public class GattLocalCharacteristicParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattLocalCharacteristicParameters.WithDefault, IWinRTObject {
  private val __2105004437_Interface: IGattLocalCharacteristicParameters.WithDefault by lazy {
    as_2105004437()
  }


  public override val __2105004437_Ptr: JNAPointer? by lazy {
    __2105004437_Interface.__2105004437_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2105004437_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2105004437(): IGattLocalCharacteristicParameters.WithDefault {
    if(pointer == NULL) {
      return(IGattLocalCharacteristicParameters.ABI.makeIGattLocalCharacteristicParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattLocalCharacteristicParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattLocalCharacteristicParameters.ABI.makeIGattLocalCharacteristicParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattLocalCharacteristicParameters> {
    public override fun getValue() = GattLocalCharacteristicParameters(pointer.getPointer(0))

    public fun setValue(value: GattLocalCharacteristicParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattLocalCharacteristicParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalCharacteristicParameters".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): GattLocalCharacteristicParameters {
      val address = segment.toRawLongValue()
      return GattLocalCharacteristicParameters(Pointer(address))
    }

    public override fun toNative(obj: GattLocalCharacteristicParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
