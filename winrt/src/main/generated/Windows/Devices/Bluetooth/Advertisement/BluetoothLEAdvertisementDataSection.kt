package Windows.Devices.Bluetooth.Advertisement

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEAdvertisementDataSection.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection;{d7213314-3a43-40f9-b6f0-92bfefc34ae3})")
@WinRTByReference(brClass = BluetoothLEAdvertisementDataSection.ByReference::class)
public class BluetoothLEAdvertisementDataSection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementDataSection.WithDefault, IWinRTObject {
  private val __291960931_Interface: IBluetoothLEAdvertisementDataSection.WithDefault by lazy {
    as_291960931()
  }


  public override val __291960931_Ptr: JNAPointer? by lazy {
    __291960931_Interface.__291960931_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__291960931_Interface)

  public constructor() : this(ABI.activate())

  public constructor(dataType: Byte, `data`: IBuffer) : this(ABI.activate(dataType, data))

  private fun as_291960931(): IBluetoothLEAdvertisementDataSection.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementDataSection.ABI.makeIBluetoothLEAdvertisementDataSection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementDataSection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementDataSection.ABI.makeIBluetoothLEAdvertisementDataSection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementDataSection> {
    public override fun getValue() = BluetoothLEAdvertisementDataSection(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementDataSection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementDataSection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBluetoothLEAdvertisementDataSectionFactory_Instance:
        IBluetoothLEAdvertisementDataSectionFactory by lazy {
      createIBluetoothLEAdvertisementDataSectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection".toHandle(),
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

    public fun createIBluetoothLEAdvertisementDataSectionFactory():
        IBluetoothLEAdvertisementDataSectionFactory {
      val refiid = Guid.REFIID(IBluetoothLEAdvertisementDataSectionFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementDataSection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBluetoothLEAdvertisementDataSectionFactory.ABI.makeIBluetoothLEAdvertisementDataSectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(dataType: Byte, `data`: IBuffer): JNAPointer? =
        IBluetoothLEAdvertisementDataSectionFactory_Instance.Create(dataType, data)?.pointer

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementDataSection {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementDataSection(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementDataSection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
