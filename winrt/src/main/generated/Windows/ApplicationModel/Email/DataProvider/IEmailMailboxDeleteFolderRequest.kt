package Windows.ApplicationModel.Email.DataProvider

import Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus
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

@ABIMarker(IEmailMailboxDeleteFolderRequest.ABI::class)
@Signature("{9469e88a-a931-4779-923d-09a3ea292e29}")
@Guid("9469e88aa9314779923d09a3ea292e29")
@WinRTInterface("9469e88aa9314779923d09a3ea292e29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxDeleteFolderRequest.ByReference::class)
public interface IEmailMailboxDeleteFolderRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_EmailFolderId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(status: EmailMailboxDeleteFolderStatus?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxDeleteFolderRequest> {
    public override fun getValue() = ABI.makeIEmailMailboxDeleteFolderRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxDeleteFolderRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxDeleteFolderRequest {
    public val __66635628_Ptr: Pointer?

    public val _66635628_VtblPtr: Pointer?
      get() = __66635628_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _66635628_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__66635628_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EmailFolderId(): String? {
      val fnPtr = _66635628_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__66635628_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _66635628_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__66635628_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(status: EmailMailboxDeleteFolderStatus?): IAsyncAction? {
      val fnPtr = _66635628_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__66635628_Ptr, marshalToNative(status), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxDeleteFolderRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __66635628_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxDeleteFolderRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9469e88aa9314779923d09a3ea292e29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxDeleteFolderRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxDeleteFolderRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxDeleteFolderRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxDeleteFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxDeleteFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__66635628_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxDeleteFolderRequest):
        Array<IEmailMailboxDeleteFolderRequest?> = (elements as
        Array<IEmailMailboxDeleteFolderRequest?>).castToImpl<IEmailMailboxDeleteFolderRequest,IEmailMailboxDeleteFolderRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxDeleteFolderRequest?> =
        arrayOfNulls<IEmailMailboxDeleteFolderRequest_Impl>(size) as
        Array<IEmailMailboxDeleteFolderRequest?>
  }
}
