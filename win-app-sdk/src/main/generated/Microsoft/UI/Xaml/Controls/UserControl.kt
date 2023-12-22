package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IUserControlFactory.ABI.IID
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

@ABIMarker(UserControl.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.UserControl;{ab8a0a51-44cf-5337-ad77-8eda1795e9f6})")
@WinRTByReference(brClass = UserControl.ByReference::class)
public open class UserControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IUserControl.WithDefault, IWinRTObject {
  private val __912857365_Interface: IUserControl.WithDefault by lazy {
    as_912857365()
  }


  public override val __912857365_Ptr: JNAPointer? by lazy {
    __912857365_Interface.__912857365_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__912857365_Interface)

  public constructor() : this(ABI.activate())

  private fun as_912857365(): IUserControl.WithDefault {
    if(pointer == NULL) {
      return(IUserControl.ABI.makeIUserControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUserControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUserControl.ABI.makeIUserControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UserControl> {
    public override fun getValue() = UserControl(pointer.getPointer(0))

    public fun setValue(value: UserControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserControl, MemoryAddress> {
    public val IUserControlStatics_Instance: IUserControlStatics by lazy {
      createIUserControlStatics()
    }


    public val IUserControlFactory_Instance: IUserControlFactory by lazy {
      createIUserControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserControlStatics(): IUserControlStatics {
      val refiid = Guid.REFIID(IUserControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.UserControl".toHandle(),refiid,interfacePtr)
      val result = IUserControlStatics.ABI.makeIUserControlStatics(interfacePtr.value)
      return result
    }

    public fun createIUserControlFactory(): IUserControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.UserControl".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUserControlFactory.ABI.makeIUserControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IUserControlFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): UserControl {
      val address = segment.toRawLongValue()
      return UserControl(Pointer(address))
    }

    public override fun toNative(obj: UserControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ContentProperty() = ABI.IUserControlStatics_Instance.get_ContentProperty()
  }
}
