package Windows.ApplicationModel.Contacts.DataProvider

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

@ABIMarker(IContactListSyncManagerSyncRequest.ABI::class)
@Signature("{3c0e57a4-c4e7-4970-9a8f-9a66a2bb6c1a}")
@Guid("3c0e57a4c4e749709a8f9a66a2bb6c1a")
@WinRTInterface("3c0e57a4c4e749709a8f9a66a2bb6c1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListSyncManagerSyncRequest.ByReference::class)
public interface IContactListSyncManagerSyncRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactListId(): String?

  @InterfaceMethod(1)
  public fun ReportCompletedAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListSyncManagerSyncRequest> {
    public override fun getValue() =
        ABI.makeIContactListSyncManagerSyncRequest(pointer.getPointer(0))

    public fun setValue(value: IContactListSyncManagerSyncRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListSyncManagerSyncRequest {
    public val __1214737725_Ptr: Pointer?

    public val _1214737725_VtblPtr: Pointer?
      get() = __1214737725_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactListId(): String? {
      val fnPtr = _1214737725_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1214737725_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompletedAsync(): IAsyncAction? {
      val fnPtr = _1214737725_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1214737725_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _1214737725_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1214737725_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactListSyncManagerSyncRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1214737725_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListSyncManagerSyncRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c0e57a4c4e749709a8f9a66a2bb6c1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListSyncManagerSyncRequest(ptr: Pointer?): WithDefault =
        IContactListSyncManagerSyncRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactListSyncManagerSyncRequest {
      val address = segment.toRawLongValue()
      return makeIContactListSyncManagerSyncRequest(Pointer(address))
    }

    public override fun toNative(obj: IContactListSyncManagerSyncRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1214737725_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListSyncManagerSyncRequest):
        Array<IContactListSyncManagerSyncRequest?> = (elements as
        Array<IContactListSyncManagerSyncRequest?>).castToImpl<IContactListSyncManagerSyncRequest,IContactListSyncManagerSyncRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListSyncManagerSyncRequest?> =
        arrayOfNulls<IContactListSyncManagerSyncRequest_Impl>(size) as
        Array<IContactListSyncManagerSyncRequest?>
  }
}
