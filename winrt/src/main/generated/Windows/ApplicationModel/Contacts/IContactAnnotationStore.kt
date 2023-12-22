package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactAnnotationStore.ABI::class)
@Signature("{23acf4aa-7a77-457d-8203-987f4b31af09}")
@Guid("23acf4aa7a77457d8203987f4b31af09")
@WinRTInterface("23acf4aa7a77457d8203987f4b31af09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactAnnotationStore.ByReference::class)
public interface IContactAnnotationStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindContactIdsByEmailAsync(emailAddress: String?):
      IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(1)
  public fun FindContactIdsByPhoneNumberAsync(phoneNumber: String?):
      IAsyncOperation<IVectorView<String?>?>?

  @InterfaceMethod(2)
  public fun FindAnnotationsForContactAsync(contact: Contact?):
      IAsyncOperation<IVectorView<ContactAnnotation?>?>?

  @InterfaceMethod(3)
  public fun DisableAnnotationAsync(`annotation`: ContactAnnotation?): IAsyncAction?

  @InterfaceMethod(4)
  public fun CreateAnnotationListAsync(): IAsyncOperation<ContactAnnotationList?>?

  @InterfaceMethod(5)
  public fun CreateAnnotationListAsync(userDataAccountId: String?):
      IAsyncOperation<ContactAnnotationList?>?

  @InterfaceMethod(6)
  public fun GetAnnotationListAsync(annotationListId: String?):
      IAsyncOperation<ContactAnnotationList?>?

  @InterfaceMethod(7)
  public fun FindAnnotationListsAsync(): IAsyncOperation<IVectorView<ContactAnnotationList?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactAnnotationStore> {
    public override fun getValue() = ABI.makeIContactAnnotationStore(pointer.getPointer(0))

    public fun setValue(value: IContactAnnotationStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactAnnotationStore {
    public val __1066680674_Ptr: Pointer?

    public val _1066680674_VtblPtr: Pointer?
      get() = __1066680674_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindContactIdsByEmailAsync(emailAddress: String?):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr, marshalToNative(emailAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindContactIdsByPhoneNumberAsync(phoneNumber: String?):
        IAsyncOperation<IVectorView<String?>?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<String?>?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr, marshalToNative(phoneNumber), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IVectorView<String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAnnotationsForContactAsync(contact: Contact?):
        IAsyncOperation<IVectorView<ContactAnnotation?>?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactAnnotation?>?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr, marshalToNative(contact), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactAnnotation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DisableAnnotationAsync(`annotation`: ContactAnnotation?): IAsyncAction? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr, marshalToNative(annotation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateAnnotationListAsync(): IAsyncOperation<ContactAnnotationList?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactAnnotationList?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContactAnnotationList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateAnnotationListAsync(userDataAccountId: String?):
        IAsyncOperation<ContactAnnotationList?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactAnnotationList?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr, marshalToNative(userDataAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContactAnnotationList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetAnnotationListAsync(annotationListId: String?):
        IAsyncOperation<ContactAnnotationList?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactAnnotationList?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr, marshalToNative(annotationListId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ContactAnnotationList?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindAnnotationListsAsync():
        IAsyncOperation<IVectorView<ContactAnnotationList?>?>? {
      val fnPtr = _1066680674_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactAnnotationList?>?>>()
      val hr = fn.invokeHR(arrayOf(__1066680674_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactAnnotationList?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactAnnotationStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1066680674_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactAnnotationStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23acf4aa7a77457d8203987f4b31af09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactAnnotationStore(ptr: Pointer?): WithDefault =
        IContactAnnotationStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactAnnotationStore {
      val address = segment.toRawLongValue()
      return makeIContactAnnotationStore(Pointer(address))
    }

    public override fun toNative(obj: IContactAnnotationStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1066680674_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactAnnotationStore): Array<IContactAnnotationStore?>
        = (elements as
        Array<IContactAnnotationStore?>).castToImpl<IContactAnnotationStore,IContactAnnotationStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactAnnotationStore?> =
        arrayOfNulls<IContactAnnotationStore_Impl>(size) as Array<IContactAnnotationStore?>
  }
}
