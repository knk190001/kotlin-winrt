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

@ABIMarker(IPopupThemeTransition.ABI::class)
@Signature("{e1fa6b8a-add3-5299-a000-121d6dbacc80}")
@Guid("e1fa6b8aadd35299a000121d6dbacc80")
@WinRTInterface("e1fa6b8aadd35299a000121d6dbacc80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupThemeTransition.ByReference::class)
public interface IPopupThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromHorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun put_FromHorizontalOffset(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_FromVerticalOffset(): Double

  @InterfaceMethod(3)
  public fun put_FromVerticalOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPopupThemeTransition> {
    public override fun getValue() = ABI.makeIPopupThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IPopupThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupThemeTransition {
    public val __1510380589_Ptr: Pointer?

    public val _1510380589_VtblPtr: Pointer?
      get() = __1510380589_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromHorizontalOffset(): Double {
      val fnPtr = _1510380589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1510380589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FromHorizontalOffset(value: Double): Unit {
      val fnPtr = _1510380589_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1510380589_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FromVerticalOffset(): Double {
      val fnPtr = _1510380589_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1510380589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_FromVerticalOffset(value: Double): Unit {
      val fnPtr = _1510380589_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1510380589_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPopupThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1510380589_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1fa6b8aadd35299a000121d6dbacc80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupThemeTransition(ptr: Pointer?): WithDefault =
        IPopupThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupThemeTransition {
      val address = segment.toRawLongValue()
      return makeIPopupThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IPopupThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1510380589_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupThemeTransition): Array<IPopupThemeTransition?> =
        (elements as
        Array<IPopupThemeTransition?>).castToImpl<IPopupThemeTransition,IPopupThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupThemeTransition?> =
        arrayOfNulls<IPopupThemeTransition_Impl>(size) as Array<IPopupThemeTransition?>
  }
}
