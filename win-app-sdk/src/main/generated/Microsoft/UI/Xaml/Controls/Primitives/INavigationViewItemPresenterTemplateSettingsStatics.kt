package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(INavigationViewItemPresenterTemplateSettingsStatics.ABI::class)
@Signature("{72f09642-c658-5b06-8c81-1566b737b746}")
@Guid("72f09642c6585b068c811566b737b746")
@WinRTInterface("72f09642c6585b068c811566b737b746")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenterTemplateSettingsStatics.ByReference::class)
public interface INavigationViewItemPresenterTemplateSettingsStatics : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_IconWidthProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SmallerIconWidthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenterTemplateSettingsStatics> {
    public override fun getValue() =
        ABI.makeINavigationViewItemPresenterTemplateSettingsStatics(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenterTemplateSettingsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenterTemplateSettingsStatics {
    public val __891524669_Ptr: Pointer?

    public val _891524669_VtblPtr: Pointer?
      get() = __891524669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IconWidthProperty(): DependencyProperty? {
      val fnPtr = _891524669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__891524669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SmallerIconWidthProperty(): DependencyProperty? {
      val fnPtr = _891524669_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__891524669_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemPresenterTemplateSettingsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __891524669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenterTemplateSettingsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72f09642c6585b068c811566b737b746")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenterTemplateSettingsStatics(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenterTemplateSettingsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewItemPresenterTemplateSettingsStatics {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenterTemplateSettingsStatics(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenterTemplateSettingsStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__891524669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenterTemplateSettingsStatics):
        Array<INavigationViewItemPresenterTemplateSettingsStatics?> = (elements as
        Array<INavigationViewItemPresenterTemplateSettingsStatics?>).castToImpl<INavigationViewItemPresenterTemplateSettingsStatics,INavigationViewItemPresenterTemplateSettingsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<INavigationViewItemPresenterTemplateSettingsStatics?> =
        arrayOfNulls<INavigationViewItemPresenterTemplateSettingsStatics_Impl>(size) as
        Array<INavigationViewItemPresenterTemplateSettingsStatics?>
  }
}
