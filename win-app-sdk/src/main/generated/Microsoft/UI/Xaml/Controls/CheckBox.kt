package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ICheckBoxFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.ToggleButton
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

@ABIMarker(CheckBox.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CheckBox;{c5830000-4c9d-5fdd-9346-674c71cd80c5})")
@WinRTByReference(brClass = CheckBox.ByReference::class)
public open class CheckBox(
  ptr: JNAPointer? = NULL
) : ToggleButton(ptr), ICheckBox.WithDefault, IWinRTObject {
  private val __1240971882_Interface: ICheckBox.WithDefault by lazy {
    as_1240971882()
  }


  public override val __1240971882_Ptr: JNAPointer? by lazy {
    __1240971882_Interface.__1240971882_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1240971882_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1240971882(): ICheckBox.WithDefault {
    if(pointer == NULL) {
      return(ICheckBox.ABI.makeICheckBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICheckBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICheckBox.ABI.makeICheckBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CheckBox> {
    public override fun getValue() = CheckBox(pointer.getPointer(0))

    public fun setValue(value: CheckBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CheckBox, MemoryAddress> {
    public val ICheckBoxFactory_Instance: ICheckBoxFactory by lazy {
      createICheckBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICheckBoxFactory(): ICheckBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CheckBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICheckBoxFactory.ABI.makeICheckBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICheckBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CheckBox {
      val address = segment.toRawLongValue()
      return CheckBox(Pointer(address))
    }

    public override fun toNative(obj: CheckBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
