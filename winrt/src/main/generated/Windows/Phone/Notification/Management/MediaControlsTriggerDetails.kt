package Windows.Phone.Notification.Management

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaControlsTriggerDetails.ABI::class)
@Signature("rc(Windows.Phone.Notification.Management.MediaControlsTriggerDetails;{fab4648b-ae45-4548-91ca-4ab0548e33b5})")
@WinRTByReference(brClass = MediaControlsTriggerDetails.ByReference::class)
public class MediaControlsTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaControlsTriggerDetails.WithDefault,
    IAccessoryNotificationTriggerDetails.WithDefault, IWinRTObject {
  private val __262473610_Interface: IMediaControlsTriggerDetails.WithDefault by lazy {
    as_262473610()
  }


  private val __1414915993_Interface: IAccessoryNotificationTriggerDetails.WithDefault by lazy {
    as_1414915993()
  }


  public override val __262473610_Ptr: JNAPointer? by lazy {
    __262473610_Interface.__262473610_Ptr
  }


  public override val __1414915993_Ptr: JNAPointer? by lazy {
    __1414915993_Interface.__1414915993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__262473610_Interface, __1414915993_Interface)

  private fun as_262473610(): IMediaControlsTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IMediaControlsTriggerDetails.ABI.makeIMediaControlsTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaControlsTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaControlsTriggerDetails.ABI.makeIMediaControlsTriggerDetails(ref.value))
  }

  private fun as_1414915993(): IAccessoryNotificationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IAccessoryNotificationTriggerDetails.ABI.makeIAccessoryNotificationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAccessoryNotificationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAccessoryNotificationTriggerDetails.ABI.makeIAccessoryNotificationTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaControlsTriggerDetails> {
    public override fun getValue() = MediaControlsTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: MediaControlsTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaControlsTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaControlsTriggerDetails {
      val address = segment.toRawLongValue()
      return MediaControlsTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: MediaControlsTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
