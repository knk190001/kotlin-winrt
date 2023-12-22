package Windows.Devices.Gpio.Provider

import Windows.Devices.Gpio.Provider.IGpioPinProviderValueChangedEventArgsFactory.ABI.IID
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

@ABIMarker(GpioPinProviderValueChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Gpio.Provider.GpioPinProviderValueChangedEventArgs;{32a6d6f2-3d5b-44cd-8fbe-13a69f2edb24})")
@WinRTByReference(brClass = GpioPinProviderValueChangedEventArgs.ByReference::class)
public class GpioPinProviderValueChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGpioPinProviderValueChangedEventArgs.WithDefault, IWinRTObject {
  private val __744750414_Interface: IGpioPinProviderValueChangedEventArgs.WithDefault by lazy {
    as_744750414()
  }


  public override val __744750414_Ptr: JNAPointer? by lazy {
    __744750414_Interface.__744750414_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__744750414_Interface)

  public constructor(edge: ProviderGpioPinEdge) : this(ABI.activate(edge))

  private fun as_744750414(): IGpioPinProviderValueChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGpioPinProviderValueChangedEventArgs.ABI.makeIGpioPinProviderValueChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGpioPinProviderValueChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGpioPinProviderValueChangedEventArgs.ABI.makeIGpioPinProviderValueChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GpioPinProviderValueChangedEventArgs> {
    public override fun getValue() = GpioPinProviderValueChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GpioPinProviderValueChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GpioPinProviderValueChangedEventArgs, MemoryAddress> {
    public val IGpioPinProviderValueChangedEventArgsFactory_Instance:
        IGpioPinProviderValueChangedEventArgsFactory by lazy {
      createIGpioPinProviderValueChangedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGpioPinProviderValueChangedEventArgsFactory():
        IGpioPinProviderValueChangedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Gpio.Provider.GpioPinProviderValueChangedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IGpioPinProviderValueChangedEventArgsFactory.ABI.makeIGpioPinProviderValueChangedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(edge: ProviderGpioPinEdge): JNAPointer? =
        IGpioPinProviderValueChangedEventArgsFactory_Instance.Create(edge)?.pointer

    public override fun fromNative(segment: MemoryAddress): GpioPinProviderValueChangedEventArgs {
      val address = segment.toRawLongValue()
      return GpioPinProviderValueChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GpioPinProviderValueChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
