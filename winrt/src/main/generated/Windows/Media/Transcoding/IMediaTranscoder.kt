package Windows.Media.Transcoding

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTranscoder.ABI::class)
@Signature("{190c99d2-a0aa-4d34-86bc-eed1b12c2f5b}")
@Guid("190c99d2a0aa4d3486bceed1b12c2f5b")
@WinRTInterface("190c99d2a0aa4d3486bceed1b12c2f5b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTranscoder.ByReference::class)
public interface IMediaTranscoder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_TrimStartTime(value: TimeSpan?): Unit

  @InterfaceMethod(1)
  public fun get_TrimStartTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun put_TrimStopTime(value: TimeSpan?): Unit

  @InterfaceMethod(3)
  public fun get_TrimStopTime(): TimeSpan?

  @InterfaceMethod(4)
  public fun put_AlwaysReencode(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_AlwaysReencode(): Boolean

  @InterfaceMethod(6)
  public fun put_HardwareAccelerationEnabled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun get_HardwareAccelerationEnabled(): Boolean

  @InterfaceMethod(8)
  public fun AddAudioEffect(activatableClassId: String?): Unit

  @InterfaceMethod(9)
  public fun AddAudioEffect(
    activatableClassId: String?,
    effectRequired: Boolean,
    configuration: IPropertySet?
  ): Unit

  @InterfaceMethod(10)
  public fun AddVideoEffect(activatableClassId: String?): Unit

  @InterfaceMethod(11)
  public fun AddVideoEffect(
    activatableClassId: String?,
    effectRequired: Boolean,
    configuration: IPropertySet?
  ): Unit

  @InterfaceMethod(12)
  public fun ClearEffects(): Unit

  @InterfaceMethod(13)
  public fun PrepareFileTranscodeAsync(
    source: IStorageFile?,
    destination: IStorageFile?,
    profile: MediaEncodingProfile?
  ): IAsyncOperation<PrepareTranscodeResult?>?

  @InterfaceMethod(14)
  public fun PrepareStreamTranscodeAsync(
    source: IRandomAccessStream?,
    destination: IRandomAccessStream?,
    profile: MediaEncodingProfile?
  ): IAsyncOperation<PrepareTranscodeResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTranscoder> {
    public override fun getValue() = ABI.makeIMediaTranscoder(pointer.getPointer(0))

    public fun setValue(value: IMediaTranscoder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTranscoder {
    public val __1869644277_Ptr: Pointer?

    public val _1869644277_VtblPtr: Pointer?
      get() = __1869644277_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_TrimStartTime(value: TimeSpan?): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_TrimStartTime(): TimeSpan? {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_TrimStopTime(value: TimeSpan?): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TrimStopTime(): TimeSpan? {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_AlwaysReencode(value: Boolean): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_AlwaysReencode(): Boolean {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_HardwareAccelerationEnabled(value: Boolean): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_HardwareAccelerationEnabled(): Boolean {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun AddAudioEffect(activatableClassId: String?): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(activatableClassId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun AddAudioEffect(
      activatableClassId: String?,
      effectRequired: Boolean,
      configuration: IPropertySet?
    ): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(activatableClassId),
          effectRequired, marshalToNative(configuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun AddVideoEffect(activatableClassId: String?): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(activatableClassId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun AddVideoEffect(
      activatableClassId: String?,
      effectRequired: Boolean,
      configuration: IPropertySet?
    ): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(activatableClassId),
          effectRequired, marshalToNative(configuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun ClearEffects(): Unit {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun PrepareFileTranscodeAsync(
      source: IStorageFile?,
      destination: IStorageFile?,
      profile: MediaEncodingProfile?
    ): IAsyncOperation<PrepareTranscodeResult?>? {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PrepareTranscodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(source),
          marshalToNative(destination), marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PrepareTranscodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun PrepareStreamTranscodeAsync(
      source: IRandomAccessStream?,
      destination: IRandomAccessStream?,
      profile: MediaEncodingProfile?
    ): IAsyncOperation<PrepareTranscodeResult?>? {
      val fnPtr = _1869644277_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PrepareTranscodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__1869644277_Ptr, marshalToNative(source),
          marshalToNative(destination), marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PrepareTranscodeResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTranscoder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1869644277_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTranscoder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("190c99d2a0aa4d3486bceed1b12c2f5b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTranscoder(ptr: Pointer?): WithDefault = IMediaTranscoder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTranscoder {
      val address = segment.toRawLongValue()
      return makeIMediaTranscoder(Pointer(address))
    }

    public override fun toNative(obj: IMediaTranscoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1869644277_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTranscoder): Array<IMediaTranscoder?> = (elements as
        Array<IMediaTranscoder?>).castToImpl<IMediaTranscoder,IMediaTranscoder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTranscoder?> =
        arrayOfNulls<IMediaTranscoder_Impl>(size) as Array<IMediaTranscoder?>
  }
}
