package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IReference
import Windows.Foundation.Uri
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceDownloadRequestedEventArgs.ABI::class)
@Signature("{c83fdffd-44a9-47a2-bf96-03398b4bfaaf}")
@Guid("c83fdffd44a947a2bf9603398b4bfaaf")
@WinRTInterface("c83fdffd44a947a2bf9603398b4bfaaf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadRequestedEventArgs.ByReference::class)
public interface IAdaptiveMediaSourceDownloadRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceType(): AdaptiveMediaSourceResourceType?

  @InterfaceMethod(1)
  public fun get_ResourceUri(): Uri?

  @InterfaceMethod(2)
  public fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>?

  @InterfaceMethod(3)
  public fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>?

  @InterfaceMethod(4)
  public fun get_Result(): AdaptiveMediaSourceDownloadResult?

  @InterfaceMethod(5)
  public fun GetDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadRequestedEventArgs {
    public val __329110168_Ptr: Pointer?

    public val _329110168_VtblPtr: Pointer?
      get() = __329110168_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceType(): AdaptiveMediaSourceResourceType? {
      val fnPtr = _329110168_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceResourceType>()
      val hr = fn.invokeHR(arrayOf(__329110168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceResourceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResourceUri(): Uri? {
      val fnPtr = _329110168_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__329110168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>? {
      val fnPtr = _329110168_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__329110168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>? {
      val fnPtr = _329110168_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__329110168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Result(): AdaptiveMediaSourceDownloadResult? {
      val fnPtr = _329110168_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceDownloadResult>()
      val hr = fn.invokeHR(arrayOf(__329110168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceDownloadResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetDeferral(): AdaptiveMediaSourceDownloadRequestedDeferral? {
      val fnPtr = _329110168_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceDownloadRequestedDeferral>()
      val hr = fn.invokeHR(arrayOf(__329110168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<AdaptiveMediaSourceDownloadRequestedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329110168_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c83fdffd44a947a2bf9603398b4bfaaf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDownloadRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329110168_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadRequestedEventArgs):
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs?> = (elements as
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs?>).castToImpl<IAdaptiveMediaSourceDownloadRequestedEventArgs,IAdaptiveMediaSourceDownloadRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadRequestedEventArgs?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadRequestedEventArgs_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadRequestedEventArgs?>
  }
}
