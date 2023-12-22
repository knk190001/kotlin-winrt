package Windows.Devices.Perception

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PerceptionInfraredFrameSource.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionInfraredFrameSource;{55b08742-1808-494e-9e30-9d2a7be8f700})")
@WinRTByReference(brClass = PerceptionInfraredFrameSource.ByReference::class)
public class PerceptionInfraredFrameSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionInfraredFrameSource.WithDefault,
    IPerceptionInfraredFrameSource2.WithDefault, IWinRTObject {
  private val __2007416838_Interface: IPerceptionInfraredFrameSource.WithDefault by lazy {
    as_2007416838()
  }


  private val __2100379784_Interface: IPerceptionInfraredFrameSource2.WithDefault by lazy {
    as_2100379784()
  }


  public override val __2007416838_Ptr: JNAPointer? by lazy {
    __2007416838_Interface.__2007416838_Ptr
  }


  public override val __2100379784_Ptr: JNAPointer? by lazy {
    __2100379784_Interface.__2100379784_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2007416838_Interface, __2100379784_Interface)

  private fun as_2007416838(): IPerceptionInfraredFrameSource.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrameSource.ABI.makeIPerceptionInfraredFrameSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrameSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrameSource.ABI.makeIPerceptionInfraredFrameSource(ref.value))
  }

  private fun as_2100379784(): IPerceptionInfraredFrameSource2.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionInfraredFrameSource2.ABI.makeIPerceptionInfraredFrameSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionInfraredFrameSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionInfraredFrameSource2.ABI.makeIPerceptionInfraredFrameSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionInfraredFrameSource> {
    public override fun getValue() = PerceptionInfraredFrameSource(pointer.getPointer(0))

    public fun setValue(value: PerceptionInfraredFrameSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionInfraredFrameSource, MemoryAddress> {
    public val IPerceptionInfraredFrameSourceStatics_Instance: IPerceptionInfraredFrameSourceStatics
        by lazy {
      createIPerceptionInfraredFrameSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionInfraredFrameSourceStatics():
        IPerceptionInfraredFrameSourceStatics {
      val refiid = Guid.REFIID(IPerceptionInfraredFrameSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.PerceptionInfraredFrameSource".toHandle(),refiid,interfacePtr)
      val result =
          IPerceptionInfraredFrameSourceStatics.ABI.makeIPerceptionInfraredFrameSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PerceptionInfraredFrameSource {
      val address = segment.toRawLongValue()
      return PerceptionInfraredFrameSource(Pointer(address))
    }

    public override fun toNative(obj: PerceptionInfraredFrameSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWatcher() = ABI.IPerceptionInfraredFrameSourceStatics_Instance.CreateWatcher()

    public fun FindAllAsync() = ABI.IPerceptionInfraredFrameSourceStatics_Instance.FindAllAsync()

    public fun FromIdAsync(id: String) =
        ABI.IPerceptionInfraredFrameSourceStatics_Instance.FromIdAsync(id)

    public fun RequestAccessAsync() =
        ABI.IPerceptionInfraredFrameSourceStatics_Instance.RequestAccessAsync()
  }
}
