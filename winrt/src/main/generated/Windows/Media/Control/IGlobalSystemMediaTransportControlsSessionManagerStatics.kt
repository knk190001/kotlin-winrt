package Windows.Media.Control

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGlobalSystemMediaTransportControlsSessionManagerStatics.ABI::class)
@Signature("{2050c4ee-11a0-57de-aed7-c97c70338245}")
@Guid("2050c4ee11a057deaed7c97c70338245")
@WinRTInterface("2050c4ee11a057deaed7c97c70338245")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IGlobalSystemMediaTransportControlsSessionManagerStatics.ByReference::class)
public interface IGlobalSystemMediaTransportControlsSessionManagerStatics : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAsync(): IAsyncOperation<GlobalSystemMediaTransportControlsSessionManager?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalSystemMediaTransportControlsSessionManagerStatics> {
    public override fun getValue() =
        ABI.makeIGlobalSystemMediaTransportControlsSessionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IGlobalSystemMediaTransportControlsSessionManagerStatics_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalSystemMediaTransportControlsSessionManagerStatics {
    public val __1568731136_Ptr: Pointer?

    public val _1568731136_VtblPtr: Pointer?
      get() = __1568731136_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAsync():
        IAsyncOperation<GlobalSystemMediaTransportControlsSessionManager?>? {
      val fnPtr = _1568731136_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<GlobalSystemMediaTransportControlsSessionManager?>>()
      val hr = fn.invokeHR(arrayOf(__1568731136_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GlobalSystemMediaTransportControlsSessionManager?>>(result.getValue())
      return resultValue
    }
  }

  public class IGlobalSystemMediaTransportControlsSessionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1568731136_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalSystemMediaTransportControlsSessionManagerStatics, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2050c4ee11a057deaed7c97c70338245")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalSystemMediaTransportControlsSessionManagerStatics(ptr: Pointer?):
        WithDefault = IGlobalSystemMediaTransportControlsSessionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGlobalSystemMediaTransportControlsSessionManagerStatics {
      val address = segment.toRawLongValue()
      return makeIGlobalSystemMediaTransportControlsSessionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IGlobalSystemMediaTransportControlsSessionManagerStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1568731136_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGlobalSystemMediaTransportControlsSessionManagerStatics):
        Array<IGlobalSystemMediaTransportControlsSessionManagerStatics?> = (elements as
        Array<IGlobalSystemMediaTransportControlsSessionManagerStatics?>).castToImpl<IGlobalSystemMediaTransportControlsSessionManagerStatics,IGlobalSystemMediaTransportControlsSessionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGlobalSystemMediaTransportControlsSessionManagerStatics?> =
        arrayOfNulls<IGlobalSystemMediaTransportControlsSessionManagerStatics_Impl>(size) as
        Array<IGlobalSystemMediaTransportControlsSessionManagerStatics?>
  }
}
