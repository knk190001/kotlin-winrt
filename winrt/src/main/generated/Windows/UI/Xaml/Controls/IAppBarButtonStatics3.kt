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

@ABIMarker(IAppBarButtonStatics3.ABI::class)
@Signature("{4d7bf314-2ede-4328-8906-752a1f27cdfa}")
@Guid("4d7bf3142ede43288906752a1f27cdfa")
@WinRTInterface("4d7bf3142ede43288906752a1f27cdfa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButtonStatics3.ByReference::class)
public interface IAppBarButtonStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LabelPositionProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsInOverflowProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_DynamicOverflowOrderProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarButtonStatics3> {
    public override fun getValue() = ABI.makeIAppBarButtonStatics3(pointer.getPointer(0))

    public fun setValue(value: IAppBarButtonStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButtonStatics3 {
    public val __1254539086_Ptr: Pointer?

    public val _1254539086_VtblPtr: Pointer?
      get() = __1254539086_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LabelPositionProperty(): DependencyProperty? {
      val fnPtr = _1254539086_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1254539086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsInOverflowProperty(): DependencyProperty? {
      val fnPtr = _1254539086_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1254539086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DynamicOverflowOrderProperty(): DependencyProperty? {
      val fnPtr = _1254539086_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1254539086_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarButtonStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1254539086_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButtonStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d7bf3142ede43288906752a1f27cdfa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButtonStatics3(ptr: Pointer?): WithDefault =
        IAppBarButtonStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButtonStatics3 {
      val address = segment.toRawLongValue()
      return makeIAppBarButtonStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButtonStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1254539086_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButtonStatics3): Array<IAppBarButtonStatics3?> =
        (elements as
        Array<IAppBarButtonStatics3?>).castToImpl<IAppBarButtonStatics3,IAppBarButtonStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButtonStatics3?> =
        arrayOfNulls<IAppBarButtonStatics3_Impl>(size) as Array<IAppBarButtonStatics3?>
  }
}
