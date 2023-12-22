package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBox7.ABI::class)
@Signature("{da4911f9-ffe1-4c6a-ac6d-1b4a174ccf80}")
@Guid("da4911f9ffe14c6aac6d1b4a174ccf80")
@WinRTInterface("da4911f9ffe14c6aac6d1b4a174ccf80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBox7.ByReference::class)
public interface ITextBox7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HandwritingView(): HandwritingView?

  @InterfaceMethod(1)
  public fun put_HandwritingView(value: HandwritingView?): Unit

  @InterfaceMethod(2)
  public fun get_IsHandwritingViewEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsHandwritingViewEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBox7> {
    public override fun getValue() = ABI.makeITextBox7(pointer.getPointer(0))

    public fun setValue(value: ITextBox7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBox7 {
    public val __1492904267_Ptr: Pointer?

    public val _1492904267_VtblPtr: Pointer?
      get() = __1492904267_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HandwritingView(): HandwritingView? {
      val fnPtr = _1492904267_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HandwritingView>()
      val hr = fn.invokeHR(arrayOf(__1492904267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HandwritingView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HandwritingView(value: HandwritingView?): Unit {
      val fnPtr = _1492904267_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904267_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsHandwritingViewEnabled(): Boolean {
      val fnPtr = _1492904267_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1492904267_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsHandwritingViewEnabled(value: Boolean): Unit {
      val fnPtr = _1492904267_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904267_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBox7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492904267_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBox7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da4911f9ffe14c6aac6d1b4a174ccf80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBox7(ptr: Pointer?): WithDefault = ITextBox7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBox7 {
      val address = segment.toRawLongValue()
      return makeITextBox7(Pointer(address))
    }

    public override fun toNative(obj: ITextBox7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492904267_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBox7): Array<ITextBox7?> = (elements as
        Array<ITextBox7?>).castToImpl<ITextBox7,ITextBox7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBox7?> = arrayOfNulls<ITextBox7_Impl>(size)
        as Array<ITextBox7?>
  }
}
