package Windows.Web.Http.Diagnostics

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IHttpDiagnosticProviderRequestResponseTimestamps.ABI::class)
@Signature("{e0afde10-55cf-4c01-91d4-a20557d849f0}")
@Guid("e0afde1055cf4c0191d4a20557d849f0")
@WinRTInterface("e0afde1055cf4c0191d4a20557d849f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDiagnosticProviderRequestResponseTimestamps.ByReference::class)
public interface IHttpDiagnosticProviderRequestResponseTimestamps : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CacheCheckedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(1)
  public fun get_ConnectionInitiatedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(2)
  public fun get_NameResolvedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(3)
  public fun get_SslNegotiatedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(4)
  public fun get_ConnectionCompletedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(5)
  public fun get_RequestSentTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(6)
  public fun get_RequestCompletedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(7)
  public fun get_ResponseReceivedTimestamp(): IReference<DateTime?>?

  @InterfaceMethod(8)
  public fun get_ResponseCompletedTimestamp(): IReference<DateTime?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDiagnosticProviderRequestResponseTimestamps> {
    public override fun getValue() =
        ABI.makeIHttpDiagnosticProviderRequestResponseTimestamps(pointer.getPointer(0))

    public fun setValue(value: IHttpDiagnosticProviderRequestResponseTimestamps_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDiagnosticProviderRequestResponseTimestamps {
    public val __829228687_Ptr: Pointer?

    public val _829228687_VtblPtr: Pointer?
      get() = __829228687_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CacheCheckedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ConnectionInitiatedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NameResolvedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SslNegotiatedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ConnectionCompletedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RequestSentTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RequestCompletedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ResponseReceivedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ResponseCompletedTimestamp(): IReference<DateTime?>? {
      val fnPtr = _829228687_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__829228687_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpDiagnosticProviderRequestResponseTimestamps_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829228687_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDiagnosticProviderRequestResponseTimestamps, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0afde1055cf4c0191d4a20557d849f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDiagnosticProviderRequestResponseTimestamps(ptr: Pointer?): WithDefault =
        IHttpDiagnosticProviderRequestResponseTimestamps_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpDiagnosticProviderRequestResponseTimestamps {
      val address = segment.toRawLongValue()
      return makeIHttpDiagnosticProviderRequestResponseTimestamps(Pointer(address))
    }

    public override fun toNative(obj: IHttpDiagnosticProviderRequestResponseTimestamps):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__829228687_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDiagnosticProviderRequestResponseTimestamps):
        Array<IHttpDiagnosticProviderRequestResponseTimestamps?> = (elements as
        Array<IHttpDiagnosticProviderRequestResponseTimestamps?>).castToImpl<IHttpDiagnosticProviderRequestResponseTimestamps,IHttpDiagnosticProviderRequestResponseTimestamps_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDiagnosticProviderRequestResponseTimestamps?>
        = arrayOfNulls<IHttpDiagnosticProviderRequestResponseTimestamps_Impl>(size) as
        Array<IHttpDiagnosticProviderRequestResponseTimestamps?>
  }
}
