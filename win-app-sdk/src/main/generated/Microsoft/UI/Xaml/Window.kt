package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IWindowFactory.ABI.IID
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

@ABIMarker(Window.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Window;{61f0ec79-5d52-56b5-86fb-40fa4af288b0})")
@WinRTByReference(brClass = Window.ByReference::class)
public open class Window(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindow.WithDefault, IWindow2.WithDefault, IWinRTObject {
  private val __812057335_Interface: IWindow.WithDefault by lazy {
    as_812057335()
  }


  private val __596026341_Interface: IWindow2.WithDefault by lazy {
    as_596026341()
  }


  public override val __812057335_Ptr: JNAPointer? by lazy {
    __812057335_Interface.__812057335_Ptr
  }


  public override val __596026341_Ptr: JNAPointer? by lazy {
    __596026341_Interface.__596026341_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__812057335_Interface, __596026341_Interface)

  public constructor() : this(ABI.activate())

  private fun as_812057335(): IWindow.WithDefault {
    if(pointer == NULL) {
      return(IWindow.ABI.makeIWindow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindow.ABI.makeIWindow(ref.value))
  }

  private fun as_596026341(): IWindow2.WithDefault {
    if(pointer == NULL) {
      return(IWindow2.ABI.makeIWindow2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindow2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindow2.ABI.makeIWindow2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Window> {
    public override fun getValue() = Window(pointer.getPointer(0))

    public fun setValue(value: Window): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Window, MemoryAddress> {
    public val IWindowStatics_Instance: IWindowStatics by lazy {
      createIWindowStatics()
    }


    public val IWindowFactory_Instance: IWindowFactory by lazy {
      createIWindowFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowStatics(): IWindowStatics {
      val refiid = Guid.REFIID(IWindowStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Window".toHandle(),refiid,interfacePtr)
      val result = IWindowStatics.ABI.makeIWindowStatics(interfacePtr.value)
      return result
    }

    public fun createIWindowFactory(): IWindowFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Window".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWindowFactory.ABI.makeIWindowFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IWindowFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Window {
      val address = segment.toRawLongValue()
      return Window(Pointer(address))
    }

    public override fun toNative(obj: Window): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IWindowStatics_Instance.get_Current()
  }
}
