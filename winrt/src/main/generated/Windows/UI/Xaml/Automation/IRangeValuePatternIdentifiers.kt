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

@ABIMarker(IRangeValuePatternIdentifiers.ABI::class)
@Signature("{f8760f45-33c9-467d-bc9e-d1515263ace1}")
@Guid("f8760f4533c9467dbc9ed1515263ace1")
@WinRTInterface("f8760f4533c9467dbc9ed1515263ace1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRangeValuePatternIdentifiers.ByReference::class)
public interface IRangeValuePatternIdentifiers : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRangeValuePatternIdentifiers> {
    public override fun getValue() = ABI.makeIRangeValuePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: IRangeValuePatternIdentifiers_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRangeValuePatternIdentifiers {
    public val __1489991081_Ptr: Pointer?

    public val _1489991081_VtblPtr: Pointer?
      get() = __1489991081_Ptr?.getPointer(0)
  }

  public class IRangeValuePatternIdentifiers_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1489991081_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRangeValuePatternIdentifiers, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8760f4533c9467dbc9ed1515263ace1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRangeValuePatternIdentifiers(ptr: Pointer?): WithDefault =
        IRangeValuePatternIdentifiers_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRangeValuePatternIdentifiers {
      val address = segment.toRawLongValue()
      return makeIRangeValuePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: IRangeValuePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1489991081_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRangeValuePatternIdentifiers):
        Array<IRangeValuePatternIdentifiers?> = (elements as
        Array<IRangeValuePatternIdentifiers?>).castToImpl<IRangeValuePatternIdentifiers,IRangeValuePatternIdentifiers_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRangeValuePatternIdentifiers?> =
        arrayOfNulls<IRangeValuePatternIdentifiers_Impl>(size) as
        Array<IRangeValuePatternIdentifiers?>
  }
}
