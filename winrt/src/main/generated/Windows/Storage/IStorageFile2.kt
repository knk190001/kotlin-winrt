package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IStorageFile2.ABI::class)
@Signature("{954e4bcf-0a77-42fb-b777-c2ed58a52e44}")
@Guid("954e4bcf0a7742fbb777c2ed58a52e44")
@WinRTInterface("954e4bcf0a7742fbb777c2ed58a52e44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFile2.ByReference::class)
public interface IStorageFile2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenAsync(accessMode: FileAccessMode?, options: StorageOpenOptions?):
      IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(1)
  public fun OpenTransactedWriteAsync(options: StorageOpenOptions?):
      IAsyncOperation<StorageStreamTransaction?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStorageFile2>
      {
    public override fun getValue() = ABI.makeIStorageFile2(pointer.getPointer(0))

    public fun setValue(value: IStorageFile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFile2 {
    public val __1447793772_Ptr: Pointer?

    public val _1447793772_VtblPtr: Pointer?
      get() = __1447793772_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OpenAsync(accessMode: FileAccessMode?, options: StorageOpenOptions?):
        IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _1447793772_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__1447793772_Ptr, marshalToNative(accessMode),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OpenTransactedWriteAsync(options: StorageOpenOptions?):
        IAsyncOperation<StorageStreamTransaction?>? {
      val fnPtr = _1447793772_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageStreamTransaction?>>()
      val hr = fn.invokeHR(arrayOf(__1447793772_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StorageStreamTransaction?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1447793772_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("954e4bcf0a7742fbb777c2ed58a52e44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFile2(ptr: Pointer?): WithDefault = IStorageFile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFile2 {
      val address = segment.toRawLongValue()
      return makeIStorageFile2(Pointer(address))
    }

    public override fun toNative(obj: IStorageFile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1447793772_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFile2): Array<IStorageFile2?> = (elements as
        Array<IStorageFile2?>).castToImpl<IStorageFile2,IStorageFile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFile2?> =
        arrayOfNulls<IStorageFile2_Impl>(size) as Array<IStorageFile2?>
  }
}
