package Windows.UI.Composition

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

@ABIMarker(ICompositionBackdropBrush.ABI::class)
@Signature("{c5acae58-3898-499e-8d7f-224e91286a5d}")
@Guid("c5acae583898499e8d7f224e91286a5d")
@WinRTInterface("c5acae583898499e8d7f224e91286a5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionBackdropBrush.ByReference::class)
public interface ICompositionBackdropBrush : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionBackdropBrush> {
    public override fun getValue() = ABI.makeICompositionBackdropBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionBackdropBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionBackdropBrush {
    public val __1414655144_Ptr: Pointer?

    public val _1414655144_VtblPtr: Pointer?
      get() = __1414655144_Ptr?.getPointer(0)
  }

  public class ICompositionBackdropBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1414655144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionBackdropBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5acae583898499e8d7f224e91286a5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionBackdropBrush(ptr: Pointer?): WithDefault =
        ICompositionBackdropBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionBackdropBrush {
      val address = segment.toRawLongValue()
      return makeICompositionBackdropBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionBackdropBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1414655144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionBackdropBrush):
        Array<ICompositionBackdropBrush?> = (elements as
        Array<ICompositionBackdropBrush?>).castToImpl<ICompositionBackdropBrush,ICompositionBackdropBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionBackdropBrush?> =
        arrayOfNulls<ICompositionBackdropBrush_Impl>(size) as Array<ICompositionBackdropBrush?>
  }
}
