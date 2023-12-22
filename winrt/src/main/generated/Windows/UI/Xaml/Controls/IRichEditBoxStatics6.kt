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

@ABIMarker(IRichEditBoxStatics6.ABI::class)
@Signature("{fe40e287-82ed-4f7e-92ba-66f67bc1ff44}")
@Guid("fe40e28782ed4f7e92ba66f67bc1ff44")
@WinRTInterface("fe40e28782ed4f7e92ba66f67bc1ff44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxStatics6.ByReference::class)
public interface IRichEditBoxStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalTextAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CharacterCasingProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DisabledFormattingAcceleratorsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxStatics6> {
    public override fun getValue() = ABI.makeIRichEditBoxStatics6(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxStatics6 {
    public val __545562246_Ptr: Pointer?

    public val _545562246_VtblPtr: Pointer?
      get() = __545562246_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalTextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _545562246_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CharacterCasingProperty(): DependencyProperty? {
      val fnPtr = _545562246_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DisabledFormattingAcceleratorsProperty(): DependencyProperty? {
      val fnPtr = _545562246_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545562246_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe40e28782ed4f7e92ba66f67bc1ff44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxStatics6(ptr: Pointer?): WithDefault = IRichEditBoxStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxStatics6 {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxStatics6(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545562246_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxStatics6): Array<IRichEditBoxStatics6?> =
        (elements as
        Array<IRichEditBoxStatics6?>).castToImpl<IRichEditBoxStatics6,IRichEditBoxStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxStatics6?> =
        arrayOfNulls<IRichEditBoxStatics6_Impl>(size) as Array<IRichEditBoxStatics6?>
  }
}
