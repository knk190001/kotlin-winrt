package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(INavigationViewTemplateSettingsStatics.ABI::class)
@Signature("{2c885e59-f7b9-5078-aeb6-8d7a03c05d02}")
@Guid("2c885e59f7b95078aeb68d7a03c05d02")
@WinRTInterface("2c885e59f7b95078aeb68d7a03c05d02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewTemplateSettingsStatics.ByReference::class)
public interface INavigationViewTemplateSettingsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TopPaddingProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OverflowButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PaneToggleButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_BackButtonVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_TopPaneVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_LeftPaneVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_SingleSelectionFollowsFocusProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewTemplateSettingsStatics> {
    public override fun getValue() =
        ABI.makeINavigationViewTemplateSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationViewTemplateSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewTemplateSettingsStatics {
    public val __1189712019_Ptr: Pointer?

    public val _1189712019_VtblPtr: Pointer?
      get() = __1189712019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TopPaddingProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OverflowButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PaneToggleButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BackButtonVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TopPaneVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_LeftPaneVisibilityProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SingleSelectionFollowsFocusProperty(): DependencyProperty? {
      val fnPtr = _1189712019_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1189712019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewTemplateSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1189712019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewTemplateSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c885e59f7b95078aeb68d7a03c05d02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewTemplateSettingsStatics(ptr: Pointer?): WithDefault =
        INavigationViewTemplateSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewTemplateSettingsStatics {
      val address = segment.toRawLongValue()
      return makeINavigationViewTemplateSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewTemplateSettingsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1189712019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewTemplateSettingsStatics):
        Array<INavigationViewTemplateSettingsStatics?> = (elements as
        Array<INavigationViewTemplateSettingsStatics?>).castToImpl<INavigationViewTemplateSettingsStatics,INavigationViewTemplateSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewTemplateSettingsStatics?> =
        arrayOfNulls<INavigationViewTemplateSettingsStatics_Impl>(size) as
        Array<INavigationViewTemplateSettingsStatics?>
  }
}
