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

@ABIMarker(ToastCollectionManager.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastCollectionManager;{2a1821fe-179d-49bc-b79d-a527920d3665})")
@WinRTByReference(brClass = ToastCollectionManager.ByReference::class)
public class ToastCollectionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastCollectionManager.WithDefault, IWinRTObject {
  private val __536832056_Interface: IToastCollectionManager.WithDefault by lazy {
    as_536832056()
  }


  public override val __536832056_Ptr: JNAPointer? by lazy {
    __536832056_Interface.__536832056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__536832056_Interface)

  private fun as_536832056(): IToastCollectionManager.WithDefault {
    if(pointer == NULL) {
      return(IToastCollectionManager.ABI.makeIToastCollectionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastCollectionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastCollectionManager.ABI.makeIToastCollectionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastCollectionManager> {
    public override fun getValue() = ToastCollectionManager(pointer.getPointer(0))

    public fun setValue(value: ToastCollectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastCollectionManager, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ToastCollectionManager {
      val address = segment.toRawLongValue()
      return ToastCollectionManager(Pointer(address))
    }

    public override fun toNative(obj: ToastCollectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
