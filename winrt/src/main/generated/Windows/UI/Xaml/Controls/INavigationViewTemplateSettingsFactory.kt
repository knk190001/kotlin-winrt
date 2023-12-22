package Windows.UI.Xaml.Controls

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

@ABIMarker(INavigationViewTemplateSettingsFactory.ABI::class)
@Signature("{28a6a351-64bc-5b60-8f74-e9ee908a240e}")
@Guid("28a6a35164bc5b608f74e9ee908a240e")
@WinRTInterface("28a6a35164bc5b608f74e9ee908a240e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewTemplateSettingsFactory.ByReference::class)
public interface INavigationViewTemplateSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NavigationViewTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewTemplateSettingsFactory> {
    public override fun getValue() =
        ABI.makeINavigationViewTemplateSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: INavigationViewTemplateSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewTemplateSettingsFactory {
    public val __1994965464_Ptr: Pointer?

    public val _1994965464_VtblPtr: Pointer?
      get() = __1994965464_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NavigationViewTemplateSettings? {
      val fnPtr = _1994965464_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NavigationViewTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1994965464_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NavigationViewTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class INavigationViewTemplateSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1994965464_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewTemplateSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("28a6a35164bc5b608f74e9ee908a240e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewTemplateSettingsFactory(ptr: Pointer?): WithDefault =
        INavigationViewTemplateSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewTemplateSettingsFactory {
      val address = segment.toRawLongValue()
      return makeINavigationViewTemplateSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewTemplateSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1994965464_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewTemplateSettingsFactory):
        Array<INavigationViewTemplateSettingsFactory?> = (elements as
        Array<INavigationViewTemplateSettingsFactory?>).castToImpl<INavigationViewTemplateSettingsFactory,INavigationViewTemplateSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewTemplateSettingsFactory?> =
        arrayOfNulls<INavigationViewTemplateSettingsFactory_Impl>(size) as
        Array<INavigationViewTemplateSettingsFactory?>
  }
}
