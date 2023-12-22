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

@ABIMarker(PerceptionColorFrameSource.ABI::class)
@Signature("rc(Windows.Devices.Perception.PerceptionColorFrameSource;{dc6dba7c-0b58-468d-9ca1-6db04cc0477c})")
@WinRTByReference(brClass = PerceptionColorFrameSource.ByReference::class)
public class PerceptionColorFrameSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionColorFrameSource.WithDefault,
    IPerceptionColorFrameSource2.WithDefault, IWinRTObject {
  private val __1184988626_Interface: IPerceptionColorFrameSource.WithDefault by lazy {
    as_1184988626()
  }


  private val __1920058208_Interface: IPerceptionColorFrameSource2.WithDefault by lazy {
    as_1920058208()
  }


  public override val __1184988626_Ptr: JNAPointer? by lazy {
    __1184988626_Interface.__1184988626_Ptr
  }


  public override val __1920058208_Ptr: JNAPointer? by lazy {
    __1920058208_Interface.__1920058208_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1184988626_Interface, __1920058208_Interface)

  private fun as_1184988626(): IPerceptionColorFrameSource.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionColorFrameSource.ABI.makeIPerceptionColorFrameSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionColorFrameSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionColorFrameSource.ABI.makeIPerceptionColorFrameSource(ref.value))
  }

  private fun as_1920058208(): IPerceptionColorFrameSource2.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionColorFrameSource2.ABI.makeIPerceptionColorFrameSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionColorFrameSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionColorFrameSource2.ABI.makeIPerceptionColorFrameSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionColorFrameSource> {
    public override fun getValue() = PerceptionColorFrameSource(pointer.getPointer(0))

    public fun setValue(value: PerceptionColorFrameSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionColorFrameSource, MemoryAddress> {
    public val IPerceptionColorFrameSourceStatics_Instance: IPerceptionColorFrameSourceStatics by
        lazy {
      createIPerceptionColorFrameSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionColorFrameSourceStatics(): IPerceptionColorFrameSourceStatics {
      val refiid = Guid.REFIID(IPerceptionColorFrameSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.PerceptionColorFrameSource".toHandle(),refiid,interfacePtr)
      val result =
          IPerceptionColorFrameSourceStatics.ABI.makeIPerceptionColorFrameSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PerceptionColorFrameSource {
      val address = segment.toRawLongValue()
      return PerceptionColorFrameSource(Pointer(address))
    }

    public override fun toNative(obj: PerceptionColorFrameSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWatcher() = ABI.IPerceptionColorFrameSourceStatics_Instance.CreateWatcher()

    public fun FindAllAsync() = ABI.IPerceptionColorFrameSourceStatics_Instance.FindAllAsync()

    public fun FromIdAsync(id: String) =
        ABI.IPerceptionColorFrameSourceStatics_Instance.FromIdAsync(id)

    public fun RequestAccessAsync() =
        ABI.IPerceptionColorFrameSourceStatics_Instance.RequestAccessAsync()
  }
}
