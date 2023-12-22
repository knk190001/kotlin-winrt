package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.Capture.VideoStreamConfiguration
import Windows.Media.Devices.VideoDeviceController
import Windows.Media.IMediaExtension
import Windows.Media.IMediaExtension.ABI.IID
import Windows.Media.MediaProperties.VideoEncodingProperties
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IVideoStabilizationEffect.ABI::class)
@Signature("{0808a650-9698-4e57-877b-bd7cb2ee0f8a}")
@Guid("0808a65096984e57877bbd7cb2ee0f8a")
@WinRTInterface("0808a65096984e57877bbd7cb2ee0f8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoStabilizationEffect.ByReference::class)
public interface IVideoStabilizationEffect : NativeMapped, IWinRTInterface, IMediaExtension {
  @InterfaceMethod(0)
  public fun put_Enabled(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_Enabled(): Boolean

  @InterfaceMethod(2)
  public fun add_EnabledChanged(handler: TypedEventHandler<VideoStabilizationEffect?,
      VideoStabilizationEffectEnabledChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_EnabledChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun GetRecommendedStreamConfiguration(controller: VideoDeviceController?,
      desiredProperties: VideoEncodingProperties?): VideoStreamConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoStabilizationEffect> {
    public override fun getValue() = ABI.makeIVideoStabilizationEffect(pointer.getPointer(0))

    public fun setValue(value: IVideoStabilizationEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoStabilizationEffect, IMediaExtension.WithDefault {
    public val __1363196842_Ptr: Pointer?

    public val _1363196842_VtblPtr: Pointer?
      get() = __1363196842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Enabled(value: Boolean): Unit {
      val fnPtr = _1363196842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1363196842_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Enabled(): Boolean {
      val fnPtr = _1363196842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1363196842_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_EnabledChanged(handler: TypedEventHandler<VideoStabilizationEffect?,
        VideoStabilizationEffectEnabledChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1363196842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1363196842_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_EnabledChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1363196842_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1363196842_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetRecommendedStreamConfiguration(controller: VideoDeviceController?,
        desiredProperties: VideoEncodingProperties?): VideoStreamConfiguration? {
      val fnPtr = _1363196842_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoStreamConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1363196842_Ptr, marshalToNative(controller),
          marshalToNative(desiredProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoStreamConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IVideoStabilizationEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtension {
    public override val __9720779_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1363196842_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1363196842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoStabilizationEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0808a65096984e57877bbd7cb2ee0f8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoStabilizationEffect(ptr: Pointer?): WithDefault =
        IVideoStabilizationEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoStabilizationEffect {
      val address = segment.toRawLongValue()
      return makeIVideoStabilizationEffect(Pointer(address))
    }

    public override fun toNative(obj: IVideoStabilizationEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1363196842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoStabilizationEffect):
        Array<IVideoStabilizationEffect?> = (elements as
        Array<IVideoStabilizationEffect?>).castToImpl<IVideoStabilizationEffect,IVideoStabilizationEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoStabilizationEffect?> =
        arrayOfNulls<IVideoStabilizationEffect_Impl>(size) as Array<IVideoStabilizationEffect?>
  }
}
