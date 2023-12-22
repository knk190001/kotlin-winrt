package Microsoft.UI.Xaml.Resources

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

@ABIMarker(ICustomXamlResourceLoaderFactory.ABI::class)
@Signature("{174d49a6-e1e2-5f7b-a618-a8a953d1b5a0}")
@Guid("174d49a6e1e25f7ba618a8a953d1b5a0")
@WinRTInterface("174d49a6e1e25f7ba618a8a953d1b5a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomXamlResourceLoaderFactory.ByReference::class)
public interface ICustomXamlResourceLoaderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      CustomXamlResourceLoader?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomXamlResourceLoaderFactory> {
    public override fun getValue() = ABI.makeICustomXamlResourceLoaderFactory(pointer.getPointer(0))

    public fun setValue(value: ICustomXamlResourceLoaderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomXamlResourceLoaderFactory {
    public val __1154272800_Ptr: Pointer?

    public val _1154272800_VtblPtr: Pointer?
      get() = __1154272800_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CustomXamlResourceLoader? {
      val fnPtr = _1154272800_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomXamlResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1154272800_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CustomXamlResourceLoader>(result.getValue())
      return resultValue
    }
  }

  public class ICustomXamlResourceLoaderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1154272800_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomXamlResourceLoaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("174d49a6e1e25f7ba618a8a953d1b5a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomXamlResourceLoaderFactory(ptr: Pointer?): WithDefault =
        ICustomXamlResourceLoaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomXamlResourceLoaderFactory {
      val address = segment.toRawLongValue()
      return makeICustomXamlResourceLoaderFactory(Pointer(address))
    }

    public override fun toNative(obj: ICustomXamlResourceLoaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1154272800_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomXamlResourceLoaderFactory):
        Array<ICustomXamlResourceLoaderFactory?> = (elements as
        Array<ICustomXamlResourceLoaderFactory?>).castToImpl<ICustomXamlResourceLoaderFactory,ICustomXamlResourceLoaderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomXamlResourceLoaderFactory?> =
        arrayOfNulls<ICustomXamlResourceLoaderFactory_Impl>(size) as
        Array<ICustomXamlResourceLoaderFactory?>
  }
}
