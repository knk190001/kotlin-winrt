package Windows.Media.Capture.Frames

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IMediaFrameSourceGroupStatics.ABI::class)
@Signature("{1c48bfc5-436f-4508-94cf-d5d8b7326445}")
@Guid("1c48bfc5436f450894cfd5d8b7326445")
@WinRTInterface("1c48bfc5436f450894cfd5d8b7326445")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceGroupStatics.ByReference::class)
public interface IMediaFrameSourceGroupStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<MediaFrameSourceGroup?>?>?

  @InterfaceMethod(1)
  public fun FromIdAsync(id: String?): IAsyncOperation<MediaFrameSourceGroup?>?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceGroupStatics> {
    public override fun getValue() = ABI.makeIMediaFrameSourceGroupStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceGroupStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceGroupStatics {
    public val __1090782992_Ptr: Pointer?

    public val _1090782992_VtblPtr: Pointer?
      get() = __1090782992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllAsync(): IAsyncOperation<IVectorView<MediaFrameSourceGroup?>?>? {
      val fnPtr = _1090782992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<MediaFrameSourceGroup?>?>>()
      val hr = fn.invokeHR(arrayOf(__1090782992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<MediaFrameSourceGroup?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(id: String?): IAsyncOperation<MediaFrameSourceGroup?>? {
      val fnPtr = _1090782992_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameSourceGroup?>>()
      val hr = fn.invokeHR(arrayOf(__1090782992_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaFrameSourceGroup?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1090782992_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1090782992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceGroupStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1090782992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceGroupStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c48bfc5436f450894cfd5d8b7326445")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceGroupStatics(ptr: Pointer?): WithDefault =
        IMediaFrameSourceGroupStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceGroupStatics {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceGroupStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceGroupStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090782992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceGroupStatics):
        Array<IMediaFrameSourceGroupStatics?> = (elements as
        Array<IMediaFrameSourceGroupStatics?>).castToImpl<IMediaFrameSourceGroupStatics,IMediaFrameSourceGroupStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceGroupStatics?> =
        arrayOfNulls<IMediaFrameSourceGroupStatics_Impl>(size) as
        Array<IMediaFrameSourceGroupStatics?>
  }
}
