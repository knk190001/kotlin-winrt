package Windows.Media.Capture

import Windows.Foundation.IReference
import Windows.Media.AudioProcessing
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaCaptureSettings2.ABI::class)
@Signature("{6f9e7cfb-fa9f-4b13-9cbe-5ab94f1f3493}")
@Guid("6f9e7cfbfa9f4b139cbe5ab94f1f3493")
@WinRTInterface("6f9e7cfbfa9f4b139cbe5ab94f1f3493")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureSettings2.ByReference::class)
public interface IMediaCaptureSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConcurrentRecordAndPhotoSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_ConcurrentRecordAndPhotoSequenceSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_CameraSoundRequiredForRegion(): Boolean

  @InterfaceMethod(3)
  public fun get_Horizontal35mmEquivalentFocalLength(): IReference<WinDef.UINT>?

  @InterfaceMethod(4)
  public fun get_PitchOffsetDegrees(): IReference<Int>?

  @InterfaceMethod(5)
  public fun get_Vertical35mmEquivalentFocalLength(): IReference<WinDef.UINT>?

  @InterfaceMethod(6)
  public fun get_MediaCategory(): MediaCategory?

  @InterfaceMethod(7)
  public fun get_AudioProcessing(): AudioProcessing?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureSettings2> {
    public override fun getValue() = ABI.makeIMediaCaptureSettings2(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureSettings2 {
    public val __1896001803_Ptr: Pointer?

    public val _1896001803_VtblPtr: Pointer?
      get() = __1896001803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConcurrentRecordAndPhotoSupported(): Boolean {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ConcurrentRecordAndPhotoSequenceSupported(): Boolean {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CameraSoundRequiredForRegion(): Boolean {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Horizontal35mmEquivalentFocalLength(): IReference<WinDef.UINT>? {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PitchOffsetDegrees(): IReference<Int>? {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Vertical35mmEquivalentFocalLength(): IReference<WinDef.UINT>? {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MediaCategory(): MediaCategory? {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaCategory>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AudioProcessing(): AudioProcessing? {
      val fnPtr = _1896001803_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioProcessing>()
      val hr = fn.invokeHR(arrayOf(__1896001803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioProcessing>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1896001803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f9e7cfbfa9f4b139cbe5ab94f1f3493")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureSettings2(ptr: Pointer?): WithDefault =
        IMediaCaptureSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureSettings2 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureSettings2(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1896001803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureSettings2): Array<IMediaCaptureSettings2?> =
        (elements as
        Array<IMediaCaptureSettings2?>).castToImpl<IMediaCaptureSettings2,IMediaCaptureSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureSettings2?> =
        arrayOfNulls<IMediaCaptureSettings2_Impl>(size) as Array<IMediaCaptureSettings2?>
  }
}
