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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageFileStatics2.ABI::class)
@Signature("{5c76a781-212e-4af9-8f04-740cae108974}")
@Guid("5c76a781212e4af98f04740cae108974")
@WinRTInterface("5c76a781212e4af98f04740cae108974")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFileStatics2.ByReference::class)
public interface IStorageFileStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFileFromPathForUserAsync(user: User?, path: String?): IAsyncOperation<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFileStatics2> {
    public override fun getValue() = ABI.makeIStorageFileStatics2(pointer.getPointer(0))

    public fun setValue(value: IStorageFileStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFileStatics2 {
    public val __131154037_Ptr: Pointer?

    public val _131154037_VtblPtr: Pointer?
      get() = __131154037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFileFromPathForUserAsync(user: User?, path: String?):
        IAsyncOperation<StorageFile?>? {
      val fnPtr = _131154037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__131154037_Ptr, marshalToNative(user), marshalToNative(path),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFileStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __131154037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFileStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c76a781212e4af98f04740cae108974")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFileStatics2(ptr: Pointer?): WithDefault = IStorageFileStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFileStatics2 {
      val address = segment.toRawLongValue()
      return makeIStorageFileStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStorageFileStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__131154037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFileStatics2): Array<IStorageFileStatics2?> =
        (elements as
        Array<IStorageFileStatics2?>).castToImpl<IStorageFileStatics2,IStorageFileStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFileStatics2?> =
        arrayOfNulls<IStorageFileStatics2_Impl>(size) as Array<IStorageFileStatics2?>
  }
}
