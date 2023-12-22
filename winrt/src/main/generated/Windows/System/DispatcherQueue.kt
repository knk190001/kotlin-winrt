package Windows.System

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(DispatcherQueue.ABI::class)
@Signature("rc(Windows.System.DispatcherQueue;{603e88e4-a338-4ffe-a457-a5cfb9ceb899})")
@WinRTByReference(brClass = DispatcherQueue.ByReference::class)
public class DispatcherQueue(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDispatcherQueue.WithDefault, IDispatcherQueue2.WithDefault, IWinRTObject {
  private val __755092315_Interface: IDispatcherQueue.WithDefault by lazy {
    as_755092315()
  }


  private val __1933025335_Interface: IDispatcherQueue2.WithDefault by lazy {
    as_1933025335()
  }


  public override val __755092315_Ptr: JNAPointer? by lazy {
    __755092315_Interface.__755092315_Ptr
  }


  public override val __1933025335_Ptr: JNAPointer? by lazy {
    __1933025335_Interface.__1933025335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__755092315_Interface, __1933025335_Interface)

  private fun as_755092315(): IDispatcherQueue.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueue.ABI.makeIDispatcherQueue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueue.ABI.makeIDispatcherQueue(ref.value))
  }

  private fun as_1933025335(): IDispatcherQueue2.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueue2.ABI.makeIDispatcherQueue2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueue2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueue2.ABI.makeIDispatcherQueue2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DispatcherQueue> {
    public override fun getValue() = DispatcherQueue(pointer.getPointer(0))

    public fun setValue(value: DispatcherQueue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DispatcherQueue, MemoryAddress> {
    public val IDispatcherQueueStatics_Instance: IDispatcherQueueStatics by lazy {
      createIDispatcherQueueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDispatcherQueueStatics(): IDispatcherQueueStatics {
      val refiid = Guid.REFIID(IDispatcherQueueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.DispatcherQueue".toHandle(),refiid,interfacePtr)
      val result = IDispatcherQueueStatics.ABI.makeIDispatcherQueueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DispatcherQueue {
      val address = segment.toRawLongValue()
      return DispatcherQueue(Pointer(address))
    }

    public override fun toNative(obj: DispatcherQueue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentThread() = ABI.IDispatcherQueueStatics_Instance.GetForCurrentThread()
  }
}
