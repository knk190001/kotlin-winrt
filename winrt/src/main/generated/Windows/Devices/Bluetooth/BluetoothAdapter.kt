package Windows.Devices.Bluetooth

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

@ABIMarker(BluetoothAdapter.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothAdapter;{7974f04c-5f7a-4a34-9225-a855f84b1a8b})")
@WinRTByReference(brClass = BluetoothAdapter.ByReference::class)
public class BluetoothAdapter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothAdapter.WithDefault, IBluetoothAdapter2.WithDefault,
    IBluetoothAdapter3.WithDefault, IWinRTObject {
  private val __401175144_Interface: IBluetoothAdapter.WithDefault by lazy {
    as_401175144()
  }


  private val __448472474_Interface: IBluetoothAdapter2.WithDefault by lazy {
    as_448472474()
  }


  private val __448472475_Interface: IBluetoothAdapter3.WithDefault by lazy {
    as_448472475()
  }


  public override val __401175144_Ptr: JNAPointer? by lazy {
    __401175144_Interface.__401175144_Ptr
  }


  public override val __448472474_Ptr: JNAPointer? by lazy {
    __448472474_Interface.__448472474_Ptr
  }


  public override val __448472475_Ptr: JNAPointer? by lazy {
    __448472475_Interface.__448472475_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__401175144_Interface, __448472474_Interface, __448472475_Interface)

  private fun as_401175144(): IBluetoothAdapter.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothAdapter.ABI.makeIBluetoothAdapter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothAdapter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothAdapter.ABI.makeIBluetoothAdapter(ref.value))
  }

  private fun as_448472474(): IBluetoothAdapter2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothAdapter2.ABI.makeIBluetoothAdapter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothAdapter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothAdapter2.ABI.makeIBluetoothAdapter2(ref.value))
  }

  private fun as_448472475(): IBluetoothAdapter3.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothAdapter3.ABI.makeIBluetoothAdapter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothAdapter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothAdapter3.ABI.makeIBluetoothAdapter3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothAdapter> {
    public override fun getValue() = BluetoothAdapter(pointer.getPointer(0))

    public fun setValue(value: BluetoothAdapter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothAdapter, MemoryAddress> {
    public val IBluetoothAdapterStatics_Instance: IBluetoothAdapterStatics by lazy {
      createIBluetoothAdapterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBluetoothAdapterStatics(): IBluetoothAdapterStatics {
      val refiid = Guid.REFIID(IBluetoothAdapterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothAdapter".toHandle(),refiid,interfacePtr)
      val result = IBluetoothAdapterStatics.ABI.makeIBluetoothAdapterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothAdapter {
      val address = segment.toRawLongValue()
      return BluetoothAdapter(Pointer(address))
    }

    public override fun toNative(obj: BluetoothAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.IBluetoothAdapterStatics_Instance.GetDeviceSelector()

    public fun FromIdAsync(deviceId: String) =
        ABI.IBluetoothAdapterStatics_Instance.FromIdAsync(deviceId)

    public fun GetDefaultAsync() = ABI.IBluetoothAdapterStatics_Instance.GetDefaultAsync()
  }
}
