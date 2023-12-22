package Microsoft.UI.Composition

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
@Signature("{670e1826-1932-51d0-bbb3-063b4ca94b56}")
@Guid("670e1826193251d0bbb3063b4ca94b56")
@WinRTInterface("670e1826193251d0bbb3063b4ca94b56")
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
    public val __1359577723_Ptr: Pointer?

    public val _1359577723_VtblPtr: Pointer?
      get() = __1359577723_Ptr?.getPointer(0)
  }

  public class ICompositionTransform_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1359577723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTransform, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("670e1826193251d0bbb3063b4ca94b56")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTransform(ptr: Pointer?): WithDefault =
        ICompositionTransform_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTransform {
      val address = segment.toRawLongValue()
      return makeICompositionTransform(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1359577723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTransform): Array<ICompositionTransform?> =
        (elements as
        Array<ICompositionTransform?>).castToImpl<ICompositionTransform,ICompositionTransform_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTransform?> =
        arrayOfNulls<ICompositionTransform_Impl>(size) as Array<ICompositionTransform?>
  }
}
