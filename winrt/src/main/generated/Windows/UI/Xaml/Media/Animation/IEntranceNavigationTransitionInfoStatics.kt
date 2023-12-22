package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyProperty
import Windows.UI.Xaml.UIElement
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

@ABIMarker(IEntranceNavigationTransitionInfoStatics.ABI::class)
@Signature("{f948c27a-40c9-469f-8f33-bf45c8811f21}")
@Guid("f948c27a40c9469f8f33bf45c8811f21")
@WinRTInterface("f948c27a40c9469f8f33bf45c8811f21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEntranceNavigationTransitionInfoStatics.ByReference::class)
public interface IEntranceNavigationTransitionInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTargetElementProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetIsTargetElement(element: UIElement?): Boolean

  @InterfaceMethod(2)
  public fun SetIsTargetElement(element: UIElement?, value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEntranceNavigationTransitionInfoStatics> {
    public override fun getValue() =
        ABI.makeIEntranceNavigationTransitionInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IEntranceNavigationTransitionInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEntranceNavigationTransitionInfoStatics {
    public val __1981744786_Ptr: Pointer?

    public val _1981744786_VtblPtr: Pointer?
      get() = __1981744786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTargetElementProperty(): DependencyProperty? {
      val fnPtr = _1981744786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1981744786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIsTargetElement(element: UIElement?): Boolean {
      val fnPtr = _1981744786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1981744786_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetIsTargetElement(element: UIElement?, value: Boolean): Unit {
      val fnPtr = _1981744786_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1981744786_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEntranceNavigationTransitionInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1981744786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEntranceNavigationTransitionInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f948c27a40c9469f8f33bf45c8811f21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEntranceNavigationTransitionInfoStatics(ptr: Pointer?): WithDefault =
        IEntranceNavigationTransitionInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IEntranceNavigationTransitionInfoStatics {
      val address = segment.toRawLongValue()
      return makeIEntranceNavigationTransitionInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IEntranceNavigationTransitionInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1981744786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEntranceNavigationTransitionInfoStatics):
        Array<IEntranceNavigationTransitionInfoStatics?> = (elements as
        Array<IEntranceNavigationTransitionInfoStatics?>).castToImpl<IEntranceNavigationTransitionInfoStatics,IEntranceNavigationTransitionInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEntranceNavigationTransitionInfoStatics?> =
        arrayOfNulls<IEntranceNavigationTransitionInfoStatics_Impl>(size) as
        Array<IEntranceNavigationTransitionInfoStatics?>
  }
}
