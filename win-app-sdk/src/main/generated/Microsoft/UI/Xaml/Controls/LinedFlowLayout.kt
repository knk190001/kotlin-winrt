package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ILinedFlowLayoutFactory.ABI.IID
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

@ABIMarker(LinedFlowLayout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.LinedFlowLayout;{f887a64b-b146-540c-8953-d8184b79ba6e})")
@WinRTByReference(brClass = LinedFlowLayout.ByReference::class)
public open class LinedFlowLayout(
  ptr: JNAPointer? = NULL
) : VirtualizingLayout(ptr), ILinedFlowLayout.WithDefault, IWinRTObject {
  private val __1980045409_Interface: ILinedFlowLayout.WithDefault by lazy {
    as_1980045409()
  }


  public override val __1980045409_Ptr: JNAPointer? by lazy {
    __1980045409_Interface.__1980045409_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1980045409_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1980045409(): ILinedFlowLayout.WithDefault {
    if(pointer == NULL) {
      return(ILinedFlowLayout.ABI.makeILinedFlowLayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinedFlowLayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinedFlowLayout.ABI.makeILinedFlowLayout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinedFlowLayout> {
    public override fun getValue() = LinedFlowLayout(pointer.getPointer(0))

    public fun setValue(value: LinedFlowLayout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinedFlowLayout, MemoryAddress> {
    public val ILinedFlowLayoutStatics_Instance: ILinedFlowLayoutStatics by lazy {
      createILinedFlowLayoutStatics()
    }


    public val ILinedFlowLayoutFactory_Instance: ILinedFlowLayoutFactory by lazy {
      createILinedFlowLayoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILinedFlowLayoutStatics(): ILinedFlowLayoutStatics {
      val refiid = Guid.REFIID(ILinedFlowLayoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.LinedFlowLayout".toHandle(),refiid,interfacePtr)
      val result = ILinedFlowLayoutStatics.ABI.makeILinedFlowLayoutStatics(interfacePtr.value)
      return result
    }

    public fun createILinedFlowLayoutFactory(): ILinedFlowLayoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.LinedFlowLayout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILinedFlowLayoutFactory.ABI.makeILinedFlowLayoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ILinedFlowLayoutFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): LinedFlowLayout {
      val address = segment.toRawLongValue()
      return LinedFlowLayout(Pointer(address))
    }

    public override fun toNative(obj: LinedFlowLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ItemsJustificationProperty() =
        ABI.ILinedFlowLayoutStatics_Instance.get_ItemsJustificationProperty()

    public fun get_ItemsStretchProperty() =
        ABI.ILinedFlowLayoutStatics_Instance.get_ItemsStretchProperty()

    public fun get_MinItemSpacingProperty() =
        ABI.ILinedFlowLayoutStatics_Instance.get_MinItemSpacingProperty()

    public fun get_LineSpacingProperty() =
        ABI.ILinedFlowLayoutStatics_Instance.get_LineSpacingProperty()

    public fun get_LineHeightProperty() =
        ABI.ILinedFlowLayoutStatics_Instance.get_LineHeightProperty()

    public fun get_ActualLineHeightProperty() =
        ABI.ILinedFlowLayoutStatics_Instance.get_ActualLineHeightProperty()
  }
}
