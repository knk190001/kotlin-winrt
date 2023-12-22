package Windows.Storage

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageLibraryStatics.ABI::class)
@Signature("{4208a6db-684a-49c6-9e59-90121ee050d6}")
@Guid("4208a6db684a49c69e5990121ee050d6")
@WinRTInterface("4208a6db684a49c69e5990121ee050d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryStatics.ByReference::class)
public interface IStorageLibraryStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLibraryAsync(libraryId: KnownLibraryId?): IAsyncOperation<StorageLibrary?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryStatics> {
    public override fun getValue() = ABI.makeIStorageLibraryStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryStatics {
    public val __1727050476_Ptr: Pointer?

    public val _1727050476_VtblPtr: Pointer?
      get() = __1727050476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLibraryAsync(libraryId: KnownLibraryId?):
        IAsyncOperation<StorageLibrary?>? {
      val fnPtr = _1727050476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageLibrary?>>()
      val hr = fn.invokeHR(arrayOf(__1727050476_Ptr, marshalToNative(libraryId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageLibrary?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibraryStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1727050476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4208a6db684a49c69e5990121ee050d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryStatics(ptr: Pointer?): WithDefault =
        IStorageLibraryStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryStatics {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1727050476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryStatics): Array<IStorageLibraryStatics?> =
        (elements as
        Array<IStorageLibraryStatics?>).castToImpl<IStorageLibraryStatics,IStorageLibraryStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryStatics?> =
        arrayOfNulls<IStorageLibraryStatics_Impl>(size) as Array<IStorageLibraryStatics?>
  }
}
