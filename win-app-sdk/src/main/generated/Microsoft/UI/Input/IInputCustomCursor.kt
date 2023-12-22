package Microsoft.UI.Input

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

@ABIMarker(IInputCustomCursor.ABI::class)
@Signature("{5486f042-7e1a-5dc8-8041-e47b609a5ba1}")
@Guid("5486f0427e1a5dc88041e47b609a5ba1")
@WinRTInterface("5486f0427e1a5dc88041e47b609a5ba1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputCustomCursor.ByReference::class)
public interface IInputCustomCursor : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputCustomCursor> {
    public override fun getValue() = ABI.makeIInputCustomCursor(pointer.getPointer(0))

    public fun setValue(value: IInputCustomCursor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputCustomCursor {
    public val __750839480_Ptr: Pointer?

    public val _750839480_VtblPtr: Pointer?
      get() = __750839480_Ptr?.getPointer(0)
  }

  public class IInputCustomCursor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __750839480_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputCustomCursor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5486f0427e1a5dc88041e47b609a5ba1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputCustomCursor(ptr: Pointer?): WithDefault = IInputCustomCursor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputCustomCursor {
      val address = segment.toRawLongValue()
      return makeIInputCustomCursor(Pointer(address))
    }

    public override fun toNative(obj: IInputCustomCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__750839480_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputCustomCursor): Array<IInputCustomCursor?> =
        (elements as
        Array<IInputCustomCursor?>).castToImpl<IInputCustomCursor,IInputCustomCursor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputCustomCursor?> =
        arrayOfNulls<IInputCustomCursor_Impl>(size) as Array<IInputCustomCursor?>
  }
}
