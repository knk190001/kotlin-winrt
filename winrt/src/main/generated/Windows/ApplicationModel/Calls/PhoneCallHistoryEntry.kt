package Windows.ApplicationModel.Calls

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(PhoneCallHistoryEntry.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallHistoryEntry;{fab0e129-32a4-4b85-83d1-f90d8c23a857})")
@WinRTByReference(brClass = PhoneCallHistoryEntry.ByReference::class)
public class PhoneCallHistoryEntry(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallHistoryEntry.WithDefault, IWinRTObject {
  private val __1819305868_Interface: IPhoneCallHistoryEntry.WithDefault by lazy {
    as_1819305868()
  }


  public override val __1819305868_Ptr: JNAPointer? by lazy {
    __1819305868_Interface.__1819305868_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1819305868_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1819305868(): IPhoneCallHistoryEntry.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallHistoryEntry.ABI.makeIPhoneCallHistoryEntry(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallHistoryEntry>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallHistoryEntry.ABI.makeIPhoneCallHistoryEntry(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryEntry> {
    public override fun getValue() = PhoneCallHistoryEntry(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryEntry): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryEntry, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallHistoryEntry".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryEntry {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryEntry(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
