package Windows.UI.Core

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

@ABIMarker(CoreDispatcher.ABI::class)
@Signature("rc(Windows.UI.Core.CoreDispatcher;{60db2fa8-b705-4fde-a7d6-ebbb1891d39e})")
@WinRTByReference(brClass = CoreDispatcher.ByReference::class)
public class CoreDispatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreDispatcher.WithDefault, ICoreAcceleratorKeys.WithDefault,
    ICoreDispatcherWithTaskPriority.WithDefault, ICoreDispatcher2.WithDefault, IWinRTObject {
  private val __783079489_Interface: ICoreDispatcher.WithDefault by lazy {
    as_783079489()
  }


  private val __1776875099_Interface: ICoreAcceleratorKeys.WithDefault by lazy {
    as_1776875099()
  }


  private val __1263944848_Interface: ICoreDispatcherWithTaskPriority.WithDefault by lazy {
    as_1263944848()
  }


  private val __1494339567_Interface: ICoreDispatcher2.WithDefault by lazy {
    as_1494339567()
  }


  public override val __783079489_Ptr: JNAPointer? by lazy {
    __783079489_Interface.__783079489_Ptr
  }


  public override val __1776875099_Ptr: JNAPointer? by lazy {
    __1776875099_Interface.__1776875099_Ptr
  }


  public override val __1263944848_Ptr: JNAPointer? by lazy {
    __1263944848_Interface.__1263944848_Ptr
  }


  public override val __1494339567_Ptr: JNAPointer? by lazy {
    __1494339567_Interface.__1494339567_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__783079489_Interface, __1776875099_Interface, __1263944848_Interface,
        __1494339567_Interface)

  private fun as_783079489(): ICoreDispatcher.WithDefault {
    if(pointer == NULL) {
      return(ICoreDispatcher.ABI.makeICoreDispatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDispatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDispatcher.ABI.makeICoreDispatcher(ref.value))
  }

  private fun as_1776875099(): ICoreAcceleratorKeys.WithDefault {
    if(pointer == NULL) {
      return(ICoreAcceleratorKeys.ABI.makeICoreAcceleratorKeys(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreAcceleratorKeys>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreAcceleratorKeys.ABI.makeICoreAcceleratorKeys(ref.value))
  }

  private fun as_1263944848(): ICoreDispatcherWithTaskPriority.WithDefault {
    if(pointer == NULL) {
      return(ICoreDispatcherWithTaskPriority.ABI.makeICoreDispatcherWithTaskPriority(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDispatcherWithTaskPriority>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDispatcherWithTaskPriority.ABI.makeICoreDispatcherWithTaskPriority(ref.value))
  }

  private fun as_1494339567(): ICoreDispatcher2.WithDefault {
    if(pointer == NULL) {
      return(ICoreDispatcher2.ABI.makeICoreDispatcher2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreDispatcher2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreDispatcher2.ABI.makeICoreDispatcher2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CoreDispatcher>
      {
    public override fun getValue() = CoreDispatcher(pointer.getPointer(0))

    public fun setValue(value: CoreDispatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreDispatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreDispatcher {
      val address = segment.toRawLongValue()
      return CoreDispatcher(Pointer(address))
    }

    public override fun toNative(obj: CoreDispatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
