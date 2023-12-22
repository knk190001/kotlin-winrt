package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyProperty
import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(ICommonNavigationTransitionInfoStatics.ABI::class)
@Signature("{20020be1-c1ba-59f5-997a-c04f5e3833b0}")
@Guid("20020be1c1ba59f5997ac04f5e3833b0")
@WinRTInterface("20020be1c1ba59f5997ac04f5e3833b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommonNavigationTransitionInfoStatics.ByReference::class)
public interface ICommonNavigationTransitionInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStaggeringEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsStaggerElementProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun GetIsStaggerElement(element: UIElement?): Boolean

  @InterfaceMethod(3)
  public fun SetIsStaggerElement(element: UIElement?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommonNavigationTransitionInfoStatics> {
    public override fun getValue() =
        ABI.makeICommonNavigationTransitionInfoStatics(pointer.getPointer(0))

    public fun setValue(value: ICommonNavigationTransitionInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommonNavigationTransitionInfoStatics {
    public val __2020858776_Ptr: Pointer?

    public val _2020858776_VtblPtr: Pointer?
      get() = __2020858776_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStaggeringEnabledProperty(): DependencyProperty? {
      val fnPtr = _2020858776_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2020858776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStaggerElementProperty(): DependencyProperty? {
      val fnPtr = _2020858776_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2020858776_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIsStaggerElement(element: UIElement?): Boolean {
      val fnPtr = _2020858776_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2020858776_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun SetIsStaggerElement(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _2020858776_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2020858776_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommonNavigationTransitionInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2020858776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommonNavigationTransitionInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20020be1c1ba59f5997ac04f5e3833b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommonNavigationTransitionInfoStatics(ptr: Pointer?): WithDefault =
        ICommonNavigationTransitionInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommonNavigationTransitionInfoStatics {
      val address = segment.toRawLongValue()
      return makeICommonNavigationTransitionInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: ICommonNavigationTransitionInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2020858776_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommonNavigationTransitionInfoStatics):
        Array<ICommonNavigationTransitionInfoStatics?> = (elements as
        Array<ICommonNavigationTransitionInfoStatics?>).castToImpl<ICommonNavigationTransitionInfoStatics,ICommonNavigationTransitionInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommonNavigationTransitionInfoStatics?> =
        arrayOfNulls<ICommonNavigationTransitionInfoStatics_Impl>(size) as
        Array<ICommonNavigationTransitionInfoStatics?>
  }
}
