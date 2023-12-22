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

@ABIMarker(IStorageFolderStatics2.ABI::class)
@Signature("{b4656dc3-71d2-467d-8b29-371f0f62bf6f}")
@Guid("b4656dc371d2467d8b29371f0f62bf6f")
@WinRTInterface("b4656dc371d2467d8b29371f0f62bf6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageFolderStatics2.ByReference::class)
public interface IStorageFolderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFolderFromPathForUserAsync(user: User?, path: String?):
      IAsyncOperation<StorageFolder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageFolderStatics2> {
    public override fun getValue() = ABI.makeIStorageFolderStatics2(pointer.getPointer(0))

    public fun setValue(value: IStorageFolderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageFolderStatics2 {
    public val __213900291_Ptr: Pointer?

    public val _213900291_VtblPtr: Pointer?
      get() = __213900291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFolderFromPathForUserAsync(user: User?, path: String?):
        IAsyncOperation<StorageFolder?>? {
      val fnPtr = _213900291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__213900291_Ptr, marshalToNative(user), marshalToNative(path),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageFolderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __213900291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageFolderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4656dc371d2467d8b29371f0f62bf6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageFolderStatics2(ptr: Pointer?): WithDefault =
        IStorageFolderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageFolderStatics2 {
      val address = segment.toRawLongValue()
      return makeIStorageFolderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IStorageFolderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__213900291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageFolderStatics2): Array<IStorageFolderStatics2?> =
        (elements as
        Array<IStorageFolderStatics2?>).castToImpl<IStorageFolderStatics2,IStorageFolderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageFolderStatics2?> =
        arrayOfNulls<IStorageFolderStatics2_Impl>(size) as Array<IStorageFolderStatics2?>
  }
}
