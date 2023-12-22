package Windows.Security.Authentication.Web.Core

import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IWebAccountEventArgs.ABI::class)
@Signature("{6fb7037d-424e-44ec-977c-ef2415462a5a}")
@Guid("6fb7037d424e44ec977cef2415462a5a")
@WinRTInterface("6fb7037d424e44ec977cef2415462a5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountEventArgs.ByReference::class)
public interface IWebAccountEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Account(): WebAccount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountEventArgs> {
    public override fun getValue() = ABI.makeIWebAccountEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebAccountEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountEventArgs {
    public val __1980228671_Ptr: Pointer?

    public val _1980228671_VtblPtr: Pointer?
      get() = __1980228671_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Account(): WebAccount? {
      val fnPtr = _1980228671_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__1980228671_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1980228671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6fb7037d424e44ec977cef2415462a5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountEventArgs(ptr: Pointer?): WithDefault = IWebAccountEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebAccountEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1980228671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountEventArgs): Array<IWebAccountEventArgs?> =
        (elements as
        Array<IWebAccountEventArgs?>).castToImpl<IWebAccountEventArgs,IWebAccountEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountEventArgs?> =
        arrayOfNulls<IWebAccountEventArgs_Impl>(size) as Array<IWebAccountEventArgs?>
  }
}
