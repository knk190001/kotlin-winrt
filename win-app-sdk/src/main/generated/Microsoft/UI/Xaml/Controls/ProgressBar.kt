package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IProgressBarFactory.ABI.IID
import Microsoft.UI.Xaml.Controls.Primitives.RangeBase
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

@ABIMarker(ProgressBar.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ProgressBar;{87555c8c-0aaf-52c1-8390-0db17f40438e})")
@WinRTByReference(brClass = ProgressBar.ByReference::class)
public open class ProgressBar(
  ptr: JNAPointer? = NULL
) : RangeBase(ptr), IProgressBar.WithDefault, IWinRTObject {
  private val __431024513_Interface: IProgressBar.WithDefault by lazy {
    as_431024513()
  }


  public override val __431024513_Ptr: JNAPointer? by lazy {
    __431024513_Interface.__431024513_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__431024513_Interface)

  public constructor() : this(ABI.activate())

  private fun as_431024513(): IProgressBar.WithDefault {
    if(pointer == NULL) {
      return(IProgressBar.ABI.makeIProgressBar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProgressBar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProgressBar.ABI.makeIProgressBar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ProgressBar> {
    public override fun getValue() = ProgressBar(pointer.getPointer(0))

    public fun setValue(value: ProgressBar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProgressBar, MemoryAddress> {
    public val IProgressBarStatics_Instance: IProgressBarStatics by lazy {
      createIProgressBarStatics()
    }


    public val IProgressBarFactory_Instance: IProgressBarFactory by lazy {
      createIProgressBarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProgressBarStatics(): IProgressBarStatics {
      val refiid = Guid.REFIID(IProgressBarStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ProgressBar".toHandle(),refiid,interfacePtr)
      val result = IProgressBarStatics.ABI.makeIProgressBarStatics(interfacePtr.value)
      return result
    }

    public fun createIProgressBarFactory(): IProgressBarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ProgressBar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProgressBarFactory.ABI.makeIProgressBarFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IProgressBarFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProgressBar {
      val address = segment.toRawLongValue()
      return ProgressBar(Pointer(address))
    }

    public override fun toNative(obj: ProgressBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsIndeterminateProperty() =
        ABI.IProgressBarStatics_Instance.get_IsIndeterminateProperty()

    public fun get_ShowErrorProperty() = ABI.IProgressBarStatics_Instance.get_ShowErrorProperty()

    public fun get_ShowPausedProperty() = ABI.IProgressBarStatics_Instance.get_ShowPausedProperty()
  }
}
