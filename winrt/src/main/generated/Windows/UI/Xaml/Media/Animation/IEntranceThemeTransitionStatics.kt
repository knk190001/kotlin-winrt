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

@ABIMarker(IEntranceThemeTransitionStatics.ABI::class)
@Signature("{37cc0577-ff98-4aed-b86e-5ec23702f877}")
@Guid("37cc0577ff984aedb86e5ec23702f877")
@WinRTInterface("37cc0577ff984aedb86e5ec23702f877")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEntranceThemeTransitionStatics.ByReference::class)
public interface IEntranceThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FromVerticalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsStaggeringEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEntranceThemeTransitionStatics> {
    public override fun getValue() = ABI.makeIEntranceThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: IEntranceThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEntranceThemeTransitionStatics {
    public val __1020065853_Ptr: Pointer?

    public val _1020065853_VtblPtr: Pointer?
      get() = __1020065853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1020065853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1020065853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FromVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1020065853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1020065853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsStaggeringEnabledProperty(): DependencyProperty? {
      val fnPtr = _1020065853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1020065853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IEntranceThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1020065853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEntranceThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37cc0577ff984aedb86e5ec23702f877")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEntranceThemeTransitionStatics(ptr: Pointer?): WithDefault =
        IEntranceThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEntranceThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeIEntranceThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IEntranceThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1020065853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEntranceThemeTransitionStatics):
        Array<IEntranceThemeTransitionStatics?> = (elements as
        Array<IEntranceThemeTransitionStatics?>).castToImpl<IEntranceThemeTransitionStatics,IEntranceThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEntranceThemeTransitionStatics?> =
        arrayOfNulls<IEntranceThemeTransitionStatics_Impl>(size) as
        Array<IEntranceThemeTransitionStatics?>
  }
}
