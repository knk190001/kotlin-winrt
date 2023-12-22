package Windows.UI.ViewManagement

import Windows.UI.UIContext
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputPane.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.InputPane;{640ada70-06f3-4c87-a678-9829c9127c28})")
@WinRTByReference(brClass = InputPane.ByReference::class)
public class InputPane(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputPane.WithDefault, IInputPane2.WithDefault,
    IInputPaneControl.WithDefault, IWinRTObject {
  private val __1005432832_Interface: IInputPane.WithDefault by lazy {
    as_1005432832()
  }


  private val __1103646770_Interface: IInputPane2.WithDefault by lazy {
    as_1103646770()
  }


  private val __1513901373_Interface: IInputPaneControl.WithDefault by lazy {
    as_1513901373()
  }


  public override val __1005432832_Ptr: JNAPointer? by lazy {
    __1005432832_Interface.__1005432832_Ptr
  }


  public override val __1103646770_Ptr: JNAPointer? by lazy {
    __1103646770_Interface.__1103646770_Ptr
  }


  public override val __1513901373_Ptr: JNAPointer? by lazy {
    __1513901373_Interface.__1513901373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1005432832_Interface, __1103646770_Interface, __1513901373_Interface)

  private fun as_1005432832(): IInputPane.WithDefault {
    if(pointer == NULL) {
      return(IInputPane.ABI.makeIInputPane(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputPane>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputPane.ABI.makeIInputPane(ref.value))
  }

  private fun as_1103646770(): IInputPane2.WithDefault {
    if(pointer == NULL) {
      return(IInputPane2.ABI.makeIInputPane2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputPane2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputPane2.ABI.makeIInputPane2(ref.value))
  }

  private fun as_1513901373(): IInputPaneControl.WithDefault {
    if(pointer == NULL) {
      return(IInputPaneControl.ABI.makeIInputPaneControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputPaneControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputPaneControl.ABI.makeIInputPaneControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InputPane> {
    public override fun getValue() = InputPane(pointer.getPointer(0))

    public fun setValue(value: InputPane): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputPane, MemoryAddress> {
    public val IInputPaneStatics2_Instance: IInputPaneStatics2 by lazy {
      createIInputPaneStatics2()
    }


    public val IInputPaneStatics_Instance: IInputPaneStatics by lazy {
      createIInputPaneStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputPaneStatics2(): IInputPaneStatics2 {
      val refiid = Guid.REFIID(IInputPaneStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.InputPane".toHandle(),refiid,interfacePtr)
      val result = IInputPaneStatics2.ABI.makeIInputPaneStatics2(interfacePtr.value)
      return result
    }

    public fun createIInputPaneStatics(): IInputPaneStatics {
      val refiid = Guid.REFIID(IInputPaneStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.InputPane".toHandle(),refiid,interfacePtr)
      val result = IInputPaneStatics.ABI.makeIInputPaneStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputPane {
      val address = segment.toRawLongValue()
      return InputPane(Pointer(address))
    }

    public override fun toNative(obj: InputPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUIContext(context: UIContext) =
        ABI.IInputPaneStatics2_Instance.GetForUIContext(context)

    public fun GetForCurrentView() = ABI.IInputPaneStatics_Instance.GetForCurrentView()
  }
}
