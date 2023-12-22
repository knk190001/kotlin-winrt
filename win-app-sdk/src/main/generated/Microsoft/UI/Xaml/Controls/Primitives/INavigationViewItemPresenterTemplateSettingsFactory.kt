package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewItemPresenterTemplateSettingsFactory.ABI::class)
@Signature("{19ef1328-52c7-55e3-b1bb-923f2f39bd6e}")
@Guid("19ef132852c755e3b1bb923f2f39bd6e")
@WinRTInterface("19ef132852c755e3b1bb923f2f39bd6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItemPresenterTemplateSettingsFactory.ByReference::class)
public interface INavigationViewItemPresenterTemplateSettingsFactory : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NavigationViewItemPresenterTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItemPresenterTemplateSettingsFactory> {
    public override fun getValue() =
        ABI.makeINavigationViewItemPresenterTemplateSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItemPresenterTemplateSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItemPresenterTemplateSettingsFactory {
    public val __1696778114_Ptr: Pointer?

    public val _1696778114_VtblPtr: Pointer?
      get() = __1696778114_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NavigationViewItemPresenterTemplateSettings? {
      val fnPtr = _1696778114_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewItemPresenterTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1696778114_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<NavigationViewItemPresenterTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewItemPresenterTemplateSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1696778114_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItemPresenterTemplateSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19ef132852c755e3b1bb923f2f39bd6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItemPresenterTemplateSettingsFactory(ptr: Pointer?): WithDefault =
        INavigationViewItemPresenterTemplateSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INavigationViewItemPresenterTemplateSettingsFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewItemPresenterTemplateSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItemPresenterTemplateSettingsFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1696778114_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItemPresenterTemplateSettingsFactory):
        Array<INavigationViewItemPresenterTemplateSettingsFactory?> = (elements as
        Array<INavigationViewItemPresenterTemplateSettingsFactory?>).castToImpl<INavigationViewItemPresenterTemplateSettingsFactory,INavigationViewItemPresenterTemplateSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<INavigationViewItemPresenterTemplateSettingsFactory?> =
        arrayOfNulls<INavigationViewItemPresenterTemplateSettingsFactory_Impl>(size) as
        Array<INavigationViewItemPresenterTemplateSettingsFactory?>
  }
}
