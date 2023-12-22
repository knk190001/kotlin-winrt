package Microsoft.UI.Xaml.Automation

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
@Signature("{93609087-1114-557d-b17b-f801e41cebbb}")
@Guid("936090871114557db17bf801e41cebbb")
@WinRTInterface("936090871114557db17bf801e41cebbb")
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
    public val __1638437479_Ptr: Pointer?

    public val _1638437479_VtblPtr: Pointer?
      get() = __1638437479_Ptr?.getPointer(0)
  }

  public class IGridItemPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1638437479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridItemPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("936090871114557db17bf801e41cebbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridItemPatternIdentifiers(ptr: Pointer?): WithDefault =
        IGridItemPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIGridItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IGridItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1638437479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridItemPatternIdentifiers):
        Array<IGridItemPatternIdentifiers?> = (elements as
        Array<IGridItemPatternIdentifiers?>).castToImpl<IGridItemPatternIdentifiers,IGridItemPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridItemPatternIdentifiers?> =
        arrayOfNulls<IGridItemPatternIdentifiers_Impl>(size) as Array<IGridItemPatternIdentifiers?>
  }
}
