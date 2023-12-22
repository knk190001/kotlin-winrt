package Windows.UI.Xaml.Media

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

@ABIMarker(IRevealBackgroundBrush.ABI::class)
@Signature("{261dcc0e-1991-4cdf-aee0-6350a3f90bb9}")
@Guid("261dcc0e19914cdfaee06350a3f90bb9")
@WinRTInterface("261dcc0e19914cdfaee06350a3f90bb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealBackgroundBrush.ByReference::class)
public interface IRevealBackgroundBrush : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealBackgroundBrush> {
    public override fun getValue() = ABI.makeIRevealBackgroundBrush(pointer.getPointer(0))

    public fun setValue(value: IRevealBackgroundBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealBackgroundBrush {
    public val __1859534499_Ptr: Pointer?

    public val _1859534499_VtblPtr: Pointer?
      get() = __1859534499_Ptr?.getPointer(0)
  }

  public class IRevealBackgroundBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1859534499_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealBackgroundBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("261dcc0e19914cdfaee06350a3f90bb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealBackgroundBrush(ptr: Pointer?): WithDefault =
        IRevealBackgroundBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealBackgroundBrush {
      val address = segment.toRawLongValue()
      return makeIRevealBackgroundBrush(Pointer(address))
    }

    public override fun toNative(obj: IRevealBackgroundBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1859534499_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealBackgroundBrush): Array<IRevealBackgroundBrush?> =
        (elements as
        Array<IRevealBackgroundBrush?>).castToImpl<IRevealBackgroundBrush,IRevealBackgroundBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealBackgroundBrush?> =
        arrayOfNulls<IRevealBackgroundBrush_Impl>(size) as Array<IRevealBackgroundBrush?>
  }
}
