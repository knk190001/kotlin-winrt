package Windows.Phone.Management.Deployment

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

@ABIMarker(Enterprise.ABI::class)
@Signature("rc(Windows.Phone.Management.Deployment.Enterprise;{96592f8d-856c-4426-a947-b06307718078})")
@WinRTByReference(brClass = Enterprise.ByReference::class)
public class Enterprise(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnterprise.WithDefault, IWinRTObject {
  private val __140789819_Interface: IEnterprise.WithDefault by lazy {
    as_140789819()
  }


  public override val __140789819_Ptr: JNAPointer? by lazy {
    __140789819_Interface.__140789819_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__140789819_Interface)

  private fun as_140789819(): IEnterprise.WithDefault {
    if(pointer == NULL) {
      return(IEnterprise.ABI.makeIEnterprise(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnterprise>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnterprise.ABI.makeIEnterprise(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Enterprise> {
    public override fun getValue() = Enterprise(pointer.getPointer(0))

    public fun setValue(value: Enterprise): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Enterprise, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Enterprise {
      val address = segment.toRawLongValue()
      return Enterprise(Pointer(address))
    }

    public override fun toNative(obj: Enterprise): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
