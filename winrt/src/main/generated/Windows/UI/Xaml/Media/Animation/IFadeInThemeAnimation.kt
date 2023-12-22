package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IFadeInThemeAnimation.ABI::class)
@Signature("{6d4bc8f5-a918-4477-8078-554c68812ab8}")
@Guid("6d4bc8f5a91844778078554c68812ab8")
@WinRTInterface("6d4bc8f5a91844778078554c68812ab8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFadeInThemeAnimation.ByReference::class)
public interface IFadeInThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFadeInThemeAnimation> {
    public override fun getValue() = ABI.makeIFadeInThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IFadeInThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFadeInThemeAnimation {
    public val __106812898_Ptr: Pointer?

    public val _106812898_VtblPtr: Pointer?
      get() = __106812898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _106812898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__106812898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _106812898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__106812898_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFadeInThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __106812898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFadeInThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d4bc8f5a91844778078554c68812ab8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFadeInThemeAnimation(ptr: Pointer?): WithDefault =
        IFadeInThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFadeInThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIFadeInThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IFadeInThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__106812898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFadeInThemeAnimation): Array<IFadeInThemeAnimation?> =
        (elements as
        Array<IFadeInThemeAnimation?>).castToImpl<IFadeInThemeAnimation,IFadeInThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFadeInThemeAnimation?> =
        arrayOfNulls<IFadeInThemeAnimation_Impl>(size) as Array<IFadeInThemeAnimation?>
  }
}
