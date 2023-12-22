package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.TriggerAction
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BeginStoryboard.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.BeginStoryboard;{bb364720-ee5a-5b32-91e2-62589729fd3a})")
@WinRTByReference(brClass = BeginStoryboard.ByReference::class)
public class BeginStoryboard(
  ptr: JNAPointer? = NULL
) : TriggerAction(ptr), IBeginStoryboard.WithDefault, IWinRTObject {
  private val __78600511_Interface: IBeginStoryboard.WithDefault by lazy {
    as_78600511()
  }


  public override val __78600511_Ptr: JNAPointer? by lazy {
    __78600511_Interface.__78600511_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__78600511_Interface)

  public constructor() : this(ABI.activate())

  private fun as_78600511(): IBeginStoryboard.WithDefault {
    if(pointer == NULL) {
      return(IBeginStoryboard.ABI.makeIBeginStoryboard(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBeginStoryboard>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBeginStoryboard.ABI.makeIBeginStoryboard(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BeginStoryboard> {
    public override fun getValue() = BeginStoryboard(pointer.getPointer(0))

    public fun setValue(value: BeginStoryboard): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BeginStoryboard, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBeginStoryboardStatics_Instance: IBeginStoryboardStatics by lazy {
      createIBeginStoryboardStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BeginStoryboard".toHandle(),
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

    public fun createIBeginStoryboardStatics(): IBeginStoryboardStatics {
      val refiid = Guid.REFIID(IBeginStoryboardStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BeginStoryboard".toHandle(),refiid,interfacePtr)
      val result = IBeginStoryboardStatics.ABI.makeIBeginStoryboardStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BeginStoryboard {
      val address = segment.toRawLongValue()
      return BeginStoryboard(Pointer(address))
    }

    public override fun toNative(obj: BeginStoryboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_StoryboardProperty() =
        ABI.IBeginStoryboardStatics_Instance.get_StoryboardProperty()
  }
}
