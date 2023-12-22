package Windows.Media.Effects

import Windows.Foundation.Collections.IVectorView
import Windows.Media.IMediaExtension
import Windows.Media.IMediaExtension.ABI.IID
import Windows.Media.MediaProperties.AudioEncodingProperties
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

@ABIMarker(IBasicAudioEffect.ABI::class)
@Signature("{8c062c53-6bc0-48b8-a99a-4b41550f1359}")
@Guid("8c062c536bc048b8a99a4b41550f1359")
@WinRTInterface("8c062c536bc048b8a99a4b41550f1359")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBasicAudioEffect.ByReference::class)
public interface IBasicAudioEffect : NativeMapped, IWinRTInterface, IMediaExtension {
  @InterfaceMethod(0)
  public fun get_UseInputFrameForOutput(): Boolean

  @InterfaceMethod(1)
  public fun get_SupportedEncodingProperties(): IVectorView<AudioEncodingProperties?>?

  @InterfaceMethod(2)
  public fun SetEncodingProperties(encodingProperties: AudioEncodingProperties?): Unit

  @InterfaceMethod(3)
  public fun ProcessFrame(context: ProcessAudioFrameContext?): Unit

  @InterfaceMethod(4)
  public fun Close(reason: MediaEffectClosedReason?): Unit

  @InterfaceMethod(5)
  public fun DiscardQueuedFrames(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBasicAudioEffect> {
    public override fun getValue() = ABI.makeIBasicAudioEffect(pointer.getPointer(0))

    public fun setValue(value: IBasicAudioEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBasicAudioEffect, IMediaExtension.WithDefault {
    public val __1205156459_Ptr: Pointer?

    public val _1205156459_VtblPtr: Pointer?
      get() = __1205156459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseInputFrameForOutput(): Boolean {
      val fnPtr = _1205156459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1205156459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SupportedEncodingProperties(): IVectorView<AudioEncodingProperties?>? {
      val fnPtr = _1205156459_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AudioEncodingProperties?>>()
      val hr = fn.invokeHR(arrayOf(__1205156459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AudioEncodingProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetEncodingProperties(encodingProperties: AudioEncodingProperties?): Unit {
      val fnPtr = _1205156459_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205156459_Ptr, marshalToNative(encodingProperties),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ProcessFrame(context: ProcessAudioFrameContext?): Unit {
      val fnPtr = _1205156459_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205156459_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Close(reason: MediaEffectClosedReason?): Unit {
      val fnPtr = _1205156459_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205156459_Ptr, marshalToNative(reason),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun DiscardQueuedFrames(): Unit {
      val fnPtr = _1205156459_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1205156459_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBasicAudioEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtension {
    public override val __9720779_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1205156459_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1205156459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBasicAudioEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c062c536bc048b8a99a4b41550f1359")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBasicAudioEffect(ptr: Pointer?): WithDefault = IBasicAudioEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBasicAudioEffect {
      val address = segment.toRawLongValue()
      return makeIBasicAudioEffect(Pointer(address))
    }

    public override fun toNative(obj: IBasicAudioEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1205156459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBasicAudioEffect): Array<IBasicAudioEffect?> = (elements
        as Array<IBasicAudioEffect?>).castToImpl<IBasicAudioEffect,IBasicAudioEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBasicAudioEffect?> =
        arrayOfNulls<IBasicAudioEffect_Impl>(size) as Array<IBasicAudioEffect?>
  }
}
