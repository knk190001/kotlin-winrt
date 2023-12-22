package Windows.Media.Protection

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

@ABIMarker(ServiceRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Protection.ServiceRequestedEventArgs;{34283baf-abb4-4fc1-bd89-93f106573a49})")
@WinRTByReference(brClass = ServiceRequestedEventArgs.ByReference::class)
public class ServiceRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IServiceRequestedEventArgs.WithDefault,
    IServiceRequestedEventArgs2.WithDefault, IWinRTObject {
  private val __1679242205_Interface: IServiceRequestedEventArgs.WithDefault by lazy {
    as_1679242205()
  }


  private val __516900753_Interface: IServiceRequestedEventArgs2.WithDefault by lazy {
    as_516900753()
  }


  public override val __1679242205_Ptr: JNAPointer? by lazy {
    __1679242205_Interface.__1679242205_Ptr
  }


  public override val __516900753_Ptr: JNAPointer? by lazy {
    __516900753_Interface.__516900753_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1679242205_Interface, __516900753_Interface)

  private fun as_1679242205(): IServiceRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IServiceRequestedEventArgs.ABI.makeIServiceRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServiceRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServiceRequestedEventArgs.ABI.makeIServiceRequestedEventArgs(ref.value))
  }

  private fun as_516900753(): IServiceRequestedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IServiceRequestedEventArgs2.ABI.makeIServiceRequestedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IServiceRequestedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IServiceRequestedEventArgs2.ABI.makeIServiceRequestedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ServiceRequestedEventArgs> {
    public override fun getValue() = ServiceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ServiceRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ServiceRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ServiceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ServiceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ServiceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
