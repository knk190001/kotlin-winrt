package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.MenuFlyoutPresenterTemplateSettings
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

@ABIMarker(IMenuFlyoutPresenter2.ABI::class)
@Signature("{895894df-5a9f-4a1f-85ec-6f3c1b6dcb89}")
@Guid("895894df5a9f4a1f85ec6f3c1b6dcb89")
@WinRTInterface("895894df5a9f4a1f85ec6f3c1b6dcb89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutPresenter2.ByReference::class)
public interface IMenuFlyoutPresenter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): MenuFlyoutPresenterTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutPresenter2> {
    public override fun getValue() = ABI.makeIMenuFlyoutPresenter2(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutPresenter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutPresenter2 {
    public val __971191168_Ptr: Pointer?

    public val _971191168_VtblPtr: Pointer?
      get() = __971191168_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): MenuFlyoutPresenterTemplateSettings? {
      val fnPtr = _971191168_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MenuFlyoutPresenterTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__971191168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MenuFlyoutPresenterTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IMenuFlyoutPresenter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __971191168_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutPresenter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("895894df5a9f4a1f85ec6f3c1b6dcb89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutPresenter2(ptr: Pointer?): WithDefault =
        IMenuFlyoutPresenter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutPresenter2 {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutPresenter2(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutPresenter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__971191168_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutPresenter2): Array<IMenuFlyoutPresenter2?> =
        (elements as
        Array<IMenuFlyoutPresenter2?>).castToImpl<IMenuFlyoutPresenter2,IMenuFlyoutPresenter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutPresenter2?> =
        arrayOfNulls<IMenuFlyoutPresenter2_Impl>(size) as Array<IMenuFlyoutPresenter2?>
  }
}
