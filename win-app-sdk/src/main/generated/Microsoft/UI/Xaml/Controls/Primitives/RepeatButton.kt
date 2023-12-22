package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(RepeatButton.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.RepeatButton;{97f4c728-4a94-56b5-91e4-e7c6f6a1251a})")
@WinRTByReference(brClass = RepeatButton.ByReference::class)
public class RepeatButton(
  ptr: JNAPointer? = NULL
) : ButtonBase(ptr), IRepeatButton.WithDefault, IWinRTObject {
  private val __718643070_Interface: IRepeatButton.WithDefault by lazy {
    as_718643070()
  }


  public override val __718643070_Ptr: JNAPointer? by lazy {
    __718643070_Interface.__718643070_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__718643070_Interface)

  public constructor() : this(ABI.activate())

  private fun as_718643070(): IRepeatButton.WithDefault {
    if(pointer == NULL) {
      return(IRepeatButton.ABI.makeIRepeatButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRepeatButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRepeatButton.ABI.makeIRepeatButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RepeatButton> {
    public override fun getValue() = RepeatButton(pointer.getPointer(0))

    public fun setValue(value: RepeatButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RepeatButton, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRepeatButtonStatics_Instance: IRepeatButtonStatics by lazy {
      createIRepeatButtonStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.RepeatButton".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIRepeatButtonStatics(): IRepeatButtonStatics {
      val refiid = Guid.REFIID(IRepeatButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.RepeatButton".toHandle(),refiid,interfacePtr)
      val result = IRepeatButtonStatics.ABI.makeIRepeatButtonStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RepeatButton {
      val address = segment.toRawLongValue()
      return RepeatButton(Pointer(address))
    }

    public override fun toNative(obj: RepeatButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DelayProperty() = ABI.IRepeatButtonStatics_Instance.get_DelayProperty()

    public fun get_IntervalProperty() = ABI.IRepeatButtonStatics_Instance.get_IntervalProperty()
  }
}
