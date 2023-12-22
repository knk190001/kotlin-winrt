package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IContentControlFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.ContentControl;{a26dd1dc-cd44-435c-be94-01d6241c231c})")
@WinRTByReference(brClass = ContentControl.ByReference::class)
public open class ContentControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IContentControl.WithDefault, IContentControl2.WithDefault,
    IContentControlOverrides.WithDefault, IWinRTObject {
  private val __116295232_Interface: IContentControl.WithDefault by lazy {
    as_116295232()
  }


  private val __689815154_Interface: IContentControl2.WithDefault by lazy {
    as_689815154()
  }


  private val __497419193_Interface: IContentControlOverrides.WithDefault by lazy {
    as_497419193()
  }


  public override val __116295232_Ptr: JNAPointer? by lazy {
    __116295232_Interface.__116295232_Ptr
  }


  public override val __689815154_Ptr: JNAPointer? by lazy {
    __689815154_Interface.__689815154_Ptr
  }


  public override val __497419193_Ptr: JNAPointer? by lazy {
    __497419193_Interface.__497419193_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__116295232_Interface, __689815154_Interface, __497419193_Interface)

  public constructor() : this(ABI.activate())

  private fun as_116295232(): IContentControl.WithDefault {
    if(pointer == NULL) {
      return(IContentControl.ABI.makeIContentControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentControl.ABI.makeIContentControl(ref.value))
  }

  private fun as_689815154(): IContentControl2.WithDefault {
    if(pointer == NULL) {
      return(IContentControl2.ABI.makeIContentControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentControl2.ABI.makeIContentControl2(ref.value))
  }

  private fun as_497419193(): IContentControlOverrides.WithDefault {
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
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentControl".toHandle(),refiid,interfacePtr)
      val result = IContentControlStatics.ABI.makeIContentControlStatics(interfacePtr.value)
      return result
    }

    public fun createIContentControlFactory(): IContentControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ContentControl".toHandle(),refiid,factoryActivatorPtr)
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
