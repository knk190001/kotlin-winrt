package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.CommandBar
import Windows.UI.Xaml.Controls.Primitives.ICommandBarFlyoutCommandBarFactory.ABI.IID
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

@ABIMarker(CommandBarFlyoutCommandBar.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.CommandBarFlyoutCommandBar;{14146e7c-38c4-55c4-b706-ce18f6061e7e})")
@WinRTByReference(brClass = CommandBarFlyoutCommandBar.ByReference::class)
public open class CommandBarFlyoutCommandBar(
  ptr: JNAPointer? = NULL
) : CommandBar(ptr), ICommandBarFlyoutCommandBar.WithDefault, IWinRTObject {
  private val __1381623271_Interface: ICommandBarFlyoutCommandBar.WithDefault by lazy {
    as_1381623271()
  }


  public override val __1381623271_Ptr: JNAPointer? by lazy {
    __1381623271_Interface.__1381623271_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1381623271_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1381623271(): ICommandBarFlyoutCommandBar.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarFlyoutCommandBar.ABI.makeICommandBarFlyoutCommandBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarFlyoutCommandBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarFlyoutCommandBar.ABI.makeICommandBarFlyoutCommandBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandBarFlyoutCommandBar> {
    public override fun getValue() = CommandBarFlyoutCommandBar(pointer.getPointer(0))

    public fun setValue(value: CommandBarFlyoutCommandBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBarFlyoutCommandBar, MemoryAddress> {
    public val ICommandBarFlyoutCommandBarFactory_Instance: ICommandBarFlyoutCommandBarFactory by
        lazy {
      createICommandBarFlyoutCommandBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommandBarFlyoutCommandBarFactory(): ICommandBarFlyoutCommandBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.CommandBarFlyoutCommandBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICommandBarFlyoutCommandBarFactory.ABI.makeICommandBarFlyoutCommandBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ICommandBarFlyoutCommandBarFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CommandBarFlyoutCommandBar {
      val address = segment.toRawLongValue()
      return CommandBarFlyoutCommandBar(Pointer(address))
    }

    public override fun toNative(obj: CommandBarFlyoutCommandBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
