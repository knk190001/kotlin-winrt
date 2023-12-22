package Windows.Security.Isolation

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

@ABIMarker(IIsolatedWindowsEnvironmentShareFolderRequestOptions.ABI::class)
@Signature("{c405eb7d-7053-4f6a-9b87-746846ed19b2}")
@Guid("c405eb7d70534f6a9b87746846ed19b2")
@WinRTInterface("c405eb7d70534f6a9b87746846ed19b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsolatedWindowsEnvironmentShareFolderRequestOptions.ByReference::class)
public interface IIsolatedWindowsEnvironmentShareFolderRequestOptions : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowWrite(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowWrite(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsolatedWindowsEnvironmentShareFolderRequestOptions> {
    public override fun getValue() =
        ABI.makeIIsolatedWindowsEnvironmentShareFolderRequestOptions(pointer.getPointer(0))

    public fun setValue(value: IIsolatedWindowsEnvironmentShareFolderRequestOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsolatedWindowsEnvironmentShareFolderRequestOptions {
    public val __656968811_Ptr: Pointer?

    public val _656968811_VtblPtr: Pointer?
      get() = __656968811_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowWrite(): Boolean {
      val fnPtr = _656968811_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__656968811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowWrite(value: Boolean): Unit {
      val fnPtr = _656968811_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__656968811_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IIsolatedWindowsEnvironmentShareFolderRequestOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __656968811_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsolatedWindowsEnvironmentShareFolderRequestOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c405eb7d70534f6a9b87746846ed19b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsolatedWindowsEnvironmentShareFolderRequestOptions(ptr: Pointer?): WithDefault
        = IIsolatedWindowsEnvironmentShareFolderRequestOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IIsolatedWindowsEnvironmentShareFolderRequestOptions {
      val address = segment.toRawLongValue()
      return makeIIsolatedWindowsEnvironmentShareFolderRequestOptions(Pointer(address))
    }

    public override fun toNative(obj: IIsolatedWindowsEnvironmentShareFolderRequestOptions):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__656968811_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsolatedWindowsEnvironmentShareFolderRequestOptions):
        Array<IIsolatedWindowsEnvironmentShareFolderRequestOptions?> = (elements as
        Array<IIsolatedWindowsEnvironmentShareFolderRequestOptions?>).castToImpl<IIsolatedWindowsEnvironmentShareFolderRequestOptions,IIsolatedWindowsEnvironmentShareFolderRequestOptions_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IIsolatedWindowsEnvironmentShareFolderRequestOptions?> =
        arrayOfNulls<IIsolatedWindowsEnvironmentShareFolderRequestOptions_Impl>(size) as
        Array<IIsolatedWindowsEnvironmentShareFolderRequestOptions?>
  }
}
