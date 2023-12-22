package Windows.Security.Authentication.Web.Provider

import Windows.Security.Authentication.Web.Core.WebProviderError
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

@ABIMarker(IWebAccountProviderBaseReportOperation.ABI::class)
@Signature("{bba4acbb-993b-4d57-bbe4-1421e3668b4c}")
@Guid("bba4acbb993b4d57bbe41421e3668b4c")
@WinRTInterface("bba4acbb993b4d57bbe41421e3668b4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderBaseReportOperation.ByReference::class)
public interface IWebAccountProviderBaseReportOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReportCompleted(): Unit

  @InterfaceMethod(1)
  public fun ReportError(value: WebProviderError?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderBaseReportOperation> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderBaseReportOperation(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderBaseReportOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderBaseReportOperation {
    public val __515081933_Ptr: Pointer?

    public val _515081933_VtblPtr: Pointer?
      get() = __515081933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReportCompleted(): Unit {
      val fnPtr = _515081933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515081933_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ReportError(value: WebProviderError?): Unit {
      val fnPtr = _515081933_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__515081933_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebAccountProviderBaseReportOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __515081933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderBaseReportOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bba4acbb993b4d57bbe41421e3668b4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderBaseReportOperation(ptr: Pointer?): WithDefault =
        IWebAccountProviderBaseReportOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderBaseReportOperation {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderBaseReportOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderBaseReportOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__515081933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderBaseReportOperation):
        Array<IWebAccountProviderBaseReportOperation?> = (elements as
        Array<IWebAccountProviderBaseReportOperation?>).castToImpl<IWebAccountProviderBaseReportOperation,IWebAccountProviderBaseReportOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderBaseReportOperation?> =
        arrayOfNulls<IWebAccountProviderBaseReportOperation_Impl>(size) as
        Array<IWebAccountProviderBaseReportOperation?>
  }
}
