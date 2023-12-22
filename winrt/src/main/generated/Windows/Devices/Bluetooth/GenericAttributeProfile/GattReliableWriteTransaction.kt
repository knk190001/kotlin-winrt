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

@ABIMarker(GattReliableWriteTransaction.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattReliableWriteTransaction;{63a66f07-1aea-4c4c-a50f-97bae474b348})")
@WinRTByReference(brClass = GattReliableWriteTransaction.ByReference::class)
public class GattReliableWriteTransaction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattReliableWriteTransaction.WithDefault,
    IGattReliableWriteTransaction2.WithDefault, IWinRTObject {
  private val __1826664028_Interface: IGattReliableWriteTransaction.WithDefault by lazy {
    as_1826664028()
  }


  private val __792009970_Interface: IGattReliableWriteTransaction2.WithDefault by lazy {
    as_792009970()
  }


  public override val __1826664028_Ptr: JNAPointer? by lazy {
    __1826664028_Interface.__1826664028_Ptr
  }


  public override val __792009970_Ptr: JNAPointer? by lazy {
    __792009970_Interface.__792009970_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1826664028_Interface, __792009970_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1826664028(): IGattReliableWriteTransaction.WithDefault {
    if(pointer == NULL) {
      return(IGattReliableWriteTransaction.ABI.makeIGattReliableWriteTransaction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReliableWriteTransaction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReliableWriteTransaction.ABI.makeIGattReliableWriteTransaction(ref.value))
  }

  private fun as_792009970(): IGattReliableWriteTransaction2.WithDefault {
    if(pointer == NULL) {
      return(IGattReliableWriteTransaction2.ABI.makeIGattReliableWriteTransaction2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattReliableWriteTransaction2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattReliableWriteTransaction2.ABI.makeIGattReliableWriteTransaction2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattReliableWriteTransaction> {
    public override fun getValue() = GattReliableWriteTransaction(pointer.getPointer(0))

    public fun setValue(value: GattReliableWriteTransaction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattReliableWriteTransaction, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Bluetooth.GenericAttributeProfile.GattReliableWriteTransaction".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): GattReliableWriteTransaction {
      val address = segment.toRawLongValue()
      return GattReliableWriteTransaction(Pointer(address))
    }

    public override fun toNative(obj: GattReliableWriteTransaction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
