package Windows.Web.Http.Diagnostics

import Windows.Foundation.DateTime
import Windows.Web.Http.HttpResponseMessage
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

@ABIMarker(IHttpDiagnosticProviderResponseReceivedEventArgs.ABI::class)
@Signature("{a0a2566c-ab5f-4d66-bb2d-084cf41635d0}")
@Guid("a0a2566cab5f4d66bb2d084cf41635d0")
@WinRTInterface("a0a2566cab5f4d66bb2d084cf41635d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDiagnosticProviderResponseReceivedEventArgs.ByReference::class)
public interface IHttpDiagnosticProviderResponseReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_Message(): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDiagnosticProviderResponseReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIHttpDiagnosticProviderResponseReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHttpDiagnosticProviderResponseReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDiagnosticProviderResponseReceivedEventArgs {
    public val __1466260521_Ptr: Pointer?

    public val _1466260521_VtblPtr: Pointer?
      get() = __1466260521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1466260521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1466260521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1466260521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1466260521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Message(): HttpResponseMessage? {
      val fnPtr = _1466260521_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__1466260521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IHttpDiagnosticProviderResponseReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1466260521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDiagnosticProviderResponseReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0a2566cab5f4d66bb2d084cf41635d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDiagnosticProviderResponseReceivedEventArgs(ptr: Pointer?): WithDefault =
        IHttpDiagnosticProviderResponseReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpDiagnosticProviderResponseReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHttpDiagnosticProviderResponseReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHttpDiagnosticProviderResponseReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1466260521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDiagnosticProviderResponseReceivedEventArgs):
        Array<IHttpDiagnosticProviderResponseReceivedEventArgs?> = (elements as
        Array<IHttpDiagnosticProviderResponseReceivedEventArgs?>).castToImpl<IHttpDiagnosticProviderResponseReceivedEventArgs,IHttpDiagnosticProviderResponseReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDiagnosticProviderResponseReceivedEventArgs?>
        = arrayOfNulls<IHttpDiagnosticProviderResponseReceivedEventArgs_Impl>(size) as
        Array<IHttpDiagnosticProviderResponseReceivedEventArgs?>
  }
}
