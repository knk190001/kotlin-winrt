package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ISystemConditionFactory.ABI.IID
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

@ABIMarker(SystemCondition.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.SystemCondition;{c15fb476-89c5-420b-abd3-fb3030472128})")
@WinRTByReference(brClass = SystemCondition.ByReference::class)
public class SystemCondition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISystemCondition.WithDefault, IBackgroundCondition.WithDefault, IWinRTObject {
  private val __1229363611_Interface: ISystemCondition.WithDefault by lazy {
    as_1229363611()
  }


  private val __772532740_Interface: IBackgroundCondition.WithDefault by lazy {
    as_772532740()
  }


  public override val __1229363611_Ptr: JNAPointer? by lazy {
    __1229363611_Interface.__1229363611_Ptr
  }


  public override val __772532740_Ptr: JNAPointer? by lazy {
    __772532740_Interface.__772532740_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1229363611_Interface, __772532740_Interface)

  public constructor(conditionType: SystemConditionType) : this(ABI.activate(conditionType))

  private fun as_1229363611(): ISystemCondition.WithDefault {
    if(pointer == NULL) {
      return(ISystemCondition.ABI.makeISystemCondition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemCondition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemCondition.ABI.makeISystemCondition(ref.value))
  }

  private fun as_772532740(): IBackgroundCondition.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundCondition.ABI.makeIBackgroundCondition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundCondition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundCondition.ABI.makeIBackgroundCondition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemCondition> {
    public override fun getValue() = SystemCondition(pointer.getPointer(0))

    public fun setValue(value: SystemCondition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemCondition, MemoryAddress> {
    public val ISystemConditionFactory_Instance: ISystemConditionFactory by lazy {
      createISystemConditionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemConditionFactory(): ISystemConditionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.SystemCondition".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISystemConditionFactory.ABI.makeISystemConditionFactory(factoryActivatorPtr.value))
    }

    public fun activate(conditionType: SystemConditionType): JNAPointer? =
        ISystemConditionFactory_Instance.Create(conditionType)?.pointer

    public override fun fromNative(segment: MemoryAddress): SystemCondition {
      val address = segment.toRawLongValue()
      return SystemCondition(Pointer(address))
    }

    public override fun toNative(obj: SystemCondition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
