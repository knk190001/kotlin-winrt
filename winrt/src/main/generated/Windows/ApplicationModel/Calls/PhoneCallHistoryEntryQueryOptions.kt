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

@ABIMarker(PhoneCallHistoryEntryQueryOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions;{9c5fe15c-8bed-40ca-b06e-c4ca8eae5c87})")
@WinRTByReference(brClass = PhoneCallHistoryEntryQueryOptions.ByReference::class)
public class PhoneCallHistoryEntryQueryOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneCallHistoryEntryQueryOptions.WithDefault, IWinRTObject {
  private val __2129600926_Interface: IPhoneCallHistoryEntryQueryOptions.WithDefault by lazy {
    as_2129600926()
  }


  public override val __2129600926_Ptr: JNAPointer? by lazy {
    __2129600926_Interface.__2129600926_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129600926_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2129600926(): IPhoneCallHistoryEntryQueryOptions.WithDefault {
    if(pointer == NULL) {
      return(IPhoneCallHistoryEntryQueryOptions.ABI.makeIPhoneCallHistoryEntryQueryOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneCallHistoryEntryQueryOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneCallHistoryEntryQueryOptions.ABI.makeIPhoneCallHistoryEntryQueryOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallHistoryEntryQueryOptions> {
    public override fun getValue() = PhoneCallHistoryEntryQueryOptions(pointer.getPointer(0))

    public fun setValue(value: PhoneCallHistoryEntryQueryOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallHistoryEntryQueryOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryQueryOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PhoneCallHistoryEntryQueryOptions {
      val address = segment.toRawLongValue()
      return PhoneCallHistoryEntryQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallHistoryEntryQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
