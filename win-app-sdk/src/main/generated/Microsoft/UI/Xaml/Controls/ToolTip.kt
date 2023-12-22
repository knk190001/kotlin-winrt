package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IToolTipFactory.ABI.IID
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

@ABIMarker(ToolTip.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ToolTip;{67e93d74-5e93-59a1-91bf-413efbeb904c})")
@WinRTByReference(brClass = ToolTip.ByReference::class)
public open class ToolTip(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IToolTip.WithDefault, IWinRTObject {
  private val __1205652540_Interface: IToolTip.WithDefault by lazy {
    as_1205652540()
  }


  public override val __1205652540_Ptr: JNAPointer? by lazy {
    __1205652540_Interface.__1205652540_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1205652540_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1205652540(): IToolTip.WithDefault {
    if(pointer == NULL) {
      return(IToolTip.ABI.makeIToolTip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToolTip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToolTip.ABI.makeIToolTip(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ToolTip> {
    public override fun getValue() = ToolTip(pointer.getPointer(0))

    public fun setValue(value: ToolTip): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToolTip, MemoryAddress> {
    public val IToolTipStatics_Instance: IToolTipStatics by lazy {
      createIToolTipStatics()
    }


    public val IToolTipFactory_Instance: IToolTipFactory by lazy {
      createIToolTipFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToolTipStatics(): IToolTipStatics {
      val refiid = Guid.REFIID(IToolTipStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToolTip".toHandle(),refiid,interfacePtr)
      val result = IToolTipStatics.ABI.makeIToolTipStatics(interfacePtr.value)
      return result
    }

    public fun createIToolTipFactory(): IToolTipFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToolTip".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToolTipFactory.ABI.makeIToolTipFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IToolTipFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToolTip {
      val address = segment.toRawLongValue()
      return ToolTip(Pointer(address))
    }

    public override fun toNative(obj: ToolTip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HorizontalOffsetProperty() =
        ABI.IToolTipStatics_Instance.get_HorizontalOffsetProperty()

    public fun get_IsOpenProperty() = ABI.IToolTipStatics_Instance.get_IsOpenProperty()

    public fun get_PlacementProperty() = ABI.IToolTipStatics_Instance.get_PlacementProperty()

    public fun get_PlacementTargetProperty() =
        ABI.IToolTipStatics_Instance.get_PlacementTargetProperty()

    public fun get_PlacementRectProperty() =
        ABI.IToolTipStatics_Instance.get_PlacementRectProperty()

    public fun get_VerticalOffsetProperty() =
        ABI.IToolTipStatics_Instance.get_VerticalOffsetProperty()
  }
}
