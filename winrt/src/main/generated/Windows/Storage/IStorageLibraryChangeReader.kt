package Windows.Storage

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageLibraryChangeReader.ABI::class)
@Signature("{f205bc83-fca2-41f9-8954-ee2e991eb96f}")
@Guid("f205bc83fca241f98954ee2e991eb96f")
@WinRTInterface("f205bc83fca241f98954ee2e991eb96f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryChangeReader.ByReference::class)
public interface IStorageLibraryChangeReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ReadBatchAsync(): IAsyncOperation<IVectorView<StorageLibraryChange?>?>?

  @InterfaceMethod(1)
  public fun AcceptChangesAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryChangeReader> {
    public override fun getValue() = ABI.makeIStorageLibraryChangeReader(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryChangeReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryChangeReader {
    public val __946864588_Ptr: Pointer?

    public val _946864588_VtblPtr: Pointer?
      get() = __946864588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ReadBatchAsync(): IAsyncOperation<IVectorView<StorageLibraryChange?>?>? {
      val fnPtr = _946864588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<StorageLibraryChange?>?>>()
      val hr = fn.invokeHR(arrayOf(__946864588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<StorageLibraryChange?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AcceptChangesAsync(): IAsyncAction? {
      val fnPtr = _946864588_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__946864588_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibraryChangeReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __946864588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryChangeReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f205bc83fca241f98954ee2e991eb96f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryChangeReader(ptr: Pointer?): WithDefault =
        IStorageLibraryChangeReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryChangeReader {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryChangeReader(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__946864588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeReader):
        Array<IStorageLibraryChangeReader?> = (elements as
        Array<IStorageLibraryChangeReader?>).castToImpl<IStorageLibraryChangeReader,IStorageLibraryChangeReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeReader?> =
        arrayOfNulls<IStorageLibraryChangeReader_Impl>(size) as Array<IStorageLibraryChangeReader?>
  }
}
