package Microsoft.UI.Composition

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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnimationControllerStatics.ABI::class)
@Signature("{b63b0fb6-286b-57af-b096-16066d43dc00}")
@Guid("b63b0fb6286b57afb09616066d43dc00")
@WinRTInterface("b63b0fb6286b57afb09616066d43dc00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationControllerStatics.ByReference::class)
public interface IAnimationControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPlaybackRate(): Float

  @InterfaceMethod(1)
  public fun get_MinPlaybackRate(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationControllerStatics> {
    public override fun getValue() = ABI.makeIAnimationControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IAnimationControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationControllerStatics {
    public val __939570238_Ptr: Pointer?

    public val _939570238_VtblPtr: Pointer?
      get() = __939570238_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPlaybackRate(): Float {
      val fnPtr = _939570238_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__939570238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MinPlaybackRate(): Float {
      val fnPtr = _939570238_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__939570238_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IAnimationControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __939570238_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b63b0fb6286b57afb09616066d43dc00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationControllerStatics(ptr: Pointer?): WithDefault =
        IAnimationControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationControllerStatics {
      val address = segment.toRawLongValue()
      return makeIAnimationControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnimationControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__939570238_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationControllerStatics):
        Array<IAnimationControllerStatics?> = (elements as
        Array<IAnimationControllerStatics?>).castToImpl<IAnimationControllerStatics,IAnimationControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationControllerStatics?> =
        arrayOfNulls<IAnimationControllerStatics_Impl>(size) as Array<IAnimationControllerStatics?>
  }
}
