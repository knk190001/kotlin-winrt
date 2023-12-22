package Windows.Security.Credentials

import Windows.Foundation.Uri
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

@ABIMarker(IWebAccountProviderFactory.ABI::class)
@Signature("{1d767df1-e1e1-4b9a-a774-5c7c7e3bf371}")
@Guid("1d767df1e1e14b9aa7745c7c7e3bf371")
@WinRTInterface("1d767df1e1e14b9aa7745c7c7e3bf371")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderFactory.ByReference::class)
public interface IWebAccountProviderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWebAccountProvider(
    id: String?,
    displayName: String?,
    iconUri: Uri?
  ): WebAccountProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderFactory> {
    public override fun getValue() = ABI.makeIWebAccountProviderFactory(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderFactory {
    public val __826471728_Ptr: Pointer?

    public val _826471728_VtblPtr: Pointer?
      get() = __826471728_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWebAccountProvider(
      id: String?,
      displayName: String?,
      iconUri: Uri?
    ): WebAccountProvider? {
      val fnPtr = _826471728_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccountProvider>()
      val hr = fn.invokeHR(arrayOf(__826471728_Ptr, marshalToNative(id),
          marshalToNative(displayName), marshalToNative(iconUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccountProvider>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __826471728_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d767df1e1e14b9aa7745c7c7e3bf371")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderFactory(ptr: Pointer?): WithDefault =
        IWebAccountProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderFactory {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__826471728_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderFactory):
        Array<IWebAccountProviderFactory?> = (elements as
        Array<IWebAccountProviderFactory?>).castToImpl<IWebAccountProviderFactory,IWebAccountProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderFactory?> =
        arrayOfNulls<IWebAccountProviderFactory_Impl>(size) as Array<IWebAccountProviderFactory?>
  }
}
