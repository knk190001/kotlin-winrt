package Windows.Storage.Search

import Windows.Foundation.DateTime
import Windows.Storage.StorageFolder
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

@ABIMarker(IStorageLibraryContentChangedTriggerDetails.ABI::class)
@Signature("{2a371977-abbf-4e1d-8aa5-6385d8884799}")
@Guid("2a371977abbf4e1d8aa56385d8884799")
@WinRTInterface("2a371977abbf4e1d8aa56385d8884799")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryContentChangedTriggerDetails.ByReference::class)
public interface IStorageLibraryContentChangedTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Folder(): StorageFolder?

  @InterfaceMethod(1)
  public fun CreateModifiedSinceQuery(lastQueryTime: DateTime?): StorageItemQueryResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryContentChangedTriggerDetails> {
    public override fun getValue() =
        ABI.makeIStorageLibraryContentChangedTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryContentChangedTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryContentChangedTriggerDetails {
    public val __1226699240_Ptr: Pointer?

    public val _1226699240_VtblPtr: Pointer?
      get() = __1226699240_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Folder(): StorageFolder? {
      val fnPtr = _1226699240_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__1226699240_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateModifiedSinceQuery(lastQueryTime: DateTime?):
        StorageItemQueryResult? {
      val fnPtr = _1226699240_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageItemQueryResult>()
      val hr = fn.invokeHR(arrayOf(__1226699240_Ptr, marshalToNative(lastQueryTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageItemQueryResult>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibraryContentChangedTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1226699240_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryContentChangedTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2a371977abbf4e1d8aa56385d8884799")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryContentChangedTriggerDetails(ptr: Pointer?): WithDefault =
        IStorageLibraryContentChangedTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStorageLibraryContentChangedTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryContentChangedTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryContentChangedTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1226699240_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryContentChangedTriggerDetails):
        Array<IStorageLibraryContentChangedTriggerDetails?> = (elements as
        Array<IStorageLibraryContentChangedTriggerDetails?>).castToImpl<IStorageLibraryContentChangedTriggerDetails,IStorageLibraryContentChangedTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryContentChangedTriggerDetails?> =
        arrayOfNulls<IStorageLibraryContentChangedTriggerDetails_Impl>(size) as
        Array<IStorageLibraryContentChangedTriggerDetails?>
  }
}
