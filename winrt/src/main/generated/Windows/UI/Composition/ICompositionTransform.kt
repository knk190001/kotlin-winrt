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

@ABIMarker(ICompositionTransform.ABI::class)
@Signature("{7cd54529-fbed-4112-abc5-185906dd927c}")
@Guid("7cd54529fbed4112abc5185906dd927c")
@WinRTInterface("7cd54529fbed4112abc5185906dd927c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTransform.ByReference::class)
public interface ICompositionTransform : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTransform> {
    public override fun getValue() = ABI.makeICompositionTransform(pointer.getPointer(0))

    public fun setValue(value: ICompositionTransform_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTransform {
    public val __1786051184_Ptr: Pointer?

    public val _1786051184_VtblPtr: Pointer?
      get() = __1786051184_Ptr?.getPointer(0)
  }

  public class ICompositionTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1786051184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7cd54529fbed4112abc5185906dd927c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTransform(ptr: Pointer?): WithDefault =
        ICompositionTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTransform {
      val address = segment.toRawLongValue()
      return makeICompositionTransform(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1786051184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTransform): Array<ICompositionTransform?> =
        (elements as
        Array<ICompositionTransform?>).castToImpl<ICompositionTransform,ICompositionTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTransform?> =
        arrayOfNulls<ICompositionTransform_Impl>(size) as Array<ICompositionTransform?>
  }
}
