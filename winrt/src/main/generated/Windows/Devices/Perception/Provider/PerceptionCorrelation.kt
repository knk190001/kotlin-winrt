package Windows.Devices.Perception.Provider

import Windows.Devices.Perception.Provider.IPerceptionCorrelationFactory.ABI.IID
import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
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

@ABIMarker(PerceptionCorrelation.ABI::class)
@Signature("rc(Windows.Devices.Perception.Provider.PerceptionCorrelation;{b4131a82-dff5-4047-8a19-3b4d805f7176})")
@WinRTByReference(brClass = PerceptionCorrelation.ByReference::class)
public class PerceptionCorrelation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionCorrelation.WithDefault, IWinRTObject {
  private val __13459890_Interface: IPerceptionCorrelation.WithDefault by lazy {
    as_13459890()
  }


  public override val __13459890_Ptr: JNAPointer? by lazy {
    __13459890_Interface.__13459890_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__13459890_Interface)

  public constructor(
    targetId: String,
    position: Vector3,
    orientation: Quaternion
  ) : this(ABI.activate(targetId, position, orientation))

  private fun as_13459890(): IPerceptionCorrelation.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionCorrelation.ABI.makeIPerceptionCorrelation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionCorrelation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionCorrelation.ABI.makeIPerceptionCorrelation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionCorrelation> {
    public override fun getValue() = PerceptionCorrelation(pointer.getPointer(0))

    public fun setValue(value: PerceptionCorrelation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionCorrelation, MemoryAddress> {
    public val IPerceptionCorrelationFactory_Instance: IPerceptionCorrelationFactory by lazy {
      createIPerceptionCorrelationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionCorrelationFactory(): IPerceptionCorrelationFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.PerceptionCorrelation".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPerceptionCorrelationFactory.ABI.makeIPerceptionCorrelationFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      targetId: String,
      position: Vector3,
      orientation: Quaternion
    ): JNAPointer? = IPerceptionCorrelationFactory_Instance.Create(targetId, position,
        orientation)?.pointer

    public override fun fromNative(segment: MemoryAddress): PerceptionCorrelation {
      val address = segment.toRawLongValue()
      return PerceptionCorrelation(Pointer(address))
    }

    public override fun toNative(obj: PerceptionCorrelation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
