package Windows.Devices.Bluetooth.Advertisement

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEAdvertisementWatcher.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher;{a6ac336f-f3d3-4297-8d6c-c81ea6623f40})")
@WinRTByReference(brClass = BluetoothLEAdvertisementWatcher.ByReference::class)
public class BluetoothLEAdvertisementWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementWatcher.WithDefault,
    IBluetoothLEAdvertisementWatcher2.WithDefault, IWinRTObject {
  private val __1645477502_Interface: IBluetoothLEAdvertisementWatcher.WithDefault by lazy {
    as_1645477502()
  }


  private val __529804940_Interface: IBluetoothLEAdvertisementWatcher2.WithDefault by lazy {
    as_529804940()
  }


  public override val __1645477502_Ptr: JNAPointer? by lazy {
    __1645477502_Interface.__1645477502_Ptr
  }


  public override val __529804940_Ptr: JNAPointer? by lazy {
    __529804940_Interface.__529804940_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1645477502_Interface, __529804940_Interface)

  public constructor() : this(ABI.activate())

  public constructor(advertisementFilter: BluetoothLEAdvertisementFilter) :
      this(ABI.activate(advertisementFilter))

  private fun as_1645477502(): IBluetoothLEAdvertisementWatcher.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementWatcher.ABI.makeIBluetoothLEAdvertisementWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementWatcher.ABI.makeIBluetoothLEAdvertisementWatcher(ref.value))
  }

  private fun as_529804940(): IBluetoothLEAdvertisementWatcher2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementWatcher2.ABI.makeIBluetoothLEAdvertisementWatcher2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementWatcher2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementWatcher2.ABI.makeIBluetoothLEAdvertisementWatcher2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementWatcher> {
    public override fun getValue() = BluetoothLEAdvertisementWatcher(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementWatcher, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBluetoothLEAdvertisementWatcherFactory_Instance:
        IBluetoothLEAdvertisementWatcherFactory by lazy {
      createIBluetoothLEAdvertisementWatcherFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher".toHandle(),
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

    public fun createIBluetoothLEAdvertisementWatcherFactory():
        IBluetoothLEAdvertisementWatcherFactory {
      val refiid = Guid.REFIID(IBluetoothLEAdvertisementWatcherFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementWatcher".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBluetoothLEAdvertisementWatcherFactory.ABI.makeIBluetoothLEAdvertisementWatcherFactory(factoryActivatorPtr.value))
    }

    public fun activate(advertisementFilter: BluetoothLEAdvertisementFilter): JNAPointer? =
        IBluetoothLEAdvertisementWatcherFactory_Instance.Create(advertisementFilter)?.pointer

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementWatcher {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementWatcher(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
