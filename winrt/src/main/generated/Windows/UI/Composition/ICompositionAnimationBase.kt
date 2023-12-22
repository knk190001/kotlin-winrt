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

@ABIMarker(ICompositionAnimationBase.ABI::class)
@Signature("{1c2c2999-e818-48d3-a6dd-d78c82f8ace9}")
@Guid("1c2c2999e81848d3a6ddd78c82f8ace9")
@WinRTInterface("1c2c2999e81848d3a6ddd78c82f8ace9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionAnimationBase.ByReference::class)
public interface ICompositionAnimationBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionAnimationBase> {
    public override fun getValue() = ABI.makeICompositionAnimationBase(pointer.getPointer(0))

    public fun setValue(value: ICompositionAnimationBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionAnimationBase {
    public val __99884185_Ptr: Pointer?

    public val _99884185_VtblPtr: Pointer?
      get() = __99884185_Ptr?.getPointer(0)
  }

  public class ICompositionAnimationBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __99884185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionAnimationBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c2c2999e81848d3a6ddd78c82f8ace9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionAnimationBase(ptr: Pointer?): WithDefault =
        ICompositionAnimationBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionAnimationBase {
      val address = segment.toRawLongValue()
      return makeICompositionAnimationBase(Pointer(address))
    }

    public override fun toNative(obj: ICompositionAnimationBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__99884185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionAnimationBase):
        Array<ICompositionAnimationBase?> = (elements as
        Array<ICompositionAnimationBase?>).castToImpl<ICompositionAnimationBase,ICompositionAnimationBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionAnimationBase?> =
        arrayOfNulls<ICompositionAnimationBase_Impl>(size) as Array<ICompositionAnimationBase?>
  }
}
