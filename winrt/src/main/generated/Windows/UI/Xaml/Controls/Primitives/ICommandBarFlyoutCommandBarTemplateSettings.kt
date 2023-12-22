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

@ABIMarker(ICommandBarFlyoutCommandBarTemplateSettings.ABI::class)
@Signature("{47642c44-26ff-5d14-9cfc-77dc64f3a447}")
@Guid("47642c4426ff5d149cfc77dc64f3a447")
@WinRTInterface("47642c4426ff5d149cfc77dc64f3a447")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarFlyoutCommandBarTemplateSettings.ByReference::class)
public interface ICommandBarFlyoutCommandBarTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpenAnimationStartPosition(): Double

  @InterfaceMethod(1)
  public fun get_OpenAnimationEndPosition(): Double

  @InterfaceMethod(2)
  public fun get_CloseAnimationEndPosition(): Double

  @InterfaceMethod(3)
  public fun get_CurrentWidth(): Double

  @InterfaceMethod(4)
  public fun get_ExpandedWidth(): Double

  @InterfaceMethod(5)
  public fun get_WidthExpansionDelta(): Double

  @InterfaceMethod(6)
  public fun get_WidthExpansionAnimationStartPosition(): Double

  @InterfaceMethod(7)
  public fun get_WidthExpansionAnimationEndPosition(): Double

  @InterfaceMethod(8)
  public fun get_WidthExpansionMoreButtonAnimationStartPosition(): Double

  @InterfaceMethod(9)
  public fun get_WidthExpansionMoreButtonAnimationEndPosition(): Double

  @InterfaceMethod(10)
  public fun get_ExpandUpOverflowVerticalPosition(): Double

  @InterfaceMethod(11)
  public fun get_ExpandDownOverflowVerticalPosition(): Double

  @InterfaceMethod(12)
  public fun get_ExpandUpAnimationStartPosition(): Double

  @InterfaceMethod(13)
  public fun get_ExpandUpAnimationEndPosition(): Double

  @InterfaceMethod(14)
  public fun get_ExpandUpAnimationHoldPosition(): Double

  @InterfaceMethod(15)
  public fun get_ExpandDownAnimationStartPosition(): Double

  @InterfaceMethod(16)
  public fun get_ExpandDownAnimationEndPosition(): Double

  @InterfaceMethod(17)
  public fun get_ExpandDownAnimationHoldPosition(): Double

  @InterfaceMethod(18)
  public fun get_ContentClipRect(): Rect?

  @InterfaceMethod(19)
  public fun get_OverflowContentClipRect(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarFlyoutCommandBarTemplateSettings> {
    public override fun getValue() =
        ABI.makeICommandBarFlyoutCommandBarTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ICommandBarFlyoutCommandBarTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarFlyoutCommandBarTemplateSettings {
    public val __1822707396_Ptr: Pointer?

    public val _1822707396_VtblPtr: Pointer?
      get() = __1822707396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpenAnimationStartPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OpenAnimationEndPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CloseAnimationEndPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CurrentWidth(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ExpandedWidth(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_WidthExpansionDelta(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_WidthExpansionAnimationStartPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_WidthExpansionAnimationEndPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_WidthExpansionMoreButtonAnimationStartPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_WidthExpansionMoreButtonAnimationEndPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_ExpandUpOverflowVerticalPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_ExpandDownOverflowVerticalPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_ExpandUpAnimationStartPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_ExpandUpAnimationEndPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_ExpandUpAnimationHoldPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_ExpandDownAnimationStartPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_ExpandDownAnimationEndPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_ExpandDownAnimationHoldPosition(): Double {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_ContentClipRect(): Rect? {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_OverflowContentClipRect(): Rect? {
      val fnPtr = _1822707396_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1822707396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class ICommandBarFlyoutCommandBarTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1822707396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarFlyoutCommandBarTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47642c4426ff5d149cfc77dc64f3a447")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarFlyoutCommandBarTemplateSettings(ptr: Pointer?): WithDefault =
        ICommandBarFlyoutCommandBarTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICommandBarFlyoutCommandBarTemplateSettings {
      val address = segment.toRawLongValue()
      return makeICommandBarFlyoutCommandBarTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarFlyoutCommandBarTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1822707396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarFlyoutCommandBarTemplateSettings):
        Array<ICommandBarFlyoutCommandBarTemplateSettings?> = (elements as
        Array<ICommandBarFlyoutCommandBarTemplateSettings?>).castToImpl<ICommandBarFlyoutCommandBarTemplateSettings,ICommandBarFlyoutCommandBarTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarFlyoutCommandBarTemplateSettings?> =
        arrayOfNulls<ICommandBarFlyoutCommandBarTemplateSettings_Impl>(size) as
        Array<ICommandBarFlyoutCommandBarTemplateSettings?>
  }
}
