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

@ABIMarker(IAdvancedVideoCaptureDeviceController7.ABI::class)
@Signature("{8d2927f0-a054-50e7-b7df-7c04234d10f0}")
@Guid("8d2927f0a05450e7b7df7c04234d10f0")
@WinRTInterface("8d2927f0a05450e7b7df7c04234d10f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController7.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfraredTorchControl(): InfraredTorchControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController7> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController7(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController7 {
    public val __71515991_Ptr: Pointer?

    public val _71515991_VtblPtr: Pointer?
      get() = __71515991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfraredTorchControl(): InfraredTorchControl? {
      val fnPtr = _71515991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InfraredTorchControl>()
      val hr = fn.invokeHR(arrayOf(__71515991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InfraredTorchControl>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d2927f0a05450e7b7df7c04234d10f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController7(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController7 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController7(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController7):
        Array<IAdvancedVideoCaptureDeviceController7?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController7?>).castToImpl<IAdvancedVideoCaptureDeviceController7,IAdvancedVideoCaptureDeviceController7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController7?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController7_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController7?>
  }
}
