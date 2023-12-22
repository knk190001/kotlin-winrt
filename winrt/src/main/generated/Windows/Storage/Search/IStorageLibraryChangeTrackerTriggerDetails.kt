package Windows.Storage.Search

import Windows.Storage.StorageFolder
import Windows.Storage.StorageLibraryChangeTracker
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

@ABIMarker(IStorageLibraryChangeTrackerTriggerDetails.ABI::class)
@Signature("{1dc7a369-b7a3-4df2-9d61-eba85a0343d2}")
@Guid("1dc7a369b7a34df29d61eba85a0343d2")
@WinRTInterface("1dc7a369b7a34df29d61eba85a0343d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryChangeTrackerTriggerDetails.ByReference::class)
public interface IStorageLibraryChangeTrackerTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Folder(): StorageFolder?

  @InterfaceMethod(1)
  public fun get_ChangeTracker(): StorageLibraryChangeTracker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryChangeTrackerTriggerDetails> {
    public override fun getValue() =
        ABI.makeIStorageLibraryChangeTrackerTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryChangeTrackerTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryChangeTrackerTriggerDetails {
    public val __63109359_Ptr: Pointer?

    public val _63109359_VtblPtr: Pointer?
      get() = __63109359_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Folder(): StorageFolder? {
      val fnPtr = _63109359_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__63109359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChangeTracker(): StorageLibraryChangeTracker? {
      val fnPtr = _63109359_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageLibraryChangeTracker>()
      val hr = fn.invokeHR(arrayOf(__63109359_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageLibraryChangeTracker>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibraryChangeTrackerTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __63109359_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryChangeTrackerTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1dc7a369b7a34df29d61eba85a0343d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryChangeTrackerTriggerDetails(ptr: Pointer?): WithDefault =
        IStorageLibraryChangeTrackerTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IStorageLibraryChangeTrackerTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryChangeTrackerTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryChangeTrackerTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__63109359_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeTrackerTriggerDetails):
        Array<IStorageLibraryChangeTrackerTriggerDetails?> = (elements as
        Array<IStorageLibraryChangeTrackerTriggerDetails?>).castToImpl<IStorageLibraryChangeTrackerTriggerDetails,IStorageLibraryChangeTrackerTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeTrackerTriggerDetails?> =
        arrayOfNulls<IStorageLibraryChangeTrackerTriggerDetails_Impl>(size) as
        Array<IStorageLibraryChangeTrackerTriggerDetails?>
  }
}
