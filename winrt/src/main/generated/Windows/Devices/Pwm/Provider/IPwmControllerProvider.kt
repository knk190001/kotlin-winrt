package Windows.Devices.Pwm.Provider

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPwmControllerProvider.ABI::class)
@Signature("{1300593b-e2e3-40a4-b7d9-48dff0377a52}")
@Guid("1300593be2e340a4b7d948dff0377a52")
@WinRTInterface("1300593be2e340a4b7d948dff0377a52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPwmControllerProvider.ByReference::class)
public interface IPwmControllerProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PinCount(): Int

  @InterfaceMethod(1)
  public fun get_ActualFrequency(): Double

  @InterfaceMethod(2)
  public fun SetDesiredFrequency(frequency: Double): Double

  @InterfaceMethod(3)
  public fun get_MaxFrequency(): Double

  @InterfaceMethod(4)
  public fun get_MinFrequency(): Double

  @InterfaceMethod(5)
  public fun AcquirePin(pin: Int): Unit

  @InterfaceMethod(6)
  public fun ReleasePin(pin: Int): Unit

  @InterfaceMethod(7)
  public fun EnablePin(pin: Int): Unit

  @InterfaceMethod(8)
  public fun DisablePin(pin: Int): Unit

  @InterfaceMethod(9)
  public fun SetPulseParameters(
    pin: Int,
    dutyCycle: Double,
    invertPolarity: Boolean
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPwmControllerProvider> {
    public override fun getValue() = ABI.makeIPwmControllerProvider(pointer.getPointer(0))

    public fun setValue(value: IPwmControllerProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPwmControllerProvider {
    public val __1461113119_Ptr: Pointer?

    public val _1461113119_VtblPtr: Pointer?
      get() = __1461113119_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PinCount(): Int {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ActualFrequency(): Double {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetDesiredFrequency(frequency: Double): Double {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr, frequency, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxFrequency(): Double {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MinFrequency(): Double {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun AcquirePin(pin: Int): Unit {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr, pin,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun ReleasePin(pin: Int): Unit {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr, pin,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun EnablePin(pin: Int): Unit {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr, pin,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun DisablePin(pin: Int): Unit {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr, pin,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetPulseParameters(
      pin: Int,
      dutyCycle: Double,
      invertPolarity: Boolean
    ): Unit {
      val fnPtr = _1461113119_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461113119_Ptr, pin, dutyCycle, invertPolarity,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPwmControllerProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1461113119_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPwmControllerProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1300593be2e340a4b7d948dff0377a52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPwmControllerProvider(ptr: Pointer?): WithDefault =
        IPwmControllerProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPwmControllerProvider {
      val address = segment.toRawLongValue()
      return makeIPwmControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: IPwmControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1461113119_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPwmControllerProvider): Array<IPwmControllerProvider?> =
        (elements as
        Array<IPwmControllerProvider?>).castToImpl<IPwmControllerProvider,IPwmControllerProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPwmControllerProvider?> =
        arrayOfNulls<IPwmControllerProvider_Impl>(size) as Array<IPwmControllerProvider?>
  }
}
