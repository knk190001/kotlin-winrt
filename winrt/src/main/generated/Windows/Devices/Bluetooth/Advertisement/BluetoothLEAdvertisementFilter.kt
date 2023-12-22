package Windows.Devices.Bluetooth.Advertisement

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

@ABIMarker(BluetoothLEAdvertisementFilter.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter;{131eb0d3-d04e-47b1-837e-49405bf6f80f})")
@WinRTByReference(brClass = BluetoothLEAdvertisementFilter.ByReference::class)
public class BluetoothLEAdvertisementFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementFilter.WithDefault, IWinRTObject {
  private val __149354890_Interface: IBluetoothLEAdvertisementFilter.WithDefault by lazy {
    as_149354890()
  }


  public override val __149354890_Ptr: JNAPointer? by lazy {
    __149354890_Interface.__149354890_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__149354890_Interface)

  public constructor() : this(ABI.activate())

  private fun as_149354890(): IBluetoothLEAdvertisementFilter.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementFilter.ABI.makeIBluetoothLEAdvertisementFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementFilter.ABI.makeIBluetoothLEAdvertisementFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementFilter> {
    public override fun getValue() = BluetoothLEAdvertisementFilter(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementFilter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementFilter {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementFilter(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
