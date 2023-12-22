package Windows.Media.Effects

import Windows.Foundation.Collections.IVectorView
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
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

@ABIMarker(IBasicVideoEffect.ABI::class)
@Signature("{8262c7ef-b360-40be-949b-2ff42ff35693}")
@Guid("8262c7efb36040be949b2ff42ff35693")
@WinRTInterface("8262c7efb36040be949b2ff42ff35693")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBasicVideoEffect.ByReference::class)
public interface IBasicVideoEffect : NativeMapped, IWinRTInterface, IMediaExtension {
  @InterfaceMethod(0)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedMemoryTypes(): MediaMemoryTypes?

  @InterfaceMethod(2)
  public fun get_TimeIndependent(): Boolean

  @InterfaceMethod(3)
  public fun get_SupportedEncodingProperties(): IVectorView<VideoEncodingProperties?>?

  @InterfaceMethod(4)
  public fun SetEncodingProperties(encodingProperties: VideoEncodingProperties?,
      device: IDirect3DDevice?): Unit

  @InterfaceMethod(5)
  public fun ProcessFrame(context: ProcessVideoFrameContext?): Unit

  @InterfaceMethod(6)
  public fun Close(reason: MediaEffectClosedReason?): Unit

  @InterfaceMethod(7)
  public fun DiscardQueuedFrames(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBasicVideoEffect> {
    public override fun getValue() = ABI.makeIBasicVideoEffect(pointer.getPointer(0))

    public fun setValue(value: IBasicVideoEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBasicVideoEffect, IMediaExtension.WithDefault {
    public val __604541318_Ptr: Pointer?

    public val _604541318_VtblPtr: Pointer?
      get() = __604541318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _604541318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedMemoryTypes(): MediaMemoryTypes? {
      val fnPtr = _604541318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaMemoryTypes>()
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaMemoryTypes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TimeIndependent(): Boolean {
      val fnPtr = _604541318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SupportedEncodingProperties(): IVectorView<VideoEncodingProperties?>? {
      val fnPtr = _604541318_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<VideoEncodingProperties?>>()
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<VideoEncodingProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetEncodingProperties(encodingProperties: VideoEncodingProperties?,
        device: IDirect3DDevice?): Unit {
      val fnPtr = _604541318_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr, marshalToNative(encodingProperties),
          marshalToNative(device),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ProcessFrame(context: ProcessVideoFrameContext?): Unit {
      val fnPtr = _604541318_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Close(reason: MediaEffectClosedReason?): Unit {
      val fnPtr = _604541318_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun DiscardQueuedFrames(): Unit {
      val fnPtr = _604541318_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__604541318_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBasicVideoEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtension {
    public override val __9720779_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_604541318_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __604541318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBasicVideoEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8262c7efb36040be949b2ff42ff35693")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBasicVideoEffect(ptr: Pointer?): WithDefault = IBasicVideoEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBasicVideoEffect {
      val address = segment.toRawLongValue()
      return makeIBasicVideoEffect(Pointer(address))
    }

    public override fun toNative(obj: IBasicVideoEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__604541318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBasicVideoEffect): Array<IBasicVideoEffect?> = (elements
        as Array<IBasicVideoEffect?>).castToImpl<IBasicVideoEffect,IBasicVideoEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBasicVideoEffect?> =
        arrayOfNulls<IBasicVideoEffect_Impl>(size) as Array<IBasicVideoEffect?>
  }
}
