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

@ABIMarker(IFadeOutThemeAnimationStatics.ABI::class)
@Signature("{0277bea1-a0a5-5e26-9b56-6a4208862738}")
@Guid("0277bea1a0a55e269b566a4208862738")
@WinRTInterface("0277bea1a0a55e269b566a4208862738")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFadeOutThemeAnimationStatics.ByReference::class)
public interface IFadeOutThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFadeOutThemeAnimationStatics> {
    public override fun getValue() = ABI.makeIFadeOutThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IFadeOutThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFadeOutThemeAnimationStatics {
    public val __932437261_Ptr: Pointer?

    public val _932437261_VtblPtr: Pointer?
      get() = __932437261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _932437261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__932437261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IFadeOutThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932437261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFadeOutThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0277bea1a0a55e269b566a4208862738")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFadeOutThemeAnimationStatics(ptr: Pointer?): WithDefault =
        IFadeOutThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFadeOutThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIFadeOutThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IFadeOutThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932437261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFadeOutThemeAnimationStatics):
        Array<IFadeOutThemeAnimationStatics?> = (elements as
        Array<IFadeOutThemeAnimationStatics?>).castToImpl<IFadeOutThemeAnimationStatics,IFadeOutThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFadeOutThemeAnimationStatics?> =
        arrayOfNulls<IFadeOutThemeAnimationStatics_Impl>(size) as
        Array<IFadeOutThemeAnimationStatics?>
  }
}
