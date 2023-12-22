package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneCallHistoryEntryReader.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader;{61ece4be-8d86-479f-8404-a9846920fee6})")
@WinRTByReference(brClass = PhoneCallHistoryEntryReader.ByReference::class)
public class PhoneCallHistoryEntryReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallHistoryEntryReader.WithDefault, IWinRTObject {
  private val __2044318575_Interface: IPhoneCallHistoryEntryReader.WithDefault by lazy {
    as_2044318575()
  }


  public override val __2044318575_Ptr: JNAPointer? by lazy {
    __2044318575_Interface.__2044318575_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2044318575_Interface)

  private fun as_2044318575(): IPhoneCallHistoryEntryReader.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallHistoryEntryReader.ABI.makeIPhoneCallHistoryEntryReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallHistoryEntryReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallHistoryEntryReader.ABI.makeIPhoneCallHistoryEntryReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryEntryReader> {
    public override fun getValue() = PhoneCallHistoryEntryReader(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryEntryReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryEntryReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryEntryReader {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryEntryReader(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryEntryReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
