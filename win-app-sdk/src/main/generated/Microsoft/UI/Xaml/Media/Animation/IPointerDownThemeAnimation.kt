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

@ABIMarker(IPointerDownThemeAnimation.ABI::class)
@Signature("{abdd1acc-40df-595d-be68-0362fe681b91}")
@Guid("abdd1acc40df595dbe680362fe681b91")
@WinRTInterface("abdd1acc40df595dbe680362fe681b91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerDownThemeAnimation.ByReference::class)
public interface IPointerDownThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetName(): String?

  @InterfaceMethod(1)
  public fun put_TargetName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerDownThemeAnimation> {
    public override fun getValue() = ABI.makeIPointerDownThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: IPointerDownThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerDownThemeAnimation {
    public val __1062921089_Ptr: Pointer?

    public val _1062921089_VtblPtr: Pointer?
      get() = __1062921089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetName(): String? {
      val fnPtr = _1062921089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1062921089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TargetName(value: String?): Unit {
      val fnPtr = _1062921089_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1062921089_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPointerDownThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1062921089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerDownThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abdd1acc40df595dbe680362fe681b91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerDownThemeAnimation(ptr: Pointer?): WithDefault =
        IPointerDownThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerDownThemeAnimation {
      val address = segment.toRawLongValue()
      return makeIPointerDownThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: IPointerDownThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1062921089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerDownThemeAnimation):
        Array<IPointerDownThemeAnimation?> = (elements as
        Array<IPointerDownThemeAnimation?>).castToImpl<IPointerDownThemeAnimation,IPointerDownThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerDownThemeAnimation?> =
        arrayOfNulls<IPointerDownThemeAnimation_Impl>(size) as Array<IPointerDownThemeAnimation?>
  }
}
