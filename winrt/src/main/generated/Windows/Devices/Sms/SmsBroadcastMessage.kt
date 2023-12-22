package Windows.Devices.Sms

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

@ABIMarker(SmsBroadcastMessage.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsBroadcastMessage;{75aebbf1-e4b7-4874-a09c-2956e592f957})")
@WinRTByReference(brClass = SmsBroadcastMessage.ByReference::class)
public class SmsBroadcastMessage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsBroadcastMessage.WithDefault, ISmsMessageBase.WithDefault, IWinRTObject {
  private val __651281037_Interface: ISmsBroadcastMessage.WithDefault by lazy {
    as_651281037()
  }


  private val __1120832021_Interface: ISmsMessageBase.WithDefault by lazy {
    as_1120832021()
  }


  public override val __651281037_Ptr: JNAPointer? by lazy {
    __651281037_Interface.__651281037_Ptr
  }


  public override val __1120832021_Ptr: JNAPointer? by lazy {
    __1120832021_Interface.__1120832021_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__651281037_Interface, __1120832021_Interface)

  private fun as_651281037(): ISmsBroadcastMessage.WithDefault {
    if(pointer == NULL) {
      return(ISmsBroadcastMessage.ABI.makeISmsBroadcastMessage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsBroadcastMessage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsBroadcastMessage.ABI.makeISmsBroadcastMessage(ref.value))
  }

  private fun as_1120832021(): ISmsMessageBase.WithDefault {
    if(pointer == NULL) {
      return(ISmsMessageBase.ABI.makeISmsMessageBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsMessageBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsMessageBase.ABI.makeISmsMessageBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsBroadcastMessage> {
    public override fun getValue() = SmsBroadcastMessage(pointer.getPointer(0))

    public fun setValue(value: SmsBroadcastMessage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsBroadcastMessage, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsBroadcastMessage {
      val address = segment.toRawLongValue()
      return SmsBroadcastMessage(Pointer(address))
    }

    public override fun toNative(obj: SmsBroadcastMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
