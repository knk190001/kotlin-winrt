package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ICommandBarFlyoutFactory.ABI.IID
import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(CommandBarFlyout.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.CommandBarFlyout;{fecd2c4d-f16a-58cd-8aca-db0f046f25c3})")
@WinRTByReference(brClass = CommandBarFlyout.ByReference::class)
public open class CommandBarFlyout(
  ptr: JNAPointer? = NULL
) : FlyoutBase(ptr), ICommandBarFlyout.WithDefault, IWinRTObject {
  private val __1912512767_Interface: ICommandBarFlyout.WithDefault by lazy {
    as_1912512767()
  }


  public override val __1912512767_Ptr: JNAPointer? by lazy {
    __1912512767_Interface.__1912512767_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1912512767_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1912512767(): ICommandBarFlyout.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarFlyout.ABI.makeICommandBarFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarFlyout.ABI.makeICommandBarFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandBarFlyout> {
    public override fun getValue() = CommandBarFlyout(pointer.getPointer(0))

    public fun setValue(value: CommandBarFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBarFlyout, MemoryAddress> {
    public val ICommandBarFlyoutFactory_Instance: ICommandBarFlyoutFactory by lazy {
      createICommandBarFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommandBarFlyoutFactory(): ICommandBarFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.CommandBarFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICommandBarFlyoutFactory.ABI.makeICommandBarFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ICommandBarFlyoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CommandBarFlyout {
      val address = segment.toRawLongValue()
      return CommandBarFlyout(Pointer(address))
    }

    public override fun toNative(obj: CommandBarFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
