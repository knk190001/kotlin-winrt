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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageFolderStatics.ABI::class)
@Signature("{08f327ff-85d5-48b9-aee9-28511e339f9f}")
@Guid("08f327ff85d548b9aee928511e339f9f")
@WinRTInterface("08f327ff85d548b9aee928511e339f9f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolderStatics.ByReference::class)
public interface IStorageFolderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFolderFromPathAsync(path: String?): IAsyncOperation<StorageFolder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFolderStatics> {
    public override fun getValue() = ABI.makeIStorageFolderStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageFolderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolderStatics {
    public val __6900011_Ptr: Pointer?

    public val _6900011_VtblPtr: Pointer?
      get() = __6900011_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFolderFromPathAsync(path: String?): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _6900011_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__6900011_Ptr, marshalToNative(path), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFolderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __6900011_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08f327ff85d548b9aee928511e339f9f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolderStatics(ptr: Pointer?): WithDefault =
        IStorageFolderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolderStatics {
      val address = segment.toRawLongValue()
      return makeIStorageFolderStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__6900011_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderStatics): Array<IStorageFolderStatics?> =
        (elements as
        Array<IStorageFolderStatics?>).castToImpl<IStorageFolderStatics,IStorageFolderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderStatics?> =
        arrayOfNulls<IStorageFolderStatics_Impl>(size) as Array<IStorageFolderStatics?>
  }
}
