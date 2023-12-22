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

@ABIMarker(IContentThemeTransitionStatics.ABI::class)
@Signature("{95cda8b1-6667-56e3-be40-866eef53663c}")
@Guid("95cda8b1666756e3be40866eef53663c")
@WinRTInterface("95cda8b1666756e3be40866eef53663c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentThemeTransitionStatics.ByReference::class)
public interface IContentThemeTransitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_VerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentThemeTransitionStatics> {
    public override fun getValue() = ABI.makeIContentThemeTransitionStatics(pointer.getPointer(0))

    public fun setValue(value: IContentThemeTransitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentThemeTransitionStatics {
    public val __1323953573_Ptr: Pointer?

    public val _1323953573_VtblPtr: Pointer?
      get() = __1323953573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1323953573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1323953573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1323953573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1323953573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IContentThemeTransitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1323953573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentThemeTransitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95cda8b1666756e3be40866eef53663c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentThemeTransitionStatics(ptr: Pointer?): WithDefault =
        IContentThemeTransitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentThemeTransitionStatics {
      val address = segment.toRawLongValue()
      return makeIContentThemeTransitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentThemeTransitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1323953573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentThemeTransitionStatics):
        Array<IContentThemeTransitionStatics?> = (elements as
        Array<IContentThemeTransitionStatics?>).castToImpl<IContentThemeTransitionStatics,IContentThemeTransitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentThemeTransitionStatics?> =
        arrayOfNulls<IContentThemeTransitionStatics_Impl>(size) as
        Array<IContentThemeTransitionStatics?>
  }
}
