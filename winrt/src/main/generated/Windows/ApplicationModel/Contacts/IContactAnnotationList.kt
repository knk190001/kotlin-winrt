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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactAnnotationList.ABI::class)
@Signature("{92a486aa-5c88-45b9-aad0-461888e68d8a}")
@Guid("92a486aa5c8845b9aad0461888e68d8a")
@WinRTInterface("92a486aa5c8845b9aad0461888e68d8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactAnnotationList.ByReference::class)
public interface IContactAnnotationList : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_ProviderPackageFamilyName(): String?

  @InterfaceMethod(2)
  public fun get_UserDataAccountId(): String?

  @InterfaceMethod(3)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(4)
  public fun TrySaveAnnotationAsync(`annotation`: ContactAnnotation?): IAsyncOperation<Boolean>?

  @InterfaceMethod(5)
  public fun GetAnnotationAsync(annotationId: String?): IAsyncOperation<ContactAnnotation?>?

  @InterfaceMethod(6)
  public fun FindAnnotationsByRemoteIdAsync(remoteId: String?):
      IAsyncOperation<IVectorView<ContactAnnotation?>?>?

  @InterfaceMethod(7)
  public fun FindAnnotationsAsync(): IAsyncOperation<IVectorView<ContactAnnotation?>?>?

  @InterfaceMethod(8)
  public fun DeleteAnnotationAsync(`annotation`: ContactAnnotation?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactAnnotationList> {
    public override fun getValue() = ABI.makeIContactAnnotationList(pointer.getPointer(0))

    public fun setValue(value: IContactAnnotationList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactAnnotationList {
    public val __242466625_Ptr: Pointer?

    public val _242466625_VtblPtr: Pointer?
      get() = __242466625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProviderPackageFamilyName(): String? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UserDataAccountId(): String? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TrySaveAnnotationAsync(`annotation`: ContactAnnotation?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr, marshalToNative(annotation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetAnnotationAsync(annotationId: String?):
        IAsyncOperation<ContactAnnotation?>? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ContactAnnotation?>>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr, marshalToNative(annotationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ContactAnnotation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun FindAnnotationsByRemoteIdAsync(remoteId: String?):
        IAsyncOperation<IVectorView<ContactAnnotation?>?>? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactAnnotation?>?>>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr, marshalToNative(remoteId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactAnnotation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindAnnotationsAsync(): IAsyncOperation<IVectorView<ContactAnnotation?>?>? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactAnnotation?>?>>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactAnnotation?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun DeleteAnnotationAsync(`annotation`: ContactAnnotation?): IAsyncAction? {
      val fnPtr = _242466625_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__242466625_Ptr, marshalToNative(annotation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactAnnotationList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __242466625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactAnnotationList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92a486aa5c8845b9aad0461888e68d8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactAnnotationList(ptr: Pointer?): WithDefault =
        IContactAnnotationList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactAnnotationList {
      val address = segment.toRawLongValue()
      return makeIContactAnnotationList(Pointer(address))
    }

    public override fun toNative(obj: IContactAnnotationList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__242466625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactAnnotationList): Array<IContactAnnotationList?> =
        (elements as
        Array<IContactAnnotationList?>).castToImpl<IContactAnnotationList,IContactAnnotationList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactAnnotationList?> =
        arrayOfNulls<IContactAnnotationList_Impl>(size) as Array<IContactAnnotationList?>
  }
}
