package Windows.Media.Capture.Frames

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

@ABIMarker(IMediaFrameReader2.ABI::class)
@Signature("{871127b3-8531-4050-87cc-a13733cf3e9b}")
@Guid("871127b38531405087cca13733cf3e9b")
@WinRTInterface("871127b38531405087cca13733cf3e9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameReader2.ByReference::class)
public interface IMediaFrameReader2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_AcquisitionMode(value: MediaFrameReaderAcquisitionMode?): Unit

  @InterfaceMethod(1)
  public fun get_AcquisitionMode(): MediaFrameReaderAcquisitionMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameReader2> {
    public override fun getValue() = ABI.makeIMediaFrameReader2(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameReader2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameReader2 {
    public val __723806656_Ptr: Pointer?

    public val _723806656_VtblPtr: Pointer?
      get() = __723806656_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_AcquisitionMode(value: MediaFrameReaderAcquisitionMode?): Unit {
      val fnPtr = _723806656_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__723806656_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_AcquisitionMode(): MediaFrameReaderAcquisitionMode? {
      val fnPtr = _723806656_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameReaderAcquisitionMode>()
      val hr = fn.invokeHR(arrayOf(__723806656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameReaderAcquisitionMode>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameReader2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __723806656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameReader2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("871127b38531405087cca13733cf3e9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameReader2(ptr: Pointer?): WithDefault = IMediaFrameReader2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameReader2 {
      val address = segment.toRawLongValue()
      return makeIMediaFrameReader2(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameReader2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__723806656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameReader2): Array<IMediaFrameReader2?> =
        (elements as
        Array<IMediaFrameReader2?>).castToImpl<IMediaFrameReader2,IMediaFrameReader2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameReader2?> =
        arrayOfNulls<IMediaFrameReader2_Impl>(size) as Array<IMediaFrameReader2?>
  }
}
