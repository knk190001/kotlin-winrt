package Windows.Devices.Perception.Provider

import Windows.Devices.Perception.Provider.IPerceptionControlGroupFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PerceptionControlGroup.ABI::class)
@Signature("rc(Windows.Devices.Perception.Provider.PerceptionControlGroup;{172c4882-2fd9-4c4e-ba34-fdf20a73dde5})")
@WinRTByReference(brClass = PerceptionControlGroup.ByReference::class)
public class PerceptionControlGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionControlGroup.WithDefault, IWinRTObject {
  private val __1706241266_Interface: IPerceptionControlGroup.WithDefault by lazy {
    as_1706241266()
  }


  public override val __1706241266_Ptr: JNAPointer? by lazy {
    __1706241266_Interface.__1706241266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1706241266_Interface)

  public constructor(ids: IIterable<String?>) : this(ABI.activate(ids))

  private fun as_1706241266(): IPerceptionControlGroup.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionControlGroup.ABI.makeIPerceptionControlGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionControlGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionControlGroup.ABI.makeIPerceptionControlGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PerceptionControlGroup> {
    public override fun getValue() = PerceptionControlGroup(pointer.getPointer(0))

    public fun setValue(value: PerceptionControlGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionControlGroup, MemoryAddress> {
    public val IPerceptionControlGroupFactory_Instance: IPerceptionControlGroupFactory by lazy {
      createIPerceptionControlGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionControlGroupFactory(): IPerceptionControlGroupFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.PerceptionControlGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPerceptionControlGroupFactory.ABI.makeIPerceptionControlGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(ids: IIterable<String?>): JNAPointer? =
        IPerceptionControlGroupFactory_Instance.Create(ids)?.pointer

    public override fun fromNative(segment: MemoryAddress): PerceptionControlGroup {
      val address = segment.toRawLongValue()
      return PerceptionControlGroup(Pointer(address))
    }

    public override fun toNative(obj: PerceptionControlGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
