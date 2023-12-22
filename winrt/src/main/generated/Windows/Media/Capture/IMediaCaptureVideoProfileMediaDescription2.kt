package Windows.Media.Capture

import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMediaCaptureVideoProfileMediaDescription2.ABI::class)
@Signature("{c6a6ef13-322d-413a-b85a-68a88e02f4e9}")
@Guid("c6a6ef13322d413ab85a68a88e02f4e9")
@WinRTInterface("c6a6ef13322d413ab85a68a88e02f4e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureVideoProfileMediaDescription2.ByReference::class)
public interface IMediaCaptureVideoProfileMediaDescription2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Subtype(): String?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureVideoProfileMediaDescription2> {
    public override fun getValue() =
        ABI.makeIMediaCaptureVideoProfileMediaDescription2(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureVideoProfileMediaDescription2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureVideoProfileMediaDescription2 {
    public val __449747406_Ptr: Pointer?

    public val _449747406_VtblPtr: Pointer?
      get() = __449747406_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Subtype(): String? {
      val fnPtr = _449747406_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__449747406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _449747406_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__449747406_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureVideoProfileMediaDescription2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __449747406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureVideoProfileMediaDescription2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6a6ef13322d413ab85a68a88e02f4e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureVideoProfileMediaDescription2(ptr: Pointer?): WithDefault =
        IMediaCaptureVideoProfileMediaDescription2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaCaptureVideoProfileMediaDescription2 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureVideoProfileMediaDescription2(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureVideoProfileMediaDescription2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__449747406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureVideoProfileMediaDescription2):
        Array<IMediaCaptureVideoProfileMediaDescription2?> = (elements as
        Array<IMediaCaptureVideoProfileMediaDescription2?>).castToImpl<IMediaCaptureVideoProfileMediaDescription2,IMediaCaptureVideoProfileMediaDescription2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureVideoProfileMediaDescription2?> =
        arrayOfNulls<IMediaCaptureVideoProfileMediaDescription2_Impl>(size) as
        Array<IMediaCaptureVideoProfileMediaDescription2?>
  }
}
