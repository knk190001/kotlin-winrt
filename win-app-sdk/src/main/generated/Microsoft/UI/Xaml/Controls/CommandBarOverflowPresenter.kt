package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ICommandBarOverflowPresenterFactory.ABI.IID
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

@ABIMarker(CommandBarOverflowPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CommandBarOverflowPresenter;{5ff69946-9b27-583b-a3c0-d44244b1bd38})")
@WinRTByReference(brClass = CommandBarOverflowPresenter.ByReference::class)
public open class CommandBarOverflowPresenter(
  ptr: JNAPointer? = NULL
) : ItemsControl(ptr), ICommandBarOverflowPresenter.WithDefault, IWinRTObject {
  private val __1169844919_Interface: ICommandBarOverflowPresenter.WithDefault by lazy {
    as_1169844919()
  }


  public override val __1169844919_Ptr: JNAPointer? by lazy {
    __1169844919_Interface.__1169844919_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1169844919_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1169844919(): ICommandBarOverflowPresenter.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarOverflowPresenter.ABI.makeICommandBarOverflowPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarOverflowPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarOverflowPresenter.ABI.makeICommandBarOverflowPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandBarOverflowPresenter> {
    public override fun getValue() = CommandBarOverflowPresenter(pointer.getPointer(0))

    public fun setValue(value: CommandBarOverflowPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandBarOverflowPresenter, MemoryAddress> {
    public val ICommandBarOverflowPresenterFactory_Instance: ICommandBarOverflowPresenterFactory by
        lazy {
      createICommandBarOverflowPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICommandBarOverflowPresenterFactory(): ICommandBarOverflowPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.CommandBarOverflowPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICommandBarOverflowPresenterFactory.ABI.makeICommandBarOverflowPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ICommandBarOverflowPresenterFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): CommandBarOverflowPresenter {
      val address = segment.toRawLongValue()
      return CommandBarOverflowPresenter(Pointer(address))
    }

    public override fun toNative(obj: CommandBarOverflowPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
