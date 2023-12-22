package Windows.Storage.Search

import Windows.Data.Text.TextSegment
import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVectorView
import Windows.Storage.Search.IStorageQueryResultBase.ABI.IID
import Windows.Storage.StorageFile
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

@ABIMarker(IStorageFileQueryResult2.ABI::class)
@Signature("{4e5db9dd-7141-46c4-8be3-e9dc9e27275c}")
@Guid("4e5db9dd714146c48be3e9dc9e27275c")
@WinRTInterface("4e5db9dd714146c48be3e9dc9e27275c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFileQueryResult2.ByReference::class)
public interface IStorageFileQueryResult2 : NativeMapped, IWinRTInterface, IStorageQueryResultBase {
  @InterfaceMethod(0)
  public fun GetMatchingPropertiesWithRanges(`file`: StorageFile?): IMap<String?,
      IVectorView<TextSegment?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFileQueryResult2> {
    public override fun getValue() = ABI.makeIStorageFileQueryResult2(pointer.getPointer(0))

    public fun setValue(value: IStorageFileQueryResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFileQueryResult2, IStorageQueryResultBase.WithDefault {
    public val __482781473_Ptr: Pointer?

    public val _482781473_VtblPtr: Pointer?
      get() = __482781473_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetMatchingPropertiesWithRanges(`file`: StorageFile?): IMap<String?,
        IVectorView<TextSegment?>?>? {
      val fnPtr = _482781473_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, IVectorView<TextSegment?>?>>()
      val hr = fn.invokeHR(arrayOf(__482781473_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?,
          IVectorView<TextSegment?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFileQueryResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageQueryResultBase {
    public override val __1632583490_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_482781473_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __482781473_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFileQueryResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e5db9dd714146c48be3e9dc9e27275c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFileQueryResult2(ptr: Pointer?): WithDefault =
        IStorageFileQueryResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFileQueryResult2 {
      val address = segment.toRawLongValue()
      return makeIStorageFileQueryResult2(Pointer(address))
    }

    public override fun toNative(obj: IStorageFileQueryResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__482781473_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileQueryResult2):
        Array<IStorageFileQueryResult2?> = (elements as
        Array<IStorageFileQueryResult2?>).castToImpl<IStorageFileQueryResult2,IStorageFileQueryResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileQueryResult2?> =
        arrayOfNulls<IStorageFileQueryResult2_Impl>(size) as Array<IStorageFileQueryResult2?>
  }
}
