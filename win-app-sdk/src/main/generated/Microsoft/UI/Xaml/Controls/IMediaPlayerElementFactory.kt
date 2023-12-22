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

@ABIMarker(IMediaPlayerElementFactory.ABI::class)
@Signature("{51aca342-65a0-5db6-8082-bd54a8d14999}")
@Guid("51aca34265a05db68082bd54a8d14999")
@WinRTInterface("51aca34265a05db68082bd54a8d14999")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerElementFactory.ByReference::class)
public interface IMediaPlayerElementFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      MediaPlayerElement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerElementFactory> {
    public override fun getValue() = ABI.makeIMediaPlayerElementFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerElementFactory {
    public val __288515636_Ptr: Pointer?

    public val _288515636_VtblPtr: Pointer?
      get() = __288515636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MediaPlayerElement? {
      val fnPtr = _288515636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerElement>()
      val hr = fn.invokeHR(arrayOf(__288515636_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerElement>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __288515636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51aca34265a05db68082bd54a8d14999")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerElementFactory(ptr: Pointer?): WithDefault =
        IMediaPlayerElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerElementFactory {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__288515636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerElementFactory):
        Array<IMediaPlayerElementFactory?> = (elements as
        Array<IMediaPlayerElementFactory?>).castToImpl<IMediaPlayerElementFactory,IMediaPlayerElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerElementFactory?> =
        arrayOfNulls<IMediaPlayerElementFactory_Impl>(size) as Array<IMediaPlayerElementFactory?>
  }
}
