package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynAboutData.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynAboutData;{e5a9bf00-1fa2-4839-93ef-f9df404890f7})")
@WinRTByReference(brClass = AllJoynAboutData.ByReference::class)
public class AllJoynAboutData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynAboutData.WithDefault, IWinRTObject {
  private val __569879418_Interface: IAllJoynAboutData.WithDefault by lazy {
    as_569879418()
  }


  public override val __569879418_Ptr: JNAPointer? by lazy {
    __569879418_Interface.__569879418_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__569879418_Interface)

  private fun as_569879418(): IAllJoynAboutData.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynAboutData.ABI.makeIAllJoynAboutData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynAboutData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynAboutData.ABI.makeIAllJoynAboutData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynAboutData> {
    public override fun getValue() = AllJoynAboutData(pointer.getPointer(0))

    public fun setValue(value: AllJoynAboutData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynAboutData, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AllJoynAboutData {
      val address = segment.toRawLongValue()
      return AllJoynAboutData(Pointer(address))
    }

    public override fun toNative(obj: AllJoynAboutData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
