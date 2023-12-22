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

@ABIMarker(IEmailMailboxValidateCertificatesRequestEventArgs.ABI::class)
@Signature("{2583bf17-02ff-49fe-a73c-03f37566c691}")
@Guid("2583bf1702ff49fea73c03f37566c691")
@WinRTInterface("2583bf1702ff49fea73c03f37566c691")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxValidateCertificatesRequestEventArgs.ByReference::class)
public interface IEmailMailboxValidateCertificatesRequestEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): EmailMailboxValidateCertificatesRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxValidateCertificatesRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIEmailMailboxValidateCertificatesRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxValidateCertificatesRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxValidateCertificatesRequestEventArgs {
    public val __116818812_Ptr: Pointer?

    public val _116818812_VtblPtr: Pointer?
      get() = __116818812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): EmailMailboxValidateCertificatesRequest? {
      val fnPtr = _116818812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxValidateCertificatesRequest>()
      val hr = fn.invokeHR(arrayOf(__116818812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<EmailMailboxValidateCertificatesRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _116818812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__116818812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxValidateCertificatesRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __116818812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxValidateCertificatesRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2583bf1702ff49fea73c03f37566c691")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxValidateCertificatesRequestEventArgs(ptr: Pointer?): WithDefault =
        IEmailMailboxValidateCertificatesRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEmailMailboxValidateCertificatesRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxValidateCertificatesRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxValidateCertificatesRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__116818812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxValidateCertificatesRequestEventArgs):
        Array<IEmailMailboxValidateCertificatesRequestEventArgs?> = (elements as
        Array<IEmailMailboxValidateCertificatesRequestEventArgs?>).castToImpl<IEmailMailboxValidateCertificatesRequestEventArgs,IEmailMailboxValidateCertificatesRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IEmailMailboxValidateCertificatesRequestEventArgs?> =
        arrayOfNulls<IEmailMailboxValidateCertificatesRequestEventArgs_Impl>(size) as
        Array<IEmailMailboxValidateCertificatesRequestEventArgs?>
  }
}
