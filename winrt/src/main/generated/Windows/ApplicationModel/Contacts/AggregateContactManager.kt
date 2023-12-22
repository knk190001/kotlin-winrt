package Windows.ApplicationModel.Contacts

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

@ABIMarker(AggregateContactManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Contacts.AggregateContactManager;{0379d5dd-db5a-4fd3-b54e-4df17917a212})")
@WinRTByReference(brClass = AggregateContactManager.ByReference::class)
public class AggregateContactManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAggregateContactManager.WithDefault, IAggregateContactManager2.WithDefault,
    IWinRTObject {
  private val __293093536_Interface: IAggregateContactManager.WithDefault by lazy {
    as_293093536()
  }


  private val __495965074_Interface: IAggregateContactManager2.WithDefault by lazy {
    as_495965074()
  }


  public override val __293093536_Ptr: JNAPointer? by lazy {
    __293093536_Interface.__293093536_Ptr
  }


  public override val __495965074_Ptr: JNAPointer? by lazy {
    __495965074_Interface.__495965074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__293093536_Interface, __495965074_Interface)

  private fun as_293093536(): IAggregateContactManager.WithDefault {
    if(pointer == NULL) {
      return(IAggregateContactManager.ABI.makeIAggregateContactManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAggregateContactManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAggregateContactManager.ABI.makeIAggregateContactManager(ref.value))
  }

  private fun as_495965074(): IAggregateContactManager2.WithDefault {
    if(pointer == NULL) {
      return(IAggregateContactManager2.ABI.makeIAggregateContactManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAggregateContactManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAggregateContactManager2.ABI.makeIAggregateContactManager2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AggregateContactManager> {
    public override fun getValue() = AggregateContactManager(pointer.getPointer(0))

    public fun setValue(value: AggregateContactManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AggregateContactManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AggregateContactManager {
      val address = segment.toRawLongValue()
      return AggregateContactManager(Pointer(address))
    }

    public override fun toNative(obj: AggregateContactManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
