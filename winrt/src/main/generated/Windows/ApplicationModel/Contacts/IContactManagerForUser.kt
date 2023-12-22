package Windows.ApplicationModel.Contacts

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.Storage.Streams.RandomAccessStreamReference
import Windows.System.User
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactManagerForUser.ABI::class)
@Signature("{b74bba57-1076-4bef-aef3-54686d18387d}")
@Guid("b74bba5710764befaef354686d18387d")
@WinRTInterface("b74bba5710764befaef354686d18387d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactManagerForUser.ByReference::class)
public interface IContactManagerForUser : NativeMapped, IWinRTInterface {
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
  public fun get_SystemDisplayNameOrder(): ContactNameOrder?

  @InterfaceMethod(6)
  public fun put_SystemDisplayNameOrder(value: ContactNameOrder?): Unit

  @InterfaceMethod(7)
  public fun get_SystemSortOrder(): ContactNameOrder?

  @InterfaceMethod(8)
  public fun put_SystemSortOrder(value: ContactNameOrder?): Unit

  @InterfaceMethod(9)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactManagerForUser> {
    public override fun getValue() = ABI.makeIContactManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IContactManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactManagerForUser {
    public val __1107770011_Ptr: Pointer?

    public val _1107770011_VtblPtr: Pointer?
      get() = __1107770011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertContactToVCardAsync(contact: Contact?):
        IAsyncOperation<RandomAccessStreamReference?>? {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(contact), result))
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
      val fnPtr = _1107770011_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RandomAccessStreamReference?>>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(contact), maxBytes, result))
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
      val fnPtr = _1107770011_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(vCard), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestStoreAsync(accessType: ContactStoreAccessType?):
        IAsyncOperation<ContactStore?>? {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactStore?>>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestAnnotationStoreAsync(accessType: ContactAnnotationStoreAccessType?):
        IAsyncOperation<ContactAnnotationStore?>? {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactAnnotationStore?>>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContactAnnotationStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SystemDisplayNameOrder(): ContactNameOrder? {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactNameOrder>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactNameOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_SystemDisplayNameOrder(value: ContactNameOrder?): Unit {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SystemSortOrder(): ContactNameOrder? {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactNameOrder>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactNameOrder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_SystemSortOrder(value: ContactNameOrder?): Unit {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_User(): User? {
      val fnPtr = _1107770011_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1107770011_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IContactManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1107770011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b74bba5710764befaef354686d18387d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactManagerForUser(ptr: Pointer?): WithDefault =
        IContactManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactManagerForUser {
      val address = segment.toRawLongValue()
      return makeIContactManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IContactManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1107770011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactManagerForUser): Array<IContactManagerForUser?> =
        (elements as
        Array<IContactManagerForUser?>).castToImpl<IContactManagerForUser,IContactManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactManagerForUser?> =
        arrayOfNulls<IContactManagerForUser_Impl>(size) as Array<IContactManagerForUser?>
  }
}
