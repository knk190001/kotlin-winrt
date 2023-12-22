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

@ABIMarker(IRichEditBoxStatics5.ABI::class)
@Signature("{4b5c4568-43d5-43e6-bbb9-cb4e6250f45a}")
@Guid("4b5c456843d543e6bbb9cb4e6250f45a")
@WinRTInterface("4b5c456843d543e6bbb9cb4e6250f45a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxStatics5.ByReference::class)
public interface IRichEditBoxStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionHighlightColorWhenNotFocusedProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MaxLengthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxStatics5> {
    public override fun getValue() = ABI.makeIRichEditBoxStatics5(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxStatics5 {
    public val __545562247_Ptr: Pointer?

    public val _545562247_VtblPtr: Pointer?
      get() = __545562247_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionHighlightColorWhenNotFocusedProperty(): DependencyProperty? {
      val fnPtr = _545562247_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxLengthProperty(): DependencyProperty? {
      val fnPtr = _545562247_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__545562247_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRichEditBoxStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545562247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b5c456843d543e6bbb9cb4e6250f45a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxStatics5(ptr: Pointer?): WithDefault = IRichEditBoxStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxStatics5 {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxStatics5(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545562247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxStatics5): Array<IRichEditBoxStatics5?> =
        (elements as
        Array<IRichEditBoxStatics5?>).castToImpl<IRichEditBoxStatics5,IRichEditBoxStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxStatics5?> =
        arrayOfNulls<IRichEditBoxStatics5_Impl>(size) as Array<IRichEditBoxStatics5?>
  }
}
