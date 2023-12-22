package Windows.Media.Core

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

@ABIMarker(IMediaStreamSourceFactory.ABI::class)
@Signature("{ef77e0d9-d158-4b7a-863f-203342fbfd41}")
@Guid("ef77e0d9d1584b7a863f203342fbfd41")
@WinRTInterface("ef77e0d9d1584b7a863f203342fbfd41")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceFactory.ByReference::class)
public interface IMediaStreamSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromDescriptor(descriptor: IMediaStreamDescriptor?): MediaStreamSource?

  @InterfaceMethod(1)
  public fun CreateFromDescriptors(descriptor: IMediaStreamDescriptor?,
      descriptor2: IMediaStreamDescriptor?): MediaStreamSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceFactory> {
    public override fun getValue() = ABI.makeIMediaStreamSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceFactory {
    public val __799078944_Ptr: Pointer?

    public val _799078944_VtblPtr: Pointer?
      get() = __799078944_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromDescriptor(descriptor: IMediaStreamDescriptor?):
        MediaStreamSource? {
      val fnPtr = _799078944_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__799078944_Ptr, marshalToNative(descriptor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromDescriptors(descriptor: IMediaStreamDescriptor?,
        descriptor2: IMediaStreamDescriptor?): MediaStreamSource? {
      val fnPtr = _799078944_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__799078944_Ptr, marshalToNative(descriptor),
          marshalToNative(descriptor2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __799078944_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef77e0d9d1584b7a863f203342fbfd41")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceFactory(ptr: Pointer?): WithDefault =
        IMediaStreamSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSourceFactory {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__799078944_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceFactory):
        Array<IMediaStreamSourceFactory?> = (elements as
        Array<IMediaStreamSourceFactory?>).castToImpl<IMediaStreamSourceFactory,IMediaStreamSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceFactory?> =
        arrayOfNulls<IMediaStreamSourceFactory_Impl>(size) as Array<IMediaStreamSourceFactory?>
  }
}
