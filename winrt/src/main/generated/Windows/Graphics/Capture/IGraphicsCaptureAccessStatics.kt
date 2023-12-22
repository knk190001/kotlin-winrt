package Windows.Graphics.Capture

import Windows.Foundation.IAsyncOperation
import Windows.Security.Authorization.AppCapabilityAccess.AppCapabilityAccessStatus
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

@ABIMarker(IGraphicsCaptureAccessStatics.ABI::class)
@Signature("{743ed370-06ec-5040-a58a-901f0f757095}")
@Guid("743ed37006ec5040a58a901f0f757095")
@WinRTInterface("743ed37006ec5040a58a901f0f757095")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsCaptureAccessStatics.ByReference::class)
public interface IGraphicsCaptureAccessStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAccessAsync(request: GraphicsCaptureAccessKind?):
      IAsyncOperation<AppCapabilityAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsCaptureAccessStatics> {
    public override fun getValue() = ABI.makeIGraphicsCaptureAccessStatics(pointer.getPointer(0))

    public fun setValue(value: IGraphicsCaptureAccessStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsCaptureAccessStatics {
    public val __1126244383_Ptr: Pointer?

    public val _1126244383_VtblPtr: Pointer?
      get() = __1126244383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAccessAsync(request: GraphicsCaptureAccessKind?):
        IAsyncOperation<AppCapabilityAccessStatus?>? {
      val fnPtr = _1126244383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppCapabilityAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1126244383_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppCapabilityAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IGraphicsCaptureAccessStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1126244383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsCaptureAccessStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("743ed37006ec5040a58a901f0f757095")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsCaptureAccessStatics(ptr: Pointer?): WithDefault =
        IGraphicsCaptureAccessStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsCaptureAccessStatics {
      val address = segment.toRawLongValue()
      return makeIGraphicsCaptureAccessStatics(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsCaptureAccessStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1126244383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsCaptureAccessStatics):
        Array<IGraphicsCaptureAccessStatics?> = (elements as
        Array<IGraphicsCaptureAccessStatics?>).castToImpl<IGraphicsCaptureAccessStatics,IGraphicsCaptureAccessStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsCaptureAccessStatics?> =
        arrayOfNulls<IGraphicsCaptureAccessStatics_Impl>(size) as
        Array<IGraphicsCaptureAccessStatics?>
  }
}
