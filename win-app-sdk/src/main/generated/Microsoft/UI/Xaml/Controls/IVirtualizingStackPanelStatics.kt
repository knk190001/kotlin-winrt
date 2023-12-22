package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IVirtualizingStackPanelStatics.ABI::class)
@Signature("{731cc881-a71a-5af9-985e-1ede3d88c274}")
@Guid("731cc881a71a5af9985e1ede3d88c274")
@WinRTInterface("731cc881a71a5af9985e1ede3d88c274")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVirtualizingStackPanelStatics.ByReference::class)
public interface IVirtualizingStackPanelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreScrollSnapPointsRegularProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_VirtualizationModeProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun GetVirtualizationMode(element: DependencyObject?): VirtualizationMode?

  @InterfaceMethod(4)
  public fun SetVirtualizationMode(element: DependencyObject?, value: VirtualizationMode?): Unit

  @InterfaceMethod(5)
  public fun get_IsVirtualizingProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun GetIsVirtualizing(o: DependencyObject?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVirtualizingStackPanelStatics> {
    public override fun getValue() = ABI.makeIVirtualizingStackPanelStatics(pointer.getPointer(0))

    public fun setValue(value: IVirtualizingStackPanelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVirtualizingStackPanelStatics {
    public val __875982620_Ptr: Pointer?

    public val _875982620_VtblPtr: Pointer?
      get() = __875982620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreScrollSnapPointsRegularProperty(): DependencyProperty? {
      val fnPtr = _875982620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _875982620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VirtualizationModeProperty(): DependencyProperty? {
      val fnPtr = _875982620_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetVirtualizationMode(element: DependencyObject?): VirtualizationMode? {
      val fnPtr = _875982620_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualizationMode>()
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualizationMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetVirtualizationMode(element: DependencyObject?,
        value: VirtualizationMode?): Unit {
      val fnPtr = _875982620_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsVirtualizingProperty(): DependencyProperty? {
      val fnPtr = _875982620_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetIsVirtualizing(o: DependencyObject?): Boolean {
      val fnPtr = _875982620_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__875982620_Ptr, marshalToNative(o), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVirtualizingStackPanelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __875982620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVirtualizingStackPanelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("731cc881a71a5af9985e1ede3d88c274")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVirtualizingStackPanelStatics(ptr: Pointer?): WithDefault =
        IVirtualizingStackPanelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVirtualizingStackPanelStatics {
      val address = segment.toRawLongValue()
      return makeIVirtualizingStackPanelStatics(Pointer(address))
    }

    public override fun toNative(obj: IVirtualizingStackPanelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__875982620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVirtualizingStackPanelStatics):
        Array<IVirtualizingStackPanelStatics?> = (elements as
        Array<IVirtualizingStackPanelStatics?>).castToImpl<IVirtualizingStackPanelStatics,IVirtualizingStackPanelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVirtualizingStackPanelStatics?> =
        arrayOfNulls<IVirtualizingStackPanelStatics_Impl>(size) as
        Array<IVirtualizingStackPanelStatics?>
  }
}
