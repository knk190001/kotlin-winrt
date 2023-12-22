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
import kotlin.Short
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEAdvertisementBytePattern.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern;{fbfad7f2-b9c5-4a08-bc51-502f8ef68a79})")
@WinRTByReference(brClass = BluetoothLEAdvertisementBytePattern.ByReference::class)
public class BluetoothLEAdvertisementBytePattern(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementBytePattern.WithDefault, IWinRTObject {
  private val __1499439830_Interface: IBluetoothLEAdvertisementBytePattern.WithDefault by lazy {
    as_1499439830()
  }


  public override val __1499439830_Ptr: JNAPointer? by lazy {
    __1499439830_Interface.__1499439830_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1499439830_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    dataType: Byte,
    offset: Short,
    `data`: IBuffer
  ) : this(ABI.activate(dataType, offset, data))

  private fun as_1499439830(): IBluetoothLEAdvertisementBytePattern.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementBytePattern.ABI.makeIBluetoothLEAdvertisementBytePattern(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementBytePattern>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementBytePattern.ABI.makeIBluetoothLEAdvertisementBytePattern(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementBytePattern> {
    public override fun getValue() = BluetoothLEAdvertisementBytePattern(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementBytePattern): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementBytePattern, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBluetoothLEAdvertisementBytePatternFactory_Instance:
        IBluetoothLEAdvertisementBytePatternFactory by lazy {
      createIBluetoothLEAdvertisementBytePatternFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern".toHandle(),
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

    public fun createIBluetoothLEAdvertisementBytePatternFactory():
        IBluetoothLEAdvertisementBytePatternFactory {
      val refiid = Guid.REFIID(IBluetoothLEAdvertisementBytePatternFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementBytePattern".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IBluetoothLEAdvertisementBytePatternFactory.ABI.makeIBluetoothLEAdvertisementBytePatternFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      dataType: Byte,
      offset: Short,
      `data`: IBuffer
    ): JNAPointer? = IBluetoothLEAdvertisementBytePatternFactory_Instance.Create(dataType, offset,
        data)?.pointer

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementBytePattern {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementBytePattern(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementBytePattern): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
