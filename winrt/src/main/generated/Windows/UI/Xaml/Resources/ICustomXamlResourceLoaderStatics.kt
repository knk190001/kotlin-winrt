package Windows.UI.Xaml.Resources

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

@ABIMarker(ICustomXamlResourceLoaderStatics.ABI::class)
@Signature("{224ff617-e4dc-4c27-ad32-db93d5d0e5da}")
@Guid("224ff617e4dc4c27ad32db93d5d0e5da")
@WinRTInterface("224ff617e4dc4c27ad32db93d5d0e5da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICustomXamlResourceLoaderStatics.ByReference::class)
public interface ICustomXamlResourceLoaderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): CustomXamlResourceLoader?

  @InterfaceMethod(1)
  public fun put_Current(value: CustomXamlResourceLoader?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICustomXamlResourceLoaderStatics> {
    public override fun getValue() = ABI.makeICustomXamlResourceLoaderStatics(pointer.getPointer(0))

    public fun setValue(value: ICustomXamlResourceLoaderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICustomXamlResourceLoaderStatics {
    public val __1980917968_Ptr: Pointer?

    public val _1980917968_VtblPtr: Pointer?
      get() = __1980917968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): CustomXamlResourceLoader? {
      val fnPtr = _1980917968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomXamlResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__1980917968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CustomXamlResourceLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Current(value: CustomXamlResourceLoader?): Unit {
      val fnPtr = _1980917968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1980917968_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICustomXamlResourceLoaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980917968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomXamlResourceLoaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("224ff617e4dc4c27ad32db93d5d0e5da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomXamlResourceLoaderStatics(ptr: Pointer?): WithDefault =
        ICustomXamlResourceLoaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomXamlResourceLoaderStatics {
      val address = segment.toRawLongValue()
      return makeICustomXamlResourceLoaderStatics(Pointer(address))
    }

    public override fun toNative(obj: ICustomXamlResourceLoaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1980917968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICustomXamlResourceLoaderStatics):
        Array<ICustomXamlResourceLoaderStatics?> = (elements as
        Array<ICustomXamlResourceLoaderStatics?>).castToImpl<ICustomXamlResourceLoaderStatics,ICustomXamlResourceLoaderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICustomXamlResourceLoaderStatics?> =
        arrayOfNulls<ICustomXamlResourceLoaderStatics_Impl>(size) as
        Array<ICustomXamlResourceLoaderStatics?>
  }
}
