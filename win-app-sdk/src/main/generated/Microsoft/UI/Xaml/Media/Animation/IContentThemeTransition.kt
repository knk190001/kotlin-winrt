package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IContentThemeTransition.ABI::class)
@Signature("{dff47071-cc51-556c-a3fe-8bbb4cba6195}")
@Guid("dff47071cc51556ca3fe8bbb4cba6195")
@WinRTInterface("dff47071cc51556ca3fe8bbb4cba6195")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentThemeTransition.ByReference::class)
public interface IContentThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun put_HorizontalOffset(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_VerticalOffset(): Double

  @InterfaceMethod(3)
  public fun put_VerticalOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentThemeTransition> {
    public override fun getValue() = ABI.makeIContentThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IContentThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentThemeTransition {
    public val __1156540928_Ptr: Pointer?

    public val _1156540928_VtblPtr: Pointer?
      get() = __1156540928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOffset(): Double {
      val fnPtr = _1156540928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1156540928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalOffset(value: Double): Unit {
      val fnPtr = _1156540928_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156540928_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VerticalOffset(): Double {
      val fnPtr = _1156540928_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1156540928_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_VerticalOffset(value: Double): Unit {
      val fnPtr = _1156540928_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156540928_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContentThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156540928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dff47071cc51556ca3fe8bbb4cba6195")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentThemeTransition(ptr: Pointer?): WithDefault =
        IContentThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentThemeTransition {
      val address = segment.toRawLongValue()
      return makeIContentThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IContentThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156540928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentThemeTransition): Array<IContentThemeTransition?>
        = (elements as
        Array<IContentThemeTransition?>).castToImpl<IContentThemeTransition,IContentThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentThemeTransition?> =
        arrayOfNulls<IContentThemeTransition_Impl>(size) as Array<IContentThemeTransition?>
  }
}
