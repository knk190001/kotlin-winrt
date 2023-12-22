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

@ABIMarker(GattLocalDescriptorParameters.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalDescriptorParameters;{5fdede6a-f3c1-4b66-8c4b-e3d2293b40e9})")
@WinRTByReference(brClass = GattLocalDescriptorParameters.ByReference::class)
public class GattLocalDescriptorParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattLocalDescriptorParameters.WithDefault, IWinRTObject {
  private val __933839465_Interface: IGattLocalDescriptorParameters.WithDefault by lazy {
    as_933839465()
  }


  public override val __933839465_Ptr: JNAPointer? by lazy {
    __933839465_Interface.__933839465_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__933839465_Interface)

  public constructor() : this(ABI.activate())

  private fun as_933839465(): IGattLocalDescriptorParameters.WithDefault {
    if(pointer == NULL) {
      return(IGattLocalDescriptorParameters.ABI.makeIGattLocalDescriptorParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattLocalDescriptorParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattLocalDescriptorParameters.ABI.makeIGattLocalDescriptorParameters(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattLocalDescriptorParameters> {
    public override fun getValue() = GattLocalDescriptorParameters(pointer.getPointer(0))

    public fun setValue(value: GattLocalDescriptorParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattLocalDescriptorParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalDescriptorParameters".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): GattLocalDescriptorParameters {
      val address = segment.toRawLongValue()
      return GattLocalDescriptorParameters(Pointer(address))
    }

    public override fun toNative(obj: GattLocalDescriptorParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
