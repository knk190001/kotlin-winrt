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

@ABIMarker(IPointerUpThemeAnimation.ABI::class)
@Signature("{94896d1c-c938-5d68-84da-552bde815810}")
@Guid("94896d1cc9385d6884da552bde815810")
@WinRTInterface("94896d1cc9385d6884da552bde815810")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerUpThemeAnimation.ByReference::class)
public interface IPointerUpThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerUpThemeAnimation> {
    public override fun getValue() = ABI.makeIPointerUpThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IPointerUpThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerUpThemeAnimation {
    public val __1975478472_Ptr: Pointer?

    public val _1975478472_VtblPtr: Pointer?
      get() = __1975478472_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _1975478472_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1975478472_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _1975478472_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1975478472_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPointerUpThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1975478472_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerUpThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94896d1cc9385d6884da552bde815810")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerUpThemeAnimation(ptr: Pointer?): WithDefault =
        IPointerUpThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerUpThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIPointerUpThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IPointerUpThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1975478472_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerUpThemeAnimation):
        Array<IPointerUpThemeAnimation?> = (elements as
        Array<IPointerUpThemeAnimation?>).castToImpl<IPointerUpThemeAnimation,IPointerUpThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerUpThemeAnimation?> =
        arrayOfNulls<IPointerUpThemeAnimation_Impl>(size) as Array<IPointerUpThemeAnimation?>
  }
}
