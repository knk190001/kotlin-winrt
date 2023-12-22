package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRichTextBlockOverflowStatics2.ABI::class)
@Signature("{b5ebed4c-f8c4-4a3a-907f-e53e78279fa3}")
@Guid("b5ebed4cf8c44a3a907fe53e78279fa3")
@WinRTInterface("b5ebed4cf8c44a3a907fe53e78279fa3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflowStatics2.ByReference::class)
public interface IRichTextBlockOverflowStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxLinesProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflowStatics2> {
    public override fun getValue() = ABI.makeIRichTextBlockOverflowStatics2(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflowStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflowStatics2 {
    public val __1418885481_Ptr: Pointer?

    public val _1418885481_VtblPtr: Pointer?
      get() = __1418885481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxLinesProperty(): DependencyProperty? {
      val fnPtr = _1418885481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1418885481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichTextBlockOverflowStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418885481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflowStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b5ebed4cf8c44a3a907fe53e78279fa3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflowStatics2(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflowStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflowStatics2 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflowStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflowStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418885481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflowStatics2):
        Array<IRichTextBlockOverflowStatics2?> = (elements as
        Array<IRichTextBlockOverflowStatics2?>).castToImpl<IRichTextBlockOverflowStatics2,IRichTextBlockOverflowStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflowStatics2?> =
        arrayOfNulls<IRichTextBlockOverflowStatics2_Impl>(size) as
        Array<IRichTextBlockOverflowStatics2?>
  }
}
