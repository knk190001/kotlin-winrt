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

@ABIMarker(ISelectionPatternIdentifiers.ABI::class)
@Signature("{4aa66fb0-e3f7-475f-b78d-f8a83bb730c4}")
@Guid("4aa66fb0e3f7475fb78df8a83bb730c4")
@WinRTInterface("4aa66fb0e3f7475fb78df8a83bb730c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISelectionPatternIdentifiers.ByReference::class)
public interface ISelectionPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISelectionPatternIdentifiers> {
    public override fun getValue() = ABI.makeISelectionPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ISelectionPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISelectionPatternIdentifiers {
    public val __1603358357_Ptr: Pointer?

    public val _1603358357_VtblPtr: Pointer?
      get() = __1603358357_Ptr?.getPointer(0)
  }

  public class ISelectionPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1603358357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISelectionPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4aa66fb0e3f7475fb78df8a83bb730c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISelectionPatternIdentifiers(ptr: Pointer?): WithDefault =
        ISelectionPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISelectionPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeISelectionPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ISelectionPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1603358357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISelectionPatternIdentifiers):
        Array<ISelectionPatternIdentifiers?> = (elements as
        Array<ISelectionPatternIdentifiers?>).castToImpl<ISelectionPatternIdentifiers,ISelectionPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISelectionPatternIdentifiers?> =
        arrayOfNulls<ISelectionPatternIdentifiers_Impl>(size) as
        Array<ISelectionPatternIdentifiers?>
  }
}
