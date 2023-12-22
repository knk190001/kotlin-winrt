package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IPopupThemeTransitionStatics.ABI::class)
@Signature("{e5a1640e-490d-1505-9f6b-8fafc044dec5}")
@Guid("e5a1640e490d15059f6b8fafc044dec5")
@WinRTInterface("e5a1640e490d15059f6b8fafc044dec5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPopupThemeTransitionStatics.ByReference::class)
public interface IPopupThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FromVerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPopupThemeTransitionStatics> {
    public override fun getValue() = ABI.makeIPopupThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: IPopupThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPopupThemeTransitionStatics {
    public val __2098257939_Ptr: Pointer?

    public val _2098257939_VtblPtr: Pointer?
      get() = __2098257939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _2098257939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098257939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FromVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _2098257939_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2098257939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPopupThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2098257939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPopupThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5a1640e490d15059f6b8fafc044dec5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPopupThemeTransitionStatics(ptr: Pointer?): WithDefault =
        IPopupThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPopupThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeIPopupThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IPopupThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2098257939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPopupThemeTransitionStatics):
        Array<IPopupThemeTransitionStatics?> = (elements as
        Array<IPopupThemeTransitionStatics?>).castToImpl<IPopupThemeTransitionStatics,IPopupThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPopupThemeTransitionStatics?> =
        arrayOfNulls<IPopupThemeTransitionStatics_Impl>(size) as
        Array<IPopupThemeTransitionStatics?>
  }
}
