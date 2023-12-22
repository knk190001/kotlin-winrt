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

@ABIMarker(ISelectionItemPatternIdentifiers.ABI::class)
@Signature("{2dafa41a-3ef8-4bb5-a02b-3ee1b2274740}")
@Guid("2dafa41a3ef84bb5a02b3ee1b2274740")
@WinRTInterface("2dafa41a3ef84bb5a02b3ee1b2274740")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionItemPatternIdentifiers.ByReference::class)
public interface ISelectionItemPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionItemPatternIdentifiers> {
    public override fun getValue() = ABI.makeISelectionItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ISelectionItemPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionItemPatternIdentifiers {
    public val __646965598_Ptr: Pointer?

    public val _646965598_VtblPtr: Pointer?
      get() = __646965598_Ptr?.getPointer(0)
  }

  public class ISelectionItemPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __646965598_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionItemPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2dafa41a3ef84bb5a02b3ee1b2274740")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionItemPatternIdentifiers(ptr: Pointer?): WithDefault =
        ISelectionItemPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeISelectionItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ISelectionItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__646965598_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionItemPatternIdentifiers):
        Array<ISelectionItemPatternIdentifiers?> = (elements as
        Array<ISelectionItemPatternIdentifiers?>).castToImpl<ISelectionItemPatternIdentifiers,ISelectionItemPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionItemPatternIdentifiers?> =
        arrayOfNulls<ISelectionItemPatternIdentifiers_Impl>(size) as
        Array<ISelectionItemPatternIdentifiers?>
  }
}
