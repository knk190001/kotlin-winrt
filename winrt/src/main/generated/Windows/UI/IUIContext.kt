package Windows.UI

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

@ABIMarker(IUIContext.ABI::class)
@Signature("{bb5cfacd-5bd8-59d0-a59e-1c17a4d6d243}")
@Guid("bb5cfacd5bd859d0a59e1c17a4d6d243")
@WinRTInterface("bb5cfacd5bd859d0a59e1c17a4d6d243")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIContext.ByReference::class)
public interface IUIContext : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIContext> {
    public override fun getValue() = ABI.makeIUIContext(pointer.getPointer(0))

    public fun setValue(value: IUIContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIContext {
    public val __324583825_Ptr: Pointer?

    public val _324583825_VtblPtr: Pointer?
      get() = __324583825_Ptr?.getPointer(0)
  }

  public class IUIContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __324583825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb5cfacd5bd859d0a59e1c17a4d6d243")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIContext(ptr: Pointer?): WithDefault = IUIContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIContext {
      val address = segment.toRawLongValue()
      return makeIUIContext(Pointer(address))
    }

    public override fun toNative(obj: IUIContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__324583825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIContext): Array<IUIContext?> = (elements as
        Array<IUIContext?>).castToImpl<IUIContext,IUIContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIContext?> = arrayOfNulls<IUIContext_Impl>(size)
        as Array<IUIContext?>
  }
}
