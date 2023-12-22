package Windows.Networking.Connectivity

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

@ABIMarker(IPInformation.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.IPInformation;{d85145e0-138f-47d7-9b3a-36bb488cef33})")
@WinRTByReference(brClass = IPInformation.ByReference::class)
public class IPInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIPInformation.WithDefault, IWinRTObject {
  private val __1939656002_Interface: IIPInformation.WithDefault by lazy {
    as_1939656002()
  }


  public override val __1939656002_Ptr: JNAPointer? by lazy {
    __1939656002_Interface.__1939656002_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1939656002_Interface)

  private fun as_1939656002(): IIPInformation.WithDefault {
    if(pointer == NULL) {
      return(IIPInformation.ABI.makeIIPInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIPInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIPInformation.ABI.makeIIPInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPInformation>
      {
    public override fun getValue() = IPInformation(pointer.getPointer(0))

    public fun setValue(value: IPInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IPInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IPInformation {
      val address = segment.toRawLongValue()
      return IPInformation(Pointer(address))
    }

    public override fun toNative(obj: IPInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
