package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Visibility
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

@ABIMarker(INavigationViewTemplateSettings.ABI::class)
@Signature("{bbd25fa5-9c08-5f10-be20-cb4c1899bd9d}")
@Guid("bbd25fa59c085f10be20cb4c1899bd9d")
@WinRTInterface("bbd25fa59c085f10be20cb4c1899bd9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewTemplateSettings.ByReference::class)
public interface INavigationViewTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TopPadding(): Double

  @InterfaceMethod(1)
  public fun get_OverflowButtonVisibility(): Visibility?

  @InterfaceMethod(2)
  public fun get_PaneToggleButtonVisibility(): Visibility?

  @InterfaceMethod(3)
  public fun get_BackButtonVisibility(): Visibility?

  @InterfaceMethod(4)
  public fun get_TopPaneVisibility(): Visibility?

  @InterfaceMethod(5)
  public fun get_LeftPaneVisibility(): Visibility?

  @InterfaceMethod(6)
  public fun get_SingleSelectionFollowsFocus(): Boolean

  @InterfaceMethod(7)
  public fun get_PaneToggleButtonWidth(): Double

  @InterfaceMethod(8)
  public fun get_SmallerPaneToggleButtonWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewTemplateSettings> {
    public override fun getValue() = ABI.makeINavigationViewTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: INavigationViewTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewTemplateSettings {
    public val __387484477_Ptr: Pointer?

    public val _387484477_VtblPtr: Pointer?
      get() = __387484477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TopPadding(): Double {
      val fnPtr = _387484477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_OverflowButtonVisibility(): Visibility? {
      val fnPtr = _387484477_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PaneToggleButtonVisibility(): Visibility? {
      val fnPtr = _387484477_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BackButtonVisibility(): Visibility? {
      val fnPtr = _387484477_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TopPaneVisibility(): Visibility? {
      val fnPtr = _387484477_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LeftPaneVisibility(): Visibility? {
      val fnPtr = _387484477_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Visibility>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Visibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SingleSelectionFollowsFocus(): Boolean {
      val fnPtr = _387484477_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_PaneToggleButtonWidth(): Double {
      val fnPtr = _387484477_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_SmallerPaneToggleButtonWidth(): Double {
      val fnPtr = _387484477_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__387484477_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigationViewTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __387484477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbd25fa59c085f10be20cb4c1899bd9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewTemplateSettings(ptr: Pointer?): WithDefault =
        INavigationViewTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewTemplateSettings {
      val address = segment.toRawLongValue()
      return makeINavigationViewTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__387484477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewTemplateSettings):
        Array<INavigationViewTemplateSettings?> = (elements as
        Array<INavigationViewTemplateSettings?>).castToImpl<INavigationViewTemplateSettings,INavigationViewTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewTemplateSettings?> =
        arrayOfNulls<INavigationViewTemplateSettings_Impl>(size) as
        Array<INavigationViewTemplateSettings?>
  }
}
