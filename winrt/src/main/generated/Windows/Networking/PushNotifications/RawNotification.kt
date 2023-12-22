package Windows.Networking.PushNotifications

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

@ABIMarker(RawNotification.ABI::class)
@Signature("rc(Windows.Networking.PushNotifications.RawNotification;{1a227281-3b79-42ac-9963-22ab00d4f0b7})")
@WinRTByReference(brClass = RawNotification.ByReference::class)
public class RawNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRawNotification.WithDefault, IRawNotification2.WithDefault,
    IRawNotification3.WithDefault, IWinRTObject {
  private val __1761910071_Interface: IRawNotification.WithDefault by lazy {
    as_1761910071()
  }


  private val __1215362697_Interface: IRawNotification2.WithDefault by lazy {
    as_1215362697()
  }


  private val __1215362698_Interface: IRawNotification3.WithDefault by lazy {
    as_1215362698()
  }


  public override val __1761910071_Ptr: JNAPointer? by lazy {
    __1761910071_Interface.__1761910071_Ptr
  }


  public override val __1215362697_Ptr: JNAPointer? by lazy {
    __1215362697_Interface.__1215362697_Ptr
  }


  public override val __1215362698_Ptr: JNAPointer? by lazy {
    __1215362698_Interface.__1215362698_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1761910071_Interface, __1215362697_Interface, __1215362698_Interface)

  private fun as_1761910071(): IRawNotification.WithDefault {
    if(pointer == NULL) {
      return(IRawNotification.ABI.makeIRawNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRawNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRawNotification.ABI.makeIRawNotification(ref.value))
  }

  private fun as_1215362697(): IRawNotification2.WithDefault {
    if(pointer == NULL) {
      return(IRawNotification2.ABI.makeIRawNotification2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRawNotification2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRawNotification2.ABI.makeIRawNotification2(ref.value))
  }

  private fun as_1215362698(): IRawNotification3.WithDefault {
    if(pointer == NULL) {
      return(IRawNotification3.ABI.makeIRawNotification3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRawNotification3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRawNotification3.ABI.makeIRawNotification3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RawNotification> {
    public override fun getValue() = RawNotification(pointer.getPointer(0))

    public fun setValue(value: RawNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RawNotification, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RawNotification {
      val address = segment.toRawLongValue()
      return RawNotification(Pointer(address))
    }

    public override fun toNative(obj: RawNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
