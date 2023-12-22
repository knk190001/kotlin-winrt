package Windows.Media.Capture

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaCaptureVideoProfileMediaDescription.ABI::class)
@Signature("{8012afef-b691-49ff-83f2-c1e76eaaea1b}")
@Guid("8012afefb69149ff83f2c1e76eaaea1b")
@WinRTInterface("8012afefb69149ff83f2c1e76eaaea1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureVideoProfileMediaDescription.ByReference::class)
public interface IMediaCaptureVideoProfileMediaDescription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Height(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_FrameRate(): Double

  @InterfaceMethod(3)
  public fun get_IsVariablePhotoSequenceSupported(): Boolean

  @InterfaceMethod(4)
  public fun get_IsHdrVideoSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureVideoProfileMediaDescription> {
    public override fun getValue() =
        ABI.makeIMediaCaptureVideoProfileMediaDescription(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureVideoProfileMediaDescription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureVideoProfileMediaDescription {
    public val __1677075968_Ptr: Pointer?

    public val _1677075968_VtblPtr: Pointer?
      get() = __1677075968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _1677075968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1677075968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _1677075968_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1677075968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_FrameRate(): Double {
      val fnPtr = _1677075968_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1677075968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsVariablePhotoSequenceSupported(): Boolean {
      val fnPtr = _1677075968_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1677075968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_IsHdrVideoSupported(): Boolean {
      val fnPtr = _1677075968_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1677075968_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaCaptureVideoProfileMediaDescription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1677075968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureVideoProfileMediaDescription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8012afefb69149ff83f2c1e76eaaea1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureVideoProfileMediaDescription(ptr: Pointer?): WithDefault =
        IMediaCaptureVideoProfileMediaDescription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaCaptureVideoProfileMediaDescription {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureVideoProfileMediaDescription(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureVideoProfileMediaDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1677075968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureVideoProfileMediaDescription):
        Array<IMediaCaptureVideoProfileMediaDescription?> = (elements as
        Array<IMediaCaptureVideoProfileMediaDescription?>).castToImpl<IMediaCaptureVideoProfileMediaDescription,IMediaCaptureVideoProfileMediaDescription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureVideoProfileMediaDescription?> =
        arrayOfNulls<IMediaCaptureVideoProfileMediaDescription_Impl>(size) as
        Array<IMediaCaptureVideoProfileMediaDescription?>
  }
}
