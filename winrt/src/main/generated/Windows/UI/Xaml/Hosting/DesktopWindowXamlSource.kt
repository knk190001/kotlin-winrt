package Windows.UI.Xaml.Hosting

import Windows.Foundation.IClosable
import Windows.UI.Xaml.Hosting.IDesktopWindowXamlSourceFactory.ABI.IID
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

@ABIMarker(DesktopWindowXamlSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.DesktopWindowXamlSource;{d585bfe1-00ff-51be-ba1d-a1329956ea0a})")
@WinRTByReference(brClass = DesktopWindowXamlSource.ByReference::class)
public open class DesktopWindowXamlSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesktopWindowXamlSource.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2082715543_Interface: IDesktopWindowXamlSource.WithDefault by lazy {
    as_2082715543()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2082715543_Ptr: JNAPointer? by lazy {
    __2082715543_Interface.__2082715543_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2082715543_Interface, __1260617006_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2082715543(): IDesktopWindowXamlSource.WithDefault {
    if(pointer == NULL) {
      return(IDesktopWindowXamlSource.ABI.makeIDesktopWindowXamlSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopWindowXamlSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopWindowXamlSource.ABI.makeIDesktopWindowXamlSource(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopWindowXamlSource> {
    public override fun getValue() = DesktopWindowXamlSource(pointer.getPointer(0))

    public fun setValue(value: DesktopWindowXamlSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopWindowXamlSource, MemoryAddress> {
    public val IDesktopWindowXamlSourceFactory_Instance: IDesktopWindowXamlSourceFactory by lazy {
      createIDesktopWindowXamlSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDesktopWindowXamlSourceFactory(): IDesktopWindowXamlSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Hosting.DesktopWindowXamlSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDesktopWindowXamlSourceFactory.ABI.makeIDesktopWindowXamlSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IDesktopWindowXamlSourceFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): DesktopWindowXamlSource {
      val address = segment.toRawLongValue()
      return DesktopWindowXamlSource(Pointer(address))
    }

    public override fun toNative(obj: DesktopWindowXamlSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
