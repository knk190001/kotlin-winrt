package Windows.ApplicationModel.Contacts.Provider

import Windows.ApplicationModel.Contacts.Contact
import Windows.ApplicationModel.Contacts.ContactSelectionMode
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IContactPickerUI.ABI::class)
@Signature("{e2cc1366-cf66-43c4-a96a-a5a112db4746}")
@Guid("e2cc1366cf6643c4a96aa5a112db4746")
@WinRTInterface("e2cc1366cf6643c4a96aa5a112db4746")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPickerUI.ByReference::class)
public interface IContactPickerUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddContact(id: String?, contact: Contact?): AddContactResult?

  @InterfaceMethod(1)
  public fun RemoveContact(id: String?): Unit

  @InterfaceMethod(2)
  public fun ContainsContact(id: String?): Boolean

  @InterfaceMethod(3)
  public fun get_DesiredFields(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_SelectionMode(): ContactSelectionMode?

  @InterfaceMethod(5)
  public fun add_ContactRemoved(handler: TypedEventHandler<ContactPickerUI?,
      ContactRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_ContactRemoved(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPickerUI> {
    public override fun getValue() = ABI.makeIContactPickerUI(pointer.getPointer(0))

    public fun setValue(value: IContactPickerUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPickerUI {
    public val __1315328539_Ptr: Pointer?

    public val _1315328539_VtblPtr: Pointer?
      get() = __1315328539_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddContact(id: String?, contact: Contact?): AddContactResult? {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AddContactResult>()
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr, marshalToNative(id), marshalToNative(contact),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AddContactResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RemoveContact(id: String?): Unit {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr, marshalToNative(id),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ContainsContact(id: String?): Boolean {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DesiredFields(): IVectorView<String?>? {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SelectionMode(): ContactSelectionMode? {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactSelectionMode>()
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactSelectionMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_ContactRemoved(handler: TypedEventHandler<ContactPickerUI?,
        ContactRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_ContactRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1315328539_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1315328539_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactPickerUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1315328539_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPickerUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2cc1366cf6643c4a96aa5a112db4746")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPickerUI(ptr: Pointer?): WithDefault = IContactPickerUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPickerUI {
      val address = segment.toRawLongValue()
      return makeIContactPickerUI(Pointer(address))
    }

    public override fun toNative(obj: IContactPickerUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1315328539_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPickerUI): Array<IContactPickerUI?> = (elements as
        Array<IContactPickerUI?>).castToImpl<IContactPickerUI,IContactPickerUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPickerUI?> =
        arrayOfNulls<IContactPickerUI_Impl>(size) as Array<IContactPickerUI?>
  }
}
