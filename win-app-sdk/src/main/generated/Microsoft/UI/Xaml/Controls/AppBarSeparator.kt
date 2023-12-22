package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAppBarSeparatorFactory.ABI.IID
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

@ABIMarker(AppBarSeparator.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AppBarSeparator;{57bb94a3-1e56-5ebe-8a57-3a243c491d67})")
@WinRTByReference(brClass = AppBarSeparator.ByReference::class)
public open class AppBarSeparator(
  ptr: JNAPointer? = NULL
) : Control(ptr), IAppBarSeparator.WithDefault, ICommandBarElement.WithDefault, IWinRTObject {
  private val __45474772_Interface: IAppBarSeparator.WithDefault by lazy {
    as_45474772()
  }


  private val __814939603_Interface: ICommandBarElement.WithDefault by lazy {
    as_814939603()
  }


  public override val __45474772_Ptr: JNAPointer? by lazy {
    __45474772_Interface.__45474772_Ptr
  }


  public override val __814939603_Ptr: JNAPointer? by lazy {
    __814939603_Interface.__814939603_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__45474772_Interface, __814939603_Interface)

  public constructor() : this(ABI.activate())

  private fun as_45474772(): IAppBarSeparator.WithDefault {
    if(pointer == NULL) {
      return(IAppBarSeparator.ABI.makeIAppBarSeparator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarSeparator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarSeparator.ABI.makeIAppBarSeparator(ref.value))
  }

  private fun as_814939603(): ICommandBarElement.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarElement.ABI.makeICommandBarElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarElement.ABI.makeICommandBarElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBarSeparator> {
    public override fun getValue() = AppBarSeparator(pointer.getPointer(0))

    public fun setValue(value: AppBarSeparator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBarSeparator, MemoryAddress> {
    public val IAppBarSeparatorStatics_Instance: IAppBarSeparatorStatics by lazy {
      createIAppBarSeparatorStatics()
    }


    public val IAppBarSeparatorFactory_Instance: IAppBarSeparatorFactory by lazy {
      createIAppBarSeparatorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarSeparatorStatics(): IAppBarSeparatorStatics {
      val refiid = Guid.REFIID(IAppBarSeparatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarSeparator".toHandle(),refiid,interfacePtr)
      val result = IAppBarSeparatorStatics.ABI.makeIAppBarSeparatorStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarSeparatorFactory(): IAppBarSeparatorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AppBarSeparator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAppBarSeparatorFactory.ABI.makeIAppBarSeparatorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAppBarSeparatorFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AppBarSeparator {
      val address = segment.toRawLongValue()
      return AppBarSeparator(Pointer(address))
    }

    public override fun toNative(obj: AppBarSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsCompactProperty() =
        ABI.IAppBarSeparatorStatics_Instance.get_IsCompactProperty()

    public fun get_IsInOverflowProperty() =
        ABI.IAppBarSeparatorStatics_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarSeparatorStatics_Instance.get_DynamicOverflowOrderProperty()
  }
}
