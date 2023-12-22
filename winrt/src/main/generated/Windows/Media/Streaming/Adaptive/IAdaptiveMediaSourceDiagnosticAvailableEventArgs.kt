package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IAdaptiveMediaSourceDiagnosticAvailableEventArgs.ABI::class)
@Signature("{3af64f06-6d9c-494a-b7a9-b3a5dee6ad68}")
@Guid("3af64f066d9c494ab7a9b3a5dee6ad68")
@WinRTInterface("3af64f066d9c494ab7a9b3a5dee6ad68")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDiagnosticAvailableEventArgs.ByReference::class)
public interface IAdaptiveMediaSourceDiagnosticAvailableEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DiagnosticType(): AdaptiveMediaSourceDiagnosticType?

  @InterfaceMethod(1)
  public fun get_RequestId(): IReference<Int>?

  @InterfaceMethod(2)
  public fun get_Position(): IReference<TimeSpan?>?

  @InterfaceMethod(3)
  public fun get_SegmentId(): IReference<WinDef.ULONG>?

  @InterfaceMethod(4)
  public fun get_ResourceType(): IReference<AdaptiveMediaSourceResourceType?>?

  @InterfaceMethod(5)
  public fun get_ResourceUri(): Uri?

  @InterfaceMethod(6)
  public fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>?

  @InterfaceMethod(7)
  public fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>?

  @InterfaceMethod(8)
  public fun get_Bitrate(): IReference<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDiagnosticAvailableEventArgs> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDiagnosticAvailableEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDiagnosticAvailableEventArgs {
    public val __1648895988_Ptr: Pointer?

    public val _1648895988_VtblPtr: Pointer?
      get() = __1648895988_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DiagnosticType(): AdaptiveMediaSourceDiagnosticType? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSourceDiagnosticType>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSourceDiagnosticType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestId(): IReference<Int>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Int>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Position(): IReference<TimeSpan?>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SegmentId(): IReference<WinDef.ULONG>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ResourceType(): IReference<AdaptiveMediaSourceResourceType?>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<AdaptiveMediaSourceResourceType?>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IReference<AdaptiveMediaSourceResourceType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ResourceUri(): Uri? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Bitrate(): IReference<WinDef.UINT>? {
      val fnPtr = _1648895988_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1648895988_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDiagnosticAvailableEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1648895988_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDiagnosticAvailableEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3af64f066d9c494ab7a9b3a5dee6ad68")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDiagnosticAvailableEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDiagnosticAvailableEventArgs {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDiagnosticAvailableEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1648895988_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDiagnosticAvailableEventArgs):
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs?> = (elements as
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs?>).castToImpl<IAdaptiveMediaSourceDiagnosticAvailableEventArgs,IAdaptiveMediaSourceDiagnosticAvailableEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs?>
        = arrayOfNulls<IAdaptiveMediaSourceDiagnosticAvailableEventArgs_Impl>(size) as
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs?>
  }
}
