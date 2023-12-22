package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ISettingsFlyoutFactory.ABI.IID
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

@ABIMarker(SettingsFlyout.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SettingsFlyout;{830ba82b-c55b-4e32-a51c-5791e024c8af})")
@WinRTByReference(brClass = SettingsFlyout.ByReference::class)
public open class SettingsFlyout(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), ISettingsFlyout.WithDefault, IWinRTObject {
  private val __600483610_Interface: ISettingsFlyout.WithDefault by lazy {
    as_600483610()
  }


  public override val __600483610_Ptr: JNAPointer? by lazy {
    __600483610_Interface.__600483610_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__600483610_Interface)

  public constructor() : this(ABI.activate())

  private fun as_600483610(): ISettingsFlyout.WithDefault {
    if(pointer == NULL) {
      return(ISettingsFlyout.ABI.makeISettingsFlyout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISettingsFlyout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISettingsFlyout.ABI.makeISettingsFlyout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SettingsFlyout>
      {
    public override fun getValue() = SettingsFlyout(pointer.getPointer(0))

    public fun setValue(value: SettingsFlyout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsFlyout, MemoryAddress> {
    public val ISettingsFlyoutStatics_Instance: ISettingsFlyoutStatics by lazy {
      createISettingsFlyoutStatics()
    }


    public val ISettingsFlyoutFactory_Instance: ISettingsFlyoutFactory by lazy {
      createISettingsFlyoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISettingsFlyoutStatics(): ISettingsFlyoutStatics {
      val refiid = Guid.REFIID(ISettingsFlyoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SettingsFlyout".toHandle(),refiid,interfacePtr)
      val result = ISettingsFlyoutStatics.ABI.makeISettingsFlyoutStatics(interfacePtr.value)
      return result
    }

    public fun createISettingsFlyoutFactory(): ISettingsFlyoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SettingsFlyout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISettingsFlyoutFactory.ABI.makeISettingsFlyoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISettingsFlyoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SettingsFlyout {
      val address = segment.toRawLongValue()
      return SettingsFlyout(Pointer(address))
    }

    public override fun toNative(obj: SettingsFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TitleProperty() = ABI.ISettingsFlyoutStatics_Instance.get_TitleProperty()

    public fun get_HeaderBackgroundProperty() =
        ABI.ISettingsFlyoutStatics_Instance.get_HeaderBackgroundProperty()

    public fun get_HeaderForegroundProperty() =
        ABI.ISettingsFlyoutStatics_Instance.get_HeaderForegroundProperty()

    public fun get_IconSourceProperty() =
        ABI.ISettingsFlyoutStatics_Instance.get_IconSourceProperty()
  }
}
