package Windows.Phone.UI.Input

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

@ABIMarker(ICameraEventArgs.ABI::class)
@Signature("{b4063bda-201f-473d-bc69-e9e4ac57c9d0}")
@Guid("b4063bda201f473dbc69e9e4ac57c9d0")
@WinRTInterface("b4063bda201f473dbc69e9e4ac57c9d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraEventArgs.ByReference::class)
public interface ICameraEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraEventArgs> {
    public override fun getValue() = ABI.makeICameraEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICameraEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraEventArgs {
    public val __1887035708_Ptr: Pointer?

    public val _1887035708_VtblPtr: Pointer?
      get() = __1887035708_Ptr?.getPointer(0)
  }

  public class ICameraEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1887035708_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4063bda201f473dbc69e9e4ac57c9d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraEventArgs(ptr: Pointer?): WithDefault = ICameraEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraEventArgs {
      val address = segment.toRawLongValue()
      return makeICameraEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICameraEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1887035708_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraEventArgs): Array<ICameraEventArgs?> = (elements as
        Array<ICameraEventArgs?>).castToImpl<ICameraEventArgs,ICameraEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraEventArgs?> =
        arrayOfNulls<ICameraEventArgs_Impl>(size) as Array<ICameraEventArgs?>
  }
}
