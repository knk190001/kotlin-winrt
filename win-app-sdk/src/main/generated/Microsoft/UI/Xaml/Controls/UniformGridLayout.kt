package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IUniformGridLayoutFactory.ABI.IID
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

@ABIMarker(UniformGridLayout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.UniformGridLayout;{8a164cbc-2a5e-56e5-a011-fb76334aabdf})")
@WinRTByReference(brClass = UniformGridLayout.ByReference::class)
public open class UniformGridLayout(
  ptr: JNAPointer? = NULL
) : VirtualizingLayout(ptr), IUniformGridLayout.WithDefault, IWinRTObject {
  private val __1821563907_Interface: IUniformGridLayout.WithDefault by lazy {
    as_1821563907()
  }


  public override val __1821563907_Ptr: JNAPointer? by lazy {
    __1821563907_Interface.__1821563907_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1821563907_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1821563907(): IUniformGridLayout.WithDefault {
    if(pointer == NULL) {
      return(IUniformGridLayout.ABI.makeIUniformGridLayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUniformGridLayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUniformGridLayout.ABI.makeIUniformGridLayout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UniformGridLayout> {
    public override fun getValue() = UniformGridLayout(pointer.getPointer(0))

    public fun setValue(value: UniformGridLayout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UniformGridLayout, MemoryAddress> {
    public val IUniformGridLayoutStatics_Instance: IUniformGridLayoutStatics by lazy {
      createIUniformGridLayoutStatics()
    }


    public val IUniformGridLayoutFactory_Instance: IUniformGridLayoutFactory by lazy {
      createIUniformGridLayoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUniformGridLayoutStatics(): IUniformGridLayoutStatics {
      val refiid = Guid.REFIID(IUniformGridLayoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.UniformGridLayout".toHandle(),refiid,interfacePtr)
      val result = IUniformGridLayoutStatics.ABI.makeIUniformGridLayoutStatics(interfacePtr.value)
      return result
    }

    public fun createIUniformGridLayoutFactory(): IUniformGridLayoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.UniformGridLayout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUniformGridLayoutFactory.ABI.makeIUniformGridLayoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IUniformGridLayoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): UniformGridLayout {
      val address = segment.toRawLongValue()
      return UniformGridLayout(Pointer(address))
    }

    public override fun toNative(obj: UniformGridLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OrientationProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_OrientationProperty()

    public fun get_MinItemWidthProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_MinItemWidthProperty()

    public fun get_MinItemHeightProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_MinItemHeightProperty()

    public fun get_MinRowSpacingProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_MinRowSpacingProperty()

    public fun get_MinColumnSpacingProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_MinColumnSpacingProperty()

    public fun get_ItemsJustificationProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_ItemsJustificationProperty()

    public fun get_ItemsStretchProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_ItemsStretchProperty()

    public fun get_MaximumRowsOrColumnsProperty() =
        ABI.IUniformGridLayoutStatics_Instance.get_MaximumRowsOrColumnsProperty()
  }
}
