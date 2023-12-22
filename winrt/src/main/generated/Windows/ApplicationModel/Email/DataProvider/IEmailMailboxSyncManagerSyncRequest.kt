package Windows.ApplicationModel.Email.DataProvider

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IEmailMailboxSyncManagerSyncRequest.ABI::class)
@Signature("{4e10e8e4-7e67-405a-b673-dc60c91090fc}")
@Guid("4e10e8e47e67405ab673dc60c91090fc")
@WinRTInterface("4e10e8e47e67405ab673dc60c91090fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxSyncManagerSyncRequest.ByReference::class)
public interface IEmailMailboxSyncManagerSyncRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxSyncManagerSyncRequest> {
    public override fun getValue() =
        ABI.makeIEmailMailboxSyncManagerSyncRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxSyncManagerSyncRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxSyncManagerSyncRequest {
    public val __897178964_Ptr: Pointer?

    public val _897178964_VtblPtr: Pointer?
      get() = __897178964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _897178964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__897178964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _897178964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__897178964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _897178964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__897178964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxSyncManagerSyncRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __897178964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxSyncManagerSyncRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e10e8e47e67405ab673dc60c91090fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxSyncManagerSyncRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxSyncManagerSyncRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxSyncManagerSyncRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxSyncManagerSyncRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxSyncManagerSyncRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__897178964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxSyncManagerSyncRequest):
        Array<IEmailMailboxSyncManagerSyncRequest?> = (elements as
        Array<IEmailMailboxSyncManagerSyncRequest?>).castToImpl<IEmailMailboxSyncManagerSyncRequest,IEmailMailboxSyncManagerSyncRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxSyncManagerSyncRequest?> =
        arrayOfNulls<IEmailMailboxSyncManagerSyncRequest_Impl>(size) as
        Array<IEmailMailboxSyncManagerSyncRequest?>
  }
}
