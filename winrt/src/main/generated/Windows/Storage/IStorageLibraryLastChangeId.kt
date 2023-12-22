package Windows.Storage

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageLibraryLastChangeId.ABI::class)
@Signature("{5281826a-bbe1-53bc-82ca-81cc7f039329}")
@Guid("5281826abbe153bc82ca81cc7f039329")
@WinRTInterface("5281826abbe153bc82ca81cc7f039329")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryLastChangeId.ByReference::class)
public interface IStorageLibraryLastChangeId : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryLastChangeId> {
    public override fun getValue() = ABI.makeIStorageLibraryLastChangeId(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryLastChangeId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryLastChangeId {
    public val __794107610_Ptr: Pointer?

    public val _794107610_VtblPtr: Pointer?
      get() = __794107610_Ptr?.getPointer(0)
  }

  public class IStorageLibraryLastChangeId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __794107610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryLastChangeId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5281826abbe153bc82ca81cc7f039329")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryLastChangeId(ptr: Pointer?): WithDefault =
        IStorageLibraryLastChangeId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryLastChangeId {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryLastChangeId(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryLastChangeId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__794107610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryLastChangeId):
        Array<IStorageLibraryLastChangeId?> = (elements as
        Array<IStorageLibraryLastChangeId?>).castToImpl<IStorageLibraryLastChangeId,IStorageLibraryLastChangeId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryLastChangeId?> =
        arrayOfNulls<IStorageLibraryLastChangeId_Impl>(size) as Array<IStorageLibraryLastChangeId?>
  }
}
