package Windows.Services.Maps.Guidance

import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceAudioNotificationRequestedEventArgs.ABI::class)
@Signature("{ca2aa24a-c7c2-4d4c-9d7c-499576bceddb}")
@Guid("ca2aa24ac7c24d4c9d7c499576bceddb")
@WinRTInterface("ca2aa24ac7c24d4c9d7c499576bceddb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceAudioNotificationRequestedEventArgs.ByReference::class)
public interface IGuidanceAudioNotificationRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AudioNotification(): GuidanceAudioNotificationKind?

  @InterfaceMethod(1)
  public fun get_AudioFilePaths(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_AudioText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceAudioNotificationRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIGuidanceAudioNotificationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGuidanceAudioNotificationRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceAudioNotificationRequestedEventArgs {
    public val __494331475_Ptr: Pointer?

    public val _494331475_VtblPtr: Pointer?
      get() = __494331475_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioNotification(): GuidanceAudioNotificationKind? {
      val fnPtr = _494331475_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceAudioNotificationKind>()
      val hr = fn.invokeHR(arrayOf(__494331475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceAudioNotificationKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AudioFilePaths(): IVectorView<String?>? {
      val fnPtr = _494331475_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__494331475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AudioText(): String? {
      val fnPtr = _494331475_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__494331475_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceAudioNotificationRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __494331475_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceAudioNotificationRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca2aa24ac7c24d4c9d7c499576bceddb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceAudioNotificationRequestedEventArgs(ptr: Pointer?): WithDefault =
        IGuidanceAudioNotificationRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGuidanceAudioNotificationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGuidanceAudioNotificationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceAudioNotificationRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__494331475_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceAudioNotificationRequestedEventArgs):
        Array<IGuidanceAudioNotificationRequestedEventArgs?> = (elements as
        Array<IGuidanceAudioNotificationRequestedEventArgs?>).castToImpl<IGuidanceAudioNotificationRequestedEventArgs,IGuidanceAudioNotificationRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceAudioNotificationRequestedEventArgs?> =
        arrayOfNulls<IGuidanceAudioNotificationRequestedEventArgs_Impl>(size) as
        Array<IGuidanceAudioNotificationRequestedEventArgs?>
  }
}
