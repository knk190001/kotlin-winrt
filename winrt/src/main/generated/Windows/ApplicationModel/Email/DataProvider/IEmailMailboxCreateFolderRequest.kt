package Windows.ApplicationModel.Email.DataProvider

import Windows.ApplicationModel.Email.EmailFolder
import Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus
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

@ABIMarker(IEmailMailboxCreateFolderRequest.ABI::class)
@Signature("{184d3775-c921-4c39-a309-e16c9f22b04b}")
@Guid("184d3775c9214c39a309e16c9f22b04b")
@WinRTInterface("184d3775c9214c39a309e16c9f22b04b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxCreateFolderRequest.ByReference::class)
public interface IEmailMailboxCreateFolderRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EmailMailboxId(): String?

  @InterfaceMethod(1)
  public fun get_ParentFolderId(): String?

  @InterfaceMethod(2)
  public fun get_Name(): String?

  @InterfaceMethod(3)
  public fun ReportCompletedAsync(folder: EmailFolder?): IAsyncAction?

  @InterfaceMethod(4)
  public fun ReportFailedAsync(status: EmailMailboxCreateFolderStatus?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxCreateFolderRequest> {
    public override fun getValue() = ABI.makeIEmailMailboxCreateFolderRequest(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxCreateFolderRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxCreateFolderRequest {
    public val __1992972219_Ptr: Pointer?

    public val _1992972219_VtblPtr: Pointer?
      get() = __1992972219_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EmailMailboxId(): String? {
      val fnPtr = _1992972219_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1992972219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ParentFolderId(): String? {
      val fnPtr = _1992972219_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1992972219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Name(): String? {
      val fnPtr = _1992972219_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1992972219_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportCompletedAsync(folder: EmailFolder?): IAsyncAction? {
      val fnPtr = _1992972219_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1992972219_Ptr, marshalToNative(folder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun ReportFailedAsync(status: EmailMailboxCreateFolderStatus?): IAsyncAction? {
      val fnPtr = _1992972219_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1992972219_Ptr, marshalToNative(status), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IEmailMailboxCreateFolderRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1992972219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxCreateFolderRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("184d3775c9214c39a309e16c9f22b04b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxCreateFolderRequest(ptr: Pointer?): WithDefault =
        IEmailMailboxCreateFolderRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxCreateFolderRequest {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxCreateFolderRequest(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxCreateFolderRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1992972219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxCreateFolderRequest):
        Array<IEmailMailboxCreateFolderRequest?> = (elements as
        Array<IEmailMailboxCreateFolderRequest?>).castToImpl<IEmailMailboxCreateFolderRequest,IEmailMailboxCreateFolderRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxCreateFolderRequest?> =
        arrayOfNulls<IEmailMailboxCreateFolderRequest_Impl>(size) as
        Array<IEmailMailboxCreateFolderRequest?>
  }
}
