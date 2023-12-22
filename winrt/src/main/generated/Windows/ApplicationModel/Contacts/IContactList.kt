package Windows.ApplicationModel.Contacts

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactList.ABI::class)
@Signature("{16ddec75-392c-4845-9dfb-51a3e7ef3e42}")
@Guid("16ddec75392c48459dfb51a3e7ef3e42")
@WinRTInterface("16ddec75392c48459dfb51a3e7ef3e42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactList.ByReference::class)
public interface IContactList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_SourceDisplayName(): String?

  @InterfaceMethod(4)
  public fun get_IsHidden(): Boolean

  @InterfaceMethod(5)
  public fun put_IsHidden(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_OtherAppReadAccess(): ContactListOtherAppReadAccess?

  @InterfaceMethod(7)
  public fun put_OtherAppReadAccess(value: ContactListOtherAppReadAccess?): Unit

  @InterfaceMethod(8)
  public fun get_OtherAppWriteAccess(): ContactListOtherAppWriteAccess?

  @InterfaceMethod(9)
  public fun put_OtherAppWriteAccess(value: ContactListOtherAppWriteAccess?): Unit

  @InterfaceMethod(10)
  public fun get_ChangeTracker(): ContactChangeTracker?

  @InterfaceMethod(11)
  public fun get_SyncManager(): ContactListSyncManager?

  @InterfaceMethod(12)
  public fun get_SupportsServerSearch(): Boolean

  @InterfaceMethod(13)
  public fun get_UserDataAccountId(): String?

  @InterfaceMethod(14)
  public fun add_ContactChanged(value: TypedEventHandler<ContactList?, ContactChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_ContactChanged(value: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(17)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(18)
  public fun GetContactFromRemoteIdAsync(remoteId: String?): IAsyncOperation<Contact?>?

  @InterfaceMethod(19)
  public fun GetMeContactAsync(): IAsyncOperation<Contact?>?

  @InterfaceMethod(20)
  public fun GetContactReader(): ContactReader?

  @InterfaceMethod(21)
  public fun GetContactReader(options: ContactQueryOptions?): ContactReader?

  @InterfaceMethod(22)
  public fun SaveContactAsync(contact: Contact?): IAsyncAction?

  @InterfaceMethod(23)
  public fun DeleteContactAsync(contact: Contact?): IAsyncAction?

  @InterfaceMethod(24)
  public fun GetContactAsync(contactId: String?): IAsyncOperation<Contact?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactList> {
    public override fun getValue() = ABI.makeIContactList(pointer.getPointer(0))

    public fun setValue(value: IContactList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactList {
    public val __42579854_Ptr: Pointer?

    public val _42579854_VtblPtr: Pointer?
      get() = __42579854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _42579854_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_SourceDisplayName(): String? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsHidden(): Boolean {
      val fnPtr = _42579854_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsHidden(value: Boolean): Unit {
      val fnPtr = _42579854_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_OtherAppReadAccess(): ContactListOtherAppReadAccess? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListOtherAppReadAccess>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListOtherAppReadAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_OtherAppReadAccess(value: ContactListOtherAppReadAccess?): Unit {
      val fnPtr = _42579854_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_OtherAppWriteAccess(): ContactListOtherAppWriteAccess? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListOtherAppWriteAccess>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListOtherAppWriteAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_OtherAppWriteAccess(value: ContactListOtherAppWriteAccess?): Unit {
      val fnPtr = _42579854_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ChangeTracker(): ContactChangeTracker? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangeTracker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_SyncManager(): ContactListSyncManager? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactListSyncManager>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactListSyncManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_SupportsServerSearch(): Boolean {
      val fnPtr = _42579854_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_UserDataAccountId(): String? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun add_ContactChanged(value: TypedEventHandler<ContactList?,
        ContactChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_ContactChanged(value: EventRegistrationToken?): Unit {
      val fnPtr = _42579854_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun GetContactFromRemoteIdAsync(remoteId: String?): IAsyncOperation<Contact?>? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(remoteId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetMeContactAsync(): IAsyncOperation<Contact?>? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun GetContactReader(): ContactReader? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactReader>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun GetContactReader(options: ContactQueryOptions?): ContactReader? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactReader>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun SaveContactAsync(contact: Contact?): IAsyncAction? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun DeleteContactAsync(contact: Contact?): IAsyncAction? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun GetContactAsync(contactId: String?): IAsyncOperation<Contact?>? {
      val fnPtr = _42579854_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__42579854_Ptr, marshalToNative(contactId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __42579854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16ddec75392c48459dfb51a3e7ef3e42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactList(ptr: Pointer?): WithDefault = IContactList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactList {
      val address = segment.toRawLongValue()
      return makeIContactList(Pointer(address))
    }

    public override fun toNative(obj: IContactList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__42579854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactList): Array<IContactList?> = (elements as
        Array<IContactList?>).castToImpl<IContactList,IContactList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactList?> =
        arrayOfNulls<IContactList_Impl>(size) as Array<IContactList?>
  }
}
