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

@ABIMarker(IRichTextBlock3.ABI::class)
@Signature("{7d39ae83-8918-4613-b007-7c898ba2950e}")
@Guid("7d39ae8389184613b0077c898ba2950e")
@WinRTInterface("7d39ae8389184613b0077c898ba2950e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlock3.ByReference::class)
public interface IRichTextBlock3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlock3> {
    public override fun getValue() = ABI.makeIRichTextBlock3(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlock3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlock3 {
    public val __1376290283_Ptr: Pointer?

    public val _1376290283_VtblPtr: Pointer?
      get() = __1376290283_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _1376290283_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1376290283_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _1376290283_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290283_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlock3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376290283_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlock3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d39ae8389184613b0077c898ba2950e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlock3(ptr: Pointer?): WithDefault = IRichTextBlock3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlock3 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlock3(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlock3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376290283_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlock3): Array<IRichTextBlock3?> = (elements as
        Array<IRichTextBlock3?>).castToImpl<IRichTextBlock3,IRichTextBlock3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlock3?> =
        arrayOfNulls<IRichTextBlock3_Impl>(size) as Array<IRichTextBlock3?>
  }
}
