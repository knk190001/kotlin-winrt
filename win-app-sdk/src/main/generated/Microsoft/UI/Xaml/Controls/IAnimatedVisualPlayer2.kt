package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IAnimatedVisualPlayer2.ABI::class)
@Signature("{db33db95-9404-5385-ae32-673e7c358ad3}")
@Guid("db33db9594045385ae32673e7c358ad3")
@WinRTInterface("db33db9594045385ae32673e7c358ad3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualPlayer2.ByReference::class)
public interface IAnimatedVisualPlayer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationOptimization(): PlayerAnimationOptimization?

  @InterfaceMethod(1)
  public fun put_AnimationOptimization(value: PlayerAnimationOptimization?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualPlayer2> {
    public override fun getValue() = ABI.makeIAnimatedVisualPlayer2(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualPlayer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualPlayer2 {
    public val __1718708793_Ptr: Pointer?

    public val _1718708793_VtblPtr: Pointer?
      get() = __1718708793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationOptimization(): PlayerAnimationOptimization? {
      val fnPtr = _1718708793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayerAnimationOptimization>()
      val hr = fn.invokeHR(arrayOf(__1718708793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayerAnimationOptimization>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AnimationOptimization(value: PlayerAnimationOptimization?): Unit {
      val fnPtr = _1718708793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1718708793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnimatedVisualPlayer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1718708793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualPlayer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db33db9594045385ae32673e7c358ad3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualPlayer2(ptr: Pointer?): WithDefault =
        IAnimatedVisualPlayer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualPlayer2 {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualPlayer2(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualPlayer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1718708793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualPlayer2): Array<IAnimatedVisualPlayer2?> =
        (elements as
        Array<IAnimatedVisualPlayer2?>).castToImpl<IAnimatedVisualPlayer2,IAnimatedVisualPlayer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualPlayer2?> =
        arrayOfNulls<IAnimatedVisualPlayer2_Impl>(size) as Array<IAnimatedVisualPlayer2?>
  }
}
