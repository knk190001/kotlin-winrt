package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.Media.Imaging.IXamlRenderingBackgroundTaskFactory.ABI.IID
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

@ABIMarker(XamlRenderingBackgroundTask.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.XamlRenderingBackgroundTask;{7807000c-a050-5121-ac74-3322d5358e39})")
@WinRTByReference(brClass = XamlRenderingBackgroundTask.ByReference::class)
public open class XamlRenderingBackgroundTask(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlRenderingBackgroundTask.WithDefault,
    IXamlRenderingBackgroundTaskOverrides.WithDefault, IWinRTObject {
  private val __4321392_Interface: IXamlRenderingBackgroundTask.WithDefault by lazy {
    as_4321392()
  }


  private val __676269961_Interface: IXamlRenderingBackgroundTaskOverrides.WithDefault by lazy {
    as_676269961()
  }


  public override val __4321392_Ptr: JNAPointer? by lazy {
    __4321392_Interface.__4321392_Ptr
  }


  public override val __676269961_Ptr: JNAPointer? by lazy {
    __676269961_Interface.__676269961_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__4321392_Interface, __676269961_Interface)

  public constructor() : this(ABI.activate())

  private fun as_4321392(): IXamlRenderingBackgroundTask.WithDefault {
    if(pointer == NULL) {
      return(IXamlRenderingBackgroundTask.ABI.makeIXamlRenderingBackgroundTask(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlRenderingBackgroundTask>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlRenderingBackgroundTask.ABI.makeIXamlRenderingBackgroundTask(ref.value))
  }

  private fun as_676269961(): IXamlRenderingBackgroundTaskOverrides.WithDefault {
    if(pointer == NULL) {
      return(IXamlRenderingBackgroundTaskOverrides.ABI.makeIXamlRenderingBackgroundTaskOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlRenderingBackgroundTaskOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlRenderingBackgroundTaskOverrides.ABI.makeIXamlRenderingBackgroundTaskOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlRenderingBackgroundTask> {
    public override fun getValue() = XamlRenderingBackgroundTask(pointer.getPointer(0))

    public fun setValue(value: XamlRenderingBackgroundTask): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlRenderingBackgroundTask, MemoryAddress> {
    public val IXamlRenderingBackgroundTaskFactory_Instance: IXamlRenderingBackgroundTaskFactory by
        lazy {
      createIXamlRenderingBackgroundTaskFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlRenderingBackgroundTaskFactory(): IXamlRenderingBackgroundTaskFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Imaging.XamlRenderingBackgroundTask".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXamlRenderingBackgroundTaskFactory.ABI.makeIXamlRenderingBackgroundTaskFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IXamlRenderingBackgroundTaskFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): XamlRenderingBackgroundTask {
      val address = segment.toRawLongValue()
      return XamlRenderingBackgroundTask(Pointer(address))
    }

    public override fun toNative(obj: XamlRenderingBackgroundTask): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
