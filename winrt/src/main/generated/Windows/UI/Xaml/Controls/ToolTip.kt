package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IToolTipFactory.ABI.IID
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
@Signature("rc(Windows.UI.Xaml.Controls.ToolTip;{7de5d75f-4415-429f-b523-699bdb8c30db})")
@WinRTByReference(brClass = ToolTip.ByReference::class)
public open class ToolTip(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IToolTip.WithDefault, IToolTip2.WithDefault, IWinRTObject {
  private val __1987156921_Interface: IToolTip.WithDefault by lazy {
    as_1987156921()
  }


  private val __1472322357_Interface: IToolTip2.WithDefault by lazy {
    as_1472322357()
  }


  public override val __1987156921_Ptr: JNAPointer? by lazy {
    __1987156921_Interface.__1987156921_Ptr
  }


  public override val __1472322357_Ptr: JNAPointer? by lazy {
    __1472322357_Interface.__1472322357_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1987156921_Interface, __1472322357_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1987156921(): IToolTip.WithDefault {
    if(pointer == NULL) {
      return(IToolTip.ABI.makeIToolTip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToolTip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToolTip.ABI.makeIToolTip(ref.value))
  }

  private fun as_1472322357(): IToolTip2.WithDefault {
    if(pointer == NULL) {
      return(IToolTip2.ABI.makeIToolTip2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToolTip2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToolTip2.ABI.makeIToolTip2(ref.value))
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


    public val IToolTipStatics2_Instance: IToolTipStatics2 by lazy {
      createIToolTipStatics2()
    }


    public val IToolTipFactory_Instance: IToolTipFactory by lazy {
      createIToolTipFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToolTipStatics(): IToolTipStatics {
      val refiid = Guid.REFIID(IToolTipStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ToolTip".toHandle(),refiid,interfacePtr)
      val result = IToolTipStatics.ABI.makeIToolTipStatics(interfacePtr.value)
      return result
    }

    public fun createIToolTipStatics2(): IToolTipStatics2 {
      val refiid = Guid.REFIID(IToolTipStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ToolTip".toHandle(),refiid,interfacePtr)
      val result = IToolTipStatics2.ABI.makeIToolTipStatics2(interfacePtr.value)
      return result
    }

    public fun createIToolTipFactory(): IToolTipFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ToolTip".toHandle(),refiid,factoryActivatorPtr)
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

    public fun get_VerticalOffsetProperty() =
        ABI.IToolTipStatics_Instance.get_VerticalOffsetProperty()

    public fun get_PlacementRectProperty() =
        ABI.IToolTipStatics2_Instance.get_PlacementRectProperty()
  }
}
