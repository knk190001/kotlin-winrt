package Windows.UI.Xaml.Resources

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
@Signature("{5bfd7e49-7886-44f3-8ed3-6fec0463ed69}")
@Guid("5bfd7e49788644f38ed36fec0463ed69")
@WinRTInterface("5bfd7e49788644f38ed36fec0463ed69")
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
    public val __1175664523_Ptr: Pointer?

    public val _1175664523_VtblPtr: Pointer?
      get() = __1175664523_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CustomXamlResourceLoader? {
      val fnPtr = _1175664523_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomXamlResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1175664523_Ptr, marshalToNative(baseInterface),
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
    public override val __1175664523_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomXamlResourceLoaderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bfd7e49788644f38ed36fec0463ed69")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomXamlResourceLoaderFactory(ptr: Pointer?): WithDefault =
        ICustomXamlResourceLoaderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomXamlResourceLoaderFactory {
      val address = segment.toRawLongValue()
      return makeICustomXamlResourceLoaderFactory(Pointer(address))
    }

    public override fun toNative(obj: ICustomXamlResourceLoaderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1175664523_Ptr))
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
