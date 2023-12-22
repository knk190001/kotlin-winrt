package Windows.Devices

import Windows.Devices.Adc.Provider.IAdcControllerProvider
import Windows.Devices.Gpio.Provider.IGpioControllerProvider
import Windows.Devices.I2c.Provider.II2cControllerProvider
import Windows.Devices.Pwm.Provider.IPwmControllerProvider
import Windows.Devices.Spi.Provider.ISpiControllerProvider
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILowLevelDevicesAggregateProviderFactory.ABI::class)
@Signature("{9ac4aaf6-3473-465e-96d5-36281a2c57af}")
@Guid("9ac4aaf63473465e96d536281a2c57af")
@WinRTInterface("9ac4aaf63473465e96d536281a2c57af")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLevelDevicesAggregateProviderFactory.ByReference::class)
public interface ILowLevelDevicesAggregateProviderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    adc: IAdcControllerProvider?,
    pwm: IPwmControllerProvider?,
    gpio: IGpioControllerProvider?,
    i2c: II2cControllerProvider?,
    spi: ISpiControllerProvider?
  ): LowLevelDevicesAggregateProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLevelDevicesAggregateProviderFactory> {
    public override fun getValue() =
        ABI.makeILowLevelDevicesAggregateProviderFactory(pointer.getPointer(0))

    public fun setValue(value: ILowLevelDevicesAggregateProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLevelDevicesAggregateProviderFactory {
    public val __1539990288_Ptr: Pointer?

    public val _1539990288_VtblPtr: Pointer?
      get() = __1539990288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      adc: IAdcControllerProvider?,
      pwm: IPwmControllerProvider?,
      gpio: IGpioControllerProvider?,
      i2c: II2cControllerProvider?,
      spi: ISpiControllerProvider?
    ): LowLevelDevicesAggregateProvider? {
      val fnPtr = _1539990288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LowLevelDevicesAggregateProvider>()
      val hr = fn.invokeHR(arrayOf(__1539990288_Ptr, marshalToNative(adc), marshalToNative(pwm),
          marshalToNative(gpio), marshalToNative(i2c), marshalToNative(spi), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LowLevelDevicesAggregateProvider>(result.getValue())
      return resultValue
    }
  }

  public class ILowLevelDevicesAggregateProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1539990288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLevelDevicesAggregateProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ac4aaf63473465e96d536281a2c57af")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLevelDevicesAggregateProviderFactory(ptr: Pointer?): WithDefault =
        ILowLevelDevicesAggregateProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ILowLevelDevicesAggregateProviderFactory {
      val address = segment.toRawLongValue()
      return makeILowLevelDevicesAggregateProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: ILowLevelDevicesAggregateProviderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1539990288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLevelDevicesAggregateProviderFactory):
        Array<ILowLevelDevicesAggregateProviderFactory?> = (elements as
        Array<ILowLevelDevicesAggregateProviderFactory?>).castToImpl<ILowLevelDevicesAggregateProviderFactory,ILowLevelDevicesAggregateProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLevelDevicesAggregateProviderFactory?> =
        arrayOfNulls<ILowLevelDevicesAggregateProviderFactory_Impl>(size) as
        Array<ILowLevelDevicesAggregateProviderFactory?>
  }
}
