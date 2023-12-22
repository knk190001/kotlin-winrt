package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentAction.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentAction;{d75b691e-6cd6-4ca0-9d8f-4728b0b7e6b6})")
@WinRTByReference(brClass = TargetedContentAction.ByReference::class)
public class TargetedContentAction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentAction.WithDefault, IWinRTObject {
  private val __651185094_Interface: ITargetedContentAction.WithDefault by lazy {
    as_651185094()
  }


  public override val __651185094_Ptr: JNAPointer? by lazy {
    __651185094_Interface.__651185094_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__651185094_Interface)

  private fun as_651185094(): ITargetedContentAction.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentAction.ABI.makeITargetedContentAction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentAction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentAction.ABI.makeITargetedContentAction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentAction> {
    public override fun getValue() = TargetedContentAction(pointer.getPointer(0))

    public fun setValue(value: TargetedContentAction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentAction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentAction {
      val address = segment.toRawLongValue()
      return TargetedContentAction(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
