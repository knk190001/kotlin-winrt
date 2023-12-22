package Microsoft.UI.Xaml

import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IDebugSettings.ABI::class)
@Signature("{4004943b-2509-5476-bba2-3fe05ecf615d}")
@Guid("4004943b25095476bba23fe05ecf615d")
@WinRTInterface("4004943b25095476bba23fe05ecf615d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDebugSettings.ByReference::class)
public interface IDebugSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnableFrameRateCounter(): Boolean

  @InterfaceMethod(1)
  public fun put_EnableFrameRateCounter(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsBindingTracingEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsBindingTracingEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsTextPerformanceVisualizationEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsTextPerformanceVisualizationEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_FailFastOnErrors(): Boolean

  @InterfaceMethod(7)
  public fun put_FailFastOnErrors(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun add_BindingFailed(handler: BindingFailedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_BindingFailed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDebugSettings>
      {
    public override fun getValue() = ABI.makeIDebugSettings(pointer.getPointer(0))

    public fun setValue(value: IDebugSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDebugSettings {
    public val __1282742609_Ptr: Pointer?

    public val _1282742609_VtblPtr: Pointer?
      get() = __1282742609_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnableFrameRateCounter(): Boolean {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_EnableFrameRateCounter(value: Boolean): Unit {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsBindingTracingEnabled(): Boolean {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsBindingTracingEnabled(value: Boolean): Unit {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsTextPerformanceVisualizationEnabled(): Boolean {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsTextPerformanceVisualizationEnabled(value: Boolean): Unit {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FailFastOnErrors(): Boolean {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_FailFastOnErrors(value: Boolean): Unit {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_BindingFailed(handler: BindingFailedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_BindingFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1282742609_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1282742609_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDebugSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1282742609_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDebugSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4004943b25095476bba23fe05ecf615d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDebugSettings(ptr: Pointer?): WithDefault = IDebugSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDebugSettings {
      val address = segment.toRawLongValue()
      return makeIDebugSettings(Pointer(address))
    }

    public override fun toNative(obj: IDebugSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1282742609_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDebugSettings): Array<IDebugSettings?> = (elements as
        Array<IDebugSettings?>).castToImpl<IDebugSettings,IDebugSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDebugSettings?> =
        arrayOfNulls<IDebugSettings_Impl>(size) as Array<IDebugSettings?>
  }
}
