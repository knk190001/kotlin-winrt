package Windows.UI.Xaml.Hosting

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlUIPresenterHost.ABI::class)
@Signature("{aafb84cd-9f6d-4f80-ac2c-0e6cb9f31659}")
@Guid("aafb84cd9f6d4f80ac2c0e6cb9f31659")
@WinRTInterface("aafb84cd9f6d4f80ac2c0e6cb9f31659")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUIPresenterHost.ByReference::class)
public interface IXamlUIPresenterHost : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ResolveFileResource(path: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUIPresenterHost> {
    public override fun getValue() = ABI.makeIXamlUIPresenterHost(pointer.getPointer(0))

    public fun setValue(value: IXamlUIPresenterHost_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUIPresenterHost {
    public val __1913366414_Ptr: Pointer?

    public val _1913366414_VtblPtr: Pointer?
      get() = __1913366414_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ResolveFileResource(path: String?): String? {
      val fnPtr = _1913366414_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1913366414_Ptr, marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IXamlUIPresenterHost_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1913366414_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUIPresenterHost, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aafb84cd9f6d4f80ac2c0e6cb9f31659")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUIPresenterHost(ptr: Pointer?): WithDefault = IXamlUIPresenterHost_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUIPresenterHost {
      val address = segment.toRawLongValue()
      return makeIXamlUIPresenterHost(Pointer(address))
    }

    public override fun toNative(obj: IXamlUIPresenterHost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1913366414_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUIPresenterHost): Array<IXamlUIPresenterHost?> =
        (elements as
        Array<IXamlUIPresenterHost?>).castToImpl<IXamlUIPresenterHost,IXamlUIPresenterHost_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUIPresenterHost?> =
        arrayOfNulls<IXamlUIPresenterHost_Impl>(size) as Array<IXamlUIPresenterHost?>
  }
}
