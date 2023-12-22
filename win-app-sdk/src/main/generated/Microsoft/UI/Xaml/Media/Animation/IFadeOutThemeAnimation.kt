package Microsoft.UI.Xaml.Media.Animation

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFadeOutThemeAnimation.ABI::class)
@Signature("{114024d6-5d67-5c9c-83c5-54a8bd7b671a}")
@Guid("114024d65d675c9c83c554a8bd7b671a")
@WinRTInterface("114024d65d675c9c83c554a8bd7b671a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFadeOutThemeAnimation.ByReference::class)
public interface IFadeOutThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFadeOutThemeAnimation> {
    public override fun getValue() = ABI.makeIFadeOutThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IFadeOutThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFadeOutThemeAnimation {
    public val __1683984270_Ptr: Pointer?

    public val _1683984270_VtblPtr: Pointer?
      get() = __1683984270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _1683984270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1683984270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _1683984270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683984270_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFadeOutThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1683984270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFadeOutThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("114024d65d675c9c83c554a8bd7b671a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFadeOutThemeAnimation(ptr: Pointer?): WithDefault =
        IFadeOutThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFadeOutThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIFadeOutThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IFadeOutThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1683984270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFadeOutThemeAnimation): Array<IFadeOutThemeAnimation?> =
        (elements as
        Array<IFadeOutThemeAnimation?>).castToImpl<IFadeOutThemeAnimation,IFadeOutThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFadeOutThemeAnimation?> =
        arrayOfNulls<IFadeOutThemeAnimation_Impl>(size) as Array<IFadeOutThemeAnimation?>
  }
}
