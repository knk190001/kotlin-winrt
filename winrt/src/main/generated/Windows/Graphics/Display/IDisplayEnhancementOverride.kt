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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayEnhancementOverride.ABI::class)
@Signature("{429594cf-d97a-4b02-a428-5c4292f7f522}")
@Guid("429594cfd97a4b02a4285c4292f7f522")
@WinRTInterface("429594cfd97a4b02a4285c4292f7f522")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayEnhancementOverride.ByReference::class)
public interface IDisplayEnhancementOverride : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColorOverrideSettings(): ColorOverrideSettings?

  @InterfaceMethod(1)
  public fun put_ColorOverrideSettings(value: ColorOverrideSettings?): Unit

  @InterfaceMethod(2)
  public fun get_BrightnessOverrideSettings(): BrightnessOverrideSettings?

  @InterfaceMethod(3)
  public fun put_BrightnessOverrideSettings(value: BrightnessOverrideSettings?): Unit

  @InterfaceMethod(4)
  public fun get_CanOverride(): Boolean

  @InterfaceMethod(5)
  public fun get_IsOverrideActive(): Boolean

  @InterfaceMethod(6)
  public fun GetCurrentDisplayEnhancementOverrideCapabilities():
      DisplayEnhancementOverrideCapabilities?

  @InterfaceMethod(7)
  public fun RequestOverride(): Unit

  @InterfaceMethod(8)
  public fun StopOverride(): Unit

  @InterfaceMethod(9)
  public fun add_CanOverrideChanged(handler: TypedEventHandler<DisplayEnhancementOverride?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_CanOverrideChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_IsOverrideActiveChanged(handler: TypedEventHandler<DisplayEnhancementOverride?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_IsOverrideActiveChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public
      fun add_DisplayEnhancementOverrideCapabilitiesChanged(handler: TypedEventHandler<DisplayEnhancementOverride?,
      DisplayEnhancementOverrideCapabilitiesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_DisplayEnhancementOverrideCapabilitiesChanged(token: EventRegistrationToken?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayEnhancementOverride> {
    public override fun getValue() = ABI.makeIDisplayEnhancementOverride(pointer.getPointer(0))

    public fun setValue(value: IDisplayEnhancementOverride_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayEnhancementOverride {
    public val __1739502901_Ptr: Pointer?

    public val _1739502901_VtblPtr: Pointer?
      get() = __1739502901_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColorOverrideSettings(): ColorOverrideSettings? {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ColorOverrideSettings>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ColorOverrideSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ColorOverrideSettings(value: ColorOverrideSettings?): Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BrightnessOverrideSettings(): BrightnessOverrideSettings? {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrightnessOverrideSettings>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrightnessOverrideSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BrightnessOverrideSettings(value: BrightnessOverrideSettings?): Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CanOverride(): Boolean {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsOverrideActive(): Boolean {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetCurrentDisplayEnhancementOverrideCapabilities():
        DisplayEnhancementOverrideCapabilities? {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayEnhancementOverrideCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayEnhancementOverrideCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun RequestOverride(): Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun StopOverride(): Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override
        fun add_CanOverrideChanged(handler: TypedEventHandler<DisplayEnhancementOverride?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_CanOverrideChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override
        fun add_IsOverrideActiveChanged(handler: TypedEventHandler<DisplayEnhancementOverride?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_IsOverrideActiveChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override
        fun add_DisplayEnhancementOverrideCapabilitiesChanged(handler: TypedEventHandler<DisplayEnhancementOverride?,
        DisplayEnhancementOverrideCapabilitiesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override
        fun remove_DisplayEnhancementOverrideCapabilitiesChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1739502901_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1739502901_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayEnhancementOverride_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1739502901_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayEnhancementOverride, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("429594cfd97a4b02a4285c4292f7f522")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayEnhancementOverride(ptr: Pointer?): WithDefault =
        IDisplayEnhancementOverride_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayEnhancementOverride {
      val address = segment.toRawLongValue()
      return makeIDisplayEnhancementOverride(Pointer(address))
    }

    public override fun toNative(obj: IDisplayEnhancementOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1739502901_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayEnhancementOverride):
        Array<IDisplayEnhancementOverride?> = (elements as
        Array<IDisplayEnhancementOverride?>).castToImpl<IDisplayEnhancementOverride,IDisplayEnhancementOverride_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayEnhancementOverride?> =
        arrayOfNulls<IDisplayEnhancementOverride_Impl>(size) as Array<IDisplayEnhancementOverride?>
  }
}
