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

@ABIMarker(IRichTextBlockOverflowStatics3.ABI::class)
@Signature("{d1d4a705-eb0b-4ecb-b9b7-e65d03087c8e}")
@Guid("d1d4a705eb0b4ecbb9b7e65d03087c8e")
@WinRTInterface("d1d4a705eb0b4ecbb9b7e65d03087c8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockOverflowStatics3.ByReference::class)
public interface IRichTextBlockOverflowStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextTrimmedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockOverflowStatics3> {
    public override fun getValue() = ABI.makeIRichTextBlockOverflowStatics3(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockOverflowStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockOverflowStatics3 {
    public val __1418885480_Ptr: Pointer?

    public val _1418885480_VtblPtr: Pointer?
      get() = __1418885480_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextTrimmedProperty(): DependencyProperty? {
      val fnPtr = _1418885480_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1418885480_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichTextBlockOverflowStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1418885480_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockOverflowStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1d4a705eb0b4ecbb9b7e65d03087c8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockOverflowStatics3(ptr: Pointer?): WithDefault =
        IRichTextBlockOverflowStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockOverflowStatics3 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockOverflowStatics3(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockOverflowStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1418885480_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockOverflowStatics3):
        Array<IRichTextBlockOverflowStatics3?> = (elements as
        Array<IRichTextBlockOverflowStatics3?>).castToImpl<IRichTextBlockOverflowStatics3,IRichTextBlockOverflowStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockOverflowStatics3?> =
        arrayOfNulls<IRichTextBlockOverflowStatics3_Impl>(size) as
        Array<IRichTextBlockOverflowStatics3?>
  }
}
