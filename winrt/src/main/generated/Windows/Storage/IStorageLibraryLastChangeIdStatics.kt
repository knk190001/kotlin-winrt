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

@ABIMarker(IStorageLibraryLastChangeIdStatics.ABI::class)
@Signature("{81a49128-2ca3-5309-b0d1-cf0788e40762}")
@Guid("81a491282ca35309b0d1cf0788e40762")
@WinRTInterface("81a491282ca35309b0d1cf0788e40762")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryLastChangeIdStatics.ByReference::class)
public interface IStorageLibraryLastChangeIdStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unknown(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryLastChangeIdStatics> {
    public override fun getValue() =
        ABI.makeIStorageLibraryLastChangeIdStatics(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryLastChangeIdStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryLastChangeIdStatics {
    public val __1573785717_Ptr: Pointer?

    public val _1573785717_VtblPtr: Pointer?
      get() = __1573785717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unknown(): WinDef.ULONG {
      val fnPtr = _1573785717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1573785717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageLibraryLastChangeIdStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1573785717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryLastChangeIdStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81a491282ca35309b0d1cf0788e40762")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryLastChangeIdStatics(ptr: Pointer?): WithDefault =
        IStorageLibraryLastChangeIdStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryLastChangeIdStatics {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryLastChangeIdStatics(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryLastChangeIdStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1573785717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryLastChangeIdStatics):
        Array<IStorageLibraryLastChangeIdStatics?> = (elements as
        Array<IStorageLibraryLastChangeIdStatics?>).castToImpl<IStorageLibraryLastChangeIdStatics,IStorageLibraryLastChangeIdStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryLastChangeIdStatics?> =
        arrayOfNulls<IStorageLibraryLastChangeIdStatics_Impl>(size) as
        Array<IStorageLibraryLastChangeIdStatics?>
  }
}
