package Windows.Devices.Display.Core

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

@ABIMarker(DisplayTaskPool.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayTaskPool;{c676253d-237d-5548-aafa-3e517fefef1c})")
@WinRTByReference(brClass = DisplayTaskPool.ByReference::class)
public class DisplayTaskPool(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayTaskPool.WithDefault, IDisplayTaskPool2.WithDefault, IWinRTObject {
  private val __69694049_Interface: IDisplayTaskPool.WithDefault by lazy {
    as_69694049()
  }


  private val __2134451727_Interface: IDisplayTaskPool2.WithDefault by lazy {
    as_2134451727()
  }


  public override val __69694049_Ptr: JNAPointer? by lazy {
    __69694049_Interface.__69694049_Ptr
  }


  public override val __2134451727_Ptr: JNAPointer? by lazy {
    __2134451727_Interface.__2134451727_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__69694049_Interface, __2134451727_Interface)

  private fun as_69694049(): IDisplayTaskPool.WithDefault {
    if(pointer == NULL) {
      return(IDisplayTaskPool.ABI.makeIDisplayTaskPool(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayTaskPool>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayTaskPool.ABI.makeIDisplayTaskPool(ref.value))
  }

  private fun as_2134451727(): IDisplayTaskPool2.WithDefault {
    if(pointer == NULL) {
      return(IDisplayTaskPool2.ABI.makeIDisplayTaskPool2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayTaskPool2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayTaskPool2.ABI.makeIDisplayTaskPool2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayTaskPool> {
    public override fun getValue() = DisplayTaskPool(pointer.getPointer(0))

    public fun setValue(value: DisplayTaskPool): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayTaskPool, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DisplayTaskPool {
      val address = segment.toRawLongValue()
      return DisplayTaskPool(Pointer(address))
    }

    public override fun toNative(obj: DisplayTaskPool): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
