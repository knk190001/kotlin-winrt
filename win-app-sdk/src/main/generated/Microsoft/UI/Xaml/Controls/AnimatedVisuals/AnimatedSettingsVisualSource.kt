package Microsoft.UI.Xaml.Controls.AnimatedVisuals

import Microsoft.UI.Xaml.Controls.IAnimatedVisualSource
import Microsoft.UI.Xaml.Controls.IAnimatedVisualSource2
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AnimatedSettingsVisualSource.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnimatedVisuals.AnimatedSettingsVisualSource;{294765c3-70e3-555c-9657-01fc4051169d})")
@WinRTByReference(brClass = AnimatedSettingsVisualSource.ByReference::class)
public class AnimatedSettingsVisualSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnimatedVisualSource.WithDefault, IAnimatedVisualSource2.WithDefault,
    IWinRTObject {
  private val __243289851_Interface: IAnimatedVisualSource.WithDefault by lazy {
    as_243289851()
  }


  private val __1047949261_Interface: IAnimatedVisualSource2.WithDefault by lazy {
    as_1047949261()
  }


  public override val __243289851_Ptr: JNAPointer? by lazy {
    __243289851_Interface.__243289851_Ptr
  }


  public override val __1047949261_Ptr: JNAPointer? by lazy {
    __1047949261_Interface.__1047949261_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__243289851_Interface, __1047949261_Interface)

  public constructor() : this(ABI.activate())

  private fun as_243289851(): IAnimatedVisualSource.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedVisualSource.ABI.makeIAnimatedVisualSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedVisualSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedVisualSource.ABI.makeIAnimatedVisualSource(ref.value))
  }

  private fun as_1047949261(): IAnimatedVisualSource2.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedVisualSource2.ABI.makeIAnimatedVisualSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedVisualSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedVisualSource2.ABI.makeIAnimatedVisualSource2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimatedSettingsVisualSource> {
    public override fun getValue() = AnimatedSettingsVisualSource(pointer.getPointer(0))

    public fun setValue(value: AnimatedSettingsVisualSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimatedSettingsVisualSource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedVisuals.AnimatedSettingsVisualSource".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): AnimatedSettingsVisualSource {
      val address = segment.toRawLongValue()
      return AnimatedSettingsVisualSource(Pointer(address))
    }

    public override fun toNative(obj: AnimatedSettingsVisualSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
