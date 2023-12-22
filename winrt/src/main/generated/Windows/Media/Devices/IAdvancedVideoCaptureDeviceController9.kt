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

@ABIMarker(IAdvancedVideoCaptureDeviceController9.ABI::class)
@Signature("{8bdca95d-0255-51bc-a10d-5a169ec1625a}")
@Guid("8bdca95d025551bca10d5a169ec1625a")
@WinRTInterface("8bdca95d025551bca10d5a169ec1625a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController9.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController9 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DigitalWindowControl(): DigitalWindowControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController9> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController9(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController9_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController9 {
    public val __71515993_Ptr: Pointer?

    public val _71515993_VtblPtr: Pointer?
      get() = __71515993_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DigitalWindowControl(): DigitalWindowControl? {
      val fnPtr = _71515993_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DigitalWindowControl>()
      val hr = fn.invokeHR(arrayOf(__71515993_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DigitalWindowControl>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController9_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515993_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController9, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bdca95d025551bca10d5a169ec1625a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController9(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController9_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController9 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController9(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController9): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515993_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController9):
        Array<IAdvancedVideoCaptureDeviceController9?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController9?>).castToImpl<IAdvancedVideoCaptureDeviceController9,IAdvancedVideoCaptureDeviceController9_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController9?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController9_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController9?>
  }
}
