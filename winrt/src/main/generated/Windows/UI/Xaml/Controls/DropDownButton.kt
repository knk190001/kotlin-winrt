package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IDropDownButtonFactory.ABI.IID
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

@ABIMarker(DropDownButton.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.DropDownButton;{671f74e6-2a27-5fa8-b0a2-79b2e71ebd87})")
@WinRTByReference(brClass = DropDownButton.ByReference::class)
public open class DropDownButton(
  ptr: JNAPointer? = NULL
) : Button(ptr), IDropDownButton.WithDefault, IWinRTObject {
  private val __1061952991_Interface: IDropDownButton.WithDefault by lazy {
    as_1061952991()
  }


  public override val __1061952991_Ptr: JNAPointer? by lazy {
    __1061952991_Interface.__1061952991_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1061952991_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1061952991(): IDropDownButton.WithDefault {
    if(pointer == NULL) {
      return(IDropDownButton.ABI.makeIDropDownButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDropDownButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDropDownButton.ABI.makeIDropDownButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DropDownButton>
      {
    public override fun getValue() = DropDownButton(pointer.getPointer(0))

    public fun setValue(value: DropDownButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DropDownButton, MemoryAddress> {
    public val IDropDownButtonFactory_Instance: IDropDownButtonFactory by lazy {
      createIDropDownButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDropDownButtonFactory(): IDropDownButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.DropDownButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDropDownButtonFactory.ABI.makeIDropDownButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IDropDownButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DropDownButton {
      val address = segment.toRawLongValue()
      return DropDownButton(Pointer(address))
    }

    public override fun toNative(obj: DropDownButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
