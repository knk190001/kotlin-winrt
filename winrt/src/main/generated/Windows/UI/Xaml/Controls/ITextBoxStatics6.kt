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

@ABIMarker(ITextBoxStatics6.ABI::class)
@Signature("{dc0d97e7-1cb7-433e-aa4f-9c64c98cdee5}")
@Guid("dc0d97e71cb7433eaa4f9c64c98cdee5")
@WinRTInterface("dc0d97e71cb7433eaa4f9c64c98cdee5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxStatics6.ByReference::class)
public interface ITextBoxStatics6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalTextAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_CharacterCasingProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PlaceholderForegroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxStatics6> {
    public override fun getValue() = ABI.makeITextBoxStatics6(pointer.getPointer(0))

    public fun setValue(value: ITextBoxStatics6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxStatics6 {
    public val __107373325_Ptr: Pointer?

    public val _107373325_VtblPtr: Pointer?
      get() = __107373325_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalTextAlignmentProperty(): DependencyProperty? {
      val fnPtr = _107373325_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CharacterCasingProperty(): DependencyProperty? {
      val fnPtr = _107373325_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlaceholderForegroundProperty(): DependencyProperty? {
      val fnPtr = _107373325_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373325_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxStatics6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __107373325_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxStatics6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc0d97e71cb7433eaa4f9c64c98cdee5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxStatics6(ptr: Pointer?): WithDefault = ITextBoxStatics6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxStatics6 {
      val address = segment.toRawLongValue()
      return makeITextBoxStatics6(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxStatics6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__107373325_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxStatics6): Array<ITextBoxStatics6?> = (elements as
        Array<ITextBoxStatics6?>).castToImpl<ITextBoxStatics6,ITextBoxStatics6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxStatics6?> =
        arrayOfNulls<ITextBoxStatics6_Impl>(size) as Array<ITextBoxStatics6?>
  }
}
