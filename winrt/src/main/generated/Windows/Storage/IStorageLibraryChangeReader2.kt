package Windows.Storage

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IStorageLibraryChangeReader2.ABI::class)
@Signature("{abf4868b-fbcc-4a4f-999e-e7ab7c646dbe}")
@Guid("abf4868bfbcc4a4f999ee7ab7c646dbe")
@WinRTInterface("abf4868bfbcc4a4f999ee7ab7c646dbe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryChangeReader2.ByReference::class)
public interface IStorageLibraryChangeReader2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetLastChangeId(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryChangeReader2> {
    public override fun getValue() = ABI.makeIStorageLibraryChangeReader2(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryChangeReader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryChangeReader2 {
    public val __711968794_Ptr: Pointer?

    public val _711968794_VtblPtr: Pointer?
      get() = __711968794_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetLastChangeId(): WinDef.ULONG {
      val fnPtr = _711968794_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__711968794_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageLibraryChangeReader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __711968794_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryChangeReader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abf4868bfbcc4a4f999ee7ab7c646dbe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryChangeReader2(ptr: Pointer?): WithDefault =
        IStorageLibraryChangeReader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryChangeReader2 {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryChangeReader2(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryChangeReader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__711968794_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryChangeReader2):
        Array<IStorageLibraryChangeReader2?> = (elements as
        Array<IStorageLibraryChangeReader2?>).castToImpl<IStorageLibraryChangeReader2,IStorageLibraryChangeReader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryChangeReader2?> =
        arrayOfNulls<IStorageLibraryChangeReader2_Impl>(size) as
        Array<IStorageLibraryChangeReader2?>
  }
}
