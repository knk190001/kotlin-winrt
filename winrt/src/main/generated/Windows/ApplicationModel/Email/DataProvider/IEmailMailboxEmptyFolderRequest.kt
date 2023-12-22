package Windows.ApplicationModel.Email.DataProvider

import Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus
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

@ABIMarker(IEmailMailboxEmptyFolderRequest.ABI::class)
@Signature("{fe4b03ab-f86d-46d9-b4ce-bc8a6d9e9268}")
@Guid("fe4b03abf86d46d9b4cebc8a6d9e9268")
@WinRTInterface("fe4b03abf86d46d9b4cebc8a6d9e9268")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxEmptyFolderRequest.ByReference::class)
public interface IEmailMailboxEmptyFolderRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_EmailFolderId(): String?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(status: EmailMailboxEmptyFolderStatus?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxEmptyFolderRequest> {
    public override fun getValue() = ABI.makeIEmailMailboxEmptyFolderRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxEmptyFolderRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxEmptyFolderRequest {
    public val __1412558306_Ptr: Pointer?

    public val _1412558306_VtblPtr: Pointer?
      get() = __1412558306_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _1412558306_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1412558306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EmailFolderId(): String? {
      val fnPtr = _1412558306_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1412558306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1412558306_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1412558306_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(status: EmailMailboxEmptyFolderStatus?): IAsyncAction? {
      val fnPtr = _1412558306_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1412558306_Ptr, marshalToNative(status), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxEmptyFolderRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1412558306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxEmptyFolderRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe4b03abf86d46d9b4cebc8a6d9e9268")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxEmptyFolderRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxEmptyFolderRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxEmptyFolderRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxEmptyFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxEmptyFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1412558306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxEmptyFolderRequest):
        Array<IEmailMailboxEmptyFolderRequest?> = (elements as
        Array<IEmailMailboxEmptyFolderRequest?>).castToImpl<IEmailMailboxEmptyFolderRequest,IEmailMailboxEmptyFolderRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxEmptyFolderRequest?> =
        arrayOfNulls<IEmailMailboxEmptyFolderRequest_Impl>(size) as
        Array<IEmailMailboxEmptyFolderRequest?>
  }
}
