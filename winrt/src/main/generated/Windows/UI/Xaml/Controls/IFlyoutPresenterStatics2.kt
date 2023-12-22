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

@ABIMarker(IFlyoutPresenterStatics2.ABI::class)
@Signature("{1492ae4b-2727-5e8e-9105-6d7a2b1185b2}")
@Guid("1492ae4b27275e8e91056d7a2b1185b2")
@WinRTInterface("1492ae4b27275e8e91056d7a2b1185b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenterStatics2.ByReference::class)
public interface IFlyoutPresenterStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsDefaultShadowEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenterStatics2> {
    public override fun getValue() = ABI.makeIFlyoutPresenterStatics2(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenterStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenterStatics2 {
    public val __794138754_Ptr: Pointer?

    public val _794138754_VtblPtr: Pointer?
      get() = __794138754_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsDefaultShadowEnabledProperty(): DependencyProperty? {
      val fnPtr = _794138754_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__794138754_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFlyoutPresenterStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __794138754_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenterStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1492ae4b27275e8e91056d7a2b1185b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenterStatics2(ptr: Pointer?): WithDefault =
        IFlyoutPresenterStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenterStatics2 {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenterStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenterStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__794138754_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenterStatics2):
        Array<IFlyoutPresenterStatics2?> = (elements as
        Array<IFlyoutPresenterStatics2?>).castToImpl<IFlyoutPresenterStatics2,IFlyoutPresenterStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenterStatics2?> =
        arrayOfNulls<IFlyoutPresenterStatics2_Impl>(size) as Array<IFlyoutPresenterStatics2?>
  }
}
