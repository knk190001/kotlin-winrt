package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ICommandBarFlyoutFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
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
@Signature("rc(Microsoft.UI.Xaml.Controls.CommandBarFlyout;{18e2cc40-09cb-5f20-a715-f0b2039c5e18})")
@WinRTByReference(brClass = CommandBarFlyout.ByReference::class)
public open class CommandBarFlyout(
  ptr: JNAPointer? = NULL
) : FlyoutBase(ptr), ICommandBarFlyout.WithDefault, ICommandBarFlyout2.WithDefault, IWinRTObject {
  private val __1111317674_Interface: ICommandBarFlyout.WithDefault by lazy {
    as_1111317674()
  }


  private val __91109576_Interface: ICommandBarFlyout2.WithDefault by lazy {
    as_91109576()
  }


  public override val __1111317674_Ptr: JNAPointer? by lazy {
    __1111317674_Interface.__1111317674_Ptr
  }


  public override val __91109576_Ptr: JNAPointer? by lazy {
    __91109576_Interface.__91109576_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1111317674_Interface, __91109576_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1111317674(): ICommandBarFlyout.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarFlyout.ABI.makeICommandBarFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarFlyout.ABI.makeICommandBarFlyout(ref.value))
  }

  private fun as_91109576(): ICommandBarFlyout2.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarFlyout2.ABI.makeICommandBarFlyout2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarFlyout2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarFlyout2.ABI.makeICommandBarFlyout2(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CommandBarFlyout".toHandle(),refiid,factoryActivatorPtr)
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
