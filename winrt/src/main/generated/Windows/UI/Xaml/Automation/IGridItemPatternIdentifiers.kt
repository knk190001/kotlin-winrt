package Windows.UI.Xaml.Automation

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

@ABIMarker(IGridItemPatternIdentifiers.ABI::class)
@Signature("{757744f1-3285-4fb1-803b-2545bd431599}")
@Guid("757744f132854fb1803b2545bd431599")
@WinRTInterface("757744f132854fb1803b2545bd431599")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridItemPatternIdentifiers.ByReference::class)
public interface IGridItemPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridItemPatternIdentifiers> {
    public override fun getValue() = ABI.makeIGridItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IGridItemPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridItemPatternIdentifiers {
    public val __869522030_Ptr: Pointer?

    public val _869522030_VtblPtr: Pointer?
      get() = __869522030_Ptr?.getPointer(0)
  }

  public class IGridItemPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __869522030_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridItemPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("757744f132854fb1803b2545bd431599")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridItemPatternIdentifiers(ptr: Pointer?): WithDefault =
        IGridItemPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIGridItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IGridItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869522030_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridItemPatternIdentifiers):
        Array<IGridItemPatternIdentifiers?> = (elements as
        Array<IGridItemPatternIdentifiers?>).castToImpl<IGridItemPatternIdentifiers,IGridItemPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridItemPatternIdentifiers?> =
        arrayOfNulls<IGridItemPatternIdentifiers_Impl>(size) as Array<IGridItemPatternIdentifiers?>
  }
}
