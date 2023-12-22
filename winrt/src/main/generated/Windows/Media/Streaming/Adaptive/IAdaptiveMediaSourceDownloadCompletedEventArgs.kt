package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IReference
import Windows.Foundation.Uri
import Windows.Web.Http.HttpResponseMessage
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

@ABIMarker(IAdaptiveMediaSourceDownloadCompletedEventArgs.ABI::class)
@Signature("{19240dc3-5b37-4a1a-8970-d621cb6ca83b}")
@Guid("19240dc35b374a1a8970d621cb6ca83b")
@WinRTInterface("19240dc35b374a1a8970d621cb6ca83b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadCompletedEventArgs.ByReference::class)
public interface IAdaptiveMediaSourceDownloadCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceType(): AdaptiveMediaSourceResourceType?

  @InterfaceMethod(1)
  public fun get_ResourceUri(): Uri?

  @InterfaceMethod(2)
  public fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>?

  @InterfaceMethod(3)
  public fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>?

  @InterfaceMethod(4)
  public fun get_HttpResponseMessage(): HttpResponseMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadCompletedEventArgs {
    public val __1758345003_Ptr: Pointer?

    public val _1758345003_VtblPtr: Pointer?
      get() = __1758345003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceType(): AdaptiveMediaSourceResourceType? {
      val fnPtr = _1758345003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceResourceType>()
      val hr = fn.invokeHR(arrayOf(__1758345003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceResourceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResourceUri(): Uri? {
      val fnPtr = _1758345003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1758345003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>? {
      val fnPtr = _1758345003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1758345003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>? {
      val fnPtr = _1758345003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1758345003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HttpResponseMessage(): HttpResponseMessage? {
      val fnPtr = _1758345003_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__1758345003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDownloadCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1758345003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("19240dc35b374a1a8970d621cb6ca83b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadCompletedEventArgs(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDownloadCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadCompletedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1758345003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadCompletedEventArgs):
        Array<IAdaptiveMediaSourceDownloadCompletedEventArgs?> = (elements as
        Array<IAdaptiveMediaSourceDownloadCompletedEventArgs?>).castToImpl<IAdaptiveMediaSourceDownloadCompletedEventArgs,IAdaptiveMediaSourceDownloadCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadCompletedEventArgs?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadCompletedEventArgs_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadCompletedEventArgs?>
  }
}
