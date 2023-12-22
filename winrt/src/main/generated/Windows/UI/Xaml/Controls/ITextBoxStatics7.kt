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

@ABIMarker(ITextBoxStatics7.ABI::class)
@Signature("{cd6c6f47-147e-46f8-a4e8-749c49847a3e}")
@Guid("cd6c6f47147e46f8a4e8749c49847a3e")
@WinRTInterface("cd6c6f47147e46f8a4e8749c49847a3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxStatics7.ByReference::class)
public interface ITextBoxStatics7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HandwritingViewProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsHandwritingViewEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxStatics7> {
    public override fun getValue() = ABI.makeITextBoxStatics7(pointer.getPointer(0))

    public fun setValue(value: ITextBoxStatics7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxStatics7 {
    public val __107373324_Ptr: Pointer?

    public val _107373324_VtblPtr: Pointer?
      get() = __107373324_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HandwritingViewProperty(): DependencyProperty? {
      val fnPtr = _107373324_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsHandwritingViewEnabledProperty(): DependencyProperty? {
      val fnPtr = _107373324_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373324_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxStatics7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __107373324_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxStatics7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd6c6f47147e46f8a4e8749c49847a3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxStatics7(ptr: Pointer?): WithDefault = ITextBoxStatics7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxStatics7 {
      val address = segment.toRawLongValue()
      return makeITextBoxStatics7(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxStatics7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__107373324_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxStatics7): Array<ITextBoxStatics7?> = (elements as
        Array<ITextBoxStatics7?>).castToImpl<ITextBoxStatics7,ITextBoxStatics7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxStatics7?> =
        arrayOfNulls<ITextBoxStatics7_Impl>(size) as Array<ITextBoxStatics7?>
  }
}
