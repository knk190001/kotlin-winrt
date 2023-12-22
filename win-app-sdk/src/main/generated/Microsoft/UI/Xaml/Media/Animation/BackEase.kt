package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(BackEase.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.BackEase;{1775bd43-1939-57cb-8c31-cd7590ec9543})")
@WinRTByReference(brClass = BackEase.ByReference::class)
public class BackEase(
  ptr: JNAPointer? = NULL
) : EasingFunctionBase(ptr), IBackEase.WithDefault, IWinRTObject {
  private val __2117866608_Interface: IBackEase.WithDefault by lazy {
    as_2117866608()
  }


  public override val __2117866608_Ptr: JNAPointer? by lazy {
    __2117866608_Interface.__2117866608_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2117866608_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2117866608(): IBackEase.WithDefault {
    if(pointer == NULL) {
      return(IBackEase.ABI.makeIBackEase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackEase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackEase.ABI.makeIBackEase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<BackEase> {
    public override fun getValue() = BackEase(pointer.getPointer(0))

    public fun setValue(value: BackEase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackEase, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IBackEaseStatics_Instance: IBackEaseStatics by lazy {
      createIBackEaseStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BackEase".toHandle(),
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

    public fun createIBackEaseStatics(): IBackEaseStatics {
      val refiid = Guid.REFIID(IBackEaseStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.BackEase".toHandle(),refiid,interfacePtr)
      val result = IBackEaseStatics.ABI.makeIBackEaseStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackEase {
      val address = segment.toRawLongValue()
      return BackEase(Pointer(address))
    }

    public override fun toNative(obj: BackEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AmplitudeProperty() = ABI.IBackEaseStatics_Instance.get_AmplitudeProperty()
  }
}
