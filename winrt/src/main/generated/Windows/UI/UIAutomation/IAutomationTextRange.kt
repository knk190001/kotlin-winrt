package Windows.UI.UIAutomation

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

@ABIMarker(IAutomationTextRange.ABI::class)
@Signature("{7e101b65-40d3-5994-85a9-0a0cb9a4ec98}")
@Guid("7e101b6540d3599485a90a0cb9a4ec98")
@WinRTInterface("7e101b6540d3599485a90a0cb9a4ec98")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationTextRange.ByReference::class)
public interface IAutomationTextRange : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationTextRange> {
    public override fun getValue() = ABI.makeIAutomationTextRange(pointer.getPointer(0))

    public fun setValue(value: IAutomationTextRange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationTextRange {
    public val __1852308234_Ptr: Pointer?

    public val _1852308234_VtblPtr: Pointer?
      get() = __1852308234_Ptr?.getPointer(0)
  }

  public class IAutomationTextRange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1852308234_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationTextRange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e101b6540d3599485a90a0cb9a4ec98")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationTextRange(ptr: Pointer?): WithDefault = IAutomationTextRange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationTextRange {
      val address = segment.toRawLongValue()
      return makeIAutomationTextRange(Pointer(address))
    }

    public override fun toNative(obj: IAutomationTextRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1852308234_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationTextRange): Array<IAutomationTextRange?> =
        (elements as
        Array<IAutomationTextRange?>).castToImpl<IAutomationTextRange,IAutomationTextRange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationTextRange?> =
        arrayOfNulls<IAutomationTextRange_Impl>(size) as Array<IAutomationTextRange?>
  }
}
