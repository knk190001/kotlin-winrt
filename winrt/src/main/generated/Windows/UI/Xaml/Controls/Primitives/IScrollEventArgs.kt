package Windows.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollEventArgs.ABI::class)
@Signature("{c57e5168-3afe-448d-b752-2f364c75d743}")
@Guid("c57e51683afe448db7522f364c75d743")
@WinRTInterface("c57e51683afe448db7522f364c75d743")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollEventArgs.ByReference::class)
public interface IScrollEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewValue(): Double

  @InterfaceMethod(1)
  public fun get_ScrollEventType(): ScrollEventType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollEventArgs> {
    public override fun getValue() = ABI.makeIScrollEventArgs(pointer.getPointer(0))

    public fun setValue(value: IScrollEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollEventArgs {
    public val __1740829714_Ptr: Pointer?

    public val _1740829714_VtblPtr: Pointer?
      get() = __1740829714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewValue(): Double {
      val fnPtr = _1740829714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1740829714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ScrollEventType(): ScrollEventType? {
      val fnPtr = _1740829714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollEventType>()
      val hr = fn.invokeHR(arrayOf(__1740829714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollEventType>(result.getValue())
      return resultValue
    }
  }

  public class IScrollEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1740829714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c57e51683afe448db7522f364c75d743")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollEventArgs(ptr: Pointer?): WithDefault = IScrollEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollEventArgs {
      val address = segment.toRawLongValue()
      return makeIScrollEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IScrollEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1740829714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollEventArgs): Array<IScrollEventArgs?> = (elements as
        Array<IScrollEventArgs?>).castToImpl<IScrollEventArgs,IScrollEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollEventArgs?> =
        arrayOfNulls<IScrollEventArgs_Impl>(size) as Array<IScrollEventArgs?>
  }
}
