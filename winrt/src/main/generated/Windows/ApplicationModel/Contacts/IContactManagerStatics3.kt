package Windows.ApplicationModel.Contacts

import Windows.ApplicationModel.Contacts.IContactManagerStatics2.ABI.IID
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.Storage.Streams.RandomAccessStreamReference
import Windows.UI.Popups.Placement
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactManagerStatics3.ABI::class)
@Signature("{c4cc3d42-7586-492a-930b-7bc138fc2139}")
@Guid("c4cc3d427586492a930b7bc138fc2139")
@WinRTInterface("c4cc3d427586492a930b7bc138fc2139")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactManagerStatics3.ByReference::class)
public interface IContactManagerStatics3 : NativeMapped, IWinRTInterface, IContactManagerStatics2,
    IContactManagerStatics {
  @InterfaceMethod(0)
  public fun ConvertContactToVCardAsync(contact: Contact?):
      IAsyncOperation<RandomAccessStreamReference?>?

  @InterfaceMethod(1)
  public fun ConvertContactToVCardAsync(contact: Contact?, maxBytes: WinDef.UINT):
      IAsyncOperation<RandomAccessStreamReference?>?

  @InterfaceMethod(2)
  public fun ConvertVCardToContactAsync(vCard: IRandomAccessStreamReference?):
      IAsyncOperation<Contact?>?

  @InterfaceMethod(3)
  public fun RequestStoreAsync(accessType: ContactStoreAccessType?): IAsyncOperation<ContactStore?>?

  @InterfaceMethod(4)
  public fun RequestAnnotationStoreAsync(accessType: ContactAnnotationStoreAccessType?):
      IAsyncOperation<ContactAnnotationStore?>?

  @InterfaceMethod(5)
  public fun IsShowContactCardSupported(): Boolean

  @InterfaceMethod(6)
  public fun ShowContactCard(
    contact: Contact?,
    selection: Rect?,
    preferredPlacement: Placement?,
    contactCardOptions: ContactCardOptions?
  ): Unit

  @InterfaceMethod(7)
  public fun IsShowDelayLoadedContactCardSupported(): Boolean

  @InterfaceMethod(8)
  public fun ShowDelayLoadedContactCard(
    contact: Contact?,
    selection: Rect?,
    preferredPlacement: Placement?,
    contactCardOptions: ContactCardOptions?
  ): ContactCardDelayedDataLoader?

  @InterfaceMethod(9)
  public fun ShowFullContactCard(contact: Contact?,
      fullContactCardOptions: FullContactCardOptions?): Unit

  @InterfaceMethod(10)
  public fun get_SystemDisplayNameOrder(): ContactNameOrder?

  @InterfaceMethod(11)
  public fun put_SystemDisplayNameOrder(value: ContactNameOrder?): Unit

  @InterfaceMethod(12)
  public fun get_SystemSortOrder(): ContactNameOrder?

  @InterfaceMethod(13)
  public fun put_SystemSortOrder(value: ContactNameOrder?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactManagerStatics3> {
    public override fun getValue() = ABI.makeIContactManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: IContactManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactManagerStatics3, IContactManagerStatics2.WithDefault,
      IContactManagerStatics.WithDefault {
    public val __847014791_Ptr: Pointer?

    public val _847014791_VtblPtr: Pointer?
      get() = __847014791_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertContactToVCardAsync(contact: Contact?):
        IAsyncOperation<RandomAccessStreamReference?>? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ConvertContactToVCardAsync(contact: Contact?, maxBytes: WinDef.UINT):
        IAsyncOperation<RandomAccessStreamReference?>? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(contact), maxBytes, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<RandomAccessStreamReference?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ConvertVCardToContactAsync(vCard: IRandomAccessStreamReference?):
        IAsyncOperation<Contact?>? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(vCard), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestStoreAsync(accessType: ContactStoreAccessType?):
        IAsyncOperation<ContactStore?>? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactStore?>>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestAnnotationStoreAsync(accessType: ContactAnnotationStoreAccessType?):
        IAsyncOperation<ContactAnnotationStore?>? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactAnnotationStore?>>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContactAnnotationStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IsShowContactCardSupported(): Boolean {
      val fnPtr = _847014791_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun ShowContactCard(
      contact: Contact?,
      selection: Rect?,
      preferredPlacement: Placement?,
      contactCardOptions: ContactCardOptions?
    ): Unit {
      val fnPtr = _847014791_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(contact),
          marshalToNative(selection), marshalToNative(preferredPlacement),
          marshalToNative(contactCardOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun IsShowDelayLoadedContactCardSupported(): Boolean {
      val fnPtr = _847014791_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun ShowDelayLoadedContactCard(
      contact: Contact?,
      selection: Rect?,
      preferredPlacement: Placement?,
      contactCardOptions: ContactCardOptions?
    ): ContactCardDelayedDataLoader? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactCardDelayedDataLoader>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(contact),
          marshalToNative(selection), marshalToNative(preferredPlacement),
          marshalToNative(contactCardOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactCardDelayedDataLoader>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun ShowFullContactCard(contact: Contact?,
        fullContactCardOptions: FullContactCardOptions?): Unit {
      val fnPtr = _847014791_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(contact),
          marshalToNative(fullContactCardOptions),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_SystemDisplayNameOrder(): ContactNameOrder? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactNameOrder>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactNameOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_SystemDisplayNameOrder(value: ContactNameOrder?): Unit {
      val fnPtr = _847014791_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_SystemSortOrder(): ContactNameOrder? {
      val fnPtr = _847014791_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactNameOrder>()
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactNameOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_SystemSortOrder(value: ContactNameOrder?): Unit {
      val fnPtr = _847014791_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__847014791_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IContactManagerStatics2,
      IContactManagerStatics {
    public override val __847014790_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_847014791_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __111224276_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IContactManagerStatics.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_847014791_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __847014791_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4cc3d427586492a930b7bc138fc2139")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactManagerStatics3(ptr: Pointer?): WithDefault =
        IContactManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeIContactManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IContactManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__847014791_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactManagerStatics3): Array<IContactManagerStatics3?>
        = (elements as
        Array<IContactManagerStatics3?>).castToImpl<IContactManagerStatics3,IContactManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactManagerStatics3?> =
        arrayOfNulls<IContactManagerStatics3_Impl>(size) as Array<IContactManagerStatics3?>
  }
}
