package Windows.ApplicationModel.Contacts.DataProvider

import Windows.ApplicationModel.Contacts.Contact
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

@ABIMarker(IContactListCreateOrUpdateContactRequest.ABI::class)
@Signature("{b4af411f-c849-47d0-b119-91cf605b2f2a}")
@Guid("b4af411fc84947d0b11991cf605b2f2a")
@WinRTInterface("b4af411fc84947d0b11991cf605b2f2a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactListCreateOrUpdateContactRequest.ByReference::class)
public interface IContactListCreateOrUpdateContactRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactListId(): String?

  @InterfaceMethod(1)
  public fun get_Contact(): Contact?

  @InterfaceMethod(2)
  public fun ReportCompletedAsync(createdOrUpdatedContact: Contact?): IAsyncAction?

  @InterfaceMethod(3)
  public fun ReportFailedAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactListCreateOrUpdateContactRequest> {
    public override fun getValue() =
        ABI.makeIContactListCreateOrUpdateContactRequest(pointer.getPointer(0))

    public fun setValue(value: IContactListCreateOrUpdateContactRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactListCreateOrUpdateContactRequest {
    public val __386133864_Ptr: Pointer?

    public val _386133864_VtblPtr: Pointer?
      get() = __386133864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactListId(): String? {
      val fnPtr = _386133864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__386133864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Contact(): Contact? {
      val fnPtr = _386133864_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Contact>()
      val hr = fn.invokeHR(arrayOf(__386133864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Contact>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompletedAsync(createdOrUpdatedContact: Contact?): IAsyncAction? {
      val fnPtr = _386133864_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__386133864_Ptr, marshalToNative(createdOrUpdatedContact),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportFailedAsync(): IAsyncAction? {
      val fnPtr = _386133864_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__386133864_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactListCreateOrUpdateContactRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __386133864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactListCreateOrUpdateContactRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4af411fc84947d0b11991cf605b2f2a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactListCreateOrUpdateContactRequest(ptr: Pointer?): WithDefault =
        IContactListCreateOrUpdateContactRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactListCreateOrUpdateContactRequest {
      val address = segment.toRawLongValue()
      return makeIContactListCreateOrUpdateContactRequest(Pointer(address))
    }

    public override fun toNative(obj: IContactListCreateOrUpdateContactRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__386133864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactListCreateOrUpdateContactRequest):
        Array<IContactListCreateOrUpdateContactRequest?> = (elements as
        Array<IContactListCreateOrUpdateContactRequest?>).castToImpl<IContactListCreateOrUpdateContactRequest,IContactListCreateOrUpdateContactRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactListCreateOrUpdateContactRequest?> =
        arrayOfNulls<IContactListCreateOrUpdateContactRequest_Impl>(size) as
        Array<IContactListCreateOrUpdateContactRequest?>
  }
}
