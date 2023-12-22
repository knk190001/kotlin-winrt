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

@ABIMarker(BluetoothLEAdvertisementPublisher.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher;{cde820f9-d9fa-43d6-a264-ddd8b7da8b78})")
@WinRTByReference(brClass = BluetoothLEAdvertisementPublisher.ByReference::class)
public class BluetoothLEAdvertisementPublisher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementPublisher.WithDefault,
    IBluetoothLEAdvertisementPublisher2.WithDefault, IWinRTObject {
  private val __1811505602_Interface: IBluetoothLEAdvertisementPublisher.WithDefault by lazy {
    as_1811505602()
  }


  private val __322098764_Interface: IBluetoothLEAdvertisementPublisher2.WithDefault by lazy {
    as_322098764()
  }


  public override val __1811505602_Ptr: JNAPointer? by lazy {
    __1811505602_Interface.__1811505602_Ptr
  }


  public override val __322098764_Ptr: JNAPointer? by lazy {
    __322098764_Interface.__322098764_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1811505602_Interface, __322098764_Interface)

  public constructor() : this(ABI.activate())

  public constructor(advertisement: BluetoothLEAdvertisement) : this(ABI.activate(advertisement))

  private fun as_1811505602(): IBluetoothLEAdvertisementPublisher.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementPublisher.ABI.makeIBluetoothLEAdvertisementPublisher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementPublisher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementPublisher.ABI.makeIBluetoothLEAdvertisementPublisher(ref.value))
  }

  private fun as_322098764(): IBluetoothLEAdvertisementPublisher2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementPublisher2.ABI.makeIBluetoothLEAdvertisementPublisher2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementPublisher2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementPublisher2.ABI.makeIBluetoothLEAdvertisementPublisher2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementPublisher> {
    public override fun getValue() = BluetoothLEAdvertisementPublisher(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementPublisher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementPublisher, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBluetoothLEAdvertisementPublisherFactory_Instance:
        IBluetoothLEAdvertisementPublisherFactory by lazy {
      createIBluetoothLEAdvertisementPublisherFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher".toHandle(),
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

    public fun createIBluetoothLEAdvertisementPublisherFactory():
        IBluetoothLEAdvertisementPublisherFactory {
      val refiid = Guid.REFIID(IBluetoothLEAdvertisementPublisherFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBluetoothLEAdvertisementPublisherFactory.ABI.makeIBluetoothLEAdvertisementPublisherFactory(factoryActivatorPtr.value))
    }

    public fun activate(advertisement: BluetoothLEAdvertisement): JNAPointer? =
        IBluetoothLEAdvertisementPublisherFactory_Instance.Create(advertisement)?.pointer

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementPublisher {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementPublisher(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementPublisher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
