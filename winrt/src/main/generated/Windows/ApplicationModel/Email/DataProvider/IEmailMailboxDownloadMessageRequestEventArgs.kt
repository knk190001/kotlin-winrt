package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.Deferral
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

@ABIMarker(IEmailMailboxDownloadMessageRequestEventArgs.ABI::class)
@Signature("{470409ad-d0a0-4a5b-bb2a-37621039c53e}")
@Guid("470409add0a04a5bbb2a37621039c53e")
@WinRTInterface("470409add0a04a5bbb2a37621039c53e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxDownloadMessageRequestEventArgs.ByReference::class)
public interface IEmailMailboxDownloadMessageRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxDownloadMessageRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxDownloadMessageRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxDownloadMessageRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxDownloadMessageRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxDownloadMessageRequestEventArgs {
    public val __1303702877_Ptr: Pointer?

    public val _1303702877_VtblPtr: Pointer?
      get() = __1303702877_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxDownloadMessageRequest? {
      val fnPtr = _1303702877_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxDownloadMessageRequest>()
      val hr = fn.invokeHR(arrayOf(__1303702877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxDownloadMessageRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1303702877_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1303702877_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxDownloadMessageRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1303702877_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxDownloadMessageRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("470409add0a04a5bbb2a37621039c53e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxDownloadMessageRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxDownloadMessageRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxDownloadMessageRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxDownloadMessageRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxDownloadMessageRequestEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1303702877_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxDownloadMessageRequestEventArgs):
        Array<IEmailMailboxDownloadMessageRequestEventArgs?> = (elements as
        Array<IEmailMailboxDownloadMessageRequestEventArgs?>).castToImpl<IEmailMailboxDownloadMessageRequestEventArgs,IEmailMailboxDownloadMessageRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxDownloadMessageRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxDownloadMessageRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxDownloadMessageRequestEventArgs?>
  }
}
