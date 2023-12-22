package Microsoft.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(StateTrigger.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.StateTrigger;{7b098126-1dab-5b58-aca7-f2b7de2e1033})")
@WinRTByReference(brClass = StateTrigger.ByReference::class)
public class StateTrigger(
  ptr: JNAPointer? = NULL
) : StateTriggerBase(ptr), IStateTrigger.WithDefault, IWinRTObject {
  private val __2140445102_Interface: IStateTrigger.WithDefault by lazy {
    as_2140445102()
  }


  public override val __2140445102_Ptr: JNAPointer? by lazy {
    __2140445102_Interface.__2140445102_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2140445102_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2140445102(): IStateTrigger.WithDefault {
    if(pointer == NULL) {
      return(IStateTrigger.ABI.makeIStateTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStateTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStateTrigger.ABI.makeIStateTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StateTrigger> {
    public override fun getValue() = StateTrigger(pointer.getPointer(0))

    public fun setValue(value: StateTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StateTrigger, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IStateTriggerStatics_Instance: IStateTriggerStatics by lazy {
      createIStateTriggerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.StateTrigger".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIStateTriggerStatics(): IStateTriggerStatics {
      val refiid = Guid.REFIID(IStateTriggerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.StateTrigger".toHandle(),refiid,interfacePtr)
      val result = IStateTriggerStatics.ABI.makeIStateTriggerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StateTrigger {
      val address = segment.toRawLongValue()
      return StateTrigger(Pointer(address))
    }

    public override fun toNative(obj: StateTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsActiveProperty() = ABI.IStateTriggerStatics_Instance.get_IsActiveProperty()
  }
}
