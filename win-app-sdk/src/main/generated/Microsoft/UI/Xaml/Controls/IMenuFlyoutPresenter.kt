package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.MenuFlyoutPresenterTemplateSettings
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

@ABIMarker(IMenuFlyoutPresenter.ABI::class)
@Signature("{5c9b4644-e292-5436-86ec-1c0e29f94c2d}")
@Guid("5c9b4644e292543686ec1c0e29f94c2d")
@WinRTInterface("5c9b4644e292543686ec1c0e29f94c2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutPresenter.ByReference::class)
public interface IMenuFlyoutPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): MenuFlyoutPresenterTemplateSettings?

  @InterfaceMethod(1)
  public fun get_IsDefaultShadowEnabled(): Boolean

  @InterfaceMethod(2)
  public fun put_IsDefaultShadowEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutPresenter> {
    public override fun getValue() = ABI.makeIMenuFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutPresenter {
    public val __1885508199_Ptr: Pointer?

    public val _1885508199_VtblPtr: Pointer?
      get() = __1885508199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): MenuFlyoutPresenterTemplateSettings? {
      val fnPtr = _1885508199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutPresenterTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1885508199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutPresenterTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsDefaultShadowEnabled(): Boolean {
      val fnPtr = _1885508199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1885508199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsDefaultShadowEnabled(value: Boolean): Unit {
      val fnPtr = _1885508199_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1885508199_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMenuFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1885508199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c9b4644e292543686ec1c0e29f94c2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutPresenter(ptr: Pointer?): WithDefault = IMenuFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885508199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutPresenter): Array<IMenuFlyoutPresenter?> =
        (elements as
        Array<IMenuFlyoutPresenter?>).castToImpl<IMenuFlyoutPresenter,IMenuFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutPresenter?> =
        arrayOfNulls<IMenuFlyoutPresenter_Impl>(size) as Array<IMenuFlyoutPresenter?>
  }
}
