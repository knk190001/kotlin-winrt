package Windows.UI.Notifications

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

@ABIMarker(ShownTileNotification.ABI::class)
@Signature("rc(Windows.UI.Notifications.ShownTileNotification;{342d8988-5af2-481a-a6a3-f2fdc78de88e})")
@WinRTByReference(brClass = ShownTileNotification.ByReference::class)
public class ShownTileNotification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IShownTileNotification.WithDefault, IWinRTObject {
  private val __878333062_Interface: IShownTileNotification.WithDefault by lazy {
    as_878333062()
  }


  public override val __878333062_Ptr: JNAPointer? by lazy {
    __878333062_Interface.__878333062_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__878333062_Interface)

  private fun as_878333062(): IShownTileNotification.WithDefault {
    if(pointer == NULL) {
      return(IShownTileNotification.ABI.makeIShownTileNotification(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IShownTileNotification>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IShownTileNotification.ABI.makeIShownTileNotification(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ShownTileNotification> {
    public override fun getValue() = ShownTileNotification(pointer.getPointer(0))

    public fun setValue(value: ShownTileNotification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ShownTileNotification, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ShownTileNotification {
      val address = segment.toRawLongValue()
      return ShownTileNotification(Pointer(address))
    }

    public override fun toNative(obj: ShownTileNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
