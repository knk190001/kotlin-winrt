package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IStackLayoutFactory.ABI.IID
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

@ABIMarker(StackLayout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.StackLayout;{3ea9c3dd-8103-571f-9e07-44ea76c91a10})")
@WinRTByReference(brClass = StackLayout.ByReference::class)
public open class StackLayout(
  ptr: JNAPointer? = NULL
) : VirtualizingLayout(ptr), IStackLayout.WithDefault, IWinRTObject {
  private val __878592939_Interface: IStackLayout.WithDefault by lazy {
    as_878592939()
  }


  public override val __878592939_Ptr: JNAPointer? by lazy {
    __878592939_Interface.__878592939_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__878592939_Interface)

  public constructor() : this(ABI.activate())

  private fun as_878592939(): IStackLayout.WithDefault {
    if(pointer == NULL) {
      return(IStackLayout.ABI.makeIStackLayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStackLayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStackLayout.ABI.makeIStackLayout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StackLayout> {
    public override fun getValue() = StackLayout(pointer.getPointer(0))

    public fun setValue(value: StackLayout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StackLayout, MemoryAddress> {
    public val IStackLayoutStatics_Instance: IStackLayoutStatics by lazy {
      createIStackLayoutStatics()
    }


    public val IStackLayoutFactory_Instance: IStackLayoutFactory by lazy {
      createIStackLayoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStackLayoutStatics(): IStackLayoutStatics {
      val refiid = Guid.REFIID(IStackLayoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.StackLayout".toHandle(),refiid,interfacePtr)
      val result = IStackLayoutStatics.ABI.makeIStackLayoutStatics(interfacePtr.value)
      return result
    }

    public fun createIStackLayoutFactory(): IStackLayoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.StackLayout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStackLayoutFactory.ABI.makeIStackLayoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IStackLayoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): StackLayout {
      val address = segment.toRawLongValue()
      return StackLayout(Pointer(address))
    }

    public override fun toNative(obj: StackLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OrientationProperty() =
        ABI.IStackLayoutStatics_Instance.get_OrientationProperty()

    public fun get_SpacingProperty() = ABI.IStackLayoutStatics_Instance.get_SpacingProperty()
  }
}
