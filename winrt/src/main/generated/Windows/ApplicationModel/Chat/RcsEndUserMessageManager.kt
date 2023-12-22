package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsEndUserMessageManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsEndUserMessageManager;{3054ae5a-4d1f-4b59-9433-126c734e86a6})")
@WinRTByReference(brClass = RcsEndUserMessageManager.ByReference::class)
public class RcsEndUserMessageManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsEndUserMessageManager.WithDefault, IWinRTObject {
  private val __396353489_Interface: IRcsEndUserMessageManager.WithDefault by lazy {
    as_396353489()
  }


  public override val __396353489_Ptr: JNAPointer? by lazy {
    __396353489_Interface.__396353489_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__396353489_Interface)

  private fun as_396353489(): IRcsEndUserMessageManager.WithDefault {
    if(pointer == NULL) {
      return(IRcsEndUserMessageManager.ABI.makeIRcsEndUserMessageManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsEndUserMessageManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsEndUserMessageManager.ABI.makeIRcsEndUserMessageManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsEndUserMessageManager> {
    public override fun getValue() = RcsEndUserMessageManager(pointer.getPointer(0))

    public fun setValue(value: RcsEndUserMessageManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsEndUserMessageManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RcsEndUserMessageManager {
      val address = segment.toRawLongValue()
      return RcsEndUserMessageManager(Pointer(address))
    }

    public override fun toNative(obj: RcsEndUserMessageManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
