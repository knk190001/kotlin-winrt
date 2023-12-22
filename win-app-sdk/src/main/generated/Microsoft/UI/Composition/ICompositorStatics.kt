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

@ABIMarker(ICompositorStatics.ABI::class)
@Signature("{6baa947a-f103-55c6-91ad-3d275bea65c4}")
@Guid("6baa947af10355c691ad3d275bea65c4")
@WinRTInterface("6baa947af10355c691ad3d275bea65c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositorStatics.ByReference::class)
public interface ICompositorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxGlobalPlaybackRate(): Float

  @InterfaceMethod(1)
  public fun get_MinGlobalPlaybackRate(): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositorStatics> {
    public override fun getValue() = ABI.makeICompositorStatics(pointer.getPointer(0))

    public fun setValue(value: ICompositorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositorStatics {
    public val __1625804405_Ptr: Pointer?

    public val _1625804405_VtblPtr: Pointer?
      get() = __1625804405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxGlobalPlaybackRate(): Float {
      val fnPtr = _1625804405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1625804405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MinGlobalPlaybackRate(): Float {
      val fnPtr = _1625804405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1625804405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class ICompositorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1625804405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6baa947af10355c691ad3d275bea65c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositorStatics(ptr: Pointer?): WithDefault = ICompositorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositorStatics {
      val address = segment.toRawLongValue()
      return makeICompositorStatics(Pointer(address))
    }

    public override fun toNative(obj: ICompositorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1625804405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositorStatics): Array<ICompositorStatics?> =
        (elements as
        Array<ICompositorStatics?>).castToImpl<ICompositorStatics,ICompositorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositorStatics?> =
        arrayOfNulls<ICompositorStatics_Impl>(size) as Array<ICompositorStatics?>
  }
}
