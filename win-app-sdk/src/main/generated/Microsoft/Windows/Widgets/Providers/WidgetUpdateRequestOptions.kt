package Microsoft.Windows.Widgets.Providers

import Microsoft.Windows.Widgets.Providers.IWidgetUpdateRequestOptionsFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WidgetUpdateRequestOptions.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetUpdateRequestOptions;{b09ca8f7-7424-5687-baaf-7dd6fa639672})")
@WinRTByReference(brClass = WidgetUpdateRequestOptions.ByReference::class)
public class WidgetUpdateRequestOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetUpdateRequestOptions.WithDefault, IWinRTObject {
  private val __506303795_Interface: IWidgetUpdateRequestOptions.WithDefault by lazy {
    as_506303795()
  }


  public override val __506303795_Ptr: JNAPointer? by lazy {
    __506303795_Interface.__506303795_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__506303795_Interface)

  public constructor(widgetId: String) : this(ABI.activate(widgetId))

  private fun as_506303795(): IWidgetUpdateRequestOptions.WithDefault {
    if(pointer == NULL) {
      return(IWidgetUpdateRequestOptions.ABI.makeIWidgetUpdateRequestOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetUpdateRequestOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetUpdateRequestOptions.ABI.makeIWidgetUpdateRequestOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WidgetUpdateRequestOptions> {
    public override fun getValue() = WidgetUpdateRequestOptions(pointer.getPointer(0))

    public fun setValue(value: WidgetUpdateRequestOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetUpdateRequestOptions, MemoryAddress> {
    public val IWidgetUpdateRequestOptionsStatics_Instance: IWidgetUpdateRequestOptionsStatics by
        lazy {
      createIWidgetUpdateRequestOptionsStatics()
    }


    public val IWidgetUpdateRequestOptionsFactory_Instance: IWidgetUpdateRequestOptionsFactory by
        lazy {
      createIWidgetUpdateRequestOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWidgetUpdateRequestOptionsStatics(): IWidgetUpdateRequestOptionsStatics {
      val refiid = Guid.REFIID(IWidgetUpdateRequestOptionsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.Widgets.Providers.WidgetUpdateRequestOptions".toHandle(),refiid,interfacePtr)
      val result =
          IWidgetUpdateRequestOptionsStatics.ABI.makeIWidgetUpdateRequestOptionsStatics(interfacePtr.value)
      return result
    }

    public fun createIWidgetUpdateRequestOptionsFactory(): IWidgetUpdateRequestOptionsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.Widgets.Providers.WidgetUpdateRequestOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWidgetUpdateRequestOptionsFactory.ABI.makeIWidgetUpdateRequestOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(widgetId: String): JNAPointer? =
        IWidgetUpdateRequestOptionsFactory_Instance.CreateInstance(widgetId)?.pointer

    public override fun fromNative(segment: MemoryAddress): WidgetUpdateRequestOptions {
      val address = segment.toRawLongValue()
      return WidgetUpdateRequestOptions(Pointer(address))
    }

    public override fun toNative(obj: WidgetUpdateRequestOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_UnsetValue() = ABI.IWidgetUpdateRequestOptionsStatics_Instance.get_UnsetValue()
  }
}
