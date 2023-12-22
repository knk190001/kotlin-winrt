package Windows.ApplicationModel.UserDataAccounts

import Windows.ApplicationModel.Appointments.AppointmentCalendar
import Windows.ApplicationModel.Contacts.ContactAnnotationList
import Windows.ApplicationModel.Contacts.ContactList
import Windows.ApplicationModel.Email.EmailMailbox
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IUserDataAccount.ABI::class)
@Signature("{b9c4367e-b348-4910-be94-4ad4bba6dea7}")
@Guid("b9c4367eb3484910be944ad4bba6dea7")
@WinRTInterface("b9c4367eb3484910be944ad4bba6dea7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccount.ByReference::class)
public interface IUserDataAccount : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_UserDisplayName(): String?

  @InterfaceMethod(2)
  public fun put_UserDisplayName(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_OtherAppReadAccess(): UserDataAccountOtherAppReadAccess?

  @InterfaceMethod(4)
  public fun put_OtherAppReadAccess(value: UserDataAccountOtherAppReadAccess?): Unit

  @InterfaceMethod(5)
  public fun get_Icon(): IRandomAccessStreamReference?

  @InterfaceMethod(6)
  public fun get_DeviceAccountTypeId(): String?

  @InterfaceMethod(7)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(8)
  public fun SaveAsync(): IAsyncAction?

  @InterfaceMethod(9)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(10)
  public fun FindAppointmentCalendarsAsync(): IAsyncOperation<IVectorView<AppointmentCalendar?>?>?

  @InterfaceMethod(11)
  public fun FindEmailMailboxesAsync(): IAsyncOperation<IVectorView<EmailMailbox?>?>?

  @InterfaceMethod(12)
  public fun FindContactListsAsync(): IAsyncOperation<IVectorView<ContactList?>?>?

  @InterfaceMethod(13)
  public fun FindContactAnnotationListsAsync():
      IAsyncOperation<IVectorView<ContactAnnotationList?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccount> {
    public override fun getValue() = ABI.makeIUserDataAccount(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccount_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccount {
    public val __560621900_Ptr: Pointer?

    public val _560621900_VtblPtr: Pointer?
      get() = __560621900_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserDisplayName(): String? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_UserDisplayName(value: String?): Unit {
      val fnPtr = _560621900_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_OtherAppReadAccess(): UserDataAccountOtherAppReadAccess? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataAccountOtherAppReadAccess>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataAccountOtherAppReadAccess>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_OtherAppReadAccess(value: UserDataAccountOtherAppReadAccess?): Unit {
      val fnPtr = _560621900_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Icon(): IRandomAccessStreamReference? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DeviceAccountTypeId(): String? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SaveAsync(): IAsyncAction? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun FindAppointmentCalendarsAsync():
        IAsyncOperation<IVectorView<AppointmentCalendar?>?>? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<AppointmentCalendar?>?>>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<AppointmentCalendar?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun FindEmailMailboxesAsync(): IAsyncOperation<IVectorView<EmailMailbox?>?>? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<EmailMailbox?>?>>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<EmailMailbox?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun FindContactListsAsync(): IAsyncOperation<IVectorView<ContactList?>?>? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactList?>?>>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactList?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun FindContactAnnotationListsAsync():
        IAsyncOperation<IVectorView<ContactAnnotationList?>?>? {
      val fnPtr = _560621900_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactAnnotationList?>?>>()
      val hr = fn.invokeHR(arrayOf(__560621900_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactAnnotationList?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataAccount_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __560621900_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccount, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9c4367eb3484910be944ad4bba6dea7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccount(ptr: Pointer?): WithDefault = IUserDataAccount_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccount {
      val address = segment.toRawLongValue()
      return makeIUserDataAccount(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__560621900_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccount): Array<IUserDataAccount?> = (elements as
        Array<IUserDataAccount?>).castToImpl<IUserDataAccount,IUserDataAccount_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccount?> =
        arrayOfNulls<IUserDataAccount_Impl>(size) as Array<IUserDataAccount?>
  }
}
