package Windows.UI.Xaml

import Windows.UI.Xaml.IFrameworkTemplateFactory.ABI.IID
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

@ABIMarker(FrameworkTemplate.ABI::class)
@Signature("rc(Windows.UI.Xaml.FrameworkTemplate;{a1e254d8-a446-4a27-9a9d-a0f59e1258a5})")
@WinRTByReference(brClass = FrameworkTemplate.ByReference::class)
public open class FrameworkTemplate(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IFrameworkTemplate.WithDefault, IWinRTObject {
  private val __983847802_Interface: IFrameworkTemplate.WithDefault by lazy {
    as_983847802()
  }


  public override val __983847802_Ptr: JNAPointer? by lazy {
    __983847802_Interface.__983847802_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__983847802_Interface)

  public constructor() : this(ABI.activate())

  private fun as_983847802(): IFrameworkTemplate.WithDefault {
    if(pointer == NULL) {
      return(IFrameworkTemplate.ABI.makeIFrameworkTemplate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameworkTemplate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameworkTemplate.ABI.makeIFrameworkTemplate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameworkTemplate> {
    public override fun getValue() = FrameworkTemplate(pointer.getPointer(0))

    public fun setValue(value: FrameworkTemplate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameworkTemplate, MemoryAddress> {
    public val IFrameworkTemplateFactory_Instance: IFrameworkTemplateFactory by lazy {
      createIFrameworkTemplateFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFrameworkTemplateFactory(): IFrameworkTemplateFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.FrameworkTemplate".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFrameworkTemplateFactory.ABI.makeIFrameworkTemplateFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IFrameworkTemplateFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): FrameworkTemplate {
      val address = segment.toRawLongValue()
      return FrameworkTemplate(Pointer(address))
    }

    public override fun toNative(obj: FrameworkTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
