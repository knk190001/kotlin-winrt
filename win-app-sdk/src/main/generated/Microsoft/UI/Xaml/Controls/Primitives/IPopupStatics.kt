package Microsoft.UI.Xaml.Controls.Primitives

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPopupStatics.ABI::class)
@Signature("{c1acfaa4-209a-5fb8-8934-8825976769b8}")
@Guid("c1acfaa4209a5fb889348825976769b8")
@WinRTInterface("c1acfaa4209a5fb889348825976769b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupStatics.ByReference::class)
public interface IPopupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChildProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_HorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_VerticalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ChildTransitionsProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_IsLightDismissEnabledProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_LightDismissOverlayModeProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPopupStatics>
      {
    public override fun getValue() = ABI.makeIPopupStatics(pointer.getPointer(0))

    public fun setValue(value: IPopupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupStatics {
    public val __916157366_Ptr: Pointer?

    public val _916157366_VtblPtr: Pointer?
      get() = __916157366_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChildProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_VerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ChildTransitionsProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_IsLightDismissEnabledProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_LightDismissOverlayModeProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty? {
      val fnPtr = _916157366_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__916157366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __916157366_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1acfaa4209a5fb889348825976769b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupStatics(ptr: Pointer?): WithDefault = IPopupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupStatics {
      val address = segment.toRawLongValue()
      return makeIPopupStatics(Pointer(address))
    }

    public override fun toNative(obj: IPopupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__916157366_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupStatics): Array<IPopupStatics?> = (elements as
        Array<IPopupStatics?>).castToImpl<IPopupStatics,IPopupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupStatics?> =
        arrayOfNulls<IPopupStatics_Impl>(size) as Array<IPopupStatics?>
  }
}
