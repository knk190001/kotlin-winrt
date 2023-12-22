package Windows.Graphics.Display

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IBrightnessOverride.ABI::class)
@Signature("{96c9621a-c143-4392-bedd-4a7e9574c8fd}")
@Guid("96c9621ac1434392bedd4a7e9574c8fd")
@WinRTInterface("96c9621ac1434392bedd4a7e9574c8fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrightnessOverride.ByReference::class)
public interface IBrightnessOverride : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsOverrideActive(): Boolean

  @InterfaceMethod(2)
  public fun get_BrightnessLevel(): Double

  @InterfaceMethod(3)
  public fun SetBrightnessLevel(brightnessLevel: Double,
      options: DisplayBrightnessOverrideOptions?): Unit

  @InterfaceMethod(4)
  public fun SetBrightnessScenario(scenario: DisplayBrightnessScenario?,
      options: DisplayBrightnessOverrideOptions?): Unit

  @InterfaceMethod(5)
  public fun GetLevelForScenario(scenario: DisplayBrightnessScenario?): Double

  @InterfaceMethod(6)
  public fun StartOverride(): Unit

  @InterfaceMethod(7)
  public fun StopOverride(): Unit

  @InterfaceMethod(8)
  public fun add_IsSupportedChanged(handler: TypedEventHandler<BrightnessOverride?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_IsSupportedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_IsOverrideActiveChanged(handler: TypedEventHandler<BrightnessOverride?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_IsOverrideActiveChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_BrightnessLevelChanged(handler: TypedEventHandler<BrightnessOverride?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_BrightnessLevelChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrightnessOverride> {
    public override fun getValue() = ABI.makeIBrightnessOverride(pointer.getPointer(0))

    public fun setValue(value: IBrightnessOverride_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrightnessOverride {
    public val __1755948700_Ptr: Pointer?

    public val _1755948700_VtblPtr: Pointer?
      get() = __1755948700_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSupported(): Boolean {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsOverrideActive(): Boolean {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_BrightnessLevel(): Double {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetBrightnessLevel(brightnessLevel: Double,
        options: DisplayBrightnessOverrideOptions?): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, brightnessLevel, marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun SetBrightnessScenario(scenario: DisplayBrightnessScenario?,
        options: DisplayBrightnessOverrideOptions?): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(scenario),
          marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetLevelForScenario(scenario: DisplayBrightnessScenario?): Double {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(scenario), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun StartOverride(): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun StopOverride(): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_IsSupportedChanged(handler: TypedEventHandler<BrightnessOverride?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_IsSupportedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_IsOverrideActiveChanged(handler: TypedEventHandler<BrightnessOverride?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_IsOverrideActiveChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_BrightnessLevelChanged(handler: TypedEventHandler<BrightnessOverride?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_BrightnessLevelChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1755948700_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1755948700_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBrightnessOverride_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1755948700_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrightnessOverride, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96c9621ac1434392bedd4a7e9574c8fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrightnessOverride(ptr: Pointer?): WithDefault = IBrightnessOverride_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrightnessOverride {
      val address = segment.toRawLongValue()
      return makeIBrightnessOverride(Pointer(address))
    }

    public override fun toNative(obj: IBrightnessOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1755948700_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrightnessOverride): Array<IBrightnessOverride?> =
        (elements as
        Array<IBrightnessOverride?>).castToImpl<IBrightnessOverride,IBrightnessOverride_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrightnessOverride?> =
        arrayOfNulls<IBrightnessOverride_Impl>(size) as Array<IBrightnessOverride?>
  }
}
