package Microsoft.UI.Xaml.Controls

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICanvasStatics.ABI::class)
@Signature("{c00d5e0f-77e3-5c59-8fcd-86761f0c6607}")
@Guid("c00d5e0f77e35c598fcd86761f0c6607")
@WinRTInterface("c00d5e0f77e35c598fcd86761f0c6607")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICanvasStatics.ByReference::class)
public interface ICanvasStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LeftProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetLeft(element: UIElement?): Double

  @InterfaceMethod(2)
  public fun SetLeft(element: UIElement?, length: Double): Unit

  @InterfaceMethod(3)
  public fun get_TopProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetTop(element: UIElement?): Double

  @InterfaceMethod(5)
  public fun SetTop(element: UIElement?, length: Double): Unit

  @InterfaceMethod(6)
  public fun get_ZIndexProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun GetZIndex(element: UIElement?): Int

  @InterfaceMethod(8)
  public fun SetZIndex(element: UIElement?, value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICanvasStatics>
      {
    public override fun getValue() = ABI.makeICanvasStatics(pointer.getPointer(0))

    public fun setValue(value: ICanvasStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICanvasStatics {
    public val __414647066_Ptr: Pointer?

    public val _414647066_VtblPtr: Pointer?
      get() = __414647066_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LeftProperty(): DependencyProperty? {
      val fnPtr = _414647066_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetLeft(element: UIElement?): Double {
      val fnPtr = _414647066_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun SetLeft(element: UIElement?, length: Double): Unit {
      val fnPtr = _414647066_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr, marshalToNative(element), length,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TopProperty(): DependencyProperty? {
      val fnPtr = _414647066_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetTop(element: UIElement?): Double {
      val fnPtr = _414647066_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun SetTop(element: UIElement?, length: Double): Unit {
      val fnPtr = _414647066_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr, marshalToNative(element), length,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ZIndexProperty(): DependencyProperty? {
      val fnPtr = _414647066_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetZIndex(element: UIElement?): Int {
      val fnPtr = _414647066_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun SetZIndex(element: UIElement?, value: Int): Unit {
      val fnPtr = _414647066_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__414647066_Ptr, marshalToNative(element), value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICanvasStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __414647066_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICanvasStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c00d5e0f77e35c598fcd86761f0c6607")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICanvasStatics(ptr: Pointer?): WithDefault = ICanvasStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICanvasStatics {
      val address = segment.toRawLongValue()
      return makeICanvasStatics(Pointer(address))
    }

    public override fun toNative(obj: ICanvasStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__414647066_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICanvasStatics): Array<ICanvasStatics?> = (elements as
        Array<ICanvasStatics?>).castToImpl<ICanvasStatics,ICanvasStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICanvasStatics?> =
        arrayOfNulls<ICanvasStatics_Impl>(size) as Array<ICanvasStatics?>
  }
}
