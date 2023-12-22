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

@ABIMarker(ICompositionShadow.ABI::class)
@Signature("{329e52e2-4335-49cc-b14a-37782d10f0c4}")
@Guid("329e52e2433549ccb14a37782d10f0c4")
@WinRTInterface("329e52e2433549ccb14a37782d10f0c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionShadow.ByReference::class)
public interface ICompositionShadow : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionShadow> {
    public override fun getValue() = ABI.makeICompositionShadow(pointer.getPointer(0))

    public fun setValue(value: ICompositionShadow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionShadow {
    public val __1270264188_Ptr: Pointer?

    public val _1270264188_VtblPtr: Pointer?
      get() = __1270264188_Ptr?.getPointer(0)
  }

  public class ICompositionShadow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1270264188_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionShadow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("329e52e2433549ccb14a37782d10f0c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionShadow(ptr: Pointer?): WithDefault = ICompositionShadow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionShadow {
      val address = segment.toRawLongValue()
      return makeICompositionShadow(Pointer(address))
    }

    public override fun toNative(obj: ICompositionShadow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1270264188_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionShadow): Array<ICompositionShadow?> =
        (elements as
        Array<ICompositionShadow?>).castToImpl<ICompositionShadow,ICompositionShadow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionShadow?> =
        arrayOfNulls<ICompositionShadow_Impl>(size) as Array<ICompositionShadow?>
  }
}
