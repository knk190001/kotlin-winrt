package Windows.Security.EnterpriseData

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

@ABIMarker(ThreadNetworkContext.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.ThreadNetworkContext;{fa4ea8e9-ef13-405a-b12c-d7348c6f41fc})")
@WinRTByReference(brClass = ThreadNetworkContext.ByReference::class)
public class ThreadNetworkContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IThreadNetworkContext.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __643500442_Interface: IThreadNetworkContext.WithDefault by lazy {
    as_643500442()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __643500442_Ptr: JNAPointer? by lazy {
    __643500442_Interface.__643500442_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__643500442_Interface, __1260617006_Interface)

  private fun as_643500442(): IThreadNetworkContext.WithDefault {
    if(pointer == NULL) {
      return(IThreadNetworkContext.ABI.makeIThreadNetworkContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThreadNetworkContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThreadNetworkContext.ABI.makeIThreadNetworkContext(ref.value))
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
      IByReference<ThreadNetworkContext> {
    public override fun getValue() = ThreadNetworkContext(pointer.getPointer(0))

    public fun setValue(value: ThreadNetworkContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ThreadNetworkContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ThreadNetworkContext {
      val address = segment.toRawLongValue()
      return ThreadNetworkContext(Pointer(address))
    }

    public override fun toNative(obj: ThreadNetworkContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
