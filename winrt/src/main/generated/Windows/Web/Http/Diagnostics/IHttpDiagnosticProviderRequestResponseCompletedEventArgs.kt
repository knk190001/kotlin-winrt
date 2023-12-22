package Windows.Web.Http.Diagnostics

import Windows.Foundation.Collections.IVectorView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHttpDiagnosticProviderRequestResponseCompletedEventArgs.ABI::class)
@Signature("{735f98ee-94f6-4532-b26e-61e1b1e4efd4}")
@Guid("735f98ee94f64532b26e61e1b1e4efd4")
@WinRTInterface("735f98ee94f64532b26e61e1b1e4efd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IHttpDiagnosticProviderRequestResponseCompletedEventArgs.ByReference::class)
public interface IHttpDiagnosticProviderRequestResponseCompletedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Timestamps(): HttpDiagnosticProviderRequestResponseTimestamps?

  @InterfaceMethod(2)
  public fun get_RequestedUri(): Uri?

  @InterfaceMethod(3)
  public fun get_ProcessId(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_ThreadId(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_Initiator(): HttpDiagnosticRequestInitiator?

  @InterfaceMethod(6)
  public fun get_SourceLocations(): IVectorView<HttpDiagnosticSourceLocation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDiagnosticProviderRequestResponseCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIHttpDiagnosticProviderRequestResponseCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHttpDiagnosticProviderRequestResponseCompletedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDiagnosticProviderRequestResponseCompletedEventArgs {
    public val __1017158914_Ptr: Pointer?

    public val _1017158914_VtblPtr: Pointer?
      get() = __1017158914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivityId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Timestamps(): HttpDiagnosticProviderRequestResponseTimestamps? {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpDiagnosticProviderRequestResponseTimestamps>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<HttpDiagnosticProviderRequestResponseTimestamps>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RequestedUri(): Uri? {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ProcessId(): WinDef.UINT {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_ThreadId(): WinDef.UINT {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_Initiator(): HttpDiagnosticRequestInitiator? {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpDiagnosticRequestInitiator>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpDiagnosticRequestInitiator>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SourceLocations(): IVectorView<HttpDiagnosticSourceLocation?>? {
      val fnPtr = _1017158914_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HttpDiagnosticSourceLocation?>>()
      val hr = fn.invokeHR(arrayOf(__1017158914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HttpDiagnosticSourceLocation?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpDiagnosticProviderRequestResponseCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1017158914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDiagnosticProviderRequestResponseCompletedEventArgs, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("735f98ee94f64532b26e61e1b1e4efd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDiagnosticProviderRequestResponseCompletedEventArgs(ptr: Pointer?):
        WithDefault = IHttpDiagnosticProviderRequestResponseCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpDiagnosticProviderRequestResponseCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHttpDiagnosticProviderRequestResponseCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHttpDiagnosticProviderRequestResponseCompletedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1017158914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDiagnosticProviderRequestResponseCompletedEventArgs):
        Array<IHttpDiagnosticProviderRequestResponseCompletedEventArgs?> = (elements as
        Array<IHttpDiagnosticProviderRequestResponseCompletedEventArgs?>).castToImpl<IHttpDiagnosticProviderRequestResponseCompletedEventArgs,IHttpDiagnosticProviderRequestResponseCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IHttpDiagnosticProviderRequestResponseCompletedEventArgs?> =
        arrayOfNulls<IHttpDiagnosticProviderRequestResponseCompletedEventArgs_Impl>(size) as
        Array<IHttpDiagnosticProviderRequestResponseCompletedEventArgs?>
  }
}
