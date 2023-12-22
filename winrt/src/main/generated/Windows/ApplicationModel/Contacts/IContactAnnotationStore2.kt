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

@ABIMarker(IContactAnnotationStore2.ABI::class)
@Signature("{7ede23fd-61e7-4967-8ec5-bdf280a24063}")
@Guid("7ede23fd61e749678ec5bdf280a24063")
@WinRTInterface("7ede23fd61e749678ec5bdf280a24063")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactAnnotationStore2.ByReference::class)
public interface IContactAnnotationStore2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAnnotationsForContactListAsync(contactListId: String?):
      IAsyncOperation<IVectorView<ContactAnnotation?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactAnnotationStore2> {
    public override fun getValue() = ABI.makeIContactAnnotationStore2(pointer.getPointer(0))

    public fun setValue(value: IContactAnnotationStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactAnnotationStore2 {
    public val __1292637524_Ptr: Pointer?

    public val _1292637524_VtblPtr: Pointer?
      get() = __1292637524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAnnotationsForContactListAsync(contactListId: String?):
        IAsyncOperation<IVectorView<ContactAnnotation?>?>? {
      val fnPtr = _1292637524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<ContactAnnotation?>?>>()
      val hr = fn.invokeHR(arrayOf(__1292637524_Ptr, marshalToNative(contactListId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<ContactAnnotation?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IContactAnnotationStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1292637524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactAnnotationStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ede23fd61e749678ec5bdf280a24063")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactAnnotationStore2(ptr: Pointer?): WithDefault =
        IContactAnnotationStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactAnnotationStore2 {
      val address = segment.toRawLongValue()
      return makeIContactAnnotationStore2(Pointer(address))
    }

    public override fun toNative(obj: IContactAnnotationStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1292637524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactAnnotationStore2):
        Array<IContactAnnotationStore2?> = (elements as
        Array<IContactAnnotationStore2?>).castToImpl<IContactAnnotationStore2,IContactAnnotationStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactAnnotationStore2?> =
        arrayOfNulls<IContactAnnotationStore2_Impl>(size) as Array<IContactAnnotationStore2?>
  }
}
