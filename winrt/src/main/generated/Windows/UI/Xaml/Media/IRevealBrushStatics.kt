package Windows.UI.Xaml.Media

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRevealBrushStatics.ABI::class)
@Signature("{190f2625-7209-4d42-a847-1ac4bbbb3499}")
@Guid("190f262572094d42a8471ac4bbbb3499")
@WinRTInterface("190f262572094d42a8471ac4bbbb3499")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealBrushStatics.ByReference::class)
public interface IRevealBrushStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ColorProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TargetThemeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AlwaysUseFallbackProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_StateProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun SetState(element: UIElement?, value: RevealBrushState?): Unit

  @InterfaceMethod(5)
  public fun GetState(element: UIElement?): RevealBrushState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealBrushStatics> {
    public override fun getValue() = ABI.makeIRevealBrushStatics(pointer.getPointer(0))

    public fun setValue(value: IRevealBrushStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealBrushStatics {
    public val __786086252_Ptr: Pointer?

    public val _786086252_VtblPtr: Pointer?
      get() = __786086252_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ColorProperty(): DependencyProperty? {
      val fnPtr = _786086252_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__786086252_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TargetThemeProperty(): DependencyProperty? {
      val fnPtr = _786086252_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__786086252_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AlwaysUseFallbackProperty(): DependencyProperty? {
      val fnPtr = _786086252_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__786086252_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_StateProperty(): DependencyProperty? {
      val fnPtr = _786086252_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__786086252_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetState(element: UIElement?, value: RevealBrushState?): Unit {
      val fnPtr = _786086252_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__786086252_Ptr, marshalToNative(element),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun GetState(element: UIElement?): RevealBrushState? {
      val fnPtr = _786086252_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevealBrushState>()
      val hr = fn.invokeHR(arrayOf(__786086252_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevealBrushState>(result.getValue())
      return resultValue
    }
  }

  public class IRevealBrushStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __786086252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealBrushStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("190f262572094d42a8471ac4bbbb3499")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealBrushStatics(ptr: Pointer?): WithDefault = IRevealBrushStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealBrushStatics {
      val address = segment.toRawLongValue()
      return makeIRevealBrushStatics(Pointer(address))
    }

    public override fun toNative(obj: IRevealBrushStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__786086252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealBrushStatics): Array<IRevealBrushStatics?> =
        (elements as
        Array<IRevealBrushStatics?>).castToImpl<IRevealBrushStatics,IRevealBrushStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealBrushStatics?> =
        arrayOfNulls<IRevealBrushStatics_Impl>(size) as Array<IRevealBrushStatics?>
  }
}
