package Windows.Networking.NetworkOperators

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

@ABIMarker(ESim.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESim;{6f6e6e26-f123-437d-8ced-dc1d2bc0c3a9})")
@WinRTByReference(brClass = ESim.ByReference::class)
public class ESim(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESim.WithDefault, IESim2.WithDefault, IWinRTObject {
  private val __1683653717_Interface: IESim.WithDefault by lazy {
    as_1683653717()
  }


  private val __653657625_Interface: IESim2.WithDefault by lazy {
    as_653657625()
  }


  public override val __1683653717_Ptr: JNAPointer? by lazy {
    __1683653717_Interface.__1683653717_Ptr
  }


  public override val __653657625_Ptr: JNAPointer? by lazy {
    __653657625_Interface.__653657625_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1683653717_Interface, __653657625_Interface)

  private fun as_1683653717(): IESim.WithDefault {
    if(pointer == NULL) {
      return(IESim.ABI.makeIESim(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESim>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESim.ABI.makeIESim(ref.value))
  }

  private fun as_653657625(): IESim2.WithDefault {
    if(pointer == NULL) {
      return(IESim2.ABI.makeIESim2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESim2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESim2.ABI.makeIESim2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ESim> {
    public override fun getValue() = ESim(pointer.getPointer(0))

    public fun setValue(value: ESim): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESim, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESim {
      val address = segment.toRawLongValue()
      return ESim(Pointer(address))
    }

    public override fun toNative(obj: ESim): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
