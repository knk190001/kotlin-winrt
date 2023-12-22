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

@ABIMarker(IFadeInThemeAnimationStatics.ABI::class)
@Signature("{5d74a6a6-92c6-5e49-865f-676087247179}")
@Guid("5d74a6a692c65e49865f676087247179")
@WinRTInterface("5d74a6a692c65e49865f676087247179")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFadeInThemeAnimationStatics.ByReference::class)
public interface IFadeInThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFadeInThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIFadeInThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IFadeInThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFadeInThemeAnimationStatics {
    public val __616823186_Ptr: Pointer?

    public val _616823186_VtblPtr: Pointer?
      get() = __616823186_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _616823186_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__616823186_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFadeInThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __616823186_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFadeInThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d74a6a692c65e49865f676087247179")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFadeInThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IFadeInThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFadeInThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIFadeInThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IFadeInThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__616823186_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFadeInThemeAnimationStatics):
        Array<IFadeInThemeAnimationStatics?> = (elements as
        Array<IFadeInThemeAnimationStatics?>).castToImpl<IFadeInThemeAnimationStatics,IFadeInThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFadeInThemeAnimationStatics?> =
        arrayOfNulls<IFadeInThemeAnimationStatics_Impl>(size) as
        Array<IFadeInThemeAnimationStatics?>
  }
}
