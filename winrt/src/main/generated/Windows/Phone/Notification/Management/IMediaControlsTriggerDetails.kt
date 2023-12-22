package Windows.Phone.Notification.Management

import Windows.Phone.Notification.Management.IAccessoryNotificationTriggerDetails.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaControlsTriggerDetails.ABI::class)
@Signature("{fab4648b-ae45-4548-91ca-4ab0548e33b5}")
@Guid("fab4648bae45454891ca4ab0548e33b5")
@WinRTInterface("fab4648bae45454891ca4ab0548e33b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaControlsTriggerDetails.ByReference::class)
public interface IMediaControlsTriggerDetails : NativeMapped, IWinRTInterface,
    IAccessoryNotificationTriggerDetails {
  @InterfaceMethod(0)
  public fun get_PlaybackStatus(): PlaybackStatus?

  @InterfaceMethod(1)
  public fun get_MediaMetadata(): MediaMetadata?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaControlsTriggerDetails> {
    public override fun getValue() = ABI.makeIMediaControlsTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IMediaControlsTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaControlsTriggerDetails,
      IAccessoryNotificationTriggerDetails.WithDefault {
    public val __262473610_Ptr: Pointer?

    public val _262473610_VtblPtr: Pointer?
      get() = __262473610_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackStatus(): PlaybackStatus? {
      val fnPtr = _262473610_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlaybackStatus>()
      val hr = fn.invokeHR(arrayOf(__262473610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlaybackStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaMetadata(): MediaMetadata? {
      val fnPtr = _262473610_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaMetadata>()
      val hr = fn.invokeHR(arrayOf(__262473610_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaMetadata>(result.getValue())
      return resultValue
    }
  }

  public class IMediaControlsTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAccessoryNotificationTriggerDetails {
    public override val __1414915993_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_262473610_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __262473610_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaControlsTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fab4648bae45454891ca4ab0548e33b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaControlsTriggerDetails(ptr: Pointer?): WithDefault =
        IMediaControlsTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaControlsTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIMediaControlsTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IMediaControlsTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__262473610_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaControlsTriggerDetails):
        Array<IMediaControlsTriggerDetails?> = (elements as
        Array<IMediaControlsTriggerDetails?>).castToImpl<IMediaControlsTriggerDetails,IMediaControlsTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaControlsTriggerDetails?> =
        arrayOfNulls<IMediaControlsTriggerDetails_Impl>(size) as
        Array<IMediaControlsTriggerDetails?>
  }
}
