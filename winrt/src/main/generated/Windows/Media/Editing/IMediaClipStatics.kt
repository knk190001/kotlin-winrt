package Windows.Media.Editing

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.Storage.IStorageFile
import Windows.UI.Color
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

@ABIMarker(IMediaClipStatics.ABI::class)
@Signature("{fa402b68-928f-43c4-bc6e-783a1a359656}")
@Guid("fa402b68928f43c4bc6e783a1a359656")
@WinRTInterface("fa402b68928f43c4bc6e783a1a359656")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaClipStatics.ByReference::class)
public interface IMediaClipStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromColor(color: Color?, originalDuration: TimeSpan?): MediaClip?

  @InterfaceMethod(1)
  public fun CreateFromFileAsync(`file`: IStorageFile?): IAsyncOperation<MediaClip?>?

  @InterfaceMethod(2)
  public fun CreateFromImageFileAsync(`file`: IStorageFile?, originalDuration: TimeSpan?):
      IAsyncOperation<MediaClip?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaClipStatics> {
    public override fun getValue() = ABI.makeIMediaClipStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaClipStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaClipStatics {
    public val __2098032535_Ptr: Pointer?

    public val _2098032535_VtblPtr: Pointer?
      get() = __2098032535_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromColor(color: Color?, originalDuration: TimeSpan?): MediaClip? {
      val fnPtr = _2098032535_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaClip>()
      val hr = fn.invokeHR(arrayOf(__2098032535_Ptr, marshalToNative(color),
          marshalToNative(originalDuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaClip>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromFileAsync(`file`: IStorageFile?): IAsyncOperation<MediaClip?>? {
      val fnPtr = _2098032535_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaClip?>>()
      val hr = fn.invokeHR(arrayOf(__2098032535_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaClip?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromImageFileAsync(`file`: IStorageFile?,
        originalDuration: TimeSpan?): IAsyncOperation<MediaClip?>? {
      val fnPtr = _2098032535_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaClip?>>()
      val hr = fn.invokeHR(arrayOf(__2098032535_Ptr, marshalToNative(file),
          marshalToNative(originalDuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaClip?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaClipStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2098032535_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaClipStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa402b68928f43c4bc6e783a1a359656")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaClipStatics(ptr: Pointer?): WithDefault = IMediaClipStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaClipStatics {
      val address = segment.toRawLongValue()
      return makeIMediaClipStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaClipStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2098032535_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaClipStatics): Array<IMediaClipStatics?> = (elements
        as Array<IMediaClipStatics?>).castToImpl<IMediaClipStatics,IMediaClipStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaClipStatics?> =
        arrayOfNulls<IMediaClipStatics_Impl>(size) as Array<IMediaClipStatics?>
  }
}
