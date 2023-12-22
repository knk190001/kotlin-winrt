package Windows.UI.Xaml.Media

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

@ABIMarker(ICompositionTarget.ABI::class)
@Signature("{26cfbff0-713c-4bec-8803-e101f7b14ed3}")
@Guid("26cfbff0713c4bec8803e101f7b14ed3")
@WinRTInterface("26cfbff0713c4bec8803e101f7b14ed3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTarget.ByReference::class)
public interface ICompositionTarget : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTarget> {
    public override fun getValue() = ABI.makeICompositionTarget(pointer.getPointer(0))

    public fun setValue(value: ICompositionTarget_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTarget {
    public val __324314463_Ptr: Pointer?

    public val _324314463_VtblPtr: Pointer?
      get() = __324314463_Ptr?.getPointer(0)
  }

  public class ICompositionTarget_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __324314463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTarget, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26cfbff0713c4bec8803e101f7b14ed3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTarget(ptr: Pointer?): WithDefault = ICompositionTarget_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTarget {
      val address = segment.toRawLongValue()
      return makeICompositionTarget(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTarget): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__324314463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTarget): Array<ICompositionTarget?> =
        (elements as
        Array<ICompositionTarget?>).castToImpl<ICompositionTarget,ICompositionTarget_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTarget?> =
        arrayOfNulls<ICompositionTarget_Impl>(size) as Array<ICompositionTarget?>
  }
}
