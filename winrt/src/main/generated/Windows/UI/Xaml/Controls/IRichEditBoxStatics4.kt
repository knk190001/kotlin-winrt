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

@ABIMarker(IRichEditBoxStatics4.ABI::class)
@Signature("{f5d54fd7-7796-42a5-a5e5-2cd211ee8176}")
@Guid("f5d54fd7779642a5a5e52cd211ee8176")
@WinRTInterface("f5d54fd7779642a5a5e52cd211ee8176")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxStatics4.ByReference::class)
public interface IRichEditBoxStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClipboardCopyFormatProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxStatics4> {
    public override fun getValue() = ABI.makeIRichEditBoxStatics4(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxStatics4 {
    public val __545562248_Ptr: Pointer?

    public val _545562248_VtblPtr: Pointer?
      get() = __545562248_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClipboardCopyFormatProperty(): DependencyProperty? {
      val fnPtr = _545562248_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562248_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545562248_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5d54fd7779642a5a5e52cd211ee8176")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxStatics4(ptr: Pointer?): WithDefault = IRichEditBoxStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxStatics4 {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxStatics4(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545562248_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxStatics4): Array<IRichEditBoxStatics4?> =
        (elements as
        Array<IRichEditBoxStatics4?>).castToImpl<IRichEditBoxStatics4,IRichEditBoxStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxStatics4?> =
        arrayOfNulls<IRichEditBoxStatics4_Impl>(size) as Array<IRichEditBoxStatics4?>
  }
}
