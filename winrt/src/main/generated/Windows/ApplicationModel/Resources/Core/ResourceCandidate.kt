package Windows.ApplicationModel.Resources.Core

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

@ABIMarker(ResourceCandidate.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceCandidate;{af5207d9-c433-4764-b3fd-8fa6bfbcbadc})")
@WinRTByReference(brClass = ResourceCandidate.ByReference::class)
public class ResourceCandidate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceCandidate.WithDefault, IResourceCandidate2.WithDefault,
    IResourceCandidate3.WithDefault, IWinRTObject {
  private val __1876310914_Interface: IResourceCandidate.WithDefault by lazy {
    as_1876310914()
  }


  private val __1963903860_Interface: IResourceCandidate2.WithDefault by lazy {
    as_1963903860()
  }


  private val __1963903861_Interface: IResourceCandidate3.WithDefault by lazy {
    as_1963903861()
  }


  public override val __1876310914_Ptr: JNAPointer? by lazy {
    __1876310914_Interface.__1876310914_Ptr
  }


  public override val __1963903860_Ptr: JNAPointer? by lazy {
    __1963903860_Interface.__1963903860_Ptr
  }


  public override val __1963903861_Ptr: JNAPointer? by lazy {
    __1963903861_Interface.__1963903861_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1876310914_Interface, __1963903860_Interface, __1963903861_Interface)

  private fun as_1876310914(): IResourceCandidate.WithDefault {
    if(pointer == NULL) {
      return(IResourceCandidate.ABI.makeIResourceCandidate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceCandidate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceCandidate.ABI.makeIResourceCandidate(ref.value))
  }

  private fun as_1963903860(): IResourceCandidate2.WithDefault {
    if(pointer == NULL) {
      return(IResourceCandidate2.ABI.makeIResourceCandidate2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceCandidate2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceCandidate2.ABI.makeIResourceCandidate2(ref.value))
  }

  private fun as_1963903861(): IResourceCandidate3.WithDefault {
    if(pointer == NULL) {
      return(IResourceCandidate3.ABI.makeIResourceCandidate3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceCandidate3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceCandidate3.ABI.makeIResourceCandidate3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceCandidate> {
    public override fun getValue() = ResourceCandidate(pointer.getPointer(0))

    public fun setValue(value: ResourceCandidate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceCandidate, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceCandidate {
      val address = segment.toRawLongValue()
      return ResourceCandidate(Pointer(address))
    }

    public override fun toNative(obj: ResourceCandidate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
