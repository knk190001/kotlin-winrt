package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IContentControlFactory.ABI.IID
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

@ABIMarker(ContentControl.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ContentControl;{07e81761-11b2-52ae-8f8b-4d53d2b5900a})")
@WinRTByReference(brClass = ContentControl.ByReference::class)
public open class ContentControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IContentControl.WithDefault, IContentControlOverrides.WithDefault, IWinRTObject {
  private val __714155051_Interface: IContentControl.WithDefault by lazy {
    as_714155051()
  }


  private val __812918212_Interface: IContentControlOverrides.WithDefault by lazy {
    as_812918212()
  }


  public override val __714155051_Ptr: JNAPointer? by lazy {
    __714155051_Interface.__714155051_Ptr
  }


  public override val __812918212_Ptr: JNAPointer? by lazy {
    __812918212_Interface.__812918212_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__714155051_Interface, __812918212_Interface)

  public constructor() : this(ABI.activate())

  private fun as_714155051(): IContentControl.WithDefault {
    if(pointer == NULL) {
      return(IContentControl.ABI.makeIContentControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentControl.ABI.makeIContentControl(ref.value))
  }

  private fun as_812918212(): IContentControlOverrides.WithDefault {
    if(pointer == NULL) {
      return(IContentControlOverrides.ABI.makeIContentControlOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentControlOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentControlOverrides.ABI.makeIContentControlOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentControl>
      {
    public override fun getValue() = ContentControl(pointer.getPointer(0))

    public fun setValue(value: ContentControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentControl, MemoryAddress> {
    public val IContentControlStatics_Instance: IContentControlStatics by lazy {
      createIContentControlStatics()
    }


    public val IContentControlFactory_Instance: IContentControlFactory by lazy {
      createIContentControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentControlStatics(): IContentControlStatics {
      val refiid = Guid.REFIID(IContentControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ContentControl".toHandle(),refiid,interfacePtr)
      val result = IContentControlStatics.ABI.makeIContentControlStatics(interfacePtr.value)
      return result
    }

    public fun createIContentControlFactory(): IContentControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ContentControl".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IContentControlFactory.ABI.makeIContentControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IContentControlFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ContentControl {
      val address = segment.toRawLongValue()
      return ContentControl(Pointer(address))
    }

    public override fun toNative(obj: ContentControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentProperty() = ABI.IContentControlStatics_Instance.get_ContentProperty()

    public fun get_ContentTemplateProperty() =
        ABI.IContentControlStatics_Instance.get_ContentTemplateProperty()

    public fun get_ContentTemplateSelectorProperty() =
        ABI.IContentControlStatics_Instance.get_ContentTemplateSelectorProperty()

    public fun get_ContentTransitionsProperty() =
        ABI.IContentControlStatics_Instance.get_ContentTransitionsProperty()
  }
}
