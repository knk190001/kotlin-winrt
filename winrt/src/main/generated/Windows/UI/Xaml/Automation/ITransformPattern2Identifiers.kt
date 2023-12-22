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

@ABIMarker(ITransformPattern2Identifiers.ABI::class)
@Signature("{08aaa03d-dea7-402f-8097-9a2783d60e5d}")
@Guid("08aaa03ddea7402f80979a2783d60e5d")
@WinRTInterface("08aaa03ddea7402f80979a2783d60e5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformPattern2Identifiers.ByReference::class)
public interface ITransformPattern2Identifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformPattern2Identifiers> {
    public override fun getValue() = ABI.makeITransformPattern2Identifiers(pointer.getPointer(0))

    public fun setValue(value: ITransformPattern2Identifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformPattern2Identifiers {
    public val __992856823_Ptr: Pointer?

    public val _992856823_VtblPtr: Pointer?
      get() = __992856823_Ptr?.getPointer(0)
  }

  public class ITransformPattern2Identifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __992856823_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformPattern2Identifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08aaa03ddea7402f80979a2783d60e5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformPattern2Identifiers(ptr: Pointer?): WithDefault =
        ITransformPattern2Identifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformPattern2Identifiers {
      val address = segment.toRawLongValue()
      return makeITransformPattern2Identifiers(Pointer(address))
    }

    public override fun toNative(obj: ITransformPattern2Identifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__992856823_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformPattern2Identifiers):
        Array<ITransformPattern2Identifiers?> = (elements as
        Array<ITransformPattern2Identifiers?>).castToImpl<ITransformPattern2Identifiers,ITransformPattern2Identifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformPattern2Identifiers?> =
        arrayOfNulls<ITransformPattern2Identifiers_Impl>(size) as
        Array<ITransformPattern2Identifiers?>
  }
}
