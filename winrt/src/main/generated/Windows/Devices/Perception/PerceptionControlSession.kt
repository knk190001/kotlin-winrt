package Windows.Devices.Perception

import Windows.Foundation.IClosable
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

@ABIMarker(PerceptionControlSession.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionControlSession;{99998653-5a3d-417f-9239-f1889e548b48})")
@WinRTByReference(brClass = PerceptionControlSession.ByReference::class)
public class PerceptionControlSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionControlSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1817070342_Interface: IPerceptionControlSession.WithDefault by lazy {
    as_1817070342()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1817070342_Ptr: JNAPointer? by lazy {
    __1817070342_Interface.__1817070342_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1817070342_Interface, __1260617006_Interface)

  private fun as_1817070342(): IPerceptionControlSession.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionControlSession.ABI.makeIPerceptionControlSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionControlSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionControlSession.ABI.makeIPerceptionControlSession(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionControlSession> {
    public override fun getValue() = PerceptionControlSession(pointer.getPointer(0))

    public fun setValue(value: PerceptionControlSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionControlSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PerceptionControlSession {
      val address = segment.toRawLongValue()
      return PerceptionControlSession(Pointer(address))
    }

    public override fun toNative(obj: PerceptionControlSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
