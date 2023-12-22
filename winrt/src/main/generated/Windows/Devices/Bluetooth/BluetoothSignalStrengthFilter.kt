package Windows.Devices.Bluetooth

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

@ABIMarker(BluetoothSignalStrengthFilter.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter;{df7b7391-6bb5-4cfe-90b1-5d7324edcf7f})")
@WinRTByReference(brClass = BluetoothSignalStrengthFilter.ByReference::class)
public class BluetoothSignalStrengthFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothSignalStrengthFilter.WithDefault, IWinRTObject {
  private val __1062100024_Interface: IBluetoothSignalStrengthFilter.WithDefault by lazy {
    as_1062100024()
  }


  public override val __1062100024_Ptr: JNAPointer? by lazy {
    __1062100024_Interface.__1062100024_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1062100024_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1062100024(): IBluetoothSignalStrengthFilter.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothSignalStrengthFilter.ABI.makeIBluetoothSignalStrengthFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothSignalStrengthFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothSignalStrengthFilter.ABI.makeIBluetoothSignalStrengthFilter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothSignalStrengthFilter> {
    public override fun getValue() = BluetoothSignalStrengthFilter(pointer.getPointer(0))

    public fun setValue(value: BluetoothSignalStrengthFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothSignalStrengthFilter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): BluetoothSignalStrengthFilter {
      val address = segment.toRawLongValue()
      return BluetoothSignalStrengthFilter(Pointer(address))
    }

    public override fun toNative(obj: BluetoothSignalStrengthFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
