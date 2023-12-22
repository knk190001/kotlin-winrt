package Windows.Devices.Gpio.Provider

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGpioPinProvider.ABI::class)
@Signature("{42344cb7-6abc-40ff-9ce7-73b85301b900}")
@Guid("42344cb76abc40ff9ce773b85301b900")
@WinRTInterface("42344cb76abc40ff9ce773b85301b900")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGpioPinProvider.ByReference::class)
public interface IGpioPinProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ValueChanged(handler: TypedEventHandler<IGpioPinProvider?,
      GpioPinProviderValueChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ValueChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_DebounceTimeout(): TimeSpan?

  @InterfaceMethod(3)
  public fun put_DebounceTimeout(value: TimeSpan?): Unit

  @InterfaceMethod(4)
  public fun get_PinNumber(): Int

  @InterfaceMethod(5)
  public fun get_SharingMode(): ProviderGpioSharingMode?

  @InterfaceMethod(6)
  public fun IsDriveModeSupported(driveMode: ProviderGpioPinDriveMode?): Boolean

  @InterfaceMethod(7)
  public fun GetDriveMode(): ProviderGpioPinDriveMode?

  @InterfaceMethod(8)
  public fun SetDriveMode(value: ProviderGpioPinDriveMode?): Unit

  @InterfaceMethod(9)
  public fun Write(value: ProviderGpioPinValue?): Unit

  @InterfaceMethod(10)
  public fun Read(): ProviderGpioPinValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGpioPinProvider> {
    public override fun getValue() = ABI.makeIGpioPinProvider(pointer.getPointer(0))

    public fun setValue(value: IGpioPinProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGpioPinProvider {
    public val __1365467070_Ptr: Pointer?

    public val _1365467070_VtblPtr: Pointer?
      get() = __1365467070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ValueChanged(handler: TypedEventHandler<IGpioPinProvider?,
        GpioPinProviderValueChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ValueChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DebounceTimeout(): TimeSpan? {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DebounceTimeout(value: TimeSpan?): Unit {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PinNumber(): Int {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_SharingMode(): ProviderGpioSharingMode? {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderGpioSharingMode>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderGpioSharingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun IsDriveModeSupported(driveMode: ProviderGpioPinDriveMode?): Boolean {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr, marshalToNative(driveMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetDriveMode(): ProviderGpioPinDriveMode? {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderGpioPinDriveMode>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderGpioPinDriveMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetDriveMode(value: ProviderGpioPinDriveMode?): Unit {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Write(value: ProviderGpioPinValue?): Unit {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Read(): ProviderGpioPinValue? {
      val fnPtr = _1365467070_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProviderGpioPinValue>()
      val hr = fn.invokeHR(arrayOf(__1365467070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProviderGpioPinValue>(result.getValue())
      return resultValue
    }
  }

  public class IGpioPinProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1365467070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGpioPinProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42344cb76abc40ff9ce773b85301b900")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGpioPinProvider(ptr: Pointer?): WithDefault = IGpioPinProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGpioPinProvider {
      val address = segment.toRawLongValue()
      return makeIGpioPinProvider(Pointer(address))
    }

    public override fun toNative(obj: IGpioPinProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1365467070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGpioPinProvider): Array<IGpioPinProvider?> = (elements as
        Array<IGpioPinProvider?>).castToImpl<IGpioPinProvider,IGpioPinProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGpioPinProvider?> =
        arrayOfNulls<IGpioPinProvider_Impl>(size) as Array<IGpioPinProvider?>
  }
}
