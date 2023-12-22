package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITeachingTipStatics.ABI::class)
@Signature("{7c3ecddb-0b4d-51c2-a27f-89180afd45a8}")
@Guid("7c3ecddb0b4d51c2a27f89180afd45a8")
@WinRTInterface("7c3ecddb0b4d51c2a27f89180afd45a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITeachingTipStatics.ByReference::class)
public interface ITeachingTipStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TargetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TailVisibilityProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_TitleProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SubtitleProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ActionButtonContentProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ActionButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ActionButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_ActionButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_CloseButtonContentProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_CloseButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_CloseButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_CloseButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_PlacementMarginProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_IsLightDismissEnabledProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_PreferredPlacementProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_HeroContentPlacementProperty(): DependencyProperty?

  @InterfaceMethod(18)
  public fun get_HeroContentProperty(): DependencyProperty?

  @InterfaceMethod(19)
  public fun get_IconSourceProperty(): DependencyProperty?

  @InterfaceMethod(20)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITeachingTipStatics> {
    public override fun getValue() = ABI.makeITeachingTipStatics(pointer.getPointer(0))

    public fun setValue(value: ITeachingTipStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITeachingTipStatics {
    public val __159525854_Ptr: Pointer?

    public val _159525854_VtblPtr: Pointer?
      get() = __159525854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TargetProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TailVisibilityProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TitleProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SubtitleProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ActionButtonContentProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ActionButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ActionButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ActionButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CloseButtonContentProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_CloseButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CloseButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_CloseButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_PlacementMarginProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ShouldConstrainToRootBoundsProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_IsLightDismissEnabledProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_PreferredPlacementProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_HeroContentPlacementProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_HeroContentProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_IconSourceProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _159525854_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__159525854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITeachingTipStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __159525854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITeachingTipStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c3ecddb0b4d51c2a27f89180afd45a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITeachingTipStatics(ptr: Pointer?): WithDefault = ITeachingTipStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITeachingTipStatics {
      val address = segment.toRawLongValue()
      return makeITeachingTipStatics(Pointer(address))
    }

    public override fun toNative(obj: ITeachingTipStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__159525854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITeachingTipStatics): Array<ITeachingTipStatics?> =
        (elements as
        Array<ITeachingTipStatics?>).castToImpl<ITeachingTipStatics,ITeachingTipStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITeachingTipStatics?> =
        arrayOfNulls<ITeachingTipStatics_Impl>(size) as Array<ITeachingTipStatics?>
  }
}
