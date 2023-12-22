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

@ABIMarker(ICompositionEasingFunctionFactory.ABI::class)
@Signature("{60840774-3da0-4949-8200-7206c00190a0}")
@Guid("608407743da0494982007206c00190a0")
@WinRTInterface("608407743da0494982007206c00190a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionEasingFunctionFactory.ByReference::class)
public interface ICompositionEasingFunctionFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionEasingFunctionFactory> {
    public override fun getValue() =
        ABI.makeICompositionEasingFunctionFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionEasingFunctionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionEasingFunctionFactory {
    public val __109606283_Ptr: Pointer?

    public val _109606283_VtblPtr: Pointer?
      get() = __109606283_Ptr?.getPointer(0)
  }

  public class ICompositionEasingFunctionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __109606283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionEasingFunctionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("608407743da0494982007206c00190a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionEasingFunctionFactory(ptr: Pointer?): WithDefault =
        ICompositionEasingFunctionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionEasingFunctionFactory {
      val address = segment.toRawLongValue()
      return makeICompositionEasingFunctionFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionEasingFunctionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__109606283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionEasingFunctionFactory):
        Array<ICompositionEasingFunctionFactory?> = (elements as
        Array<ICompositionEasingFunctionFactory?>).castToImpl<ICompositionEasingFunctionFactory,ICompositionEasingFunctionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionEasingFunctionFactory?> =
        arrayOfNulls<ICompositionEasingFunctionFactory_Impl>(size) as
        Array<ICompositionEasingFunctionFactory?>
  }
}
