package Windows.ApplicationModel.Background

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

@ABIMarker(ApplicationTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.ApplicationTriggerDetails;{97dc6ab2-2219-4a9e-9c5e-41d047f76e82})")
@WinRTByReference(brClass = ApplicationTriggerDetails.ByReference::class)
public class ApplicationTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationTriggerDetails.WithDefault, IWinRTObject {
  private val __743912969_Interface: IApplicationTriggerDetails.WithDefault by lazy {
    as_743912969()
  }


  public override val __743912969_Ptr: JNAPointer? by lazy {
    __743912969_Interface.__743912969_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__743912969_Interface)

  private fun as_743912969(): IApplicationTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IApplicationTriggerDetails.ABI.makeIApplicationTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationTriggerDetails.ABI.makeIApplicationTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationTriggerDetails> {
    public override fun getValue() = ApplicationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ApplicationTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ApplicationTriggerDetails {
      val address = segment.toRawLongValue()
      return ApplicationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ApplicationTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
