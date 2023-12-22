package Windows.Devices.Perception

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

@ABIMarker(IPerceptionDepthFrameSource2.ABI::class)
@Signature("{e3d23d2e-6e2c-4e6d-91d9-704cd8dff79d}")
@Guid("e3d23d2e6e2c4e6d91d9704cd8dff79d")
@WinRTInterface("e3d23d2e6e2c4e6d91d9704cd8dff79d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthFrameSource2.ByReference::class)
public interface IPerceptionDepthFrameSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthFrameSource2> {
    public override fun getValue() = ABI.makeIPerceptionDepthFrameSource2(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthFrameSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthFrameSource2 {
    public val __1909864448_Ptr: Pointer?

    public val _1909864448_VtblPtr: Pointer?
      get() = __1909864448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1909864448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1909864448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthFrameSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1909864448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthFrameSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3d23d2e6e2c4e6d91d9704cd8dff79d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthFrameSource2(ptr: Pointer?): WithDefault =
        IPerceptionDepthFrameSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionDepthFrameSource2 {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthFrameSource2(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthFrameSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1909864448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthFrameSource2):
        Array<IPerceptionDepthFrameSource2?> = (elements as
        Array<IPerceptionDepthFrameSource2?>).castToImpl<IPerceptionDepthFrameSource2,IPerceptionDepthFrameSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthFrameSource2?> =
        arrayOfNulls<IPerceptionDepthFrameSource2_Impl>(size) as
        Array<IPerceptionDepthFrameSource2?>
  }
}
