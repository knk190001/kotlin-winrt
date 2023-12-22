package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.System.User
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

@ABIMarker(IStorageLibraryStatics2.ABI::class)
@Signature("{ffb08ddc-fa75-4695-b9d1-7f81f97832e3}")
@Guid("ffb08ddcfa754695b9d17f81f97832e3")
@WinRTInterface("ffb08ddcfa754695b9d17f81f97832e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryStatics2.ByReference::class)
public interface IStorageLibraryStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLibraryForUserAsync(user: User?, libraryId: KnownLibraryId?):
      IAsyncOperation<StorageLibrary?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryStatics2> {
    public override fun getValue() = ABI.makeIStorageLibraryStatics2(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryStatics2 {
    public val __1998957254_Ptr: Pointer?

    public val _1998957254_VtblPtr: Pointer?
      get() = __1998957254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLibraryForUserAsync(user: User?, libraryId: KnownLibraryId?):
        IAsyncOperation<StorageLibrary?>? {
      val fnPtr = _1998957254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageLibrary?>>()
      val hr = fn.invokeHR(arrayOf(__1998957254_Ptr, marshalToNative(user),
          marshalToNative(libraryId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageLibrary?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibraryStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1998957254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ffb08ddcfa754695b9d17f81f97832e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryStatics2(ptr: Pointer?): WithDefault =
        IStorageLibraryStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryStatics2 {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1998957254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryStatics2): Array<IStorageLibraryStatics2?>
        = (elements as
        Array<IStorageLibraryStatics2?>).castToImpl<IStorageLibraryStatics2,IStorageLibraryStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryStatics2?> =
        arrayOfNulls<IStorageLibraryStatics2_Impl>(size) as Array<IStorageLibraryStatics2?>
  }
}
