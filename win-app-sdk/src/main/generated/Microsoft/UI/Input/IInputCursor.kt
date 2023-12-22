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

@ABIMarker(IInputCursor.ABI::class)
@Signature("{359b15f9-19c2-5714-8432-75176826406b}")
@Guid("359b15f919c25714843275176826406b")
@WinRTInterface("359b15f919c25714843275176826406b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputCursor.ByReference::class)
public interface IInputCursor : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInputCursor> {
    public override fun getValue() = ABI.makeIInputCursor(pointer.getPointer(0))

    public fun setValue(value: IInputCursor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputCursor {
    public val __619935577_Ptr: Pointer?

    public val _619935577_VtblPtr: Pointer?
      get() = __619935577_Ptr?.getPointer(0)
  }

  public class IInputCursor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __619935577_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputCursor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("359b15f919c25714843275176826406b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputCursor(ptr: Pointer?): WithDefault = IInputCursor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputCursor {
      val address = segment.toRawLongValue()
      return makeIInputCursor(Pointer(address))
    }

    public override fun toNative(obj: IInputCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__619935577_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputCursor): Array<IInputCursor?> = (elements as
        Array<IInputCursor?>).castToImpl<IInputCursor,IInputCursor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputCursor?> =
        arrayOfNulls<IInputCursor_Impl>(size) as Array<IInputCursor?>
  }
}
