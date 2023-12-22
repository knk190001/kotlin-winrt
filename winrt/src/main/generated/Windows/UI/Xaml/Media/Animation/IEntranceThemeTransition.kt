package Windows.UI.Xaml.Media.Animation

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEntranceThemeTransition.ABI::class)
@Signature("{07698c09-a8e3-419a-a01d-7410a0ae8ec8}")
@Guid("07698c09a8e3419aa01d7410a0ae8ec8")
@WinRTInterface("07698c09a8e3419aa01d7410a0ae8ec8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEntranceThemeTransition.ByReference::class)
public interface IEntranceThemeTransition : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromHorizontalOffset(): Double

  @InterfaceMethod(1)
  public fun put_FromHorizontalOffset(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_FromVerticalOffset(): Double

  @InterfaceMethod(3)
  public fun put_FromVerticalOffset(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_IsStaggeringEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsStaggeringEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEntranceThemeTransition> {
    public override fun getValue() = ABI.makeIEntranceThemeTransition(pointer.getPointer(0))

    public fun setValue(value: IEntranceThemeTransition_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEntranceThemeTransition {
    public val __1164552798_Ptr: Pointer?

    public val _1164552798_VtblPtr: Pointer?
      get() = __1164552798_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromHorizontalOffset(): Double {
      val fnPtr = _1164552798_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1164552798_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FromHorizontalOffset(value: Double): Unit {
      val fnPtr = _1164552798_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1164552798_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_FromVerticalOffset(): Double {
      val fnPtr = _1164552798_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1164552798_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_FromVerticalOffset(value: Double): Unit {
      val fnPtr = _1164552798_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1164552798_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsStaggeringEnabled(): Boolean {
      val fnPtr = _1164552798_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1164552798_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsStaggeringEnabled(value: Boolean): Unit {
      val fnPtr = _1164552798_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1164552798_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEntranceThemeTransition_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1164552798_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEntranceThemeTransition, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07698c09a8e3419aa01d7410a0ae8ec8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEntranceThemeTransition(ptr: Pointer?): WithDefault =
        IEntranceThemeTransition_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEntranceThemeTransition {
      val address = segment.toRawLongValue()
      return makeIEntranceThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: IEntranceThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1164552798_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEntranceThemeTransition):
        Array<IEntranceThemeTransition?> = (elements as
        Array<IEntranceThemeTransition?>).castToImpl<IEntranceThemeTransition,IEntranceThemeTransition_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEntranceThemeTransition?> =
        arrayOfNulls<IEntranceThemeTransition_Impl>(size) as Array<IEntranceThemeTransition?>
  }
}
