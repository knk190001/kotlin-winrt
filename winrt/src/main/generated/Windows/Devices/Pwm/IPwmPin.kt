package Windows.Devices.Pwm

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IPwmPin.ABI::class)
@Signature("{22972dc8-c6cf-4821-b7f9-c6454fb6af79}")
@Guid("22972dc8c6cf4821b7f9c6454fb6af79")
@WinRTInterface("22972dc8c6cf4821b7f9c6454fb6af79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPwmPin.ByReference::class)
public interface IPwmPin : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_Controller(): PwmController?

  @InterfaceMethod(1)
  public fun GetActiveDutyCyclePercentage(): Double

  @InterfaceMethod(2)
  public fun SetActiveDutyCyclePercentage(dutyCyclePercentage: Double): Unit

  @InterfaceMethod(3)
  public fun get_Polarity(): PwmPulsePolarity?

  @InterfaceMethod(4)
  public fun put_Polarity(value: PwmPulsePolarity?): Unit

  @InterfaceMethod(5)
  public fun Start(): Unit

  @InterfaceMethod(6)
  public fun Stop(): Unit

  @InterfaceMethod(7)
  public fun get_IsStarted(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPwmPin> {
    public override fun getValue() = ABI.makeIPwmPin(pointer.getPointer(0))

    public fun setValue(value: IPwmPin_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPwmPin, IClosable.WithDefault {
    public val __150616210_Ptr: Pointer?

    public val _150616210_VtblPtr: Pointer?
      get() = __150616210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Controller(): PwmController? {
      val fnPtr = _150616210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PwmController>()
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PwmController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetActiveDutyCyclePercentage(): Double {
      val fnPtr = _150616210_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetActiveDutyCyclePercentage(dutyCyclePercentage: Double): Unit {
      val fnPtr = _150616210_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr, dutyCyclePercentage,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Polarity(): PwmPulsePolarity? {
      val fnPtr = _150616210_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PwmPulsePolarity>()
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PwmPulsePolarity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Polarity(value: PwmPulsePolarity?): Unit {
      val fnPtr = _150616210_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _150616210_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Stop(): Unit {
      val fnPtr = _150616210_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsStarted(): Boolean {
      val fnPtr = _150616210_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__150616210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPwmPin_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_150616210_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __150616210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPwmPin, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("22972dc8c6cf4821b7f9c6454fb6af79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPwmPin(ptr: Pointer?): WithDefault = IPwmPin_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPwmPin {
      val address = segment.toRawLongValue()
      return makeIPwmPin(Pointer(address))
    }

    public override fun toNative(obj: IPwmPin): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__150616210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPwmPin): Array<IPwmPin?> = (elements as
        Array<IPwmPin?>).castToImpl<IPwmPin,IPwmPin_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPwmPin?> = arrayOfNulls<IPwmPin_Impl>(size) as
        Array<IPwmPin?>
  }
}
