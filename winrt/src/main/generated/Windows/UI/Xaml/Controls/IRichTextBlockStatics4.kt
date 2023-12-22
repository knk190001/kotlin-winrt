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

@ABIMarker(IRichTextBlockStatics4.ABI::class)
@Signature("{80155bc4-6d96-4b08-ad57-13db0f046412}")
@Guid("80155bc46d964b08ad5713db0f046412")
@WinRTInterface("80155bc46d964b08ad5713db0f046412")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlockStatics4.ByReference::class)
public interface IRichTextBlockStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextDecorationsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlockStatics4> {
    public override fun getValue() = ABI.makeIRichTextBlockStatics4(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlockStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlockStatics4 {
    public val __846301065_Ptr: Pointer?

    public val _846301065_VtblPtr: Pointer?
      get() = __846301065_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextDecorationsProperty(): DependencyProperty? {
      val fnPtr = _846301065_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__846301065_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichTextBlockStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __846301065_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlockStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80155bc46d964b08ad5713db0f046412")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlockStatics4(ptr: Pointer?): WithDefault =
        IRichTextBlockStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlockStatics4 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlockStatics4(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlockStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__846301065_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlockStatics4): Array<IRichTextBlockStatics4?> =
        (elements as
        Array<IRichTextBlockStatics4?>).castToImpl<IRichTextBlockStatics4,IRichTextBlockStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlockStatics4?> =
        arrayOfNulls<IRichTextBlockStatics4_Impl>(size) as Array<IRichTextBlockStatics4?>
  }
}
