package Windows.Media.Devices

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

@ABIMarker(IAdvancedVideoCaptureDeviceController6.ABI::class)
@Signature("{b6563a53-68a1-44b7-9f89-b5fa97ac0cbe}")
@Guid("b6563a5368a144b79f89b5fa97ac0cbe")
@WinRTInterface("b6563a5368a144b79f89b5fa97ac0cbe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController6.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VideoTemporalDenoisingControl(): VideoTemporalDenoisingControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController6> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController6(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController6 {
    public val __71515990_Ptr: Pointer?

    public val _71515990_VtblPtr: Pointer?
      get() = __71515990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoTemporalDenoisingControl(): VideoTemporalDenoisingControl? {
      val fnPtr = _71515990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoTemporalDenoisingControl>()
      val hr = fn.invokeHR(arrayOf(__71515990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoTemporalDenoisingControl>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6563a5368a144b79f89b5fa97ac0cbe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController6(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController6 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController6(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController6):
        Array<IAdvancedVideoCaptureDeviceController6?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController6?>).castToImpl<IAdvancedVideoCaptureDeviceController6,IAdvancedVideoCaptureDeviceController6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController6?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController6_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController6?>
  }
}
