package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IRepositionThemeAnimationStatics.ABI::class)
@Signature("{c04118de-aff5-5fa9-aee7-94a621c82618}")
@Guid("c04118deaff55fa9aee794a621c82618")
@WinRTInterface("c04118deaff55fa9aee794a621c82618")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepositionThemeAnimationStatics.ByReference::class)
public interface IRepositionThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FromHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FromVerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepositionThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIRepositionThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IRepositionThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepositionThemeAnimationStatics {
    public val __3553075_Ptr: Pointer?

    public val _3553075_VtblPtr: Pointer?
      get() = __3553075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _3553075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__3553075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FromHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _3553075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__3553075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FromVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _3553075_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__3553075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRepositionThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __3553075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepositionThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c04118deaff55fa9aee794a621c82618")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepositionThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IRepositionThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepositionThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIRepositionThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IRepositionThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__3553075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepositionThemeAnimationStatics):
        Array<IRepositionThemeAnimationStatics?> = (elements as
        Array<IRepositionThemeAnimationStatics?>).castToImpl<IRepositionThemeAnimationStatics,IRepositionThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepositionThemeAnimationStatics?> =
        arrayOfNulls<IRepositionThemeAnimationStatics_Impl>(size) as
        Array<IRepositionThemeAnimationStatics?>
  }
}
