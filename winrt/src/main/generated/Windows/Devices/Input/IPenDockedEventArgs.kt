package Windows.Devices.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPenDockedEventArgs.ABI::class)
@Signature("{fd4277c6-ca63-5d4e-9ed3-a28a54521c8c}")
@Guid("fd4277c6ca635d4e9ed3a28a54521c8c")
@WinRTInterface("fd4277c6ca635d4e9ed3a28a54521c8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDockedEventArgs.ByReference::class)
public interface IPenDockedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenDockedEventArgs> {
    public override fun getValue() = ABI.makeIPenDockedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPenDockedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDockedEventArgs {
    public val __588769081_Ptr: Pointer?

    public val _588769081_VtblPtr: Pointer?
      get() = __588769081_Ptr?.getPointer(0)
  }

  public class IPenDockedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __588769081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDockedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd4277c6ca635d4e9ed3a28a54521c8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDockedEventArgs(ptr: Pointer?): WithDefault = IPenDockedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDockedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPenDockedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPenDockedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__588769081_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDockedEventArgs): Array<IPenDockedEventArgs?> =
        (elements as
        Array<IPenDockedEventArgs?>).castToImpl<IPenDockedEventArgs,IPenDockedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDockedEventArgs?> =
        arrayOfNulls<IPenDockedEventArgs_Impl>(size) as Array<IPenDockedEventArgs?>
  }
}
