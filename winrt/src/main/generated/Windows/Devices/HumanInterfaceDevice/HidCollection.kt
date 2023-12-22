package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidCollection.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidCollection;{7189f5a3-32f1-46e3-befd-44d2663b7e6a})")
@WinRTByReference(brClass = HidCollection.ByReference::class)
public class HidCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidCollection.WithDefault, IWinRTObject {
  private val __14585706_Interface: IHidCollection.WithDefault by lazy {
    as_14585706()
  }


  public override val __14585706_Ptr: JNAPointer? by lazy {
    __14585706_Interface.__14585706_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__14585706_Interface)

  private fun as_14585706(): IHidCollection.WithDefault {
    if(pointer == NULL) {
      return(IHidCollection.ABI.makeIHidCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidCollection.ABI.makeIHidCollection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HidCollection>
      {
    public override fun getValue() = HidCollection(pointer.getPointer(0))

    public fun setValue(value: HidCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidCollection {
      val address = segment.toRawLongValue()
      return HidCollection(Pointer(address))
    }

    public override fun toNative(obj: HidCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
