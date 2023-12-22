package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(EasingFunctionBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.EasingFunctionBase;{c108383f-2c02-4151-8ecd-68ddaa3f0d9b})")
@WinRTByReference(brClass = EasingFunctionBase.ByReference::class)
public open class EasingFunctionBase(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IEasingFunctionBase.WithDefault, IWinRTObject {
  private val __1108870118_Interface: IEasingFunctionBase.WithDefault by lazy {
    as_1108870118()
  }


  public override val __1108870118_Ptr: JNAPointer? by lazy {
    __1108870118_Interface.__1108870118_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1108870118_Interface)

  private fun as_1108870118(): IEasingFunctionBase.WithDefault {
    if(pointer == NULL) {
      return(IEasingFunctionBase.ABI.makeIEasingFunctionBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEasingFunctionBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEasingFunctionBase.ABI.makeIEasingFunctionBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EasingFunctionBase> {
    public override fun getValue() = EasingFunctionBase(pointer.getPointer(0))

    public fun setValue(value: EasingFunctionBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EasingFunctionBase, MemoryAddress> {
    public val IEasingFunctionBaseStatics_Instance: IEasingFunctionBaseStatics by lazy {
      createIEasingFunctionBaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEasingFunctionBaseStatics(): IEasingFunctionBaseStatics {
      val refiid = Guid.REFIID(IEasingFunctionBaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.EasingFunctionBase".toHandle(),refiid,interfacePtr)
      val result = IEasingFunctionBaseStatics.ABI.makeIEasingFunctionBaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): EasingFunctionBase {
      val address = segment.toRawLongValue()
      return EasingFunctionBase(Pointer(address))
    }

    public override fun toNative(obj: EasingFunctionBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EasingModeProperty() =
        ABI.IEasingFunctionBaseStatics_Instance.get_EasingModeProperty()
  }
}
