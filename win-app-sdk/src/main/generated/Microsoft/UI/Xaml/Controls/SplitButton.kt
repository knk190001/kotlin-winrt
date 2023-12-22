package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ISplitButtonFactory.ABI.IID
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

@ABIMarker(SplitButton.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SplitButton;{f627202d-d2d7-5ff6-bb05-8c48eb6b1fc6})")
@WinRTByReference(brClass = SplitButton.ByReference::class)
public open class SplitButton(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), ISplitButton.WithDefault, IWinRTObject {
  private val __40922427_Interface: ISplitButton.WithDefault by lazy {
    as_40922427()
  }


  public override val __40922427_Ptr: JNAPointer? by lazy {
    __40922427_Interface.__40922427_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__40922427_Interface)

  public constructor() : this(ABI.activate())

  private fun as_40922427(): ISplitButton.WithDefault {
    if(pointer == NULL) {
      return(ISplitButton.ABI.makeISplitButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitButton.ABI.makeISplitButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SplitButton> {
    public override fun getValue() = SplitButton(pointer.getPointer(0))

    public fun setValue(value: SplitButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitButton, MemoryAddress> {
    public val ISplitButtonStatics_Instance: ISplitButtonStatics by lazy {
      createISplitButtonStatics()
    }


    public val ISplitButtonFactory_Instance: ISplitButtonFactory by lazy {
      createISplitButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISplitButtonStatics(): ISplitButtonStatics {
      val refiid = Guid.REFIID(ISplitButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SplitButton".toHandle(),refiid,interfacePtr)
      val result = ISplitButtonStatics.ABI.makeISplitButtonStatics(interfacePtr.value)
      return result
    }

    public fun createISplitButtonFactory(): ISplitButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SplitButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISplitButtonFactory.ABI.makeISplitButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISplitButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SplitButton {
      val address = segment.toRawLongValue()
      return SplitButton(Pointer(address))
    }

    public override fun toNative(obj: SplitButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FlyoutProperty() = ABI.ISplitButtonStatics_Instance.get_FlyoutProperty()

    public fun get_CommandProperty() = ABI.ISplitButtonStatics_Instance.get_CommandProperty()

    public fun get_CommandParameterProperty() =
        ABI.ISplitButtonStatics_Instance.get_CommandParameterProperty()
  }
}
