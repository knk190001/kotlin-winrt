package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IAppBarSeparatorFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.AppBarSeparator;{1b0795a1-1bc1-4d53-95ea-fb0a2cccc905})")
@WinRTByReference(brClass = AppBarSeparator.ByReference::class)
public open class AppBarSeparator(
  ptr: JNAPointer? = NULL
) : Control(ptr), IAppBarSeparator.WithDefault, ICommandBarElement.WithDefault,
    ICommandBarElement2.WithDefault, IWinRTObject {
  private val __19629769_Interface: IAppBarSeparator.WithDefault by lazy {
    as_19629769()
  }


  private val __1747695496_Interface: ICommandBarElement.WithDefault by lazy {
    as_1747695496()
  }


  private val __1656014522_Interface: ICommandBarElement2.WithDefault by lazy {
    as_1656014522()
  }


  public override val __19629769_Ptr: JNAPointer? by lazy {
    __19629769_Interface.__19629769_Ptr
  }


  public override val __1747695496_Ptr: JNAPointer? by lazy {
    __1747695496_Interface.__1747695496_Ptr
  }


  public override val __1656014522_Ptr: JNAPointer? by lazy {
    __1656014522_Interface.__1656014522_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__19629769_Interface, __1747695496_Interface, __1656014522_Interface)

  public constructor() : this(ABI.activate())

  private fun as_19629769(): IAppBarSeparator.WithDefault {
    if(pointer == NULL) {
      return(IAppBarSeparator.ABI.makeIAppBarSeparator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBarSeparator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBarSeparator.ABI.makeIAppBarSeparator(ref.value))
  }

  private fun as_1747695496(): ICommandBarElement.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarElement.ABI.makeICommandBarElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarElement.ABI.makeICommandBarElement(ref.value))
  }

  private fun as_1656014522(): ICommandBarElement2.WithDefault {
    if(pointer == NULL) {
      return(ICommandBarElement2.ABI.makeICommandBarElement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandBarElement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandBarElement2.ABI.makeICommandBarElement2(ref.value))
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


    public val IAppBarSeparatorStatics3_Instance: IAppBarSeparatorStatics3 by lazy {
      createIAppBarSeparatorStatics3()
    }


    public val IAppBarSeparatorFactory_Instance: IAppBarSeparatorFactory by lazy {
      createIAppBarSeparatorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBarSeparatorStatics(): IAppBarSeparatorStatics {
      val refiid = Guid.REFIID(IAppBarSeparatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarSeparator".toHandle(),refiid,interfacePtr)
      val result = IAppBarSeparatorStatics.ABI.makeIAppBarSeparatorStatics(interfacePtr.value)
      return result
    }

    public fun createIAppBarSeparatorStatics3(): IAppBarSeparatorStatics3 {
      val refiid = Guid.REFIID(IAppBarSeparatorStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarSeparator".toHandle(),refiid,interfacePtr)
      val result = IAppBarSeparatorStatics3.ABI.makeIAppBarSeparatorStatics3(interfacePtr.value)
      return result
    }

    public fun createIAppBarSeparatorFactory(): IAppBarSeparatorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.AppBarSeparator".toHandle(),refiid,factoryActivatorPtr)
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
        ABI.IAppBarSeparatorStatics3_Instance.get_IsInOverflowProperty()

    public fun get_DynamicOverflowOrderProperty() =
        ABI.IAppBarSeparatorStatics3_Instance.get_DynamicOverflowOrderProperty()
  }
}
