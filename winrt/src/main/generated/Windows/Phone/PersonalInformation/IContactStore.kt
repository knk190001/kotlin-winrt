package Windows.Phone.PersonalInformation

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactStore.ABI::class)
@Signature("{b2cd6fef-2bfd-4fad-8552-4e698097e8eb}")
@Guid("b2cd6fef2bfd4fad85524e698097e8eb")
@WinRTInterface("b2cd6fef2bfd4fad85524e698097e8eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactStore.ByReference::class)
public interface IContactStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindContactByRemoteIdAsync(id: String?): IAsyncOperation<StoredContact?>?

  @InterfaceMethod(1)
  public fun FindContactByIdAsync(id: String?): IAsyncOperation<StoredContact?>?

  @InterfaceMethod(2)
  public fun DeleteContactAsync(id: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun CreateContactQuery(): ContactQueryResult?

  @InterfaceMethod(4)
  public fun CreateContactQuery(options: ContactQueryOptions?): ContactQueryResult?

  @InterfaceMethod(5)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(6)
  public fun get_RevisionNumber(): WinDef.ULONG

  @InterfaceMethod(7)
  public fun GetChangesAsync(baseRevisionNumber: WinDef.ULONG):
      IAsyncOperation<IVectorView<ContactChangeRecord?>?>?

  @InterfaceMethod(8)
  public fun LoadExtendedPropertiesAsync(): IAsyncOperation<IMap<String?, IUnknown?>?>?

  @InterfaceMethod(9)
  public fun SaveExtendedPropertiesAsync(`data`: IMapView<String?, IUnknown?>?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactStore>
      {
    public override fun getValue() = ABI.makeIContactStore(pointer.getPointer(0))

    public fun setValue(value: IContactStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactStore {
    public val __343114007_Ptr: Pointer?

    public val _343114007_VtblPtr: Pointer?
      get() = __343114007_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindContactByRemoteIdAsync(id: String?): IAsyncOperation<StoredContact?>? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoredContact?>>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StoredContact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindContactByIdAsync(id: String?): IAsyncOperation<StoredContact?>? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StoredContact?>>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StoredContact?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteContactAsync(id: String?): IAsyncAction? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateContactQuery(): ContactQueryResult? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryResult>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateContactQuery(options: ContactQueryOptions?): ContactQueryResult? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryResult>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_RevisionNumber(): WinDef.ULONG {
      val fnPtr = _343114007_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetChangesAsync(baseRevisionNumber: WinDef.ULONG):
        IAsyncOperation<IVectorView<ContactChangeRecord?>?>? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactChangeRecord?>?>>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr, baseRevisionNumber, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactChangeRecord?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun LoadExtendedPropertiesAsync(): IAsyncOperation<IMap<String?, IUnknown?>?>? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMap<String?, IUnknown?>?>>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMap<String?,
          IUnknown?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun SaveExtendedPropertiesAsync(`data`: IMapView<String?, IUnknown?>?):
        IAsyncAction? {
      val fnPtr = _343114007_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__343114007_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __343114007_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2cd6fef2bfd4fad85524e698097e8eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactStore(ptr: Pointer?): WithDefault = IContactStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactStore {
      val address = segment.toRawLongValue()
      return makeIContactStore(Pointer(address))
    }

    public override fun toNative(obj: IContactStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__343114007_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactStore): Array<IContactStore?> = (elements as
        Array<IContactStore?>).castToImpl<IContactStore,IContactStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactStore?> =
        arrayOfNulls<IContactStore_Impl>(size) as Array<IContactStore?>
  }
}
