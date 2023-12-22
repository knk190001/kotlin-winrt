package Windows.Management.Policies

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

@ABIMarker(NamedPolicyData.ABI::class)
@Signature("rc(Windows.Management.Policies.NamedPolicyData;{38dcb198-95ac-4077-a643-8078cae26400})")
@WinRTByReference(brClass = NamedPolicyData.ByReference::class)
public class NamedPolicyData(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INamedPolicyData.WithDefault, IWinRTObject {
  private val __893361948_Interface: INamedPolicyData.WithDefault by lazy {
    as_893361948()
  }


  public override val __893361948_Ptr: JNAPointer? by lazy {
    __893361948_Interface.__893361948_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__893361948_Interface)

  private fun as_893361948(): INamedPolicyData.WithDefault {
    if(pointer == NULL) {
      return(INamedPolicyData.ABI.makeINamedPolicyData(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INamedPolicyData>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INamedPolicyData.ABI.makeINamedPolicyData(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NamedPolicyData> {
    public override fun getValue() = NamedPolicyData(pointer.getPointer(0))

    public fun setValue(value: NamedPolicyData): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NamedPolicyData, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NamedPolicyData {
      val address = segment.toRawLongValue()
      return NamedPolicyData(Pointer(address))
    }

    public override fun toNative(obj: NamedPolicyData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
