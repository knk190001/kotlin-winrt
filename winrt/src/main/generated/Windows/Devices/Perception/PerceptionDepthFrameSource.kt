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

@ABIMarker(PerceptionDepthFrameSource.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionDepthFrameSource;{79d433d6-47fb-4df1-bfc9-f01d40bd9942})")
@WinRTByReference(brClass = PerceptionDepthFrameSource.ByReference::class)
public class PerceptionDepthFrameSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionDepthFrameSource.WithDefault,
    IPerceptionDepthFrameSource2.WithDefault, IWinRTObject {
  private val __2001271182_Interface: IPerceptionDepthFrameSource.WithDefault by lazy {
    as_2001271182()
  }


  private val __1909864448_Interface: IPerceptionDepthFrameSource2.WithDefault by lazy {
    as_1909864448()
  }


  public override val __2001271182_Ptr: JNAPointer? by lazy {
    __2001271182_Interface.__2001271182_Ptr
  }


  public override val __1909864448_Ptr: JNAPointer? by lazy {
    __1909864448_Interface.__1909864448_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2001271182_Interface, __1909864448_Interface)

  private fun as_2001271182(): IPerceptionDepthFrameSource.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthFrameSource.ABI.makeIPerceptionDepthFrameSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthFrameSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthFrameSource.ABI.makeIPerceptionDepthFrameSource(ref.value))
  }

  private fun as_1909864448(): IPerceptionDepthFrameSource2.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionDepthFrameSource2.ABI.makeIPerceptionDepthFrameSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionDepthFrameSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionDepthFrameSource2.ABI.makeIPerceptionDepthFrameSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionDepthFrameSource> {
    public override fun getValue() = PerceptionDepthFrameSource(pointer.getPointer(0))

    public fun setValue(value: PerceptionDepthFrameSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionDepthFrameSource, MemoryAddress> {
    public val IPerceptionDepthFrameSourceStatics_Instance: IPerceptionDepthFrameSourceStatics by
        lazy {
      createIPerceptionDepthFrameSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionDepthFrameSourceStatics(): IPerceptionDepthFrameSourceStatics {
      val refiid = Guid.REFIID(IPerceptionDepthFrameSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.PerceptionDepthFrameSource".toHandle(),refiid,interfacePtr)
      val result =
          IPerceptionDepthFrameSourceStatics.ABI.makeIPerceptionDepthFrameSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PerceptionDepthFrameSource {
      val address = segment.toRawLongValue()
      return PerceptionDepthFrameSource(Pointer(address))
    }

    public override fun toNative(obj: PerceptionDepthFrameSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWatcher() = ABI.IPerceptionDepthFrameSourceStatics_Instance.CreateWatcher()

    public fun FindAllAsync() = ABI.IPerceptionDepthFrameSourceStatics_Instance.FindAllAsync()

    public fun FromIdAsync(id: String) =
        ABI.IPerceptionDepthFrameSourceStatics_Instance.FromIdAsync(id)

    public fun RequestAccessAsync() =
        ABI.IPerceptionDepthFrameSourceStatics_Instance.RequestAccessAsync()
  }
}
