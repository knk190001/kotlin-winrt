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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEManufacturerData.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData;{912dba18-6963-4533-b061-4694dafb34e5})")
@WinRTByReference(brClass = BluetoothLEManufacturerData.ByReference::class)
public class BluetoothLEManufacturerData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEManufacturerData.WithDefault, IWinRTObject {
  private val __1186418978_Interface: IBluetoothLEManufacturerData.WithDefault by lazy {
    as_1186418978()
  }


  public override val __1186418978_Ptr: JNAPointer? by lazy {
    __1186418978_Interface.__1186418978_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1186418978_Interface)

  public constructor() : this(ABI.activate())

  public constructor(companyId: WinDef.USHORT, `data`: IBuffer) : this(ABI.activate(companyId,
      data))

  private fun as_1186418978(): IBluetoothLEManufacturerData.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEManufacturerData.ABI.makeIBluetoothLEManufacturerData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEManufacturerData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEManufacturerData.ABI.makeIBluetoothLEManufacturerData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEManufacturerData> {
    public override fun getValue() = BluetoothLEManufacturerData(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEManufacturerData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEManufacturerData, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBluetoothLEManufacturerDataFactory_Instance: IBluetoothLEManufacturerDataFactory by
        lazy {
      createIBluetoothLEManufacturerDataFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData".toHandle(),
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

    public fun createIBluetoothLEManufacturerDataFactory(): IBluetoothLEManufacturerDataFactory {
      val refiid = Guid.REFIID(IBluetoothLEManufacturerDataFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEManufacturerData".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBluetoothLEManufacturerDataFactory.ABI.makeIBluetoothLEManufacturerDataFactory(factoryActivatorPtr.value))
    }

    public fun activate(companyId: WinDef.USHORT, `data`: IBuffer): JNAPointer? =
        IBluetoothLEManufacturerDataFactory_Instance.Create(companyId, data)?.pointer

    public override fun fromNative(segment: MemoryAddress): BluetoothLEManufacturerData {
      val address = segment.toRawLongValue()
      return BluetoothLEManufacturerData(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEManufacturerData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
