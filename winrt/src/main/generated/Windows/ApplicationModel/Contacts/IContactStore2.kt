package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactStore.ABI.IID
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IContactStore2.ABI::class)
@Signature("{18ce1c22-ebd5-4bfb-b690-5f4f27c4f0e8}")
@Guid("18ce1c22ebd54bfbb6905f4f27c4f0e8")
@WinRTInterface("18ce1c22ebd54bfbb6905f4f27c4f0e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactStore2.ByReference::class)
public interface IContactStore2 : NativeMapped, IWinRTInterface, IContactStore {
  @InterfaceMethod(0)
  public fun get_ChangeTracker(): ContactChangeTracker?

  @InterfaceMethod(1)
  public fun add_ContactChanged(value: TypedEventHandler<ContactStore?, ContactChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_ContactChanged(value: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun get_AggregateContactManager(): AggregateContactManager?

  @InterfaceMethod(4)
  public fun FindContactListsAsync(): IAsyncOperation<IVectorView<ContactList?>?>?

  @InterfaceMethod(5)
  public fun GetContactListAsync(contactListId: String?): IAsyncOperation<ContactList?>?

  @InterfaceMethod(6)
  public fun CreateContactListAsync(displayName: String?): IAsyncOperation<ContactList?>?

  @InterfaceMethod(7)
  public fun GetMeContactAsync(): IAsyncOperation<Contact?>?

  @InterfaceMethod(8)
  public fun GetContactReader(): ContactReader?

  @InterfaceMethod(9)
  public fun GetContactReader(options: ContactQueryOptions?): ContactReader?

  @InterfaceMethod(10)
  public fun CreateContactListAsync(displayName: String?, userDataAccountId: String?):
      IAsyncOperation<ContactList?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactStore2>
      {
    public override fun getValue() = ABI.makeIContactStore2(pointer.getPointer(0))

    public fun setValue(value: IContactStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactStore2, IContactStore.WithDefault {
    public val __2054089147_Ptr: Pointer?

    public val _2054089147_VtblPtr: Pointer?
      get() = __2054089147_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeTracker(): ContactChangeTracker? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactChangeTracker>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_ContactChanged(value: TypedEventHandler<ContactStore?,
        ContactChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_ContactChanged(value: EventRegistrationToken?): Unit {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AggregateContactManager(): AggregateContactManager? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AggregateContactManager>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AggregateContactManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindContactListsAsync(): IAsyncOperation<IVectorView<ContactList?>?>? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactList?>?>>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactList?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetContactListAsync(contactListId: String?):
        IAsyncOperation<ContactList?>? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactList?>>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr, marshalToNative(contactListId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateContactListAsync(displayName: String?):
        IAsyncOperation<ContactList?>? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactList?>>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr, marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetMeContactAsync(): IAsyncOperation<Contact?>? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetContactReader(): ContactReader? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactReader>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetContactReader(options: ContactQueryOptions?): ContactReader? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactReader>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactReader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateContactListAsync(displayName: String?, userDataAccountId: String?):
        IAsyncOperation<ContactList?>? {
      val fnPtr = _2054089147_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactList?>>()
      val hr = fn.invokeHR(arrayOf(__2054089147_Ptr, marshalToNative(displayName),
          marshalToNative(userDataAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactList?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactStore {
    public override val __1313186931_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2054089147_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2054089147_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18ce1c22ebd54bfbb6905f4f27c4f0e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactStore2(ptr: Pointer?): WithDefault = IContactStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactStore2 {
      val address = segment.toRawLongValue()
      return makeIContactStore2(Pointer(address))
    }

    public override fun toNative(obj: IContactStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2054089147_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactStore2): Array<IContactStore2?> = (elements as
        Array<IContactStore2?>).castToImpl<IContactStore2,IContactStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactStore2?> =
        arrayOfNulls<IContactStore2_Impl>(size) as Array<IContactStore2?>
  }
}
