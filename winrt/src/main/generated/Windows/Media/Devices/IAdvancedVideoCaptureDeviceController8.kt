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

@ABIMarker(IAdvancedVideoCaptureDeviceController8.ABI::class)
@Signature("{d843f010-e7fb-595b-9a78-0e54c4532b43}")
@Guid("d843f010e7fb595b9a780e54c4532b43")
@WinRTInterface("d843f010e7fb595b9a780e54c4532b43")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController8.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PanelBasedOptimizationControl(): PanelBasedOptimizationControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController8> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController8(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController8 {
    public val __71515992_Ptr: Pointer?

    public val _71515992_VtblPtr: Pointer?
      get() = __71515992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PanelBasedOptimizationControl(): PanelBasedOptimizationControl? {
      val fnPtr = _71515992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PanelBasedOptimizationControl>()
      val hr = fn.invokeHR(arrayOf(__71515992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PanelBasedOptimizationControl>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d843f010e7fb595b9a780e54c4532b43")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController8(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController8 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController8(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController8):
        Array<IAdvancedVideoCaptureDeviceController8?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController8?>).castToImpl<IAdvancedVideoCaptureDeviceController8,IAdvancedVideoCaptureDeviceController8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController8?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController8_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController8?>
  }
}
