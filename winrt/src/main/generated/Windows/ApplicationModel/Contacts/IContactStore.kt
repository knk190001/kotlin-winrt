package Windows.ApplicationModel.Contacts

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IContactStore.ABI::class)
@Signature("{2c220b10-3a6c-4293-b9bc-fe987f6e0d52}")
@Guid("2c220b103a6c4293b9bcfe987f6e0d52")
@WinRTInterface("2c220b103a6c4293b9bcfe987f6e0d52")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactStore.ByReference::class)
public interface IContactStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindContactsAsync(): IAsyncOperation<IVectorView<Contact?>?>?

  @InterfaceMethod(1)
  public fun FindContactsAsync(searchText: String?): IAsyncOperation<IVectorView<Contact?>?>?

  @InterfaceMethod(2)
  public fun GetContactAsync(contactId: String?): IAsyncOperation<Contact?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactStore>
      {
    public override fun getValue() = ABI.makeIContactStore(pointer.getPointer(0))

    public fun setValue(value: IContactStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactStore {
    public val __1313186931_Ptr: Pointer?

    public val _1313186931_VtblPtr: Pointer?
      get() = __1313186931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindContactsAsync(): IAsyncOperation<IVectorView<Contact?>?>? {
      val fnPtr = _1313186931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Contact?>?>>()
      val hr = fn.invokeHR(arrayOf(__1313186931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Contact?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindContactsAsync(searchText: String?):
        IAsyncOperation<IVectorView<Contact?>?>? {
      val fnPtr = _1313186931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<Contact?>?>>()
      val hr = fn.invokeHR(arrayOf(__1313186931_Ptr, marshalToNative(searchText), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<Contact?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetContactAsync(contactId: String?): IAsyncOperation<Contact?>? {
      val fnPtr = _1313186931_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Contact?>>()
      val hr = fn.invokeHR(arrayOf(__1313186931_Ptr, marshalToNative(contactId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Contact?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1313186931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c220b103a6c4293b9bcfe987f6e0d52")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactStore(ptr: Pointer?): WithDefault = IContactStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactStore {
      val address = segment.toRawLongValue()
      return makeIContactStore(Pointer(address))
    }

    public override fun toNative(obj: IContactStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1313186931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactStore): Array<IContactStore?> = (elements as
        Array<IContactStore?>).castToImpl<IContactStore,IContactStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactStore?> =
        arrayOfNulls<IContactStore_Impl>(size) as Array<IContactStore?>
  }
}
