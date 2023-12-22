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

@ABIMarker(ITransformPatternIdentifiers.ABI::class)
@Signature("{2348187b-c50f-5a0e-bc05-305ac71b3b6b}")
@Guid("2348187bc50f5a0ebc05305ac71b3b6b")
@WinRTInterface("2348187bc50f5a0ebc05305ac71b3b6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformPatternIdentifiers.ByReference::class)
public interface ITransformPatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformPatternIdentifiers> {
    public override fun getValue() = ABI.makeITransformPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ITransformPatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformPatternIdentifiers {
    public val __2108897920_Ptr: Pointer?

    public val _2108897920_VtblPtr: Pointer?
      get() = __2108897920_Ptr?.getPointer(0)
  }

  public class ITransformPatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2108897920_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformPatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2348187bc50f5a0ebc05305ac71b3b6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformPatternIdentifiers(ptr: Pointer?): WithDefault =
        ITransformPatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformPatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeITransformPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ITransformPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2108897920_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformPatternIdentifiers):
        Array<ITransformPatternIdentifiers?> = (elements as
        Array<ITransformPatternIdentifiers?>).castToImpl<ITransformPatternIdentifiers,ITransformPatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformPatternIdentifiers?> =
        arrayOfNulls<ITransformPatternIdentifiers_Impl>(size) as
        Array<ITransformPatternIdentifiers?>
  }
}
