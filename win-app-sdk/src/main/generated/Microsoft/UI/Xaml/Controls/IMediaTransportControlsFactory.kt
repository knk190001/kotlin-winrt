package Microsoft.UI.Xaml.Controls

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTransportControlsFactory.ABI::class)
@Signature("{a3f9a254-1bcf-57b5-9481-c19c4583ac0e}")
@Guid("a3f9a2541bcf57b59481c19c4583ac0e")
@WinRTInterface("a3f9a2541bcf57b59481c19c4583ac0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTransportControlsFactory.ByReference::class)
public interface IMediaTransportControlsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      MediaTransportControls?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTransportControlsFactory> {
    public override fun getValue() = ABI.makeIMediaTransportControlsFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaTransportControlsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTransportControlsFactory {
    public val __80672424_Ptr: Pointer?

    public val _80672424_VtblPtr: Pointer?
      get() = __80672424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MediaTransportControls? {
      val fnPtr = _80672424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTransportControls>()
      val hr = fn.invokeHR(arrayOf(__80672424_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTransportControls>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTransportControlsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __80672424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTransportControlsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3f9a2541bcf57b59481c19c4583ac0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTransportControlsFactory(ptr: Pointer?): WithDefault =
        IMediaTransportControlsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTransportControlsFactory {
      val address = segment.toRawLongValue()
      return makeIMediaTransportControlsFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaTransportControlsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__80672424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTransportControlsFactory):
        Array<IMediaTransportControlsFactory?> = (elements as
        Array<IMediaTransportControlsFactory?>).castToImpl<IMediaTransportControlsFactory,IMediaTransportControlsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTransportControlsFactory?> =
        arrayOfNulls<IMediaTransportControlsFactory_Impl>(size) as
        Array<IMediaTransportControlsFactory?>
  }
}
