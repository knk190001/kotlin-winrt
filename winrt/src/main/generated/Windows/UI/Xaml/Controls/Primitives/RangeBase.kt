package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Control
import Windows.UI.Xaml.Controls.Primitives.IRangeBaseFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RangeBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.RangeBase;{fa002c1a-494e-46cf-91d4-e14a8d798675})")
@WinRTByReference(brClass = RangeBase.ByReference::class)
public open class RangeBase(
  ptr: JNAPointer? = NULL
) : Control(ptr), IRangeBase.WithDefault, IRangeBaseOverrides.WithDefault, IWinRTObject {
  private val __1613068882_Interface: IRangeBase.WithDefault by lazy {
    as_1613068882()
  }


  private val __2086109195_Interface: IRangeBaseOverrides.WithDefault by lazy {
    as_2086109195()
  }


  public override val __1613068882_Ptr: JNAPointer? by lazy {
    __1613068882_Interface.__1613068882_Ptr
  }


  public override val __2086109195_Ptr: JNAPointer? by lazy {
    __2086109195_Interface.__2086109195_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1613068882_Interface, __2086109195_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1613068882(): IRangeBase.WithDefault {
    if(pointer == NULL) {
      return(IRangeBase.ABI.makeIRangeBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRangeBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRangeBase.ABI.makeIRangeBase(ref.value))
  }

  private fun as_2086109195(): IRangeBaseOverrides.WithDefault {
    if(pointer == NULL) {
      return(IRangeBaseOverrides.ABI.makeIRangeBaseOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRangeBaseOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRangeBaseOverrides.ABI.makeIRangeBaseOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RangeBase> {
    public override fun getValue() = RangeBase(pointer.getPointer(0))

    public fun setValue(value: RangeBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RangeBase, MemoryAddress> {
    public val IRangeBaseStatics_Instance: IRangeBaseStatics by lazy {
      createIRangeBaseStatics()
    }


    public val IRangeBaseFactory_Instance: IRangeBaseFactory by lazy {
      createIRangeBaseFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRangeBaseStatics(): IRangeBaseStatics {
      val refiid = Guid.REFIID(IRangeBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.RangeBase".toHandle(),refiid,interfacePtr)
      val result = IRangeBaseStatics.ABI.makeIRangeBaseStatics(interfacePtr.value)
      return result
    }

    public fun createIRangeBaseFactory(): IRangeBaseFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.RangeBase".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRangeBaseFactory.ABI.makeIRangeBaseFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRangeBaseFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RangeBase {
      val address = segment.toRawLongValue()
      return RangeBase(Pointer(address))
    }

    public override fun toNative(obj: RangeBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MinimumProperty() = ABI.IRangeBaseStatics_Instance.get_MinimumProperty()

    public fun get_MaximumProperty() = ABI.IRangeBaseStatics_Instance.get_MaximumProperty()

    public fun get_SmallChangeProperty() = ABI.IRangeBaseStatics_Instance.get_SmallChangeProperty()

    public fun get_LargeChangeProperty() = ABI.IRangeBaseStatics_Instance.get_LargeChangeProperty()

    public fun get_ValueProperty() = ABI.IRangeBaseStatics_Instance.get_ValueProperty()
  }
}
