package Microsoft.UI.Xaml.Resources

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
@Signature("{e08a5a92-b1a2-539a-9d4a-7994e4468cd7}")
@Guid("e08a5a92b1a2539a9d4a7994e4468cd7")
@WinRTInterface("e08a5a92b1a2539a9d4a7994e4468cd7")
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
    public val __349019355_Ptr: Pointer?

    public val _349019355_VtblPtr: Pointer?
      get() = __349019355_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): CustomXamlResourceLoader? {
      val fnPtr = _349019355_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CustomXamlResourceLoader>()
      val hr = fn.invokeHR(arrayOf(__349019355_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CustomXamlResourceLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Current(value: CustomXamlResourceLoader?): Unit {
      val fnPtr = _349019355_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__349019355_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICustomXamlResourceLoaderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __349019355_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICustomXamlResourceLoaderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e08a5a92b1a2539a9d4a7994e4468cd7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICustomXamlResourceLoaderStatics(ptr: Pointer?): WithDefault =
        ICustomXamlResourceLoaderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICustomXamlResourceLoaderStatics {
      val address = segment.toRawLongValue()
      return makeICustomXamlResourceLoaderStatics(Pointer(address))
    }

    public override fun toNative(obj: ICustomXamlResourceLoaderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__349019355_Ptr))
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
