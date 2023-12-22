package Windows.Media.Import

import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhotoImportFindItemsResult2.ABI::class)
@Signature("{fbdd6a3b-ecf9-406a-815e-5015625b0a88}")
@Guid("fbdd6a3becf9406a815e5015625b0a88")
@WinRTInterface("fbdd6a3becf9406a815e5015625b0a88")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportFindItemsResult2.ByReference::class)
public interface IPhotoImportFindItemsResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddItemsInDateRangeToSelection(rangeStart: DateTime?, rangeLength: TimeSpan?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportFindItemsResult2> {
    public override fun getValue() = ABI.makeIPhotoImportFindItemsResult2(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportFindItemsResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportFindItemsResult2 {
    public val __208856938_Ptr: Pointer?

    public val _208856938_VtblPtr: Pointer?
      get() = __208856938_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddItemsInDateRangeToSelection(rangeStart: DateTime?,
        rangeLength: TimeSpan?): Unit {
      val fnPtr = _208856938_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208856938_Ptr, marshalToNative(rangeStart),
          marshalToNative(rangeLength),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPhotoImportFindItemsResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __208856938_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportFindItemsResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fbdd6a3becf9406a815e5015625b0a88")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportFindItemsResult2(ptr: Pointer?): WithDefault =
        IPhotoImportFindItemsResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportFindItemsResult2 {
      val address = segment.toRawLongValue()
      return makeIPhotoImportFindItemsResult2(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportFindItemsResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__208856938_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportFindItemsResult2):
        Array<IPhotoImportFindItemsResult2?> = (elements as
        Array<IPhotoImportFindItemsResult2?>).castToImpl<IPhotoImportFindItemsResult2,IPhotoImportFindItemsResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportFindItemsResult2?> =
        arrayOfNulls<IPhotoImportFindItemsResult2_Impl>(size) as
        Array<IPhotoImportFindItemsResult2?>
  }
}
