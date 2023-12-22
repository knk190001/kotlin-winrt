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

@ABIMarker(ILowLevelDevicesAggregateProvider.ABI::class)
@Signature("{a73e561c-aac1-4ec7-a852-479f7060d01f}")
@Guid("a73e561caac14ec7a852479f7060d01f")
@WinRTInterface("a73e561caac14ec7a852479f7060d01f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLevelDevicesAggregateProvider.ByReference::class)
public interface ILowLevelDevicesAggregateProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdcControllerProvider(): IAdcControllerProvider?

  @InterfaceMethod(1)
  public fun get_PwmControllerProvider(): IPwmControllerProvider?

  @InterfaceMethod(2)
  public fun get_GpioControllerProvider(): IGpioControllerProvider?

  @InterfaceMethod(3)
  public fun get_I2cControllerProvider(): II2cControllerProvider?

  @InterfaceMethod(4)
  public fun get_SpiControllerProvider(): ISpiControllerProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLevelDevicesAggregateProvider> {
    public override fun getValue() =
        ABI.makeILowLevelDevicesAggregateProvider(pointer.getPointer(0))

    public fun setValue(value: ILowLevelDevicesAggregateProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLevelDevicesAggregateProvider {
    public val __869931878_Ptr: Pointer?

    public val _869931878_VtblPtr: Pointer?
      get() = __869931878_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdcControllerProvider(): IAdcControllerProvider? {
      val fnPtr = _869931878_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAdcControllerProvider>()
      val hr = fn.invokeHR(arrayOf(__869931878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAdcControllerProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PwmControllerProvider(): IPwmControllerProvider? {
      val fnPtr = _869931878_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IPwmControllerProvider>()
      val hr = fn.invokeHR(arrayOf(__869931878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IPwmControllerProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_GpioControllerProvider(): IGpioControllerProvider? {
      val fnPtr = _869931878_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IGpioControllerProvider>()
      val hr = fn.invokeHR(arrayOf(__869931878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IGpioControllerProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_I2cControllerProvider(): II2cControllerProvider? {
      val fnPtr = _869931878_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<II2cControllerProvider>()
      val hr = fn.invokeHR(arrayOf(__869931878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<II2cControllerProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SpiControllerProvider(): ISpiControllerProvider? {
      val fnPtr = _869931878_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISpiControllerProvider>()
      val hr = fn.invokeHR(arrayOf(__869931878_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISpiControllerProvider>(result.getValue())
      return resultValue
    }
  }

  public class ILowLevelDevicesAggregateProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869931878_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLevelDevicesAggregateProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a73e561caac14ec7a852479f7060d01f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLevelDevicesAggregateProvider(ptr: Pointer?): WithDefault =
        ILowLevelDevicesAggregateProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLevelDevicesAggregateProvider {
      val address = segment.toRawLongValue()
      return makeILowLevelDevicesAggregateProvider(Pointer(address))
    }

    public override fun toNative(obj: ILowLevelDevicesAggregateProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869931878_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLevelDevicesAggregateProvider):
        Array<ILowLevelDevicesAggregateProvider?> = (elements as
        Array<ILowLevelDevicesAggregateProvider?>).castToImpl<ILowLevelDevicesAggregateProvider,ILowLevelDevicesAggregateProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLevelDevicesAggregateProvider?> =
        arrayOfNulls<ILowLevelDevicesAggregateProvider_Impl>(size) as
        Array<ILowLevelDevicesAggregateProvider?>
  }
}
