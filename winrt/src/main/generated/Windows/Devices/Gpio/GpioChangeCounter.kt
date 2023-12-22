package Windows.Devices.Gpio

import Windows.Devices.Gpio.IGpioChangeCounterFactory.ABI.IID
import Windows.Foundation.IClosable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GpioChangeCounter.ABI::class)
@Signature("rc(Windows.Devices.Gpio.GpioChangeCounter;{cb5ec0de-6801-43ff-803d-4576628a8b26})")
@WinRTByReference(brClass = GpioChangeCounter.ByReference::class)
public class GpioChangeCounter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGpioChangeCounter.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1404136769_Interface: IGpioChangeCounter.WithDefault by lazy {
    as_1404136769()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1404136769_Ptr: JNAPointer? by lazy {
    __1404136769_Interface.__1404136769_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1404136769_Interface, __1260617006_Interface)

  public constructor(pin: GpioPin) : this(ABI.activate(pin))

  private fun as_1404136769(): IGpioChangeCounter.WithDefault {
    if(pointer == NULL) {
      return(IGpioChangeCounter.ABI.makeIGpioChangeCounter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGpioChangeCounter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGpioChangeCounter.ABI.makeIGpioChangeCounter(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GpioChangeCounter> {
    public override fun getValue() = GpioChangeCounter(pointer.getPointer(0))

    public fun setValue(value: GpioChangeCounter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GpioChangeCounter, MemoryAddress> {
    public val IGpioChangeCounterFactory_Instance: IGpioChangeCounterFactory by lazy {
      createIGpioChangeCounterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGpioChangeCounterFactory(): IGpioChangeCounterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Gpio.GpioChangeCounter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGpioChangeCounterFactory.ABI.makeIGpioChangeCounterFactory(factoryActivatorPtr.value))
    }

    public fun activate(pin: GpioPin): JNAPointer? =
        IGpioChangeCounterFactory_Instance.Create(pin)?.pointer

    public override fun fromNative(segment: MemoryAddress): GpioChangeCounter {
      val address = segment.toRawLongValue()
      return GpioChangeCounter(Pointer(address))
    }

    public override fun toNative(obj: GpioChangeCounter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
