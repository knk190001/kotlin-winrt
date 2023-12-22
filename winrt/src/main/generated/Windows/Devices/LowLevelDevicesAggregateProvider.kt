package Windows.Devices

import Windows.Devices.Adc.Provider.IAdcControllerProvider
import Windows.Devices.Gpio.Provider.IGpioControllerProvider
import Windows.Devices.I2c.Provider.II2cControllerProvider
import Windows.Devices.ILowLevelDevicesAggregateProviderFactory.ABI.IID
import Windows.Devices.Pwm.Provider.IPwmControllerProvider
import Windows.Devices.Spi.Provider.ISpiControllerProvider
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

@ABIMarker(LowLevelDevicesAggregateProvider.ABI::class)
@Signature("rc(Windows.Devices.LowLevelDevicesAggregateProvider;{a73e561c-aac1-4ec7-a852-479f7060d01f})")
@WinRTByReference(brClass = LowLevelDevicesAggregateProvider.ByReference::class)
public class LowLevelDevicesAggregateProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILowLevelDevicesAggregateProvider.WithDefault, IWinRTObject {
  private val __869931878_Interface: ILowLevelDevicesAggregateProvider.WithDefault by lazy {
    as_869931878()
  }


  public override val __869931878_Ptr: JNAPointer? by lazy {
    __869931878_Interface.__869931878_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__869931878_Interface)

  public constructor(
    adc: IAdcControllerProvider,
    pwm: IPwmControllerProvider,
    gpio: IGpioControllerProvider,
    i2c: II2cControllerProvider,
    spi: ISpiControllerProvider
  ) : this(ABI.activate(adc, pwm, gpio, i2c, spi))

  private fun as_869931878(): ILowLevelDevicesAggregateProvider.WithDefault {
    if(pointer == NULL) {
      return(ILowLevelDevicesAggregateProvider.ABI.makeILowLevelDevicesAggregateProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLevelDevicesAggregateProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLevelDevicesAggregateProvider.ABI.makeILowLevelDevicesAggregateProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LowLevelDevicesAggregateProvider> {
    public override fun getValue() = LowLevelDevicesAggregateProvider(pointer.getPointer(0))

    public fun setValue(value: LowLevelDevicesAggregateProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLevelDevicesAggregateProvider, MemoryAddress> {
    public val ILowLevelDevicesAggregateProviderFactory_Instance:
        ILowLevelDevicesAggregateProviderFactory by lazy {
      createILowLevelDevicesAggregateProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILowLevelDevicesAggregateProviderFactory():
        ILowLevelDevicesAggregateProviderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.LowLevelDevicesAggregateProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILowLevelDevicesAggregateProviderFactory.ABI.makeILowLevelDevicesAggregateProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      adc: IAdcControllerProvider,
      pwm: IPwmControllerProvider,
      gpio: IGpioControllerProvider,
      i2c: II2cControllerProvider,
      spi: ISpiControllerProvider
    ): JNAPointer? = ILowLevelDevicesAggregateProviderFactory_Instance.Create(adc, pwm, gpio, i2c,
        spi)?.pointer

    public override fun fromNative(segment: MemoryAddress): LowLevelDevicesAggregateProvider {
      val address = segment.toRawLongValue()
      return LowLevelDevicesAggregateProvider(Pointer(address))
    }

    public override fun toNative(obj: LowLevelDevicesAggregateProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
