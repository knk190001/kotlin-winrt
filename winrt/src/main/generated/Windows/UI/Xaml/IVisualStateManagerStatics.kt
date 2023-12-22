package Windows.UI.Xaml

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.Controls.Control
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVisualStateManagerStatics.ABI::class)
@Signature("{01d0e9e0-d713-414e-a74e-e63ec7ac8c3d}")
@Guid("01d0e9e0d713414ea74ee63ec7ac8c3d")
@WinRTInterface("01d0e9e0d713414ea74ee63ec7ac8c3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualStateManagerStatics.ByReference::class)
public interface IVisualStateManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetVisualStateGroups(obj: FrameworkElement?): IVector<VisualStateGroup?>?

  @InterfaceMethod(1)
  public fun get_CustomVisualStateManagerProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun GetCustomVisualStateManager(obj: FrameworkElement?): VisualStateManager?

  @InterfaceMethod(3)
  public fun SetCustomVisualStateManager(obj: FrameworkElement?, value: VisualStateManager?): Unit

  @InterfaceMethod(4)
  public fun GoToState(
    control: Control?,
    stateName: String?,
    useTransitions: Boolean
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisualStateManagerStatics> {
    public override fun getValue() = ABI.makeIVisualStateManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IVisualStateManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualStateManagerStatics {
    public val __970050775_Ptr: Pointer?

    public val _970050775_VtblPtr: Pointer?
      get() = __970050775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetVisualStateGroups(obj: FrameworkElement?): IVector<VisualStateGroup?>? {
      val fnPtr = _970050775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<VisualStateGroup?>>()
      val hr = fn.invokeHR(arrayOf(__970050775_Ptr, marshalToNative(obj), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<VisualStateGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CustomVisualStateManagerProperty(): DependencyProperty? {
      val fnPtr = _970050775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__970050775_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetCustomVisualStateManager(obj: FrameworkElement?): VisualStateManager? {
      val fnPtr = _970050775_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisualStateManager>()
      val hr = fn.invokeHR(arrayOf(__970050775_Ptr, marshalToNative(obj), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisualStateManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetCustomVisualStateManager(obj: FrameworkElement?,
        value: VisualStateManager?): Unit {
      val fnPtr = _970050775_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__970050775_Ptr, marshalToNative(obj), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GoToState(
      control: Control?,
      stateName: String?,
      useTransitions: Boolean
    ): Boolean {
      val fnPtr = _970050775_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__970050775_Ptr, marshalToNative(control),
          marshalToNative(stateName), useTransitions, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVisualStateManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __970050775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualStateManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01d0e9e0d713414ea74ee63ec7ac8c3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualStateManagerStatics(ptr: Pointer?): WithDefault =
        IVisualStateManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualStateManagerStatics {
      val address = segment.toRawLongValue()
      return makeIVisualStateManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IVisualStateManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__970050775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualStateManagerStatics):
        Array<IVisualStateManagerStatics?> = (elements as
        Array<IVisualStateManagerStatics?>).castToImpl<IVisualStateManagerStatics,IVisualStateManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualStateManagerStatics?> =
        arrayOfNulls<IVisualStateManagerStatics_Impl>(size) as Array<IVisualStateManagerStatics?>
  }
}
