package Windows.Media.Capture.Frames

import Windows.Media.Devices.AudioDeviceController
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

@ABIMarker(IMediaFrameSourceController3.ABI::class)
@Signature("{1f0cf815-2464-4651-b1e8-4a82dbdb54de}")
@Guid("1f0cf81524644651b1e84a82dbdb54de")
@WinRTInterface("1f0cf81524644651b1e84a82dbdb54de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceController3.ByReference::class)
public interface IMediaFrameSourceController3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioDeviceController(): AudioDeviceController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceController3> {
    public override fun getValue() = ABI.makeIMediaFrameSourceController3(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceController3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceController3 {
    public val __539491885_Ptr: Pointer?

    public val _539491885_VtblPtr: Pointer?
      get() = __539491885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioDeviceController(): AudioDeviceController? {
      val fnPtr = _539491885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceController>()
      val hr = fn.invokeHR(arrayOf(__539491885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceController>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceController3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __539491885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceController3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f0cf81524644651b1e84a82dbdb54de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceController3(ptr: Pointer?): WithDefault =
        IMediaFrameSourceController3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceController3 {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceController3(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceController3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__539491885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceController3):
        Array<IMediaFrameSourceController3?> = (elements as
        Array<IMediaFrameSourceController3?>).castToImpl<IMediaFrameSourceController3,IMediaFrameSourceController3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceController3?> =
        arrayOfNulls<IMediaFrameSourceController3_Impl>(size) as
        Array<IMediaFrameSourceController3?>
  }
}
