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

@ABIMarker(ICompositionEasingFunction.ABI::class)
@Signature("{8e1ecd0d-57d8-5bc9-9bcd-e43d0dd733c4}")
@Guid("8e1ecd0d57d85bc99bcde43d0dd733c4")
@WinRTInterface("8e1ecd0d57d85bc99bcde43d0dd733c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEasingFunction.ByReference::class)
public interface ICompositionEasingFunction : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEasingFunction> {
    public override fun getValue() = ABI.makeICompositionEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ICompositionEasingFunction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEasingFunction {
    public val __173689740_Ptr: Pointer?

    public val _173689740_VtblPtr: Pointer?
      get() = __173689740_Ptr?.getPointer(0)
  }

  public class ICompositionEasingFunction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __173689740_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEasingFunction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e1ecd0d57d85bc99bcde43d0dd733c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEasingFunction(ptr: Pointer?): WithDefault =
        ICompositionEasingFunction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionEasingFunction {
      val address = segment.toRawLongValue()
      return makeICompositionEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__173689740_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEasingFunction):
        Array<ICompositionEasingFunction?> = (elements as
        Array<ICompositionEasingFunction?>).castToImpl<ICompositionEasingFunction,ICompositionEasingFunction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEasingFunction?> =
        arrayOfNulls<ICompositionEasingFunction_Impl>(size) as Array<ICompositionEasingFunction?>
  }
}
