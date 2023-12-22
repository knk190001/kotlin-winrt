package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Provider.FileUpdateStatus
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

@ABIMarker(ICachedFileManagerStatics.ABI::class)
@Signature("{8ffc224a-e782-495d-b614-654c4f0b2370}")
@Guid("8ffc224ae782495db614654c4f0b2370")
@WinRTInterface("8ffc224ae782495db614654c4f0b2370")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICachedFileManagerStatics.ByReference::class)
public interface ICachedFileManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DeferUpdates(`file`: IStorageFile?): Unit

  @InterfaceMethod(1)
  public fun CompleteUpdatesAsync(`file`: IStorageFile?): IAsyncOperation<FileUpdateStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICachedFileManagerStatics> {
    public override fun getValue() = ABI.makeICachedFileManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICachedFileManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICachedFileManagerStatics {
    public val __1193926223_Ptr: Pointer?

    public val _1193926223_VtblPtr: Pointer?
      get() = __1193926223_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DeferUpdates(`file`: IStorageFile?): Unit {
      val fnPtr = _1193926223_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1193926223_Ptr, marshalToNative(file),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun CompleteUpdatesAsync(`file`: IStorageFile?):
        IAsyncOperation<FileUpdateStatus?>? {
      val fnPtr = _1193926223_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<FileUpdateStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1193926223_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<FileUpdateStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ICachedFileManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1193926223_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICachedFileManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ffc224ae782495db614654c4f0b2370")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICachedFileManagerStatics(ptr: Pointer?): WithDefault =
        ICachedFileManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICachedFileManagerStatics {
      val address = segment.toRawLongValue()
      return makeICachedFileManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICachedFileManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1193926223_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICachedFileManagerStatics):
        Array<ICachedFileManagerStatics?> = (elements as
        Array<ICachedFileManagerStatics?>).castToImpl<ICachedFileManagerStatics,ICachedFileManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICachedFileManagerStatics?> =
        arrayOfNulls<ICachedFileManagerStatics_Impl>(size) as Array<ICachedFileManagerStatics?>
  }
}
