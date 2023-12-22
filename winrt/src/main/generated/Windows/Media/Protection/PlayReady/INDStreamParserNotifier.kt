package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IVector
import Windows.Media.Core.AudioStreamDescriptor
import Windows.Media.Core.IMediaStreamDescriptor
import Windows.Media.Core.MediaStreamSample
import Windows.Media.Core.VideoStreamDescriptor
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
import kotlin.Byte
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDStreamParserNotifier.ABI::class)
@Signature("{c167acd0-2ce6-426c-ace5-5e9275fea715}")
@Guid("c167acd02ce6426cace55e9275fea715")
@WinRTInterface("c167acd02ce6426cace55e9275fea715")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDStreamParserNotifier.ByReference::class)
public interface INDStreamParserNotifier : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor?): Unit

  @InterfaceMethod(1)
  public
      fun OnMediaStreamDescriptorCreated(audioStreamDescriptors: IVector<AudioStreamDescriptor?>?,
      videoStreamDescriptors: IVector<VideoStreamDescriptor?>?): Unit

  @InterfaceMethod(2)
  public fun OnSampleParsed(
    streamID: WinDef.UINT,
    streamType: NDMediaStreamType?,
    streamSample: MediaStreamSample?,
    pts: Long,
    ccFormat: NDClosedCaptionFormat?,
    ccDataBytes: Array<Byte>
  ): Unit

  @InterfaceMethod(3)
  public fun OnBeginSetupDecryptor(
    descriptor: IMediaStreamDescriptor?,
    keyID: com.sun.jna.platform.win32.Guid.GUID?,
    proBytes: Array<Byte>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDStreamParserNotifier> {
    public override fun getValue() = ABI.makeINDStreamParserNotifier(pointer.getPointer(0))

    public fun setValue(value: INDStreamParserNotifier_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDStreamParserNotifier {
    public val __1899335605_Ptr: Pointer?

    public val _1899335605_VtblPtr: Pointer?
      get() = __1899335605_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor?):
        Unit {
      val fnPtr = _1899335605_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1899335605_Ptr, marshalToNative(licenseFetchDescriptor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override
        fun OnMediaStreamDescriptorCreated(audioStreamDescriptors: IVector<AudioStreamDescriptor?>?,
        videoStreamDescriptors: IVector<VideoStreamDescriptor?>?): Unit {
      val fnPtr = _1899335605_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1899335605_Ptr, marshalToNative(audioStreamDescriptors),
          marshalToNative(videoStreamDescriptors),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun OnSampleParsed(
      streamID: WinDef.UINT,
      streamType: NDMediaStreamType?,
      streamSample: MediaStreamSample?,
      pts: Long,
      ccFormat: NDClosedCaptionFormat?,
      ccDataBytes: Array<Byte>
    ): Unit {
      val fnPtr = _1899335605_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1899335605_Ptr, streamID, marshalToNative(streamType),
          marshalToNative(streamSample), pts, marshalToNative(ccFormat),
          ccDataBytes.size,marshalToNative(ccDataBytes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun OnBeginSetupDecryptor(
      descriptor: IMediaStreamDescriptor?,
      keyID: com.sun.jna.platform.win32.Guid.GUID?,
      proBytes: Array<Byte>
    ): Unit {
      val fnPtr = _1899335605_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1899335605_Ptr, marshalToNative(descriptor),
          marshalToNative(keyID), proBytes.size,marshalToNative(proBytes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INDStreamParserNotifier_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1899335605_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDStreamParserNotifier, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c167acd02ce6426cace55e9275fea715")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDStreamParserNotifier(ptr: Pointer?): WithDefault =
        INDStreamParserNotifier_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDStreamParserNotifier {
      val address = segment.toRawLongValue()
      return makeINDStreamParserNotifier(Pointer(address))
    }

    public override fun toNative(obj: INDStreamParserNotifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1899335605_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDStreamParserNotifier): Array<INDStreamParserNotifier?>
        = (elements as
        Array<INDStreamParserNotifier?>).castToImpl<INDStreamParserNotifier,INDStreamParserNotifier_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDStreamParserNotifier?> =
        arrayOfNulls<INDStreamParserNotifier_Impl>(size) as Array<INDStreamParserNotifier?>
  }
}
