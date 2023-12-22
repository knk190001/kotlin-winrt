package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.NonVirtualizingLayout
import Microsoft.UI.Xaml.Controls.Primitives.IColumnMajorUniformToLargestGridLayoutFactory.ABI.IID
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

@ABIMarker(ColumnMajorUniformToLargestGridLayout.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ColumnMajorUniformToLargestGridLayout;{ee10a6aa-efeb-51ac-b791-71913ae8c235})")
@WinRTByReference(brClass = ColumnMajorUniformToLargestGridLayout.ByReference::class)
public open class ColumnMajorUniformToLargestGridLayout(
  ptr: JNAPointer? = NULL
) : NonVirtualizingLayout(ptr), IColumnMajorUniformToLargestGridLayout.WithDefault, IWinRTObject {
  private val __1595648815_Interface: IColumnMajorUniformToLargestGridLayout.WithDefault by lazy {
    as_1595648815()
  }


  public override val __1595648815_Ptr: JNAPointer? by lazy {
    __1595648815_Interface.__1595648815_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1595648815_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1595648815(): IColumnMajorUniformToLargestGridLayout.WithDefault {
    if(pointer == NULL) {
      return(IColumnMajorUniformToLargestGridLayout.ABI.makeIColumnMajorUniformToLargestGridLayout(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColumnMajorUniformToLargestGridLayout>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColumnMajorUniformToLargestGridLayout.ABI.makeIColumnMajorUniformToLargestGridLayout(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColumnMajorUniformToLargestGridLayout> {
    public override fun getValue() = ColumnMajorUniformToLargestGridLayout(pointer.getPointer(0))

    public fun setValue(value: ColumnMajorUniformToLargestGridLayout): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColumnMajorUniformToLargestGridLayout, MemoryAddress> {
    public val IColumnMajorUniformToLargestGridLayoutStatics_Instance:
        IColumnMajorUniformToLargestGridLayoutStatics by lazy {
      createIColumnMajorUniformToLargestGridLayoutStatics()
    }


    public val IColumnMajorUniformToLargestGridLayoutFactory_Instance:
        IColumnMajorUniformToLargestGridLayoutFactory by lazy {
      createIColumnMajorUniformToLargestGridLayoutFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColumnMajorUniformToLargestGridLayoutStatics():
        IColumnMajorUniformToLargestGridLayoutStatics {
      val refiid = Guid.REFIID(IColumnMajorUniformToLargestGridLayoutStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ColumnMajorUniformToLargestGridLayout".toHandle(),refiid,interfacePtr)
      val result =
          IColumnMajorUniformToLargestGridLayoutStatics.ABI.makeIColumnMajorUniformToLargestGridLayoutStatics(interfacePtr.value)
      return result
    }

    public fun createIColumnMajorUniformToLargestGridLayoutFactory():
        IColumnMajorUniformToLargestGridLayoutFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ColumnMajorUniformToLargestGridLayout".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IColumnMajorUniformToLargestGridLayoutFactory.ABI.makeIColumnMajorUniformToLargestGridLayoutFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        IColumnMajorUniformToLargestGridLayoutFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ColumnMajorUniformToLargestGridLayout {
      val address = segment.toRawLongValue()
      return ColumnMajorUniformToLargestGridLayout(Pointer(address))
    }

    public override fun toNative(obj: ColumnMajorUniformToLargestGridLayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxColumnsProperty() =
        ABI.IColumnMajorUniformToLargestGridLayoutStatics_Instance.get_MaxColumnsProperty()

    public fun get_ColumnSpacingProperty() =
        ABI.IColumnMajorUniformToLargestGridLayoutStatics_Instance.get_ColumnSpacingProperty()

    public fun get_RowSpacingProperty() =
        ABI.IColumnMajorUniformToLargestGridLayoutStatics_Instance.get_RowSpacingProperty()
  }
}
