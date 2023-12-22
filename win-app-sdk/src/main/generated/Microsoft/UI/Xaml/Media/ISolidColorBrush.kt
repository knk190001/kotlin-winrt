package Microsoft.UI.Xaml.Media

import Windows.UI.Color
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

@ABIMarker(ISolidColorBrush.ABI::class)
@Signature("{b3865c31-37c8-55c1-8a72-d41c67642e2a}")
@Guid("b3865c3137c855c18a72d41c67642e2a")
@WinRTInterface("b3865c3137c855c18a72d41c67642e2a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISolidColorBrush.ByReference::class)
public interface ISolidColorBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Color(): Color?

  @InterfaceMethod(1)
  public fun put_Color(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISolidColorBrush> {
    public override fun getValue() = ABI.makeISolidColorBrush(pointer.getPointer(0))

    public fun setValue(value: ISolidColorBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISolidColorBrush {
    public val __807831121_Ptr: Pointer?

    public val _807831121_VtblPtr: Pointer?
      get() = __807831121_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Color(): Color? {
      val fnPtr = _807831121_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__807831121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Color(value: Color?): Unit {
      val fnPtr = _807831121_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__807831121_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISolidColorBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __807831121_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISolidColorBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3865c3137c855c18a72d41c67642e2a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISolidColorBrush(ptr: Pointer?): WithDefault = ISolidColorBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISolidColorBrush {
      val address = segment.toRawLongValue()
      return makeISolidColorBrush(Pointer(address))
    }

    public override fun toNative(obj: ISolidColorBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__807831121_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISolidColorBrush): Array<ISolidColorBrush?> = (elements as
        Array<ISolidColorBrush?>).castToImpl<ISolidColorBrush,ISolidColorBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISolidColorBrush?> =
        arrayOfNulls<ISolidColorBrush_Impl>(size) as Array<ISolidColorBrush?>
  }
}
