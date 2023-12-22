package Windows.Devices.Perception.Provider

import Windows.Devices.Perception.Provider.IPerceptionCorrelationGroupFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PerceptionCorrelationGroup.ABI::class)
@Signature("rc(Windows.Devices.Perception.Provider.PerceptionCorrelationGroup;{752a0906-36a7-47bb-9b79-56cc6b746770})")
@WinRTByReference(brClass = PerceptionCorrelationGroup.ByReference::class)
public class PerceptionCorrelationGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionCorrelationGroup.WithDefault, IWinRTObject {
  private val __826532845_Interface: IPerceptionCorrelationGroup.WithDefault by lazy {
    as_826532845()
  }


  public override val __826532845_Ptr: JNAPointer? by lazy {
    __826532845_Interface.__826532845_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__826532845_Interface)

  public constructor(relativeLocations: IIterable<PerceptionCorrelation?>) :
      this(ABI.activate(relativeLocations))

  private fun as_826532845(): IPerceptionCorrelationGroup.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionCorrelationGroup.ABI.makeIPerceptionCorrelationGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionCorrelationGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionCorrelationGroup.ABI.makeIPerceptionCorrelationGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionCorrelationGroup> {
    public override fun getValue() = PerceptionCorrelationGroup(pointer.getPointer(0))

    public fun setValue(value: PerceptionCorrelationGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionCorrelationGroup, MemoryAddress> {
    public val IPerceptionCorrelationGroupFactory_Instance: IPerceptionCorrelationGroupFactory by
        lazy {
      createIPerceptionCorrelationGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionCorrelationGroupFactory(): IPerceptionCorrelationGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.PerceptionCorrelationGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPerceptionCorrelationGroupFactory.ABI.makeIPerceptionCorrelationGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(relativeLocations: IIterable<PerceptionCorrelation?>): JNAPointer? =
        IPerceptionCorrelationGroupFactory_Instance.Create(relativeLocations)?.pointer

    public override fun fromNative(segment: MemoryAddress): PerceptionCorrelationGroup {
      val address = segment.toRawLongValue()
      return PerceptionCorrelationGroup(Pointer(address))
    }

    public override fun toNative(obj: PerceptionCorrelationGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
