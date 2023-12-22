package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.Rect
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICommandBarTemplateSettings.ABI::class)
@Signature("{61c8f92c-05aa-414a-a2ae-482c5a46c08e}")
@Guid("61c8f92c05aa414aa2ae482c5a46c08e")
@WinRTInterface("61c8f92c05aa414aa2ae482c5a46c08e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarTemplateSettings.ByReference::class)
public interface ICommandBarTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentHeight(): Double

  @InterfaceMethod(1)
  public fun get_OverflowContentClipRect(): Rect?

  @InterfaceMethod(2)
  public fun get_OverflowContentMinWidth(): Double

  @InterfaceMethod(3)
  public fun get_OverflowContentMaxHeight(): Double

  @InterfaceMethod(4)
  public fun get_OverflowContentHorizontalOffset(): Double

  @InterfaceMethod(5)
  public fun get_OverflowContentHeight(): Double

  @InterfaceMethod(6)
  public fun get_NegativeOverflowContentHeight(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarTemplateSettings> {
    public override fun getValue() = ABI.makeICommandBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ICommandBarTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarTemplateSettings {
    public val __491721601_Ptr: Pointer?

    public val _491721601_VtblPtr: Pointer?
      get() = __491721601_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentHeight(): Double {
      val fnPtr = _491721601_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OverflowContentClipRect(): Rect? {
      val fnPtr = _491721601_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OverflowContentMinWidth(): Double {
      val fnPtr = _491721601_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_OverflowContentMaxHeight(): Double {
      val fnPtr = _491721601_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_OverflowContentHorizontalOffset(): Double {
      val fnPtr = _491721601_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_OverflowContentHeight(): Double {
      val fnPtr = _491721601_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_NegativeOverflowContentHeight(): Double {
      val fnPtr = _491721601_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__491721601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class ICommandBarTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __491721601_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61c8f92c05aa414aa2ae482c5a46c08e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarTemplateSettings(ptr: Pointer?): WithDefault =
        ICommandBarTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarTemplateSettings {
      val address = segment.toRawLongValue()
      return makeICommandBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__491721601_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarTemplateSettings):
        Array<ICommandBarTemplateSettings?> = (elements as
        Array<ICommandBarTemplateSettings?>).castToImpl<ICommandBarTemplateSettings,ICommandBarTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarTemplateSettings?> =
        arrayOfNulls<ICommandBarTemplateSettings_Impl>(size) as Array<ICommandBarTemplateSettings?>
  }
}
